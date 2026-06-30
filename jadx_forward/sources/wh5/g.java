package wh5;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f527594d;

    public g(wh5.s sVar) {
        this.f527594d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        mf3.k kVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s sVar = this.f527594d;
        mf3.s sVar2 = sVar.f407643m;
        if (sVar2 != null && (kVar = sVar2.f407650a) != null && (aVar = (vf3.a) sVar.H(vf3.a.class)) != null && (X6 = ((vf3.i) aVar).X6(kVar)) != null) {
            vf3.e eVar = X6.f517922a;
            vf3.e eVar2 = vf3.e.f517913g;
            if (eVar == eVar2) {
                mf3.w mo147256x74bf41ce = kVar.mo147256x74bf41ce();
                mf3.w wVar = mf3.w.f407662e;
                if (mo147256x74bf41ce == wVar) {
                    sVar.Q("cancelDownloadHD", new java.lang.Object[0]);
                    mf3.s sVar3 = sVar.f407643m;
                    if (sVar3 != null && (kVar2 = sVar3.f407650a) != null && kVar2.mo147256x74bf41ce() == wVar) {
                        sVar.Q("cancelDownload execute", new java.lang.Object[0]);
                        vf3.a aVar2 = (vf3.a) sVar.H(vf3.a.class);
                        if (aVar2 != null) {
                            aVar2.x6(kVar2);
                        }
                    }
                    lg3.a aVar3 = sVar.f527623w;
                    if (aVar3 != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).h(kVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                    }
                }
            }
            if (X6.f517922a != eVar2 || kVar.mo147256x74bf41ce() != mf3.w.f407661d) {
                sVar.Q("tryDownloadHD", new java.lang.Object[0]);
                sVar.l0();
            } else if (sVar.A) {
                sVar.Q("cancel wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar4 = sVar.f527623w;
                if (aVar4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar4).h(kVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
                }
                sVar.A = false;
            } else {
                sVar.Q("try wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar5 = sVar.f527623w;
                if (aVar5 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar5).h(kVar, new vf3.f(vf3.e.f517912f, null, 0, 0.0f, 6, null));
                }
                sVar.A = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
