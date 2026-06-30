package xc5;

/* loaded from: classes12.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f535085d;

    public q(xc5.h0 h0Var) {
        this.f535085d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 h07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.h0 h0Var = this.f535085d;
        mf3.s sVar = h0Var.f407643m;
        if (sVar != null && (kVar = sVar.f407650a) != null && (h07 = h0Var.h0()) != null) {
            if (h0Var.f535000y) {
                h0Var.f535000y = false;
                kVar.f(mf3.w.f407661d);
                lg3.a aVar = h0Var.f534998w;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).h(kVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                }
            } else {
                h0Var.f535000y = true;
                kVar.f(mf3.w.f407662e);
                lg3.a aVar2 = h0Var.f534998w;
                if (aVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar, new vf3.f(vf3.e.f517913g, null, 0, 0.0f, 6, null));
                }
                h0Var.b0();
                p3325xe03a0797.p3326xc267989b.l.d(h0Var.f535001z, null, null, new xc5.e0(h07, h0Var, kVar, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
