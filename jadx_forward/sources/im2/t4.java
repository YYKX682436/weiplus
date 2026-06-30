package im2;

/* loaded from: classes3.dex */
public final class t4 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f374079d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f374080e;

    /* renamed from: f, reason: collision with root package name */
    public long f374081f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f374082g;

    /* renamed from: h, reason: collision with root package name */
    public int f374083h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f374084i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f374079d = "FinderLiveExitAnimateOp@" + hashCode() + '}';
    }

    public final void O6(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374079d, "notifyFinish source: " + str + " start finish");
        this.f374080e = true;
        m158354x19263085().finish();
        ig2.a aVar = ig2.a.f372895a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearFluentList fluentExitLiveRoomPlayerList: ");
        java.util.HashMap hashMap = ig2.a.f372897c;
        sb6.append(hashMap.size());
        sb6.append(" directorSize: ");
        java.util.HashMap hashMap2 = ig2.a.f372896b;
        sb6.append(hashMap2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFluentReplaySwitchManager", sb6.toString());
        hashMap2.clear();
        hashMap.clear();
    }

    public final void P6() {
        m158354x19263085().getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        m158354x19263085().getWindow().getDecorView().setBackgroundColor(0);
        ig2.r b17 = ig2.a.f372895a.b(this.f374081f);
        if (b17 == null || !(b17 instanceof ig2.f)) {
            O6("director = null");
            return;
        }
        if (b17.c() == null) {
            O6("onDirectorExit object = null");
            return;
        }
        ig2.n c17 = b17.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        ez2.a aVar = c17.f372935a;
        long j17 = this.f374081f;
        android.view.ViewGroup viewGroup = this.f374082g;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("parentView");
            throw null;
        }
        og2.a aVar2 = new og2.a(aVar, j17, viewGroup, null);
        b17.d(aVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374079d, "onDirectorExit params = " + aVar2);
        b17.b(new im2.s4(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        this.f374084i = true;
        return super.mo2274xbdc3c5dc();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        long longExtra = m158359x1e885992().getLongExtra("CURRENT_FEED_ID", 0L);
        this.f374081f = longExtra;
        ig2.r b17 = ig2.a.f372895a.b(longExtra);
        this.f374083h = b17 != null ? b17.hashCode() : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374079d, "onCreate currentFeedId: " + this.f374081f + " directorHashCode: " + this.f374083h);
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.gd9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f374082g = (android.view.ViewGroup) findViewById;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.String str = this.f374079d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDestroy");
        ig2.a aVar = ig2.a.f372895a;
        ig2.r b17 = aVar.b(this.f374081f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("directorHashCode: ");
        sb6.append(this.f374083h);
        sb6.append(" direct: ");
        sb6.append(b17 != null ? b17.hashCode() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if ((b17 != null ? b17.hashCode() : 0) == this.f374083h) {
            aVar.a(this.f374081f);
        }
    }
}
