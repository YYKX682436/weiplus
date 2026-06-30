package xc5;

/* loaded from: classes12.dex */
public final class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f534993d;

    public g2(xc5.s2 s2Var) {
        this.f534993d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.s2 s2Var = this.f534993d;
        mf3.s sVar = s2Var.f407643m;
        if (sVar != null && (kVar = sVar.f407650a) != null) {
            if (s2Var.f535100y) {
                s2Var.f535100y = false;
                gg3.b bVar = (gg3.b) s2Var.H(gg3.b.class);
                if (bVar != null) {
                    bVar.H5(kVar);
                }
                kVar.f(mf3.w.f407661d);
                lg3.a aVar = s2Var.f535098w;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).h(kVar, new vf3.f(vf3.e.f517916m, null, 0, 0.0f, 14, null));
                }
                s2Var.i0();
                s2Var.a0();
            } else {
                s2Var.f535100y = true;
                kVar.f(mf3.w.f407662e);
                lg3.a aVar2 = s2Var.f535098w;
                if (aVar2 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(kVar, new vf3.f(vf3.e.f517913g, null, 0, 0.0f, 6, null));
                }
                s2Var.b0();
                gg3.b bVar2 = (gg3.b) s2Var.H(gg3.b.class);
                if (bVar2 != null) {
                    bVar2.f4(kVar, new xc5.o2(s2Var, kVar), new xc5.p2(s2Var, kVar));
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
