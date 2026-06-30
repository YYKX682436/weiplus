package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/multitask/MultiTaskCallBackBroadcast;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.MultiTaskCallBackBroadcast */
/* loaded from: classes8.dex */
public final class C16594x7c7d7f3e extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f231934a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.Activity activity;
        android.app.Activity activity2;
        android.app.Activity activity3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "MultiTaskCallBackBroadcast onReceive");
        android.app.Activity activity4 = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent != null ? intent.getAction() : null, "com.tencent.mm.multitask")) {
            int intExtra = intent.getIntExtra("com.tencent.mm.multitask.ActionCode", 0);
            if (intExtra == 0) {
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                    if (j17 != null) {
                        activity4 = (android.app.Activity) j17.get();
                    }
                } else {
                    activity4 = activity;
                }
                if (activity4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
                    zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity4);
                    if (Ai != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).l7(true, 7) : false) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 Ni = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni();
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        Ni.j(bool, bool);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "hideMultiTaskFloatBall");
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_Default, topActivity: " + activity4);
                return;
            }
            if (intExtra == 1) {
                java.lang.ref.WeakReference k18 = com.p314xaae8f345.mm.app.w.k();
                if (k18 == null || (activity2 = (android.app.Activity) k18.get()) == null) {
                    java.lang.ref.WeakReference j18 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                    if (j18 != null) {
                        activity4 = (android.app.Activity) j18.get();
                    }
                } else {
                    activity4 = activity2;
                }
                if (activity4 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d06 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06();
                    c5715x746b0d06.f136036g.f87694c = 4;
                    c5715x746b0d06.b(android.os.Looper.getMainLooper());
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_RefreshData, topActivity: " + activity4);
                return;
            }
            if (intExtra != 2) {
                return;
            }
            java.lang.String stringExtra = intent.getStringExtra("com.tencent.mm.multitask.id");
            int intExtra2 = intent.getIntExtra("com.tencent.mm.multitask.type", 0);
            java.lang.ref.WeakReference k19 = com.p314xaae8f345.mm.app.w.k();
            if (k19 == null || (activity3 = (android.app.Activity) k19.get()) == null) {
                java.lang.ref.WeakReference j19 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                if (j19 != null) {
                    activity4 = (android.app.Activity) j19.get();
                }
            } else {
                activity4 = activity3;
            }
            if (activity4 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06 c5715x746b0d062 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5715x746b0d06();
                am.ak akVar = c5715x746b0d062.f136036g;
                akVar.f87694c = 5;
                akVar.f87692a = stringExtra;
                akVar.f87693b = intExtra2;
                c5715x746b0d062.b(android.os.Looper.getMainLooper());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskCallBackBroadcast", "ActionCode_DeleteData, topActivity: " + activity4 + ", multiTaskId: " + stringExtra + ", multiTaskType: " + intExtra2);
        }
    }
}
