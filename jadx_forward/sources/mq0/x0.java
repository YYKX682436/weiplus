package mq0;

/* loaded from: classes7.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mq0.a1 f412160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq0.x f412161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412162f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mq0.a1 a1Var, fq0.x xVar, java.lang.String str) {
        super(0);
        this.f412160d = a1Var;
        this.f412161e = xVar;
        this.f412162f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        mq0.a1 a1Var = this.f412160d;
        java.util.HashMap hashMap = a1Var.f412068a;
        fq0.x xVar = this.f412161e;
        java.util.List list = (java.util.List) hashMap.get(xVar.f347011b);
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(a1Var.f412069b, "reportFirstFrame but start time not found " + xVar);
        } else {
            long longValue = ((java.lang.Number) kz5.n0.X(list)).longValue();
            java.util.HashMap hashMap2 = a1Var.f412068a;
            java.lang.String str = xVar.f347011b;
            hashMap2.remove(str);
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String str2 = xVar.f347011b;
            java.lang.String str3 = xVar.f347013d;
            java.lang.String str4 = xVar.f347010a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c enumC16454xc40f4d3c = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37598xf943aa9b;
            long j17 = elapsedRealtime - longValue;
            java.util.List c17 = kz5.b0.c(java.lang.String.valueOf(xVar.f347020k.getValue()));
            cl0.g gVar = new cl0.g();
            gVar.o("appStatus", com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d() ? 1 : 2);
            hq0.e0 e0Var = xVar.f347012c;
            gVar.h(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, e0Var != null ? e0Var.f364515c : null);
            gVar.r("hasCover", ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(this.f412162f, str));
            iVar.qa(str2, str3, str4, enumC16454xc40f4d3c, j17, c17, gVar);
            java.util.Objects.toString(enumC16454xc40f4d3c);
        }
        return jz5.f0.f384359a;
    }
}
