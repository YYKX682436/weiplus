package df2;

/* loaded from: classes3.dex */
public final class fd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.od f311667d;

    public fd(df2.od odVar) {
        this.f311667d = odVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBannerController$getBannerViewOnLiving$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.od odVar = this.f311667d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14408x406bfa38 c14408x406bfa38 = odVar.f312488o;
        if (c14408x406bfa38 != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xw(false, c14408x406bfa38));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rx rxVar = odVar.f312487n;
        if (rxVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(rxVar, null, false, 0, 7, null);
        }
        df2.od.f312485w.a(odVar.getStore().getLiveRoomData(), 2, 1, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBannerController$getBannerViewOnLiving$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
