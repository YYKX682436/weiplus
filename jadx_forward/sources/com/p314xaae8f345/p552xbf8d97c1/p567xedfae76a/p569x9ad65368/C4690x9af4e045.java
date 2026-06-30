package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/matrix/lifecycle/supervisor/SubordinatePacemaker;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.supervisor.SubordinatePacemaker */
/* loaded from: classes12.dex */
public final class C4690x9af4e045 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f134329a;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k f134331c;

    /* renamed from: d, reason: collision with root package name */
    public static yz5.a f134332d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045 f134333e = new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4690x9af4e045();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f134330b = jz5.h.b(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.i0.f134376d);

    private C4690x9af4e045() {
    }

    public final void a(android.content.Context context) {
        if (f134331c != null) {
            java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134266o;
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar = f134331c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            interfaceC4661x636abfbb.mo40970xb5bdeb7a(kVar);
            f134331c = null;
            java.lang.String b17 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b();
            if (context != null) {
                try {
                    context.unregisterReceiver(this);
                } catch (java.lang.Throwable th6) {
                    oj.j.d(b17, th6, "", new java.lang.Object[0]);
                }
            }
            oj.j.c(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.d0.f134367k.b(), "SubordinatePacemaker: uninstalled", new java.lang.Object[0]);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 465198915 && action.equals("SUPERVISOR_INSTALLED")) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().post(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.h0.f134374d);
        }
    }
}
