package z21;

/* loaded from: classes9.dex */
public class i implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.j f551133d;

    public i(z21.j jVar) {
        this.f551133d = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        z21.j jVar = this.f551133d;
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(jVar.f551143h);
        fp.k.c();
        java.lang.String str = jVar.f551143h;
        int i17 = jVar.f551142g;
        boolean z17 = jVar.f551146n;
        if (k17 - i17 < 3300 && !z17) {
            return true;
        }
        if (jVar.mo807x6c193ac1(jVar.m47995xb7ba1aa7(), jVar.f551139d) != -1) {
            return false;
        }
        jVar.f551141f = fp.k.a() + com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171;
        jVar.f551139d.mo815x76e0bfae(3, -1, "doScene failed", jVar);
        return false;
    }
}
