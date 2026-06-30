package kj5;

/* loaded from: classes.dex */
public final class f extends cj5.d1 {

    /* renamed from: p, reason: collision with root package name */
    public int f389993p;

    /* renamed from: q, reason: collision with root package name */
    public int f389994q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f389995r;

    /* renamed from: s, reason: collision with root package name */
    public long f389996s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f389996s = -1L;
    }

    @Override // cj5.d1
    public void U6(boolean z17) {
        super.U6(z17);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a O6 = O6();
        if (O6 != null) {
            v65.i.b(O6, null, new kj5.d(this, null), 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 1000001001) {
            return;
        }
        boolean z17 = false;
        int intExtra = intent.getIntExtra("select_record_msg_num", 0);
        this.f389993p = intExtra;
        this.f389994q = intExtra;
        this.f389995r = intent.getStringArrayListExtra("key_selected_record_msg_list");
        if (this.f389993p == 0) {
            d75.b.g(new kj5.e(this));
            return;
        }
        this.f389996s = intent.getLongExtra("select_record_min_msg_id", -1L);
        rd0.v0 v0Var = (rd0.v0) i95.n0.c(rd0.v0.class);
        int i19 = this.f389993p;
        ((qg5.p0) v0Var).getClass();
        int g17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
        if (1 <= g17 && g17 < i19) {
            z17 = true;
        }
        if (z17) {
            this.f389994q = com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.g();
        }
        d75.b.g(new kj5.e(this));
    }

    @Override // cj5.d1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f m67437x4bd5310;
        super.mo450x3e5a77bb(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
        if (P6 == null || (m67437x4bd5310 = P6.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.L2(m158354x19263085(), new kj5.b(this));
    }

    @Override // cj5.d1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        super.mo451xac79a11b();
        if (((rd0.v0) i95.n0.c(rd0.v0.class)) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.x3.a();
        }
    }
}
