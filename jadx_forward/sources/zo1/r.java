package zo1;

/* loaded from: classes.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f556284e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar) {
        super(2);
        this.f556283d = u3Var;
        this.f556284e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupRangeManagerUI", "error code of update range info is " + intValue);
        pm0.v.X(new zo1.q(this.f556283d, this.f556284e, intValue));
        return jz5.f0.f384359a;
    }
}
