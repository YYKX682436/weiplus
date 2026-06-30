package hm1;

/* loaded from: classes7.dex */
public final class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.h {

    /* renamed from: e, reason: collision with root package name */
    public static final hm1.a f363725e = new hm1.a();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1052x1688f2cd.h, eg.c
    public eg.b Ua(java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        switch (type.hashCode()) {
            case -1960115589:
                if (type.equals("voiproom")) {
                    return new lf1.j();
                }
                return super.Ua(type);
            case -1190716580:
                if (type.equals("nativeView")) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1191x80def495.p1192xb915a73c.t0();
                }
                return super.Ua(type);
            case 112202875:
                if (type.equals("video")) {
                    lm1.t tVar = new lm1.t();
                    hm1.m mVar = hm1.m.f363736a;
                    bg.f fVar = new bg.f(((java.lang.Boolean) ((jz5.n) hm1.m.f363749n).mo141623x754a37bb()).booleanValue(), tVar);
                    tVar.f400892a = fVar;
                    fVar.F(new lm1.a());
                    return fVar;
                }
                return super.Ua(type);
            case 113005369:
                if (type.equals("webgl")) {
                    return new wb1.h();
                }
                return super.Ua(type);
            default:
                return super.Ua(type);
        }
    }
}
