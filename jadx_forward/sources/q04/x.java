package q04;

/* loaded from: classes12.dex */
public final class x implements o04.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f440942b;

    public x(java.lang.String str, int i17) {
        this.f440941a = str;
        this.f440942b = i17;
    }

    @Override // o04.q
    public void a(int i17, boolean z17, dm.ba baVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecRecoveryDataService", "postReportByTextStatusEditActivity onActionDone " + i17 + ' ' + z17 + ' ');
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("recovery_storage").D("recovery_data_id", this.f440941a);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("recovery_storage").A("recovery_data_type", this.f440942b);
    }
}
