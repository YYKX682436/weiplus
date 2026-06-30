package hr3;

/* loaded from: classes4.dex */
public final class ub extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f365614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe f365615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16862xafeaf932 f365616f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365617g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16862xafeaf932 activityC16862xafeaf932, java.lang.String str) {
        super(1);
        this.f365614d = u3Var;
        this.f365615e = c21541x1c1b08fe;
        this.f365616f = activityC16862xafeaf932;
        this.f365617g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f365614d.hide();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = this.f365615e;
        if (booleanValue) {
            java.lang.String str = this.f365617g;
            k41.g0 c17 = k41.o0.c(str);
            if (c17 != null) {
                c17.f68603x672cb5cf = c21541x1c1b08fe.N();
                c17.f68598xec0735e1 = true;
                k41.o0.f(c17);
                if (java.lang.Boolean.valueOf(c17.f68603x672cb5cf).booleanValue()) {
                    l41.r1 r1Var = l41.r1.f397446a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    java.lang.String field_locationType = c17.f68602x8b26fb4;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_locationType, "field_locationType");
                    l41.r1.b(r1Var, str, field_locationType, 3, null, 8, null);
                }
            }
        } else {
            c21541x1c1b08fe.S(!c21541x1c1b08fe.N());
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16862xafeaf932 activityC16862xafeaf932 = this.f365616f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16862xafeaf932.mo55332x76847179();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293262s = activityC16862xafeaf932.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0f);
            aVar.f293265v = activityC16862xafeaf932.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0e);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
        }
        return jz5.f0.f384359a;
    }
}
