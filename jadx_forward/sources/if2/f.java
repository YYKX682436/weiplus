package if2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f372645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f372646f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, boolean z17, int i17) {
        super(0);
        this.f372644d = c14197x319b1b9e;
        this.f372645e = z17;
        this.f372646f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (java.lang.Object obj : this.f372644d.m56799x73a45721()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.T2(this.f372645e, this.f372646f);
            }
        }
        return jz5.f0.f384359a;
    }
}
