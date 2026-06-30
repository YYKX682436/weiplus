package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes14.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f293513a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f293514b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f293515c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f293516d;

    /* renamed from: e, reason: collision with root package name */
    public int f293517e;

    /* renamed from: f, reason: collision with root package name */
    public int f293518f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s3 f293519g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f293520h = false;

    /* renamed from: i, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f293521i = null;

    /* renamed from: j, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f293522j = null;

    /* renamed from: k, reason: collision with root package name */
    public android.content.DialogInterface.OnShowListener f293523k = null;

    /* renamed from: l, reason: collision with root package name */
    public android.content.DialogInterface.OnKeyListener f293524l = null;

    public t3(android.content.Context context) {
        this.f293514b = context;
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3(this.f293514b, this.f293518f, this.f293517e);
        u3Var.setMessage(this.f293515c);
        u3Var.setCancelable(this.f293516d);
        u3Var.setOnCancelListener(this.f293522j);
        u3Var.setCanceledOnTouchOutside(false);
        u3Var.f293541h = this;
        this.f293513a = u3Var;
        return u3Var;
    }

    public final boolean b(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return true;
        }
        if (context instanceof android.content.ContextWrapper) {
            return b(((android.content.ContextWrapper) context).getBaseContext());
        }
        return false;
    }
}
