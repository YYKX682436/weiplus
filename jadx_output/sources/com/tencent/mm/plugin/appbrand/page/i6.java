package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f86753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f86754e;

    public i6(com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f86754e = v5Var;
        this.f86753d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f86754e;
        if (v5Var.r1() == null) {
            return;
        }
        al1.b r17 = v5Var.r1();
        int i17 = this.f86753d;
        r17.setForegroundColor(i17);
        v5Var.f3((i17 == -1 ? al1.j0.WHITE : al1.j0.BLACK).name());
    }
}
