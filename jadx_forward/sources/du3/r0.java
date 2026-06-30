package du3;

/* loaded from: classes3.dex */
public final class r0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f325221d;

    public r0(du3.t0 t0Var) {
        this.f325221d = t0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.g gVar = (hk0.g) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeDoodleState >> ");
        sb6.append(gVar.f363267a.f363257a);
        sb6.append(", ");
        hk0.e eVar = gVar.f363268b;
        sb6.append(eVar.f363257a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoBrushPlugin", sb6.toString());
        hk0.e eVar2 = gVar.f363267a;
        hk0.h hVar = eVar2.f363257a;
        hk0.h hVar2 = eVar.f363257a;
        if (hVar2 == hVar) {
            return;
        }
        hk0.h hVar3 = hk0.h.f363274f;
        du3.t0 t0Var = this.f325221d;
        if (hVar2 == hVar3) {
            t0Var.z().setBackground(null);
        } else if (hVar2 == hk0.h.f363273e && hVar == hVar3) {
            eu3.c cVar = t0Var.f325245m;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoBrushListAdapter", "cancelSelectBrush " + cVar.f338355e);
            cVar.f338355e = -1;
            android.view.View view = cVar.f338356f;
            if (view != null) {
                cVar.x(view, 1.0f);
            }
        }
        if (hVar == hVar3) {
            t0Var.z().setBackground(i65.a.i(t0Var.f325241f.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.cjs));
            return;
        }
        if (hVar == hk0.h.f363273e) {
            if (hVar2 == hk0.h.f363272d || hVar2 == hVar3) {
                int i17 = t0Var.f325245m.f338355e;
                int i18 = eVar2.f363259c;
                if (i17 == -1 && i18 != 2) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A = t0Var.A();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/DoodleState;)V", "Undefined", "scrollToPosition", "(I)V");
                    A.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/DoodleState;)V", "Undefined", "scrollToPosition", "(I)V");
                }
                eu3.c cVar2 = t0Var.f325245m;
                if (cVar2.f338355e != i18) {
                    cVar2.f338355e = i18;
                    if (i18 == 2) {
                        cVar2.f338356f = cVar2.f338359i;
                    }
                    android.view.View view2 = cVar2.f338356f;
                    if (view2 != null) {
                        view2.setScaleX(1.4f);
                    }
                    android.view.View view3 = cVar2.f338356f;
                    if (view3 == null) {
                        return;
                    }
                    view3.setScaleY(1.4f);
                }
            }
        }
    }
}
