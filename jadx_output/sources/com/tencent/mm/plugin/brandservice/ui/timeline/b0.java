package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f94103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f94103d = bizTestUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.io.InputStream open = this.f94103d.getAssets().open("mbad_video.txt");
        kotlin.jvm.internal.o.f(open, "open(...)");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(open, r26.c.f368865a);
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).Ai(1, "mock_ad_card_video_" + java.lang.System.currentTimeMillis(), (inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192)).readLine());
        return jz5.f0.f302826a;
    }
}
