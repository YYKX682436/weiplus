package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class z2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152721f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152722g;

    public z2(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, int i17, int i18) {
        this.f152722g = l3Var;
        this.f152719d = str;
        this.f152720e = i17;
        this.f152721f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var = this.f152722g;
        java.util.HashMap hashMap = (java.util.HashMap) l3Var.f152596f;
        java.lang.String str = this.f152719d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2();
            am.hn hnVar = c5814x771f4db2.f136121g;
            hnVar.f88377a = 3;
            hnVar.f88378b = 0;
            hnVar.f88379c = str;
            int i17 = this.f152720e;
            hnVar.f88380d = i17;
            int i18 = this.f152721f;
            hnVar.f88381e = i18;
            c5814x771f4db2.e();
            if (i17 != 0 || i18 < oVar.G1) {
                return;
            }
            l3Var.l(t21.d3.i(oVar.E1, oVar.f323347b2, oVar.X1), oVar.G1, oVar.F1, oVar);
        }
    }
}
