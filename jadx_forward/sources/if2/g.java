package if2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f372650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f372651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f372652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f372653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, int i17, int i18, android.content.Intent intent) {
        super(0);
        this.f372650d = c14197x319b1b9e;
        this.f372651e = i17;
        this.f372652f = i18;
        this.f372653g = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (java.lang.Object obj : this.f372650d.m56799x73a45721()) {
            if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
            if (eVar != null) {
                eVar.mo57866x9d4787cb(this.f372651e, this.f372652f, this.f372653g);
            }
        }
        return jz5.f0.f384359a;
    }
}
