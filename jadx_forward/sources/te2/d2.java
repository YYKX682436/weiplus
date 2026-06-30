package te2;

/* loaded from: classes14.dex */
public final class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final qo0.c f499474h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499475i;

    /* renamed from: m, reason: collision with root package name */
    public final te2.b2 f499476m;

    /* renamed from: n, reason: collision with root package name */
    public te2.a3 f499477n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f499478o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(android.content.Context context, qo0.c statusMonitor, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.b2 b2Var) {
        super(context, false, null, false, 14, null);
        android.view.View findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f499474h = statusMonitor;
        this.f499475i = activity;
        this.f499476m = b2Var;
        if (context.getResources().getConfiguration().orientation == 2 && (findViewById = this.f199917g.f526370d.findViewById(com.p314xaae8f345.mm.R.id.f6b)) != null) {
            findViewById.setRotation(0.0f);
        }
        android.view.View findViewById2 = this.f199917g.f526369c.b().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.jhc);
        if (findViewById2 != null) {
            findViewById2.setImportantForAccessibility(2);
        }
        android.view.View findViewById3 = this.f199917g.f526370d.findViewById(com.p314xaae8f345.mm.R.id.f6b);
        if (findViewById3 == null) {
            return;
        }
        findViewById3.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ekn));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dab;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public jz5.l k() {
        android.content.Context context = this.f199914d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.okf);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oke);
        return new jz5.l(string, string2 != null ? string2 : "");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.okf);
        return string == null ? "" : string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f499478o = rootView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        gk2.e eVar;
        super.t();
        if (this.f499477n == null) {
            return;
        }
        te2.a3 y17 = y();
        x91.h hVar = null;
        qo0.c.a(y17.f499390e, qo0.b.f446889g4, null, 2, null);
        te2.b2 b2Var = y17.f499392g;
        if (b2Var != null && (eVar = ((te2.l2) b2Var).f499724d) != null) {
            hVar = ((je2.i) eVar.a(je2.i.class)).f380768f;
        }
        if (hVar != null || b2Var == null) {
            return;
        }
        ((te2.l2) b2Var).f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        gk2.e eVar;
        super.w();
        if (this.f499477n == null) {
            return;
        }
        te2.a3 y17 = y();
        te2.b2 b2Var = y17.f499392g;
        if (((b2Var == null || (eVar = ((te2.l2) b2Var).f499724d) == null) ? null : ((je2.i) eVar.a(je2.i.class)).f380768f) != null) {
            ((te2.l2) b2Var).g();
            y17.g(y17.f499397o);
        } else {
            y17.f499407y = y17.f499394i;
            if (b2Var != null) {
                ((te2.l2) b2Var).g();
            }
            y17.g(0);
        }
    }

    public final te2.a3 y() {
        te2.a3 a3Var = this.f499477n;
        if (a3Var != null) {
            return a3Var;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
        throw null;
    }
}
