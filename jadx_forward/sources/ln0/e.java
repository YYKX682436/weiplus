package ln0;

/* loaded from: classes10.dex */
public final class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f401179d;

    public e(ln0.p pVar) {
        this.f401179d = pVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        ln0.p pVar = this.f401179d;
        if (pVar.f401212h.compareAndSet(true, false)) {
            ((ku5.t0) ku5.t0.f394148d).h(new ln0.a(pVar), pVar.f401211g);
        }
        return true;
    }
}
