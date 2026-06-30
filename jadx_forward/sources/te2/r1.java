package te2;

/* loaded from: classes3.dex */
public final class r1 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f499901d;

    public r1(java.util.List tabs) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabs, "tabs");
        this.f499901d = tabs;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: destroyItem */
    public void mo7741x89d2022d(android.view.ViewGroup container, int i17, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        container.removeView((android.view.View) any);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getCount */
    public int mo8338x7444f759() {
        return this.f499901d.size();
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: getPageTitle */
    public java.lang.CharSequence mo8340x337c8253(int i17) {
        java.util.List list = this.f499901d;
        int ordinal = ((te2.u1) list.get(i17)).m166331xfb85f7b0().ordinal();
        if (ordinal == 0) {
            java.lang.String string = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqp);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            return string;
        }
        if (ordinal == 1) {
            java.lang.String string2 = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            return string2;
        }
        if (ordinal != 2) {
            return "";
        }
        java.lang.String string3 = ((te2.u1) list.get(i17)).getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string3);
        return string3;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: instantiateItem */
    public java.lang.Object mo7744x8d1aed1d(android.view.ViewGroup container, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        te2.u1 u1Var = (te2.u1) this.f499901d.get(i17);
        container.addView(u1Var);
        return u1Var;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.a
    /* renamed from: isViewFromObject */
    public boolean mo7745xc5a713d8(android.view.View view, java.lang.Object any) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(any, "any");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, any);
    }
}
