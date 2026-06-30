package qy0;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 f449120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388) {
        super(2);
        this.f449120d = c11004x58386388;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Boolean) obj2).booleanValue();
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p918xcca2f8c0.C11004x58386388 c11004x58386388 = this.f449120d;
        if (booleanValue) {
            gz0.h hVar = c11004x58386388.f151281m;
            if (hVar != null) {
                hVar.a();
            }
        } else {
            gz0.h hVar2 = c11004x58386388.f151281m;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
        ((n0.q4) c11004x58386388.f151279h).mo148714x53d8522f(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
