package com.tencent.mars.zstd;

/* loaded from: classes13.dex */
public class ZstdDictTrainer {
    private final int allocatedSize;
    private final int dictSize;
    private long filledSize;
    private final java.util.List<java.lang.Integer> sampleSizes = new java.util.ArrayList();
    private final java.nio.ByteBuffer trainingSamples;

    public ZstdDictTrainer(int i17, int i18) {
        this.trainingSamples = java.nio.ByteBuffer.allocateDirect(i17);
        this.allocatedSize = i17;
        this.dictSize = i18;
    }

    private int[] copyToIntArray(java.util.List<java.lang.Integer> list) {
        int[] iArr = new int[list.size()];
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iArr[i17] = it.next().intValue();
            i17++;
        }
        return iArr;
    }

    public boolean addSample(byte[] bArr) {
        if (this.filledSize + bArr.length > this.allocatedSize) {
            return false;
        }
        this.trainingSamples.put(bArr);
        this.sampleSizes.add(java.lang.Integer.valueOf(bArr.length));
        this.filledSize += bArr.length;
        return true;
    }

    public byte[] trainSamples() {
        return trainSamples(false);
    }

    public java.nio.ByteBuffer trainSamplesDirect() {
        return trainSamplesDirect(false);
    }

    public byte[] trainSamples(boolean z17) {
        java.nio.ByteBuffer trainSamplesDirect = trainSamplesDirect(z17);
        byte[] bArr = new byte[trainSamplesDirect.remaining()];
        trainSamplesDirect.get(bArr);
        return bArr;
    }

    public java.nio.ByteBuffer trainSamplesDirect(boolean z17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.dictSize);
        long trainFromBufferDirect = com.tencent.mars.zstd.Zstd.trainFromBufferDirect(this.trainingSamples, copyToIntArray(this.sampleSizes), allocateDirect, z17);
        if (com.tencent.mars.zstd.Zstd.isError(trainFromBufferDirect)) {
            allocateDirect.limit(0);
            return null;
        }
        allocateDirect.limit(java.lang.Long.valueOf(trainFromBufferDirect).intValue());
        return allocateDirect;
    }
}
