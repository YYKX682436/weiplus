package n21;

/* loaded from: classes12.dex */
public class a implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.b f415770d;

    public a(n21.b bVar) {
        this.f415770d = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        n21.b bVar = this.f415770d;
        com.p314xaae8f345.mm.vfs.w6.k(bVar.f415775h);
        fp.k.c();
        java.lang.String str = bVar.f415775h;
        int i17 = bVar.f415779o;
        if (bVar.mo807x6c193ac1(bVar.m47995xb7ba1aa7(), bVar.f415771d) != -1) {
            return false;
        }
        bVar.f415771d.mo815x76e0bfae(3, -1, "doScene failed", bVar);
        return false;
    }
}
