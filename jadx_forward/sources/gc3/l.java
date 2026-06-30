package gc3;

/* loaded from: classes12.dex */
public class l implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351967d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904) {
        this.f351967d = c16411x58668904;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904 = this.f351967d;
        tl.d dVar = c16411x58668904.f229139f;
        if (dVar == null) {
            return true;
        }
        int d17 = dVar.d();
        if (c16411x58668904.f229144n == 2) {
            c16411x58668904.getClass();
            c16411x58668904.b(new gc3.k(c16411x58668904, d17));
        }
        return true;
    }
}
