package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441;

/* loaded from: classes5.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI f175643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.brandservice.ui.timeline.BizTestUI bizTestUI) {
        super(0);
        this.f175643d = bizTestUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.io.InputStream open = this.f175643d.getAssets().open("mbad_pic.txt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(open, "open(...)");
        java.io.Reader inputStreamReader = new java.io.InputStreamReader(open, r26.c.f450398a);
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).Ai(1, "mock_ad_card_pic_" + java.lang.System.currentTimeMillis(), (inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192)).readLine());
        return jz5.f0.f384359a;
    }
}
