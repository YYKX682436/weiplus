package qi3;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f445261e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f445262f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445263g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str, long j17, java.lang.Long l17, java.lang.String str2) {
        super(1);
        this.f445260d = str;
        this.f445261e = j17;
        this.f445262f = l17;
        this.f445263g = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.fr pack = (r45.fr) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pack, "pack");
        r45.jr jrVar = new r45.jr();
        jrVar.f459598d = this.f445263g;
        pack.f456095n = jrVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r()));
        java.lang.String str = this.f445260d;
        sb6.append(str);
        sb6.append(this.f445261e);
        sb6.append('_');
        java.lang.Long l17 = this.f445262f;
        sb6.append((l17 != null ? l17.longValue() : c01.w9.o(str)) / 1000);
        pack.f456091g = sb6.toString();
        return jz5.f0.f384359a;
    }
}
