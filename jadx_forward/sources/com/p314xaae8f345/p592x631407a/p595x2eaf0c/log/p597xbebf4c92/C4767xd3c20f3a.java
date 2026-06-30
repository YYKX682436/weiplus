package com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92;

/* renamed from: com.tencent.midas.comm.log.processor.APLogCompressor */
/* loaded from: classes13.dex */
public class C4767xd3c20f3a {
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4773xfbf9b76f out = null;

    /* renamed from: gziper */
    private com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4774xd002df60 f20351xb6abc787 = null;

    /* renamed from: create */
    public static com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a m41694xaf65a0fc() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a c4767xd3c20f3a = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p597xbebf4c92.C4767xd3c20f3a();
        try {
            c4767xd3c20f3a.out = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4773xfbf9b76f(512);
            c4767xd3c20f3a.f20351xb6abc787 = new com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4774xd002df60(c4767xd3c20f3a.out);
            return c4767xd3c20f3a;
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: close */
    public void m41695x5a5ddf8() {
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4774xd002df60 c4774xd002df60 = this.f20351xb6abc787;
        if (c4774xd002df60 != null) {
            c4774xd002df60.close();
        }
        com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.p599xe9faa8c5.C4773xfbf9b76f c4773xfbf9b76f = this.out;
        if (c4773xfbf9b76f != null) {
            c4773xfbf9b76f.close();
        }
    }

    /* renamed from: compress */
    public synchronized byte[] m41696xdc47eb62(byte[] bArr) {
        this.f20351xb6abc787.m41747xe7f4689d();
        this.out.m41738x6761d4f();
        this.f20351xb6abc787.m41749x408c834c();
        this.f20351xb6abc787.write(bArr, 0, bArr.length);
        this.f20351xb6abc787.m41748xb4098c93();
        this.f20351xb6abc787.flush();
        return this.out.m41740x5f01b1f6();
    }
}
