package jb1;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb1.e f380231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f380233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jb1.e eVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        super(1);
        this.f380231d = eVar;
        this.f380232e = i17;
        this.f380233f = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            qb1.a.b(this.f380231d, this.f380232e, this.f380233f, null);
        } else {
            qb1.a.a(this.f380231d, this.f380232e, this.f380233f, 10008, "fail:system error, add service fail", null, 16, null);
        }
        return jz5.f0.f384359a;
    }
}
