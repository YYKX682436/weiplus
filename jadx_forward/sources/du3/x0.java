package du3;

/* loaded from: classes3.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f325297d;

    public x0(du3.i1 i1Var) {
        this.f325297d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "update rotate");
        hk0.u0 C = this.f325297d.C();
        int i17 = (C.f363351i.f363390i + 90) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateRotate >> " + i17 + ' ' + C.f363351i.f363390i);
        hk0.z zVar = C.f363351i;
        zVar.f363390i = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateRotate >> " + zVar.f363390i);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hk0.j U6 = C.U6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(U6);
        arrayList2.add(new hk0.j(5, new android.os.Bundle()));
        p3325xe03a0797.p3326xc267989b.l.d(C.f363355p, null, null, new hk0.s0(C, arrayList2, null), 3, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "updateRotate >> " + f0Var);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
