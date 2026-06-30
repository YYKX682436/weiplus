package dz0;

/* loaded from: classes5.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f326324d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326326f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f326327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.p pVar, java.lang.String str, com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, dz0.e0 e0Var) {
        super(3);
        this.f326324d = pVar;
        this.f326325e = str;
        this.f326326f = c11015x5b190a3b;
        this.f326327g = e0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4079x793f83 c4079x793f83;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4121xb12fb285 m33395x7a30592b;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b) obj;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[] c4116xf4b2c356Arr = (com.p314xaae8f345.p457x3304c6.p477x633fb29.C4116xf4b2c356[]) obj2;
        long longValue = ((java.lang.Number) obj3).longValue();
        yz5.p pVar = this.f326324d;
        if (pVar != null) {
            pVar.mo149xb9724478(c4093x6b88526b, c4116xf4b2c356Arr);
        }
        java.util.List C0 = c4116xf4b2c356Arr != null ? kz5.z.C0(c4116xf4b2c356Arr) : null;
        java.lang.String templateId = this.f326325e;
        if (C0 != null) {
            if ((C0.isEmpty() ^ true ? C0 : null) != null) {
                this.f326327g.f326358h.put(templateId, C0);
            }
        }
        com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b = this.f326326f;
        az0.n7 n7Var = c11015x5b190a3b.f151316d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(templateId, (n7Var == null || (c4079x793f83 = n7Var.f97275a) == null || (m33395x7a30592b = c4079x793f83.m33395x7a30592b()) == null) ? null : m33395x7a30592b.m33907x3bfa570b());
        if (b17) {
            c11015x5b190a3b.f151322m.b(c11015x5b190a3b.V6());
        }
        bz0.j jVar = bz0.j.f118283a;
        java.lang.String requestId = java.lang.String.valueOf(longValue);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        bz0.j.f118293k.put(templateId, requestId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRecommendMusicComplete: templateId:");
        sb6.append(templateId);
        sb6.append(", templateIdMatch:");
        sb6.append(b17);
        sb6.append(", err:");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        sb6.append(" recommend size:");
        sb6.append(c4116xf4b2c356Arr != null ? java.lang.Integer.valueOf(c4116xf4b2c356Arr.length) : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        return jz5.f0.f384359a;
    }
}
