package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class o2 extends com.tencent.matrix.lifecycle.g {
    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        android.os.Handler a17 = com.tencent.mm.feature.performance.adpf.a2.a();
        com.tencent.mm.feature.performance.adpf.n2 n2Var = com.tencent.mm.feature.performance.adpf.n2.f67453d;
        a17.removeCallbacks(n2Var);
        android.os.Handler a18 = com.tencent.mm.feature.performance.adpf.a2.a();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        a18.postDelayed(n2Var, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL * 10);
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        android.os.Handler a17 = com.tencent.mm.feature.performance.adpf.a2.a();
        com.tencent.mm.feature.performance.adpf.n2 n2Var = com.tencent.mm.feature.performance.adpf.n2.f67453d;
        a17.removeCallbacks(n2Var);
        android.os.Handler a18 = com.tencent.mm.feature.performance.adpf.a2.a();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        a18.postDelayed(n2Var, com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL * 10);
    }
}
