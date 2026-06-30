package ku3;

/* loaded from: classes3.dex */
public final class u1 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f393955d;

    public u1(ku3.z1 z1Var) {
        this.f393955d = z1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        int i17 = ((zt3.b) obj).f557118a;
        ku3.z1 z1Var = this.f393955d;
        if (i17 == 1) {
            z1Var.f394027e.S6(7, new ku3.t1(z1Var));
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "EVENT_CAMERA_FIRST_FRAME");
            z1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "goto hide shader");
            if (z1Var.c().getVisibility() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordFrameShaderPlugin", "go to hide shade");
                z1Var.c().setVisibility(4);
                java.lang.Object mo141623x754a37bb = ((jz5.n) z1Var.f394030h).mo141623x754a37bb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                android.view.View view = (android.view.View) mo141623x754a37bb;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin", "hideShader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin", "hideShader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
