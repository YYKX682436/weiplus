package com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b;

/* renamed from: com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent */
/* loaded from: classes3.dex */
public final class C22448xb8f34d53 extends lf3.n implements eg3.a {

    /* renamed from: d, reason: collision with root package name */
    public eg3.h f290666d;

    /* renamed from: e, reason: collision with root package name */
    public int f290667e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f290668f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f290669g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f290670h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22448xb8f34d53(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.Object filePath = (7 & 1) != 0 ? "" : null;
        java.lang.Object fileId = (7 & 2) != 0 ? "" : null;
        java.lang.String aesKey = (7 & 4) != 0 ? "" : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileId, "fileId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aesKey, "aesKey");
        this.f290668f = "";
        this.f290669g = new java.util.HashMap();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f290670h = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409>(a0Var) { // from class: com.tencent.mm.ui.media.base.image.BaseTranslationDataComponent$resultEventListener$1
            {
                this.f39173x3fe91575 = -1699517927;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 event = c5974x1d8a7409;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultTranslateDataComponent", "scanTranslationResult " + event.f136272g.f87933a + ", " + event.f136272g.f87935c);
                ((ku5.t0) ku5.t0.f394148d).B(new rh5.h(com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53.this, event));
                return true;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f290670h.mo48814x2efc64();
        ((java.util.HashMap) this.f290669g).clear();
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f290670h.mo48813x58998cd();
    }
}
