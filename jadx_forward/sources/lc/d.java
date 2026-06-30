package lc;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc.c f399327d;

    public d(lc.c cVar) {
        this.f399327d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde;
        lc.c cVar = this.f399327d;
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed39 = cVar.f399325a.f399347o;
        if (c2936x4a02ed39 != null) {
            c2936x4a02ed39.invalidate();
        }
        lc.g gVar = cVar.f399325a;
        gVar.getClass();
        mc.m mVar = mc.k.f407058a;
        int i17 = ic.d.f371814k;
        android.content.Context a17 = ic.c.f371813a.a();
        if (a17 != null && !mVar.f407061c) {
            mVar.f407061c = true;
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) a17.getApplicationContext().getSystemService("sensor");
            mVar.f407059a = sensorManager;
            if (sensorManager == null) {
                mc.p.f407064a.e("LightSensor", " 光线传感器不可用~");
            } else {
                android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
                if (defaultSensor != null) {
                    mc.j jVar = new mc.j(mVar);
                    mVar.f407060b = jVar;
                    mVar.f407059a.registerListener(jVar, defaultSensor, 3);
                } else {
                    mc.p.f407064a.e("LightSensor", " 光线传感器不可用~");
                }
            }
        }
        lc.C29089x2f5e24 c29089x2f5e24 = new lc.C29089x2f5e24(gVar);
        if (mVar.f407060b != null) {
            mVar.f407062d = c29089x2f5e24;
        } else {
            mc.p.f407064a.e("LightSensor", "设备无光线传感器或者未调用start()方法");
        }
        android.app.Activity activity = gVar.getActivity();
        if (activity == null) {
            mc.p.f407064a.e("AuthingFragment", "can not get activity!");
        } else {
            try {
                gVar.f399349q = android.provider.Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
            } catch (android.provider.Settings.SettingNotFoundException unused) {
                mc.p.f407064a.e("AuthingFragment", "can not get screen brightness");
            }
        }
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p336x373aa5.C2936x4a02ed39 c2936x4a02ed392 = cVar.f399325a.f399347o;
        if (c2936x4a02ed392 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c2936x4a02ed392, arrayList.toArray(), "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c2936x4a02ed392.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c2936x4a02ed392, "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p333xb29de3e3.C2919x968bacde c2919x968bacde2 = cVar.f399325a.B;
        if (c2919x968bacde2 == null || !c2919x968bacde2.m21791xf5cf5a97()) {
            cVar.f399325a.f399347o.m21968x5e3699ff(true);
        } else {
            cVar.f399325a.f399347o.m21968x5e3699ff(false);
        }
        lc.g gVar2 = cVar.f399325a;
        if (gVar2.f399344i == null || (c2919x968bacde = gVar2.B) == null || !c2919x968bacde.m21795xab9efeaa()) {
            return;
        }
        android.widget.TextView textView = cVar.f399325a.f399344i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textView, arrayList2.toArray(), "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/cloud/huiyan/fragments/c$a", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cVar.f399325a.f399344i.setText((ic.c.f371813a.f371823i.m21835x9b223799() / 1000) + cVar.f399325a.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.piw));
    }
}
