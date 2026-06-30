package bk5;

/* loaded from: classes10.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f103204a = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.ui.toast.WeToastStarter$msgReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.app.Activity activity;
            if (intent != null) {
                java.lang.CharSequence charSequenceExtra = intent.getCharSequenceExtra("toast_text");
                java.lang.Integer valueOf = java.lang.Integer.valueOf(intent.getIntExtra("toast_icon", 0));
                if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4678x1d1a4af6.f19964x4fbc8495.mo40975xf7b3660d()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                    java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                    if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                        java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                        activity = j17 != null ? (android.app.Activity) j17.get() : null;
                    }
                    h0Var.f391656d = activity;
                    if (activity != null && (activity instanceof android.app.Activity) && activity.isFinishing()) {
                        if (intent.getBooleanExtra("toast_ignore", false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "msgReceiver ignoreFinishing!!");
                            return;
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "topActivity is finishing!!");
                            pm0.v.V(100L, new bk5.f(h0Var, valueOf, charSequenceExtra));
                            return;
                        }
                    }
                    if (h0Var.f391656d == null) {
                        h0Var.f391656d = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeToastStarter", "msgReceiver topActivity:%s", h0Var.f391656d);
                    if (valueOf.intValue() > 0 && charSequenceExtra != null) {
                        android.content.Context context2 = (android.content.Context) h0Var.f391656d;
                        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                        e4Var.f293309c = charSequenceExtra;
                        e4Var.b(valueOf.intValue());
                        e4Var.c();
                        return;
                    }
                    if (charSequenceExtra != null) {
                        android.content.Context context3 = (android.content.Context) h0Var.f391656d;
                        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context3);
                        e4Var2.f293309c = charSequenceExtra;
                        e4Var2.c();
                    }
                }
            }
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final android.content.BroadcastReceiver f103205b = new com.p314xaae8f345.mm.ui.p2739x6969627.C22494x95d1448a();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2739x6969627.C22492x73358eb9 f103206c = new com.p314xaae8f345.mm.ui.p2739x6969627.C22492x73358eb9();
}
