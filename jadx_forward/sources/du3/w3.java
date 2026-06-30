package du3;

/* loaded from: classes3.dex */
public final class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f325295d;

    public w3(du3.h4 h4Var) {
        this.f325295d = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.l lVar;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "undo click");
        hk0.u0 C = this.f325295d.C();
        hk0.z zVar = C.f363351i;
        java.util.LinkedList linkedList = zVar.f363382a;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "when undo editState data is empty");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar = new jz5.l(new jz5.l(bool, bool), null);
        } else {
            hk0.k kVar = (hk0.k) linkedList.getLast();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("undo lastEdit >> ");
            sb6.append(kVar.f363291b);
            sb6.append(' ');
            hk0.l lVar2 = kVar.f363290a;
            sb6.append(lVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", sb6.toString());
            if (lVar2 == hk0.l.f363298f) {
                java.util.LinkedList linkedList2 = zVar.f363389h;
                if (linkedList2.isEmpty()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "undo currentCropEditDataList >> error restore crop");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "undo >> remove crop " + kVar.f363291b + ", " + ((java.lang.String) linkedList2.removeLast()));
                    if (linkedList2.isEmpty()) {
                        zVar.f363391j = zVar.f363390i;
                        zVar.f363390i = 0;
                        zVar.f363392k = false;
                    } else {
                        hk0.d dVar = (hk0.d) zVar.f363384c.get(linkedList2.getLast());
                        if (dVar != null) {
                            zVar.f363391j = zVar.f363390i;
                            zVar.f363390i = dVar.f363248d;
                            f0Var = jz5.f0.f384359a;
                        } else {
                            f0Var = null;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "undo >> error restore crop");
                        }
                    }
                }
            }
            zVar.f363383b.add(kVar);
            linkedList.removeLast();
            lVar = new jz5.l(new jz5.l(java.lang.Boolean.valueOf(!linkedList.isEmpty()), java.lang.Boolean.valueOf(!r0.isEmpty())), kVar);
        }
        jz5.l lVar3 = (jz5.l) lVar.f384366d;
        hk0.k kVar2 = (hk0.k) lVar.f384367e;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("undoEdit >> ");
        sb7.append(((java.lang.Boolean) lVar3.f384366d).booleanValue());
        sb7.append(", ");
        java.lang.Boolean bool2 = (java.lang.Boolean) lVar3.f384367e;
        sb7.append(bool2.booleanValue());
        sb7.append(", ");
        sb7.append(kVar2 != null ? kVar2.f363291b : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoStateModel", sb7.toString());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("BUNDLE_KEY_BOOLEAN_1", ((java.lang.Boolean) lVar3.f384366d).booleanValue());
        arrayList2.add(new hk0.j(1, bundle));
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBoolean("BUNDLE_KEY_BOOLEAN_1", bool2.booleanValue());
        arrayList2.add(new hk0.j(2, bundle2));
        arrayList2.add(C.U6());
        p3325xe03a0797.p3326xc267989b.l.d(C.f363355p, null, null, new hk0.q0(C, arrayList2, kVar2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
