package vd0;

/* loaded from: classes5.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final vd0.a2 f516899d = new vd0.a2();

    public a2() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity;
        java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
        if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
            java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
            activity = j17 != null ? (android.app.Activity) j17.get() : null;
        }
        if (activity != null) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activity);
            e4Var.f293309c = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lxa);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f80350xb902fbc6);
            e4Var.c();
        } else {
            ((ft.e) i95.n0.c(ft.e.class)).m7(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.p2052x633fb29.C17357xe1a9af2c(1));
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("care_mode_recover_quite_state_source", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("care_mode_recover_quite_state", hashMap, 29254);
        return jz5.f0.f384359a;
    }
}
