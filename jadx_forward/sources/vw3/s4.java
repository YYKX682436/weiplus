package vw3;

/* loaded from: classes.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f522641d;

    public s4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f522641d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f522641d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String obj = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.imw)).getText().toString();
            java.lang.String obj2 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.imz)).getText().toString();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 m78125xdce0328 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.m78125xdce0328(obj);
            java.lang.String[] strArr = (java.lang.String[]) new r26.t("_").g(obj, 0).toArray(new java.lang.String[0]);
            java.lang.String str = strArr[strArr.length - 1];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "SYNC")) {
                str = strArr[strArr.length - 2];
            }
            switch (str.hashCode()) {
                case -1838656495:
                    if (str.equals("STRING")) {
                        gm0.j1.u().c().x(m78125xdce0328, obj2);
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 72655:
                    if (str.equals("INT")) {
                        gm0.j1.u().c().x(m78125xdce0328, java.lang.Integer.valueOf(java.lang.Integer.parseInt(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 2342524:
                    if (str.equals("LONG")) {
                        gm0.j1.u().c().x(m78125xdce0328, java.lang.Long.valueOf(java.lang.Long.parseLong(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 66988604:
                    if (str.equals("FLOAT")) {
                        gm0.j1.u().c().x(m78125xdce0328, java.lang.Float.valueOf(java.lang.Float.parseFloat(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 782694408:
                    if (str.equals("BOOLEAN")) {
                        gm0.j1.u().c().x(m78125xdce0328, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                case 2022338513:
                    if (str.equals("DOUBLE")) {
                        gm0.j1.u().c().x(m78125xdce0328, java.lang.Double.valueOf(java.lang.Double.parseDouble(obj2)));
                        break;
                    }
                    throw new java.lang.RuntimeException();
                default:
                    throw new java.lang.RuntimeException();
            }
            pm0.v.K(null, vw3.r4.f522630d);
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
