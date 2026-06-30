package th5;

/* loaded from: classes12.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f500920d;

    public i0(th5.l0 l0Var) {
        this.f500920d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        vf3.a aVar;
        vf3.f X6;
        lg3.a aVar2;
        lg3.a aVar3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.l0 l0Var = this.f500920d;
        mf3.s sVar = l0Var.f407643m;
        java.lang.Object obj = sVar != null ? sVar.f407650a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null && (aVar = (vf3.a) l0Var.H(vf3.a.class)) != null && (X6 = ((vf3.i) aVar).X6(qVar)) != null) {
            vf3.e eVar = X6.f517922a;
            vf3.e eVar2 = vf3.e.f517913g;
            if (eVar == eVar2 && qVar.f500983h == mf3.w.f407662e) {
                vf3.a aVar4 = (vf3.a) l0Var.H(vf3.a.class);
                if (aVar4 != null) {
                    aVar4.x6(qVar);
                }
                qVar.f500983h = mf3.w.f407661d;
                lg3.a aVar5 = l0Var.f500936x;
                if (aVar5 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar5).h(qVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                }
                long j17 = qVar.f500876b;
                if (j17 > 0 && (aVar3 = l0Var.f500936x) != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
                }
                l0Var.h0();
            } else if (eVar == eVar2 && qVar.f500983h == mf3.w.f407661d) {
                if (l0Var.f500938z) {
                    l0Var.f500938z = false;
                    lg3.a aVar6 = l0Var.f500936x;
                    if (aVar6 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar6).h(qVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                    }
                    long j18 = qVar.f500876b;
                    if (j18 > 0 && (aVar2 = l0Var.f500936x) != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).g(new vf3.b(0L, j18, 0L, 0L, 0L, false, 61, null));
                    }
                } else {
                    l0Var.f500938z = true;
                    lg3.a aVar7 = l0Var.f500936x;
                    if (aVar7 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar7).h(qVar, new vf3.f(vf3.e.f517912f, null, 0, 0.0f, 6, null));
                    }
                }
            } else if (qVar.f500983h != mf3.w.f407662e) {
                l0Var.j0();
                th5.v0.f501003a.a(qVar.f500877c, qVar.f500875a, qVar.f500876b, th5.a.f500866e, th5.e.f500900f);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
