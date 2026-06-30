package so2;

/* loaded from: classes10.dex */
public abstract class i implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final dm.pd f491944d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f491945e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f491946f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f491947g;

    public i(dm.pd mention) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mention, "mention");
        this.f491944d = mention;
    }

    public final java.lang.String a() {
        dm.pd pdVar = this.f491944d;
        java.lang.String str = "";
        if (!pdVar.u0()) {
            java.lang.String str2 = pdVar.f66131xdec927b;
            java.lang.String str3 = pdVar.f66106x21f9b213;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                str = c61.yb.md((c61.yb) c17, str2 == null ? "" : str2, str3 == null ? "" : str3, false, 4, null);
            } else if (str3 != null) {
                str = str3;
            }
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = pdVar.f66070x5f9d295d.m75941xfb821914(0).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) it.next();
            java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
            java.lang.String m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m76197x6c03c64c)) {
                i95.m c18 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                m76184x8010e5e4 = c61.yb.md((c61.yb) c18, m76197x6c03c64c == null ? "" : m76197x6c03c64c, m76184x8010e5e4 == null ? "" : m76184x8010e5e4, false, 4, null);
            } else if (m76184x8010e5e4 == null) {
                m76184x8010e5e4 = "";
            }
            sb6.append(m76184x8010e5e4);
            sb6.append("，");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7)) {
            return sb7;
        }
        java.lang.String substring = sb7.substring(0, sb7.length() - 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        return substring;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491944d.f66095xc8a07680;
    }
}
