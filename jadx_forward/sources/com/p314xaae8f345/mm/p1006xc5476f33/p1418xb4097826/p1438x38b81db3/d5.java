package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class d5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f184656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f184657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184658f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f184659g;

    public d5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, zy2.gc gcVar, android.content.Context context, boolean z17) {
        this.f184656d = u3Var;
        this.f184657e = gcVar;
        this.f184658f = context;
        this.f184659g = z17;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.String string;
        r45.wh2 req = (r45.wh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f184656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        zy2.gc gcVar = this.f184657e;
        if (gcVar != null) {
            gcVar.r5(req, ret);
        }
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        boolean z17 = this.f184659g;
        android.content.Context context = this.f184658f;
        if (m75939xb282bd08 == 0) {
            string = context.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.cpl : com.p314xaae8f345.mm.R.C30867xcad56011.f572844cq0);
        } else {
            string = context.getResources().getString(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.cpk : com.p314xaae8f345.mm.R.C30867xcad56011.cpz);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        db5.t7.m(context, string);
    }
}
