package ek4;

/* loaded from: classes12.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f335183g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ek4.s sVar, java.lang.String str, int i17, int i18) {
        super(0);
        this.f335180d = sVar;
        this.f335181e = str;
        this.f335182f = i17;
        this.f335183g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335180d;
        dn.o oVar = (dn.o) sVar.f335218a.get(this.f335181e);
        if (oVar != null) {
            java.lang.String str = this.f335181e;
            int i17 = this.f335182f;
            long j17 = i17;
            oVar.W1 = j17;
            dn.n nVar = oVar.f323348c2;
            if (nVar != null) {
                ek4.s.a(sVar);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onDataAvailable mediaId:");
                sb6.append(str);
                sb6.append(" offset:");
                sb6.append(i17);
                sb6.append(" length:");
                int i18 = this.f335183g;
                sb6.append(i18);
                sb6.append(" callback:");
                sb6.append(nVar.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
                long j18 = i18;
                nVar.mo65706x9bb59ea0(str, j17, j18);
                ek4.t.b(sVar.f335222e, str, j17 + j18, -1L);
            }
        }
        return jz5.f0.f384359a;
    }
}
