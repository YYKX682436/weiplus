package wt1;

/* loaded from: classes15.dex */
public class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt1.g f530797d;

    public d(wt1.g gVar) {
        this.f530797d = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardCodeMgr", "onTimerExpired, do request code");
        wt1.g gVar = this.f530797d;
        gVar.a(gVar.f530803e);
        gVar.e();
        return true;
    }
}
