package jn2;

/* loaded from: classes10.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(jn2.z1 z1Var, jn2.r1 r1Var) {
        super(2);
        this.f382151d = z1Var;
        this.f382152e = r1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        r45.ay1 ay1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.z22 songInfo = (r45.z22) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songInfo, "songInfo");
        jn2.z1 z1Var = this.f382151d;
        java.lang.String str = z1Var.f382301g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("singButtonClickListener: pos=");
        sb6.append(intValue);
        sb6.append(", song=");
        r45.by1 by1Var = songInfo.f473164h;
        sb6.append((by1Var == null || (ay1Var = by1Var.f452676d) == null) ? null : ay1Var.f451884e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        r45.ay1 ay1Var2 = songInfo.f473164h.f452676d;
        jn2.r1 r1Var = this.f382152e;
        if (ay1Var2 != null) {
            sf2.x xVar = r1Var.I;
            xVar.getClass();
            te2.a9.f(te2.a9.f499416a, xVar.h7(), 8, kz5.b0.c(ay1Var2), null, 8, null);
        }
        z1Var.B(songInfo.f473162f);
        sf2.e1 e1Var = (sf2.e1) r1Var.I.m56789x25fe639c(sf2.e1.class);
        if (e1Var != null) {
            sf2.e1.m7(e1Var, songInfo, false, false, false, null, 22, null);
        }
        return jz5.f0.f384359a;
    }
}
