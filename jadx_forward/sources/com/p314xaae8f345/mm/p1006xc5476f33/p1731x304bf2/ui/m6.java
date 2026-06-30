package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui;

/* loaded from: classes4.dex */
public class m6 implements android.view.View.OnClickListener, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f223009d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b f223010e = null;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f223011f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f223012g;

    public m6(android.content.Context context) {
        this.f223009d = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameSubscriptionClickListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f223010e = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b) view.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameSubscriptionClickListener", "Clicked appid = " + this.f223010e.f67370x28d45f97);
        gm0.j1.d().a(1219, this);
        java.lang.String d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.b bVar = this.f223010e;
        gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k3(bVar.f67370x28d45f97, d17, bVar.f221743m2, bVar.f221751u2));
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameSubscriptionClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l6 l6Var;
        android.content.Context context = this.f223009d;
        if (i17 != 0 || i18 != 0 || m1Var.mo808xfb85f7b0() != 1219) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(context);
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.fpl);
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.fpk);
            i0Var.h();
            return;
        }
        gm0.j1.d().q(1219, this);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.k3) m1Var).f221887e.f152244b.f152233a;
        m53.k5 k5Var = fVar == null ? new m53.k5() : (m53.k5) fVar;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(k5Var.f405383d);
        java.lang.String str2 = k5Var.f405384e;
        java.lang.String str3 = k5Var.f405385f;
        m53.s sVar = k5Var.f405386g;
        if (sVar != null) {
            l6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.l6();
            l6Var.f222992a = sVar.f405567d;
            l6Var.f222993b = sVar.f405568e;
            l6Var.f222994c = sVar.f405569f;
            l6Var.f222995d = sVar.f405570g;
        } else {
            l6Var = null;
        }
        this.f223010e.f221744n2 = valueOf.booleanValue();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        if (l6Var == null) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = str2;
            aVar.f293262s = str3;
            aVar.A = false;
            aVar.f293265v = of5.b.a(context).getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpk);
            aVar.E = this.f223011f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            return;
        }
        java.lang.String str4 = l6Var.f222995d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar2.f293242a = str2;
        aVar2.f293262s = l6Var.f222992a;
        aVar2.A = false;
        aVar2.f293265v = l6Var.f222993b;
        aVar2.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.k6(this, str4);
        aVar2.Z = true;
        aVar2.f293266w = l6Var.f222994c;
        aVar2.F = this.f223011f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var2.e(aVar2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var2 = aVar2.f293256m;
        if (d0Var2 != null) {
            d0Var2.a(j0Var2.f293370r);
        }
        j0Var2.show();
    }
}
