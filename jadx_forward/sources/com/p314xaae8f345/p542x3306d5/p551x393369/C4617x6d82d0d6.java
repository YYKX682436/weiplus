package com.p314xaae8f345.p542x3306d5.p551x393369;

/* renamed from: com.tencent.mars.zstd.ZstdDictTrainer */
/* loaded from: classes13.dex */
public class C4617x6d82d0d6 {

    /* renamed from: allocatedSize */
    private final int f19816xb8087168;

    /* renamed from: dictSize */
    private final int f19817xf5dd94d7;

    /* renamed from: filledSize */
    private long f19818xfb768083;

    /* renamed from: sampleSizes */
    private final java.util.List<java.lang.Integer> f19819x874b508 = new java.util.ArrayList();

    /* renamed from: trainingSamples */
    private final java.nio.ByteBuffer f19820x537705cf;

    public C4617x6d82d0d6(int i17, int i18) {
        this.f19820x537705cf = java.nio.ByteBuffer.allocateDirect(i17);
        this.f19816xb8087168 = i17;
        this.f19817xf5dd94d7 = i18;
    }

    /* renamed from: copyToIntArray */
    private int[] m40674x1709cc9a(java.util.List<java.lang.Integer> list) {
        int[] iArr = new int[list.size()];
        java.util.Iterator<java.lang.Integer> it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            iArr[i17] = it.next().intValue();
            i17++;
        }
        return iArr;
    }

    /* renamed from: addSample */
    public boolean m40675xfeff1dab(byte[] bArr) {
        if (this.f19818xfb768083 + bArr.length > this.f19816xb8087168) {
            return false;
        }
        this.f19820x537705cf.put(bArr);
        this.f19819x874b508.add(java.lang.Integer.valueOf(bArr.length));
        this.f19818xfb768083 += bArr.length;
        return true;
    }

    /* renamed from: trainSamples */
    public byte[] m40676x9f5d0ce1() {
        return m40677x9f5d0ce1(false);
    }

    /* renamed from: trainSamplesDirect */
    public java.nio.ByteBuffer m40678xa8c4a82a() {
        return m40679xa8c4a82a(false);
    }

    /* renamed from: trainSamples */
    public byte[] m40677x9f5d0ce1(boolean z17) {
        java.nio.ByteBuffer m40679xa8c4a82a = m40679xa8c4a82a(z17);
        byte[] bArr = new byte[m40679xa8c4a82a.remaining()];
        m40679xa8c4a82a.get(bArr);
        return bArr;
    }

    /* renamed from: trainSamplesDirect */
    public java.nio.ByteBuffer m40679xa8c4a82a(boolean z17) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f19817xf5dd94d7);
        long m40667xb58c4f3b = com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40667xb58c4f3b(this.f19820x537705cf, m40674x1709cc9a(this.f19819x874b508), allocateDirect, z17);
        if (com.p314xaae8f345.p542x3306d5.p551x393369.C4614x2aa789.m40663x7aad7efe(m40667xb58c4f3b)) {
            allocateDirect.limit(0);
            return null;
        }
        allocateDirect.limit(java.lang.Long.valueOf(m40667xb58c4f3b).intValue());
        return allocateDirect;
    }
}
