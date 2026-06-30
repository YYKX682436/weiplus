package cw1;

/* renamed from: cw1.u2$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC28142x6880464 implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj = new java.lang.Object();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
        java.lang.Object obj2 = new java.lang.Object();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array2 = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
        cw1.c cVar = (cw1.c) view.getTag();
        android.content.Intent intent = new android.content.Intent();
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = cVar.f304365a;
        final long j17 = cVar.f304367c;
        cj6.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                f9Var = ot0.c3.l().g("getNewestMsgByCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$g5
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return ot0.z2.f430355a.w0(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, j17);
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$h5
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                        g9Var.getClass();
                        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                        android.database.Cursor f17 = g9Var.f275522r.f("select * from " + X8 + " where" + g9Var.Z8(str) + "and createTime > " + j17 + "  order by createTime ASC limit 1", null, 2);
                        if (f17.moveToFirst()) {
                            f9Var2.mo9015xbf5d97fd(f17);
                        }
                        f17.close();
                        return f9Var2;
                    }
                });
            } else if (cj6.Pb(X8)) {
                f9Var = ot0.z2.f430355a.w0(cj6.f275522r, X8, str, j17);
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                android.database.Cursor f17 = cj6.f275522r.f("select * from " + X8 + " where" + cj6.Z8(str) + "and createTime > " + j17 + "  order by createTime ASC limit 1", null, 2);
                if (f17.moveToFirst()) {
                    f9Var2.mo9015xbf5d97fd(f17);
                }
                f17.close();
                f9Var = f9Var2;
            }
        }
        if (f9Var != null && f9Var.m124847x74d37ac6() > 0) {
            intent.putExtra("msg_local_id", f9Var.m124847x74d37ac6());
        }
        intent.putExtra("KHalfScreenUIC", ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(3));
        ((sy.z) ((ty.j0) i95.n0.c(ty.j0.class))).Ai(cVar.f304365a, intent);
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
