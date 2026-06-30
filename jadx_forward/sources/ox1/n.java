package ox1;

/* loaded from: classes12.dex */
public class n implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431142d;

    public n(ox1.s sVar) {
        this.f431142d = sVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        ox1.c cVar;
        ox1.s sVar = this.f431142d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = sVar.i();
        ox1.c cVar2 = sVar.f431171x;
        boolean z17 = cVar2 != null && cVar2.f431116c < ((float) sVar.k(i17));
        ox1.c cVar3 = sVar.f431171x;
        boolean z18 = cVar3 != null && cVar3.f431116c > ((float) sVar.j());
        if (!ox1.s.K || i17 == null || (cVar = sVar.f431171x) == null || cVar.a() != 1 || (!z17 && !z18)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = sVar.f431172y;
            if (b4Var != null) {
                b4Var.d();
            }
        } else if (z17 && i17.canScrollVertically(-1)) {
            if (sVar.f431171x.f431114a == 3) {
                sVar.b();
            }
            sVar.G(false);
            sVar.n();
            sVar.p();
            i17.mo7976xc291bbd2(0, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed);
        } else if (z18 && i17.canScrollVertically(1)) {
            sVar.G(false);
            sVar.n();
            sVar.p();
            i17.mo7976xc291bbd2(0, 300);
        }
        return true;
    }
}
