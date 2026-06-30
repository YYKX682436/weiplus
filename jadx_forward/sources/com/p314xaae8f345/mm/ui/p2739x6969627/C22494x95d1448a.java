package com.p314xaae8f345.mm.ui.p2739x6969627;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tencent/mm/ui/toast/WeToastStarter$snackBarMsgReceiver$1", "Landroid/content/BroadcastReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.toast.WeToastStarter$snackBarMsgReceiver$1 */
/* loaded from: classes10.dex */
public final class C22494x95d1448a extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f291491a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        android.app.Activity activity;
        if (intent != null) {
            java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("INTENT_SNACK_BAR_TEXT");
            int intExtra = intent.getIntExtra("INTENT_SNACK_BAR_ICON_ID", 0);
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40975xf7b3660d()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                    activity = j17 != null ? (android.app.Activity) j17.get() : null;
                }
                h0Var.f391656d = activity;
                if (activity != null && activity.isFinishing()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "snackBarMsgReceiver topActivity is finishing!!");
                    pm0.v.V(100L, new bk5.g(h0Var, charSequenceExtra, intExtra));
                    return;
                }
                if (h0Var.f391656d == null) {
                    h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "snackBarMsgReceiver2 msgReceiver topActivity:%s", h0Var.f391656d);
                android.content.Context context2 = (android.content.Context) h0Var.f391656d;
                if (context2 == null) {
                    return;
                }
                int i17 = al5.u4.f87591t;
                al5.t4 t4Var = new al5.t4(context2);
                t4Var.f87575e = charSequenceExtra;
                t4Var.e(intExtra);
                t4Var.g();
            }
        }
    }
}
