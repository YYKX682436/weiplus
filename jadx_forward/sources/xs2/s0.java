package xs2;

/* loaded from: classes.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537909a;

    public s0(android.content.Context context) {
        this.f537909a = context;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (xg2.g.e(fVar)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest success!");
            pm0.v.X(new xs2.r0(this.f537909a));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ReplayBulletPopupHelper", "FinderLiveComplainReplayMsgRequest fail:" + fVar.f152149b + ',' + fVar.f152148a + ',' + fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
