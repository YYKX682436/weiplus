package ix3;

/* loaded from: classes8.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.q2 f377036d;

    public n2(ix3.q2 q2Var) {
        this.f377036d = q2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/uic/RepairerHonorRiskDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v75.c cVar = v75.c.f515486a;
        java.lang.Class cls = (java.lang.Class) ((jz5.n) v75.c.f515487b).mo141623x754a37bb();
        if (cls != null) {
            try {
                java.lang.Object invoke = cls.getMethod("getDeviceHealthDetectApiTag", new java.lang.Class[0]).invoke(((jz5.n) v75.c.f515488c).mo141623x754a37bb(), new java.lang.Object[0]);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(invoke, "null cannot be cast to non-null type kotlin.Int");
                i17 = ((java.lang.Integer) invoke).intValue();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Honor..DeviceHealthDetect", "device health api tag is::" + i17);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Honor..DeviceHealthDetect", th6, "old version of touch detect api ", new java.lang.Object[0]);
                i17 = -2;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Honor..DeviceHealthDetect", "This device does not support DeviceHealthDetect");
            i17 = -1;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f377036d.m158354x19263085();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(m158354x19263085);
        e4Var.f293309c = java.lang.String.valueOf(i17);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/uic/RepairerHonorRiskDebugUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
