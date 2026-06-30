package ku3;

/* loaded from: classes3.dex */
public final class j0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m0 f393813d;

    public j0(ku3.m0 m0Var) {
        this.f393813d = m0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ku3.m0 m0Var = this.f393813d;
        if (m0Var.a().getVisibility() == 0) {
            android.view.View a17 = m0Var.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin$initLogic$1$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin$initLogic$1$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0Var.f393846f = true;
        }
    }
}
