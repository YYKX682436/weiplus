package ko3;

/* loaded from: classes11.dex */
public class m0 implements android.hardware.display.DisplayManager.DisplayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko3.l0 f391522d;

    public m0(ko3.l0 l0Var) {
        this.f391522d = l0Var;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i17) {
        ko3.l0 l0Var = this.f391522d;
        try {
            android.view.Display display = l0Var.f391519e.getDisplay(i17);
            java.lang.String str = "";
            java.lang.String name = display != null ? display.getName() : "";
            if (android.text.TextUtils.isEmpty(name)) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            if (display != null) {
                try {
                    java.lang.String str2 = (java.lang.String) display.getClass().getMethod("getOwnerPackageName", new java.lang.Class[0]).invoke(display, new java.lang.Object[0]);
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SRD", th6, "[getDisplayOwnerPackage] error", new java.lang.Object[0]);
                }
            }
            r45.lw4 lw4Var = new r45.lw4();
            lw4Var.f461418d = i17;
            lw4Var.f461419e = name;
            lw4Var.f461420f = currentTimeMillis;
            lw4Var.f461421g = str;
            l0Var.f391518d.put(java.lang.Integer.valueOf(i17), lw4Var);
            l0Var.i();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5919xacf0563b c5919xacf0563b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5919xacf0563b();
            am.dr drVar = c5919xacf0563b.f136221g;
            drVar.f88024a = i17;
            drVar.f88026c = name;
            drVar.f88027d = currentTimeMillis;
            drVar.f88025b = str;
            drVar.f88028e = 1;
            c5919xacf0563b.e();
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SRD", th7.toString());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i17) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i17) {
        ko3.l0 l0Var = this.f391522d;
        if (l0Var.f391518d.containsKey(java.lang.Integer.valueOf(i17))) {
            l0Var.f391518d.remove(java.lang.Integer.valueOf(i17));
            l0Var.i();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5919xacf0563b c5919xacf0563b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5919xacf0563b();
            am.dr drVar = c5919xacf0563b.f136221g;
            drVar.f88024a = i17;
            drVar.f88026c = "";
            drVar.f88027d = java.lang.System.currentTimeMillis() / 1000;
            drVar.f88028e = 2;
            c5919xacf0563b.e();
        }
    }
}
