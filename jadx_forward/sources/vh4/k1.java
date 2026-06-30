package vh4;

/* loaded from: classes5.dex */
public final class k1 implements c01.yc {
    @Override // c01.yc
    public void O0(com.p314xaae8f345.mm.p944x882e457a.p0 addMsgInfo) {
        java.lang.String j17;
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            r45.j4 j4Var = addMsgInfo.f152259a;
            if (j4Var != null && j4Var.f459093g == 10002) {
                java.lang.String g17 = x51.j1.g(j4Var.f459094h);
                w15.g gVar = new w15.g();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                gVar.m126728xdc93280d(g17);
                w15.f j18 = gVar.j();
                if (j18 != null) {
                    if ((ot5.h.f430410a.a(j18.m173118xfb865c31(), wo.w0.k(), "MicroMsg.ShowTeenageModeStaticSysCmdMsgNewXmlListener", false) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j18.m173118xfb865c31(), "uuidtest")) && (j17 = j18.j()) != null) {
                        java.lang.String k17 = j18.k();
                        boolean equals = k17 != null ? k17.equals("1") : false;
                        java.lang.ref.WeakReference k18 = com.p314xaae8f345.mm.app.w.k();
                        if (k18 == null || (activity = (android.app.Activity) k18.get()) == null) {
                            java.lang.ref.WeakReference j19 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                            activity = j19 != null ? (android.app.Activity) j19.get() : null;
                        }
                        if (activity != null) {
                            android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18579x5b99114c.class);
                            intent.putExtra("IntentKey_DeadlineWord", j17);
                            intent.putExtra("IntentKey_Title", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ohu));
                            intent.putExtra("IntentKey_BackIconRes", com.p314xaae8f345.mm.R.raw.f78865x1dda7f39);
                            intent.putExtra("IntentKey_ForceDisplay", equals);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(intent);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/ShowTeenageModeStaticSysCmdMsgNewXmlListener", "onRecieveMsg", "(Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            activity.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(activity, "com/tencent/mm/plugin/teenmode/model/ShowTeenageModeStaticSysCmdMsgNewXmlListener", "onRecieveMsg", "(Lcom/tencent/mm/modelbase/IMessageExtension$AddMsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    }
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.p314xaae8f345.mm.p944x882e457a.r0 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
    }
}
