package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 f206050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f3 f206051e;

    public d3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f3 f3Var) {
        this.f206050d = z9Var;
        this.f206051e = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar;
        r45.xs2 xs2Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.z9 z9Var = this.f206050d;
        if (z9Var != null && (jbVar = z9Var.f186862c) != null && (xs2Var = jbVar.N) != null && (m75934xbce7f2f = xs2Var.m75934xbce7f2f(11)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f3 f3Var = this.f206051e;
            java.lang.String e17 = xy2.c.e(f3Var.f206072a);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).yk(5, 2, "");
            r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("FinderProfileBanner", e17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderProfileBanner", e17, false, false, 12, null);
            if (S0 != null && b07 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a, "3", S0, b07, 2, f3Var.f206073b, 0, null, 0, 0, 480, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f3.a(f3Var, 1);
            i95.m c17 = i95.n0.c(c61.t8.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((c61.t8) c17).Bi(f3Var.f206072a, m75934xbce7f2f, "FinderMpCardEntry", e17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
