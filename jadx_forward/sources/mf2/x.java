package mf2;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f407630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f407631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f407632f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e, int i17, android.os.Bundle bundle) {
        super(0);
        this.f407630d = c14197x319b1b9e;
        this.f407631e = i17;
        this.f407632f = bundle;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (java.lang.Object obj : this.f407630d.m56799x73a45721()) {
            mf2.v vVar = obj instanceof mf2.v ? (mf2.v) obj : null;
            if (vVar != null) {
                vVar.s6(this.f407631e, this.f407632f);
            }
        }
        return jz5.f0.f384359a;
    }
}
