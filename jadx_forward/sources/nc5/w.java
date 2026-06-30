package nc5;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public int f417771a;

    /* renamed from: b, reason: collision with root package name */
    public android.app.Activity f417772b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.f9 f417773c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f417774d = "";

    /* renamed from: e, reason: collision with root package name */
    public m11.b0 f417775e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f417776f;

    public w() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f417776f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.query.ScanTransImage$scanTranslationResultEventListener$1
            {
                this.f39173x3fe91575 = -1699517927;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 event = c5974x1d8a7409;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.ct ctVar = event.f136272g;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTransImageUtil", "scanTranslationResult %d, %s", java.lang.Integer.valueOf(ctVar.f87933a), java.lang.Boolean.valueOf(ctVar.f87935c));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nc5.v(nc5.w.this, event));
                return true;
            }
        };
    }
}
