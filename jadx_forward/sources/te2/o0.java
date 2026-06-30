package te2;

/* loaded from: classes3.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f499799d;

    public o0(te2.p1 p1Var) {
        this.f499799d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent;
        android.content.Intent intent2;
        te2.p1 p1Var = this.f499799d;
        android.content.Context context = p1Var.f499819d.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        int i17 = 0;
        if (abstractActivityC21394xb3d2c0cf != null && (intent2 = abstractActivityC21394xb3d2c0cf.getIntent()) != null) {
            i17 = intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0);
        }
        if (i17 != 3) {
            ae2.in inVar = ae2.in.f85221a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85307i5).mo141623x754a37bb()).r()).booleanValue()) {
                return;
            }
        }
        qo0.c.a(p1Var.f499821f, qo0.b.f446915m2, null, 2, null);
        android.content.Context context2 = p1Var.f499819d.getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = context2 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2 : null;
        if (abstractActivityC21394xb3d2c0cf2 == null || (intent = abstractActivityC21394xb3d2c0cf2.getIntent()) == null) {
            return;
        }
        intent.removeExtra("KEY_PARAMS_DO_ACTION");
    }
}
