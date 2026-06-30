package com.tencent.matrix.lifecycle.supervisor;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SubordinatePacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class SubordinatePacemaker extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f52796a;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.tencent.matrix.lifecycle.k f52798c;

    /* renamed from: d, reason: collision with root package name */
    public static yz5.a f52799d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker f52800e = new com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f52797b = jz5.h.b(com.tencent.matrix.lifecycle.supervisor.i0.f52843d);

    private SubordinatePacemaker() {
    }

    public final void a(android.content.Context context) {
        if (f52798c != null) {
            java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
            com.tencent.matrix.lifecycle.IForegroundStatefulOwner iForegroundStatefulOwner = com.tencent.matrix.lifecycle.owners.f0.f52733o;
            com.tencent.matrix.lifecycle.k kVar = f52798c;
            kotlin.jvm.internal.o.d(kVar);
            iForegroundStatefulOwner.removeObserver(kVar);
            f52798c = null;
            java.lang.String b17 = com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b();
            if (context != null) {
                try {
                    context.unregisterReceiver(this);
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
            }
            oj.j.c(com.tencent.matrix.lifecycle.supervisor.d0.f52834k.b(), "SubordinatePacemaker: uninstalled", new java.lang.Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 465198915 && action.equals("SUPERVISOR_INSTALLED")) {
            com.tencent.matrix.lifecycle.q0.f52785f.a().post(com.tencent.matrix.lifecycle.supervisor.h0.f52841d);
        }
    }
}
