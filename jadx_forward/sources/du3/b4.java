package du3;

/* loaded from: classes3.dex */
public final class b4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f325078d;

    public b4(du3.h4 h4Var) {
        this.f325078d = h4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.view.View A = this.f325078d.A();
        int i17 = ((hk0.c1) obj).f363245b ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$4", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$4", "onChanged", "(Lcom/tencent/mm/improve_edit/ViewState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
