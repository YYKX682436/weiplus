package el2;

/* loaded from: classes3.dex */
public final class d2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i2 f335309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.f52 f335310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(el2.i2 i2Var, r45.f52 f52Var) {
        super(0);
        this.f335309d = i2Var;
        this.f335310e = f52Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId=");
        sb6.append(this.f335309d.Z6());
        sb6.append(", promoteId=");
        r45.f52 f52Var = this.f335310e;
        sb6.append(f52Var != null ? java.lang.Long.valueOf(f52Var.m75942xfb822ef2(4)) : null);
        sb6.append(",isAnchor=");
        sb6.append(zl2.r4.f555483a.w1());
        sb6.append(", isAssistant=");
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        sb6.append(c1Var != null ? java.lang.Boolean.valueOf(c1Var.T) : null);
        return sb6.toString();
    }
}
