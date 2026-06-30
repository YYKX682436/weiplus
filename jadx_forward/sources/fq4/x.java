package fq4;

/* loaded from: classes15.dex */
public class x implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq4.y f347185d;

    public x(fq4.y yVar) {
        this.f347185d = yVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        fq4.y yVar = this.f347185d;
        yVar.f347188c += 100;
        yVar.f347189d += (yVar.f347186a.d() * 100) / 100;
        if (yVar.f347188c < 3000) {
            return true;
        }
        yVar.f347186a.mo166726xad07d6f3();
        yVar.f347187b.d();
        int i17 = yVar.f347189d / 30;
        yVar.f347189d = i17;
        boolean z17 = i17 >= 30;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6223x8faa8c7b c6223x8faa8c7b = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6223x8faa8c7b();
        c6223x8faa8c7b.f136470g.f89218a = z17;
        c6223x8faa8c7b.e();
        return false;
    }
}
