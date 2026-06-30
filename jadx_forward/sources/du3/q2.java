package du3;

/* loaded from: classes3.dex */
public final class q2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.s2 f325219d;

    public q2(du3.s2 s2Var) {
        this.f325219d = s2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.c1 c1Var = (hk0.c1) obj;
        du3.s2 s2Var = this.f325219d;
        if (s2Var.D().R6(5)) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) s2Var.f325231g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view = (android.view.View) mo141623x754a37bb;
            int i17 = c1Var.f363245b ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoMosaicPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
