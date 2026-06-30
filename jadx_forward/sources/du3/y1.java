package du3;

/* loaded from: classes3.dex */
public final class y1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.g2 f325307d;

    public y1(du3.g2 g2Var) {
        this.f325307d = g2Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.View B = this.f325307d.B();
        int i17 = ((hk0.c1) obj).f363245b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(B, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$7", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        B.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(B, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoFuncPlugin$onAttach$7", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
