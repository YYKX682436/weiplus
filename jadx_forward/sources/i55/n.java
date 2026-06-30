package i55;

/* loaded from: classes8.dex */
public final class n extends vp1.d implements up1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final i55.n f370398a = new i55.n();

    @Override // up1.a
    public void A(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void C(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void D(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void E(java.util.List activityRecordList, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecordList, "activityRecordList");
    }

    @Override // up1.a
    public void F(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        e55.m mVar = e55.m.f331214a;
        java.lang.String str = activityRecord.f455619e;
        int i17 = activityRecord.f455622h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
            android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
            mo50288x733c63a2.what = 1008;
            mo50288x733c63a2.obj = nm5.j.d(str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            g17.mo50308x2936bf5f(mo50288x733c63a2);
            return;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("page_name", str);
        bundle.putInt("page_hash_code", i17);
        bundle.putLong("event_time", j17);
        bundle.putString("page_event", "app_out");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, bundle, e55.i.class, null);
    }

    @Override // up1.b
    public void a(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        e55.m.f331214a.j(fragment);
    }

    @Override // up1.b
    public void b(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        e55.m mVar = e55.m.f331214a;
        if (e55.e.f331200a.m(activity.getClass().getSimpleName())) {
            mVar.m();
        }
    }

    @Override // up1.a
    public void c(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void d(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void e(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void f(r45.f83 activityRecord, r45.g83 fragmentRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragmentRecord, "fragmentRecord");
    }

    @Override // up1.a
    public void g(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void h(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
        e55.m mVar = e55.m.f331214a;
        java.lang.String str = activityRecord.f455619e;
        int i17 = activityRecord.f455622h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
            android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
            mo50288x733c63a2.what = 1007;
            mo50288x733c63a2.obj = nm5.j.d(str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
            g17.mo50308x2936bf5f(mo50288x733c63a2);
            return;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("page_name", str);
        bundle.putInt("page_hash_code", i17);
        bundle.putLong("event_time", j17);
        bundle.putString("page_event", "app_in");
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str2, bundle, e55.i.class, null);
    }

    @Override // up1.a
    public void j(r45.f83 f83Var, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
    }

    @Override // up1.a
    public void m(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void n(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        e55.m.f331214a.k(activity);
    }

    @Override // up1.a
    public void o(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.a
    public void q(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void r(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        e55.m.f331214a.j(activity);
    }

    @Override // up1.a
    public void s(r45.f83 activityRecord, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRecord, "activityRecord");
    }

    @Override // up1.b
    public void v(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasName, "vasName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vasSimpleName, "vasSimpleName");
        e55.m.f331214a.k(fragment);
    }

    @Override // up1.b
    public void w(android.app.Activity activity, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        e55.m mVar = e55.m.f331214a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 g17 = mVar.g();
        android.os.Message mo50288x733c63a2 = mVar.g().mo50288x733c63a2();
        mo50288x733c63a2.what = 1002;
        mo50288x733c63a2.obj = nm5.j.c(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), activity);
        g17.mo50308x2936bf5f(mo50288x733c63a2);
        if (e55.e.f331200a.m(activity.getClass().getSimpleName())) {
            mVar.n();
        }
    }

    @Override // up1.a
    public void x(r45.f83 fromActivityRecord, r45.f83 toActivityRecord, boolean z17, android.content.Intent intent, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromActivityRecord, "fromActivityRecord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toActivityRecord, "toActivityRecord");
    }
}
