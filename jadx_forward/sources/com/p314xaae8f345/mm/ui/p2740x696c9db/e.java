package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public int f291895a;

    /* renamed from: b, reason: collision with root package name */
    public final al5.o4 f291896b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f291897c = false;

    /* renamed from: d, reason: collision with root package name */
    public final db5.g4 f291898d;

    /* renamed from: e, reason: collision with root package name */
    public int f291899e;

    /* renamed from: f, reason: collision with root package name */
    public final int f291900f;

    public e(android.app.Activity activity, al5.o4 o4Var) {
        this.f291898d = new db5.g4(activity);
        this.f291896b = o4Var;
        int b17 = fp.a.b(activity, (int) activity.getResources().getDimension(activity.getResources().getConfiguration().orientation == 2 ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax : com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay));
        this.f291895a = b17;
        this.f291899e = b17 * 3;
        this.f291900f = (int) activity.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561657op);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionBarMenuViewHelper", "mDefaultNormalActionbarHeight: %s, needTitleCenterMode: %s.", java.lang.Integer.valueOf(this.f291895a), java.lang.Boolean.valueOf(o4Var.f87510a));
    }
}
