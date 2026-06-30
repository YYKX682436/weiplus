package cr;

/* loaded from: classes12.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr.g f303097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f303098f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yz5.l lVar, cr.g gVar, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4) {
        super(2);
        this.f303096d = lVar;
        this.f303097e = gVar;
        this.f303098f = c21053xdbf1e5f4;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cr.i iVar = (cr.i) obj2;
        yz5.l lVar = this.f303096d;
        if (booleanValue && iVar != null) {
            this.f303097e.a(this.f303098f, lVar);
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        return jz5.f0.f384359a;
    }
}
