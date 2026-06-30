package ku3;

/* loaded from: classes3.dex */
public final class k0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m0 f393823d;

    public k0(ku3.m0 m0Var) {
        this.f393823d = m0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17 = ((zt3.b) obj).f557118a;
        ku3.m0 m0Var = this.f393823d;
        if (i17 == 1) {
            m0Var.f393844d.S6(8, m0Var);
            m0Var.f393844d.S6(7, new ku3.j0(m0Var));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitNineGridPlugin", "EVENT_CAMERA_FIRST_FRAME >> " + m0Var.f393846f);
            if (m0Var.f393846f) {
                m0Var.f393846f = false;
                android.view.View a17 = m0Var.a();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/EventState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin$initLogic$1", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/EventState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
