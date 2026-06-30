package p81;

/* loaded from: classes7.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p81.j f434255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p81.j jVar) {
        super(2);
        this.f434255d = jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 error = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        p81.j jVar = this.f434255d;
        jVar.a(6, "onError(" + error + ", " + ((java.lang.String) obj2) + ')');
        switch (error.ordinal()) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                r81.f fVar = r81.f.INSTANCE;
                boolean z17 = jVar.f434259d;
                int i17 = z17 ? 50 : 49;
                int i18 = jVar.f434258c;
                fVar.b(i18, i17);
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166023h == error) {
                    fVar.b(i18, z17 ? 59 : 58);
                    break;
                }
                break;
            default:
                p81.j.b(jVar, false);
                break;
        }
        jVar.f434257b.mo146xb9724478(java.lang.Boolean.FALSE);
        return jz5.f0.f384359a;
    }
}
