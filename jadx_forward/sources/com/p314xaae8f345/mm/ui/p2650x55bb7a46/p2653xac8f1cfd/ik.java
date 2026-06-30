package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class ik implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk f280767d;

    public ik(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar) {
        this.f280767d = jkVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk jkVar = this.f280767d;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) jkVar.f280838s.getItem(i17);
        if (f9Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.Q0())) {
            jkVar.p0();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5) ((sb5.d0) jkVar.f280113d.f542241c.a(sb5.d0.class));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) b5Var.f280113d.f542241c.a(sb5.z.class));
            if (kVar.W0(tg3.l1.a(f9Var))) {
                b5Var.f280227e.c(kVar.L0());
                b5Var.f280227e.setVisibility(0);
                b5Var.f280228f.b();
            }
            if (!jkVar.f280834o) {
                jkVar.f280834o = true;
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) jkVar.f280113d.f542252n).h1(true);
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) jkVar.f280113d.f542251m).f279802t.mo75773xf7ca0f7b(0);
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) jkVar.f280113d.f542252n).B.m79088x648e109b(false);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) jkVar.f280113d.f542252n).i1(false);
            sb5.z zVar = (sb5.z) jkVar.f280113d.f542241c.a(sb5.z.class);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar;
            kVar2.T0(f9Var.Q0(), f9Var.m124847x74d37ac6(), hd5.n.ACTION_POSITION, new sb5.y());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/SearchComponent$9", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
