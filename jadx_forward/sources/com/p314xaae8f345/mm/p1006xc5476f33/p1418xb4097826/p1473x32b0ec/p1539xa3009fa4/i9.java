package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class i9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 f198681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg2.a f198682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var, xg2.a aVar) {
        super(0);
        this.f198681d = v9Var;
        this.f198682e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9 v9Var = this.f198681d;
        android.widget.ProgressBar progressBar = v9Var.f199022h;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eib);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        rm0.j jVar = this.f198682e.f535912a;
        if (jVar != null && (str = jVar.f478959g) != null) {
            if (!(str.length() > 0)) {
                str = null;
            }
            if (str != null) {
                string = str;
            }
        }
        db5.t7.f(v9Var.m80379x76847179(), string, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h9.f198666a);
        return jz5.f0.f384359a;
    }
}
