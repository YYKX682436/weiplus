package rh3;

/* loaded from: classes15.dex */
public final class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh3.c f477192d;

    public a(rh3.c cVar) {
        this.f477192d = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        rh3.c cVar = this.f477192d;
        long mo162433xddd35a52 = ((sh3.a) cVar).mo162433xddd35a52();
        long mo162434x37a7fa50 = ((sh3.a) cVar).mo162434x37a7fa50();
        rh3.c cVar2 = this.f477192d;
        rh3.j jVar = cVar2.f477206q;
        if (jVar == null) {
            return true;
        }
        jVar.n(cVar2, mo162433xddd35a52, mo162434x37a7fa50);
        return true;
    }
}
