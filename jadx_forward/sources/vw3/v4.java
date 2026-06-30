package vw3;

/* loaded from: classes.dex */
public final class v4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI f522692d;

    public v4(com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI) {
        this.f522692d = repairerResetConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.repairer.ui.RepairerResetConfigUI repairerResetConfigUI = this.f522692d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String obj = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.jmf)).getText().toString();
            java.lang.String obj2 = ((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.jmh)).getText().toString();
            int parseInt = java.lang.Integer.parseInt(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerResetConfigUI.findViewById(com.p314xaae8f345.mm.R.id.jmi)).getText().toString());
            if (parseInt == 1) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putInt(obj, java.lang.Integer.parseInt(obj2));
            } else if (parseInt == 2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putLong(obj, java.lang.Long.parseLong(obj2));
            } else if (parseInt == 3) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putString(obj, obj2);
            } else if (parseInt == 4) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putBoolean(obj, java.lang.Boolean.parseBoolean(obj2));
            } else if (parseInt == 5) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e()).putFloat(obj, java.lang.Float.parseFloat(obj2));
            }
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9), 0).show();
        } catch (java.lang.Exception unused) {
            db5.t7.m123883x26a183b(repairerResetConfigUI.mo55332x76847179(), repairerResetConfigUI.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572012w8), 0).show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerResetConfigUI$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
