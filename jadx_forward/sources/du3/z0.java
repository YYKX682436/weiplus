package du3;

/* loaded from: classes3.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.i1 f325310d;

    public z0(du3.i1 i1Var) {
        this.f325310d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoCropPlugin", "onClick crop cancel");
        hk0.u0 C = this.f325310d.C();
        C.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", "doCropCancel");
        hk0.z zVar = C.f363351i;
        zVar.f363392k = false;
        zVar.f363390i = zVar.f363391j;
        zVar.f363393l = false;
        hk0.j U6 = C.U6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(U6);
        arrayList2.add(new hk0.j(8, new android.os.Bundle()));
        p3325xe03a0797.p3326xc267989b.l.d(C.f363355p, null, null, new hk0.i0(C, arrayList2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoCropPlugin$initLogic$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
