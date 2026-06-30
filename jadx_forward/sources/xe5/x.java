package xe5;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f535676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xe5.i iVar, long j17) {
        super(0);
        this.f535675d = iVar;
        this.f535676e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xe5.i iVar = this.f535675d;
        android.widget.TextView textView = iVar.f535584l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = iVar.f535585m;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        java.util.HashMap hashMap = ((vd2.e2) ((en0.e) i95.n0.c(en0.e.class))).f517245h;
        long j17 = this.f535676e;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) hashMap.get(java.lang.Long.valueOf(j17));
        if (f9Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyGetMoreLiveService", "notifyUpdateByFeedId: feedId=".concat(pm0.v.u(j17)));
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().m0(new xg3.l0(f9Var.Q0(), "update", f9Var, 0));
        }
        return jz5.f0.f384359a;
    }
}
