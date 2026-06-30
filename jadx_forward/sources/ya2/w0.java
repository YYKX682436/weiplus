package ya2;

/* loaded from: classes10.dex */
public final class w0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f542105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f542106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f542107c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f542108d;

    public w0(cl0.g gVar, android.content.Context context, zy2.i5 i5Var, java.lang.String str) {
        this.f542105a = gVar;
        this.f542106b = context;
        this.f542107c = i5Var;
        this.f542108d = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb821914 = ((r45.ua1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) kz5.n0.Z(m75941xfb821914);
            java.lang.String str = (c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c;
            java.lang.String m75945x2fec8307 = ((r45.ua1) fVar.f152151d).m75945x2fec8307(3);
            ya2.e1.T(ya2.e1.f542005a, this.f542105a, this.f542106b, this.f542107c, this.f542108d, str, m75945x2fec8307 == null ? "" : m75945x2fec8307, null, 64, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRouterApi", "CgiFinderGetUser failed.");
        }
        return jz5.f0.f384359a;
    }
}
