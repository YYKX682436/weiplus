package com.tencent.midas.comm.log.processor;

/* loaded from: classes13.dex */
public class APLogCompressor {
    private com.tencent.midas.comm.log.util.compressor.CachedByteArrayStream out = null;
    private com.tencent.midas.comm.log.util.compressor.GzipCompressorOutputStream gziper = null;

    public static com.tencent.midas.comm.log.processor.APLogCompressor create() {
        com.tencent.midas.comm.log.processor.APLogCompressor aPLogCompressor = new com.tencent.midas.comm.log.processor.APLogCompressor();
        try {
            aPLogCompressor.out = new com.tencent.midas.comm.log.util.compressor.CachedByteArrayStream(512);
            aPLogCompressor.gziper = new com.tencent.midas.comm.log.util.compressor.GzipCompressorOutputStream(aPLogCompressor.out);
            return aPLogCompressor;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public void close() {
        com.tencent.midas.comm.log.util.compressor.GzipCompressorOutputStream gzipCompressorOutputStream = this.gziper;
        if (gzipCompressorOutputStream != null) {
            gzipCompressorOutputStream.close();
        }
        com.tencent.midas.comm.log.util.compressor.CachedByteArrayStream cachedByteArrayStream = this.out;
        if (cachedByteArrayStream != null) {
            cachedByteArrayStream.close();
        }
    }

    public synchronized byte[] compress(byte[] bArr) {
        this.gziper.continued();
        this.out.reset();
        this.gziper.writeHeader();
        this.gziper.write(bArr, 0, bArr.length);
        this.gziper.finish();
        this.gziper.flush();
        return this.out.toByteArray();
    }
}
