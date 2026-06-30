package xn1;

/* loaded from: classes12.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn1.h f536992d;

    public f(xn1.h hVar) {
        this.f536992d = hVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvChooseHelper", "clearChooseData");
        xn1.h hVar = this.f536992d;
        hVar.f537003s.clear();
        hVar.f537004t = null;
        hVar.f536998n = null;
        hVar.f536990f = false;
        return true;
    }
}
