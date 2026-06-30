package ga3;

/* loaded from: classes15.dex */
public class o implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351395d;

    public o(ga3.v vVar) {
        this.f351395d = vVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "timer, onTimerExpired to stop record");
        this.f351395d.k();
        return true;
    }
}
