package nj2;

/* loaded from: classes10.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f419356h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f419357i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f419358m;

    /* renamed from: n, reason: collision with root package name */
    public final kj2.o f419359n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f419360o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f419361p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context, gk2.e liveData, pj2.b service) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f419356h = liveData;
        android.view.View view = this.f419357i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View inviteListLayout = view.findViewById(com.p314xaae8f345.mm.R.id.qtx);
        this.f419358m = inviteListLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inviteListLayout, "inviteListLayout");
        this.f419359n = new kj2.o(inviteListLayout, liveData, service, new ii2.c(new ii2.a(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560847vu), new android.graphics.Rect(0, 0, 0, 1), ii2.b.f373155e, null, 8, null)), new nj2.a(this, context));
        android.view.View view2 = this.f419357i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        this.f419360o = view2.findViewById(com.p314xaae8f345.mm.R.id.nhc);
        android.view.View view3 = this.f419357i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        this.f419361p = view3.findViewById(com.p314xaae8f345.mm.R.id.imn);
        this.f199917g.c(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cle));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570372ba4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hky);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f419357i = rootView;
        android.view.ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.p314xaae8f345.mm.ui.bl.b(rootView.getContext()).y * 2) / 3;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        this.f419359n.b();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        this.f419359n.f();
    }
}
