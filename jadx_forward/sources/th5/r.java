package th5;

/* loaded from: classes12.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.w f500988d;

    public r(th5.w wVar) {
        this.f500988d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        rf3.u uVar;
        mf3.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.w wVar = this.f500988d;
        mf3.s sVar2 = wVar.f407643m;
        java.lang.Object obj = sVar2 != null ? sVar2.f407650a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        if (oVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mf3.w wVar2 = oVar.f500954f;
        mf3.w wVar3 = mf3.w.f407662e;
        if (wVar2 == wVar3 && oVar.f500957i < 1.0f) {
            yz5.a aVar = oVar.f500959k;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            wVar.a0();
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (wVar2 == wVar3) {
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        oVar.f500954f = wVar3;
        wVar.b0();
        lg3.a aVar2 = wVar.f501005w;
        if (aVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(oVar, new vf3.f(vf3.e.f517913g, null, 0, 0.0f, 6, null));
        }
        rf3.q qVar = (rf3.q) wVar.g(rf3.q.class);
        if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f407643m) != null) {
            uVar.t(sVar);
        }
        th5.v0.f501003a.a(oVar.f500877c, oVar.f500875a, oVar.f500876b, th5.a.f500866e, th5.e.f500900f);
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
