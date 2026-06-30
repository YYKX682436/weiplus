package ir;

/* loaded from: classes12.dex */
public final class i0 extends ir.u0 {

    /* renamed from: b, reason: collision with root package name */
    public final ir.r f375399b;

    /* renamed from: c, reason: collision with root package name */
    public r45.v75 f375400c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f375401d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f375402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ir.r groupInfo) {
        super(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupInfo, "groupInfo");
        this.f375399b = groupInfo;
    }

    @Override // ir.u0
    public boolean a(java.lang.Object obj) {
        if (mo139714xb2c87fbf(obj) && (obj instanceof ir.i0)) {
            ir.i0 i0Var = (ir.i0) obj;
            r45.v75 v75Var = i0Var.f375400c;
            java.lang.Integer valueOf = v75Var != null ? java.lang.Integer.valueOf(v75Var.f469497d) : null;
            r45.v75 v75Var2 = this.f375400c;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, v75Var2 != null ? java.lang.Integer.valueOf(v75Var2.f469497d) : null)) {
                r45.v75 v75Var3 = i0Var.f375400c;
                java.lang.String str = v75Var3 != null ? v75Var3.f469498e : null;
                r45.v75 v75Var4 = this.f375400c;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, v75Var4 != null ? v75Var4.f469498e : null)) {
                    r45.v75 v75Var5 = i0Var.f375400c;
                    java.lang.String str2 = v75Var5 != null ? v75Var5.f469499f : null;
                    r45.v75 v75Var6 = this.f375400c;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, v75Var6 != null ? v75Var6.f469499f : null)) {
                        r45.v75 v75Var7 = i0Var.f375400c;
                        java.lang.String str3 = v75Var7 != null ? v75Var7.f469500g : null;
                        r45.v75 v75Var8 = this.f375400c;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str3, v75Var8 != null ? v75Var8.f469500g : null)) {
                            r45.v75 v75Var9 = i0Var.f375400c;
                            java.lang.String str4 = v75Var9 != null ? v75Var9.f469502i : null;
                            r45.v75 v75Var10 = this.f375400c;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, v75Var10 != null ? v75Var10.f469502i : null)) {
                                r45.v75 v75Var11 = i0Var.f375400c;
                                java.lang.String str5 = v75Var11 != null ? v75Var11.f469503m : null;
                                r45.v75 v75Var12 = this.f375400c;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str5, v75Var12 != null ? v75Var12.f469503m : null) && i0Var.f375401d == this.f375401d) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ir.u0
    /* renamed from: equals */
    public boolean mo139714xb2c87fbf(java.lang.Object obj) {
        return super.mo139714xb2c87fbf(obj) && (obj instanceof ir.i0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ir.i0) obj).f375399b.c(), this.f375399b.c());
    }
}
