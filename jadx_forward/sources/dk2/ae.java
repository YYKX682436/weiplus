package dk2;

/* loaded from: classes3.dex */
public final class ae extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f314742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(long j17, long j18) {
        super(0);
        this.f314741d = j17;
        this.f314742e = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("heartBeat liveId:");
        sb6.append(this.f314741d);
        sb6.append(" delay:");
        sb6.append(this.f314742e);
        sb6.append(" curLive:");
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        boolean z17 = false;
        sb6.append((e1Var == null || (nw1Var2 = e1Var.f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var2.m75942xfb822ef2(0)));
        sb6.append(" liveId:");
        sb6.append(this.f314741d);
        sb6.append(" isFinish: ");
        dk2.xg xgVar = dk2.ef.f314924j0;
        sb6.append(xgVar != null ? java.lang.Boolean.valueOf(xgVar.f315891b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveService", sb6.toString());
        if (this.f314741d > 0) {
            mm2.e1 e1Var2 = (mm2.e1) efVar.i(mm2.e1.class);
            if (e1Var2 != null && (nw1Var = e1Var2.f410521r) != null && nw1Var.m75942xfb822ef2(0) == this.f314741d) {
                z17 = true;
            }
            if (z17) {
                dk2.xg xgVar2 = dk2.ef.f314924j0;
                if (xgVar2 != null) {
                    xgVar2.b();
                }
                dk2.xg xgVar3 = dk2.ef.f314924j0;
                if (xgVar3 != null) {
                    xgVar3.c(java.lang.Long.valueOf(this.f314742e));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
