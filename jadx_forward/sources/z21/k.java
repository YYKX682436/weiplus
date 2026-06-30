package z21;

/* loaded from: classes9.dex */
public class k implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.l f551177d;

    public k(z21.l lVar) {
        this.f551177d = lVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        z21.l lVar = this.f551177d;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(lVar.f551183i);
        fp.k.c();
        java.lang.String str = lVar.f551183i;
        int i17 = lVar.f551182h;
        boolean z17 = lVar.f551181g;
        if (k17 - i17 < 3300 && !z17) {
            return true;
        }
        if (lVar.mo807x6c193ac1(lVar.m47995xb7ba1aa7(), lVar.f551178d) != -1) {
            return false;
        }
        lVar.f551180f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
        lVar.f551178d.mo815x76e0bfae(3, -1, "doScene failed", lVar);
        return false;
    }
}
