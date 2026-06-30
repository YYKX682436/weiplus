package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MMWizardActivity */
/* loaded from: classes5.dex */
public abstract class AbstractActivityC21409xdfe27f5a extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f278452d = new java.util.HashMap();

    public static void X6(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "startWizardActivity()");
        java.lang.String stringExtra = intent.getStringExtra("WizardRootClass");
        java.lang.String stringExtra2 = intent.getStringExtra("WizardTransactionId");
        boolean z17 = context instanceof android.app.Activity;
        android.content.Intent intent2 = z17 ? ((android.app.Activity) context).getIntent() : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && intent2 != null) {
            stringExtra = intent2.getStringExtra("WizardRootClass");
            stringExtra2 = intent2.getStringExtra("WizardTransactionId");
            if (intent2.getComponent() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "start wizard, callerIntent class=%s", intent2.getComponent().getClassName());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "start wizard, root=%s", stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            intent.putExtra("WizardRootClass", stringExtra);
        }
        if (stringExtra2 != null) {
            intent.putExtra("WizardTransactionId", stringExtra2);
        }
        if (intent.getExtras() == null) {
            intent.putExtras(new android.os.Bundle());
        }
        if (!z17) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/MMWizardActivity", "startWizardActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/MMWizardActivity", "startWizardActivity", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static void Y6(android.content.Context context, android.content.Intent intent, android.content.Intent intent2) {
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("trans.");
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            sb6.append(android.os.SystemClock.elapsedRealtime());
            sb6.append(".");
            sb6.append(intent2.hashCode());
            java.lang.String sb7 = sb6.toString();
            ((java.util.HashMap) f278452d).put(sb7, intent2);
            intent.putExtra("WizardTransactionId", sb7);
            android.content.Intent intent3 = ((android.app.Activity) context).getIntent();
            if (intent3 != null) {
                intent3.putExtra("WizardTransactionId", sb7);
            }
            X6(context, intent);
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWizardActivity", "%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }

    public void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "cancel()");
        java.lang.String stringExtra = getIntent().getStringExtra("WizardTransactionId");
        java.util.Map map = f278452d;
        android.content.Intent intent = (android.content.Intent) ((java.util.HashMap) map).get(stringExtra);
        ((java.util.HashMap) map).remove(stringExtra);
        if (intent != null) {
            intent.toString();
        }
    }

    public void U6(int i17) {
        java.lang.String stringExtra = getIntent().getStringExtra("WizardRootClass");
        java.lang.String stringExtra2 = getIntent().getStringExtra("WizardTransactionId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "exit resultCode:%d, rootClass:%s, transaction:%s", java.lang.Integer.valueOf(i17), stringExtra, stringExtra2);
        java.util.Map map = f278452d;
        android.content.Intent intent = (android.content.Intent) ((java.util.HashMap) map).get(stringExtra2);
        ((java.util.HashMap) map).remove(stringExtra2);
        if (intent == null) {
            intent = new android.content.Intent();
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && intent.getComponent() != null) {
            stringExtra = intent.getComponent().getClassName();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "exit component rootClass %s", stringExtra);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            try {
                intent.putExtra("wizard_activity_result_code", i17);
                intent.setClassName(this, stringExtra);
                intent.addFlags(67108864);
                if (intent.getStringExtra("WizardRootClass") != null) {
                    X6(this, intent);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/MMWizardActivity", "exit", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/ui/MMWizardActivity", "exit", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } catch (java.lang.Exception unused) {
            }
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.ui.ce ceVar = new com.p314xaae8f345.mm.ui.ce(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(ceVar, 200L, false);
    }

    public void V6() {
        W6(1);
    }

    public void W6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "finishWizard()");
        U6(i17);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "onCreate()");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.b(getIntent().getExtras(), "WizardRootKillSelf", false)) {
            super.finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMWizardActivity", "finish wizard, root=" + getComponentName().getClassName());
            U6(getIntent().getExtras().getInt("wizard_activity_result_code"));
        }
    }
}
