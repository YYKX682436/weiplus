package com.p314xaae8f345.mm.p947xba6de98f;

/* loaded from: classes12.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f152566e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f152567f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p947xba6de98f.l3 f152568g;

    public k3(com.p314xaae8f345.mm.p947xba6de98f.l3 l3Var, java.lang.String str, int i17, int i18) {
        this.f152568g = l3Var;
        this.f152565d = str;
        this.f152566e = i17;
        this.f152567f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = (java.util.HashMap) this.f152568g.f152596f;
        java.lang.String str = this.f152565d;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null) {
            dn.n nVar = oVar.f323348c2;
            int i17 = this.f152567f;
            int i18 = this.f152566e;
            if (nVar != null) {
                nVar.mo65706x9bb59ea0(this.f152565d, i18, i17);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2();
            am.hn hnVar = c5814x771f4db2.f136121g;
            hnVar.f88377a = 2;
            hnVar.f88378b = 0;
            hnVar.f88379c = str;
            hnVar.f88380d = i18;
            hnVar.f88381e = i17;
            c5814x771f4db2.e();
        }
    }
}
