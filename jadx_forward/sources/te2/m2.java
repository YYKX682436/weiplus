package te2;

/* loaded from: classes14.dex */
public final class m2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.a3 f499755d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p2 f499756e;

    public m2(te2.a3 a3Var, te2.p2 p2Var) {
        this.f499755d = a3Var;
        this.f499756e = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kn0.g gVar;
        r45.ka4 ka4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.a3 a3Var = this.f499755d;
        te2.b2 b2Var = a3Var.f499392g;
        if (b2Var != null) {
            x91.h hVar = this.f499756e.f499832a;
            te2.l2 l2Var = (te2.l2) b2Var;
            gk2.e eVar = l2Var.f499724d;
            kn0.i iVar = ((mm2.e1) eVar.a(mm2.e1.class)).f410523t;
            java.lang.String str = (iVar == null || (gVar = iVar.f391091b) == null || (ka4Var = gVar.f391081o) == null) ? null : ka4Var.f460092z;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = l2Var.f499725e;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "hlsUrl is nullOrNil!!, return");
            } else {
                ((je2.i) eVar.a(je2.i.class)).f380768f = hVar;
                x91.h hVar2 = ((je2.i) eVar.a(je2.i.class)).f380768f;
                if (hVar2 != null) {
                    hVar2.e(new te2.i2(l2Var, str));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "selectDevice: " + eVar + ".business(LiveCastScreenSlice::class.java).selectedDevice");
            }
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f409259h, a3Var.a());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback$DeviceAdapter$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
