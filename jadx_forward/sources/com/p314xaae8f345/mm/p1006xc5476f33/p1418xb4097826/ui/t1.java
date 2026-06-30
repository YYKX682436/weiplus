package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class t1 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 f211387d;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81) {
        this.f211387d = activityC15014x7ce71a81;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81 = this.f211387d;
            if (a07 < activityC15014x7ce71a81.f210057v.size()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = ((so2.i0) activityC15014x7ce71a81.f210057v.get(a07)).f491948d;
                if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(c19782x23db1cfa.m76197x6c03c64c())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15014x7ce71a81.mo55332x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                    i0Var.Bk(m76197x6c03c64c, mo55332x76847179);
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("finder_username", c19782x23db1cfa.m76197x6c03c64c());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                i0Var2.mk(context, intent);
            }
        }
    }
}
