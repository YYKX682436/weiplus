package fn5;

/* loaded from: classes3.dex */
public final class a extends db5.p8 {

    /* renamed from: g, reason: collision with root package name */
    public final android.app.Activity f346170g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f346171h;

    public a(android.app.Activity activity, java.util.ArrayList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f346170g = activity;
        this.f346171h = data;
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c(int i17, boolean z17) {
        return null;
    }

    @Override // db5.p8
    public java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.util.ArrayList arrayList = this.f346171h;
        if (view != null) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.view.page.ImageQueryGalleryViewHolder");
            java.lang.String str = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) arrayList.get(i17)).f134739g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
            ((fn5.b) tag).a(str);
            return view;
        }
        android.view.View inflate = android.view.View.inflate(this.f346170g, com.p314xaae8f345.mm.R.C30864xbddafb2a.bki, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        fn5.b bVar = new fn5.b(inflate);
        inflate.setTag(bVar);
        java.lang.String str2 = ((com.p314xaae8f345.mm.api.C4988x89c61bdd) arrayList.get(i17)).f134739g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getScanImagePath(...)");
        bVar.a(str2);
        return inflate;
    }

    @Override // db5.p8
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f f(int i17, boolean z17) {
        android.view.View e17 = e(i17);
        if (e17 == null) {
            return null;
        }
        android.view.View findViewById = e17.findViewById(com.p314xaae8f345.mm.R.id.h_l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        if (z17 && findViewById.getVisibility() == 8) {
            return null;
        }
        return (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f) findViewById;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f346171h.size();
    }
}
