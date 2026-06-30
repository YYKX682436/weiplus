package com.p314xaae8f345.mm.ui;

/* loaded from: classes9.dex */
public class zh implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f294167d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f294168e;

    public zh(android.app.Activity activity, java.lang.String str) {
        this.f294167d = new java.lang.ref.WeakReference(activity);
        this.f294168e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.app.Activity activity;
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5 = (com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5) obj;
        if (c11158xe7d16ed5 != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.yh(this, c11158xe7d16ed5));
            return null;
        }
        java.lang.ref.WeakReference weakReference = this.f294167d;
        if (weakReference.get() == null || (activity = (android.app.Activity) weakReference.get()) == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
        return null;
    }
}
