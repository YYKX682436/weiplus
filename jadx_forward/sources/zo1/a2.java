package zo1;

/* loaded from: classes5.dex */
public final class a2 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f556079b;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f556078a = activityC12868xd8a7d79e;
        this.f556079b = y1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.String stringExtra;
        po1.d e17;
        if (i17 != -1 || intent == null || (stringExtra = intent.getStringExtra("deviceId")) == null || (e17 = ro1.v.f479547a.e(stringExtra)) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e.f174347u;
        this.f556078a.Y6(e17);
        this.f556079b.q();
    }
}
