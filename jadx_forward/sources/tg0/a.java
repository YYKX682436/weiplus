package tg0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f500554a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f500555b;

    /* renamed from: c, reason: collision with root package name */
    public final int f500556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f500557d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f500558e;

    public a(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        this.f500554a = str;
        this.f500555b = str2;
        this.f500556c = i17;
        this.f500557d = i18;
        this.f500558e = str3;
    }

    public final java.util.Map a() {
        jz5.l lVar = new jz5.l("dataType", 2);
        java.lang.String str = this.f500554a;
        jz5.l lVar2 = new jz5.l("token", str);
        java.lang.String str2 = this.f500555b;
        jz5.l lVar3 = new jz5.l("enckey", str2);
        int i17 = this.f500556c;
        jz5.l lVar4 = new jz5.l("encIdx", java.lang.Integer.valueOf(i17));
        int i18 = this.f500557d;
        jz5.l lVar5 = new jz5.l("type", java.lang.Integer.valueOf(i18));
        java.lang.String str3 = this.f500558e;
        java.util.Map k17 = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("url", str3));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CircleSearch.ReuseImageInfoForMoment", "reuse image info, " + str + ' ' + str2 + ' ' + i17 + ' ' + i18 + ' ' + str3 + '}');
        return k17;
    }

    /* renamed from: equals */
    public boolean m166433xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0.a)) {
            return false;
        }
        tg0.a aVar = (tg0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500554a, aVar.f500554a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500555b, aVar.f500555b) && this.f500556c == aVar.f500556c && this.f500557d == aVar.f500557d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500558e, aVar.f500558e);
    }

    /* renamed from: hashCode */
    public int m166434x8cdac1b() {
        java.lang.String str = this.f500554a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f500555b;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f500556c)) * 31) + java.lang.Integer.hashCode(this.f500557d)) * 31;
        java.lang.String str3 = this.f500558e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m166435x9616526c() {
        return "CircleSearchReuseImageInfoForMoment(token=" + this.f500554a + ", enckey=" + this.f500555b + ", encIdx=" + this.f500556c + ", type=" + this.f500557d + ", url=" + this.f500558e + ')';
    }
}
