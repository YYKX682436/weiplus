package wk;

/* loaded from: classes8.dex */
public class m implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wk.n f528421d;

    public m(wk.n nVar) {
        this.f528421d = nVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtSimpleRecord", "Voice record timeout.");
        wk.n nVar = this.f528421d;
        nVar.f528425g = true;
        nVar.b();
        return false;
    }
}
