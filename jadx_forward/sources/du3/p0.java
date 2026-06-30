package du3;

/* loaded from: classes3.dex */
public final class p0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t0 f325208d;

    public p0(du3.t0 t0Var) {
        this.f325208d = t0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17;
        du3.t0 t0Var = this.f325208d;
        java.lang.Object mo141623x754a37bb = ((jz5.n) t0Var.f325242g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        if (((hk0.o) obj).f363316b) {
            nu3.i iVar = nu3.i.f421751a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            if (t0Var.f325245m.f338355e == -1) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A = t0Var.A();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "Undefined", "scrollToPosition", "(I)V");
                A.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "Undefined", "scrollToPosition", "(I)V");
            }
            i17 = 0;
        } else {
            i17 = 4;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBrushPlugin$onAttach$1", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
