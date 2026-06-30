package qw2;

/* loaded from: classes10.dex */
public final class l extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f448668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 f448669e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3) {
        this.f448669e = c15211x75b8b4d3;
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        this.f448668d = arrayList;
        arrayList.add(null);
        arrayList.add(null);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        container.removeView((android.view.View) obj);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return 2;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3 = this.f448669e;
        return i17 == 0 ? c15211x75b8b4d3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hu_) : c15211x75b8b4d3.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hua);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        boolean z17 = i17 == 1;
        android.view.View inflate = android.view.LayoutInflater.from(container.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.agd, container, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3 = this.f448669e;
        qw2.k kVar = new qw2.k(c15211x75b8b4d3, inflate, z17);
        if (z17) {
            c15211x75b8b4d3.m61589xd6a75ad5();
        } else {
            c15211x75b8b4d3.m61587xbd9492e8();
        }
        this.f448668d.set(i17, kVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = kVar.f448666b;
        container.addView(c1163xf1deaba4);
        return c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, obj);
    }
}
