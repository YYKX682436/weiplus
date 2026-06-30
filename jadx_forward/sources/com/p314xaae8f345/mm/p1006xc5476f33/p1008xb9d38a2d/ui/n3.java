package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes14.dex */
public final class n3 extends com.p314xaae8f345.mm.app.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3 f155588d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3 o3Var) {
        this.f155588d = o3Var;
    }

    @Override // com.p314xaae8f345.mm.app.d, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity a17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o3 o3Var = this.f155588d;
        android.app.Activity activity = (android.app.Activity) o3Var.f155613g.get();
        if (activity != null && activity == a17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.q3.f155661a.a(o3Var, o3Var.f155611e);
        } else if (activity == null) {
            a17.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }
}
