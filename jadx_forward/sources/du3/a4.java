package du3;

/* loaded from: classes3.dex */
public final class a4 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.h4 f325045d;

    public a4(du3.h4 h4Var) {
        this.f325045d = h4Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        boolean z17 = ((hk0.o) obj).f363316b;
        du3.h4 h4Var = this.f325045d;
        if (z17) {
            android.view.View A = h4Var.A();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            A.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (h4Var.C().R6(2) || h4Var.C().R6(3)) {
            return;
        }
        android.view.View A2 = h4Var.A();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(A2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(A2, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin$onAttach$3", "onChanged", "(Lcom/tencent/mm/improve_edit/FuncState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
