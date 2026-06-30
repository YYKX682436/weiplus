package du3;

/* loaded from: classes3.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f325300d;

    public x3(du3.h4 h4Var) {
        this.f325300d = h4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.l lVar;
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "forward click");
        hk0.u0 C = this.f325300d.C();
        hk0.z zVar = C.f363351i;
        java.util.LinkedList linkedList = zVar.f363383b;
        if (linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "when forward data is empty");
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            lVar = new jz5.l(new jz5.l(bool, bool), null);
        } else {
            hk0.k kVar = (hk0.k) kz5.n0.i0(linkedList);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("forward lastEdit >> ");
            sb6.append(kVar.f363291b);
            sb6.append(' ');
            hk0.l lVar2 = kVar.f363290a;
            sb6.append(lVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", sb6.toString());
            if (lVar2 == hk0.l.f363298f) {
                java.util.LinkedList linkedList2 = zVar.f363389h;
                java.lang.String str = kVar.f363291b;
                linkedList2.addLast(str);
                hk0.d dVar = (hk0.d) zVar.f363384c.get(str);
                if (dVar != null) {
                    zVar.f363391j = zVar.f363390i;
                    zVar.f363390i = dVar.f363248d;
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoDataModel", "forward >> error restore crop");
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoDataModel", "forward add crop");
            }
            zVar.f363382a.add(kVar);
            linkedList.removeLast();
            lVar = new jz5.l(new jz5.l(java.lang.Boolean.valueOf(!r0.isEmpty()), java.lang.Boolean.valueOf(!linkedList.isEmpty())), kVar);
        }
        jz5.l lVar3 = (jz5.l) lVar.f384366d;
        hk0.k kVar2 = (hk0.k) lVar.f384367e;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("forwardEdit >> ");
        sb7.append(((java.lang.Boolean) lVar3.f384366d).booleanValue());
        sb7.append(", ");
        java.lang.Boolean bool2 = (java.lang.Boolean) lVar3.f384367e;
        sb7.append(bool2.booleanValue());
        sb7.append((char) 65292);
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
        p3325xe03a0797.p3326xc267989b.l.d(C.f363355p, null, null, new hk0.k0(C, arrayList2, kVar2, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$initLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
