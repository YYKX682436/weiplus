package qf2;

/* loaded from: classes.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yz5.l lVar) {
        super(1);
        this.f443957d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicVisitorBattlePkController", "anchorReplayVisitorBattleAgain modifyBattleInfo rsp: " + booleanValue);
        yz5.l lVar = this.f443957d;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f384359a;
    }
}
