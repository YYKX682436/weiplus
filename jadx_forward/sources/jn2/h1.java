package jn2;

/* loaded from: classes10.dex */
public final class h1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(jn2.z1 z1Var, jn2.r1 r1Var) {
        super(2);
        this.f382159d = z1Var;
        this.f382160e = r1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ay1 ay1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.z22 songInfo = (r45.z22) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        jn2.z1 z1Var = this.f382159d;
        java.lang.String str = z1Var.f382301g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("endClickListener: pos=");
        sb6.append(intValue);
        sb6.append(", song=");
        r45.by1 by1Var = songInfo.f473164h;
        sb6.append((by1Var == null || (ay1Var = by1Var.f452676d) == null) ? null : ay1Var.f451884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        z1Var.B(null);
        sf2.e1 e1Var = (sf2.e1) this.f382160e.I.m56789x25fe639c(sf2.e1.class);
        if (e1Var != null) {
            sf2.e1.m7(e1Var, null, false, false, false, null, 30, null);
        }
        return jz5.f0.f384359a;
    }
}
