package iy2;

/* loaded from: classes15.dex */
public final class f implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 f377426d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974) {
        this.f377426d = c15487x24678974;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1682x6b2e132.C15487x24678974 c15487x24678974 = this.f377426d;
        z21.e eVar = c15487x24678974.f218279f;
        if (eVar == null) {
            return true;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        int mo48281x67ad3875 = eVar.mo48281x67ad3875();
        if (c15487x24678974.getCurrentState() == c15487x24678974.getSTATE_STARTED()) {
            c15487x24678974.d(mo48281x67ad3875);
        }
        return true;
    }
}
