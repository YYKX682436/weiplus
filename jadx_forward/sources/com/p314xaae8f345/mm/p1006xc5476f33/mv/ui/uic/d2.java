package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d2 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 f232628a;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68) {
        this.f232628a = c16668xffb9dd68;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.b
    public void a(int i17) {
        fm3.u uVar;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68 c16668xffb9dd68 = this.f232628a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c16668xffb9dd68.f232507d, "onPageSettle:" + i17 + ", lastPos:" + c16668xffb9dd68.f232515o);
        if (c16668xffb9dd68.f232515o == i17) {
            return;
        }
        if (c16668xffb9dd68.f232523w) {
            r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(c16668xffb9dd68.m80379x76847179(), 7, r45.bt4.class);
            if (bt4Var != null) {
                bt4Var.f452569d = 13;
            }
        }
        c16668xffb9dd68.f232523w = false;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c16668xffb9dd68.f232509f;
        android.view.View view = (c22849x81a93d25 == null || (p07 = c22849x81a93d25.p0(i17)) == null) ? null : p07.f3639x46306858;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c16668xffb9dd68.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class);
        java.util.ArrayList arrayList = c16668xffb9dd68.f232510g;
        s1Var.U6(view, ((lm3.e) arrayList.get(i17)).f401015d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = c16668xffb9dd68.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0.class);
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        k0Var.P6(view, (lm3.e) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.Q6(c16668xffb9dd68, i17);
        c16668xffb9dd68.f232515o = i17;
        c16668xffb9dd68.c7(i17);
        lm3.e eVar = (lm3.e) kz5.n0.a0(arrayList, i17);
        if (eVar == null || (uVar = eVar.f401015d) == null) {
            return;
        }
        uVar.f345676w = 0L;
        uVar.f345677x = 0L;
    }
}
