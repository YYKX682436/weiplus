package dq1;

/* loaded from: classes8.dex */
public final class q extends dq1.a {
    public q() {
        dq1.u[] uVarArr = dq1.u.f323891d;
    }

    @Override // dq1.k
    public boolean a(com.p314xaae8f345.mm.p1006xc5476f33.biz.p1284xc9e135a5.ActivityC12955x181c0197 ui6, dq1.b context, com.p314xaae8f345.mm.p2495xc50a8b8b.g actionBuffer, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionBuffer, "actionBuffer");
        dq1.p pVar = dq1.p.f323886a;
        if (!pVar.a(dq1.c.f323879d, context, pVar.b())) {
            return false;
        }
        r45.n00 n00Var = new r45.n00();
        try {
            n00Var.mo11468x92b714fd(actionBuffer.g());
            final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(ui6);
            com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
            c11207x71c7a1c1.f153806e = java.lang.System.currentTimeMillis();
            c11207x71c7a1c1.f153807f = 17;
            android.content.Intent intent = new android.content.Intent();
            c11207x71c7a1c1.f153821w = intent;
            final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
            intent.putExtra("key_result_receiver", new android.os.ResultReceiver(m77777x504cd8a2) { // from class: com.tencent.mm.plugin.biz.scheme.handler.BizSchemeWWKefu$handle$1
                @Override // android.os.ResultReceiver
                public void onReceiveResult(int i17, android.os.Bundle bundle) {
                    android.app.Activity activity;
                    boolean z17 = false;
                    if (bundle != null && bundle.getInt("result_key_action", 0) == 3) {
                        z17 = true;
                    }
                    if (!z17 || (activity = (android.app.Activity) weakReference.get()) == null) {
                        return;
                    }
                    activity.finishAndRemoveTask();
                }
            });
            c11207x71c7a1c1.f153805d = ui6;
            r45.s4 s4Var = new r45.s4();
            c11207x71c7a1c1.f153810i = s4Var;
            java.lang.String str2 = n00Var.f462504d;
            s4Var.f467019d = str2;
            s4Var.f467020e = str2;
            s4Var.f467022g = new r45.l05();
            r45.l05 l05Var = c11207x71c7a1c1.f153810i.f467022g;
            l05Var.f460594f = n00Var.f462504d;
            l05Var.f460593e = "";
            l05Var.f460592d = c11207x71c7a1c1.f153807f;
            c11207x71c7a1c1.f153814p = true;
            c11207x71c7a1c1.f153815q = c11207x71c7a1c1.f153805d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez);
            c11207x71c7a1c1.f153809h = j41.f0.a(c11207x71c7a1c1.f153807f);
            c11207x71c7a1c1.f153816r = true;
            c11207x71c7a1c1.f153818t = true;
            c11207x71c7a1c1.f153819u = true;
            ((l41.g2) ((j41.z) i95.n0.c(j41.z.class))).Bi(c11207x71c7a1c1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = ui6.f175410h;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            return true;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizSchemeWWKefu", "e = " + e17.getMessage());
            return false;
        }
    }
}
