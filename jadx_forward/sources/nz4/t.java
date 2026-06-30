package nz4;

/* loaded from: classes12.dex */
public class t implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423170d;

    public t(nz4.y yVar) {
        this.f423170d = yVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        nz4.f fVar;
        nz4.y yVar = this.f423170d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 i17 = yVar.i();
        nz4.f fVar2 = yVar.f423199x;
        boolean z17 = fVar2 != null && fVar2.f423137c < ((float) yVar.k(i17));
        nz4.f fVar3 = yVar.f423199x;
        boolean z18 = fVar3 != null && fVar3.f423137c > ((float) yVar.j());
        if (!nz4.y.M || i17 == null || (fVar = yVar.f423199x) == null || fVar.a() != 1 || (!z17 && !z18)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = yVar.f423200y;
            if (b4Var != null) {
                b4Var.d();
            }
        } else if (z17 && i17.canScrollVertically(-1)) {
            if (yVar.f423199x.f423135a == 3) {
                yVar.b();
            }
            yVar.K(false);
            yVar.n();
            yVar.p();
            i17.mo7976xc291bbd2(0, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed);
        } else if (z18 && i17.canScrollVertically(1)) {
            yVar.K(false);
            yVar.n();
            yVar.p();
            i17.mo7976xc291bbd2(0, 300);
        }
        return true;
    }
}
