package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227383d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227383d = c16344xea85a40c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeAppBarLayout", "[jump ecs] click");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227383d;
        if (c16344xea85a40c.E1.F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeAppBarLayout", "[jump ecs] no jump_info");
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(new pq.a(c16344xea85a40c.getContext()), c16344xea85a40c.E1.F, null);
        gb3.n.a(7);
        gb3.m.a(98, c16344xea85a40c.G1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.g1.f227406n++;
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
