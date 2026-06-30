package ek4;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f335189f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f335190g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f335191h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ek4.s sVar, java.lang.String str, int i17, int i18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        super(0);
        this.f335187d = sVar;
        this.f335188e = str;
        this.f335189f = i17;
        this.f335190g = i18;
        this.f335191h = videoInfo;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335187d;
        dn.o oVar = (dn.o) sVar.f335218a.get(this.f335188e);
        if (oVar != null) {
            java.lang.String str = this.f335188e;
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f335191h;
            int i17 = this.f335189f;
            long j17 = i17;
            oVar.W1 = j17;
            dn.n nVar = oVar.f323348c2;
            if (nVar != null) {
                ek4.s.a(sVar);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onMoovReady mediaId:");
                sb6.append(str);
                sb6.append(" offset:");
                sb6.append(i17);
                sb6.append(" length:");
                int i18 = this.f335190g;
                sb6.append(i18);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
                nVar.mo65708xe7d268fb(str, j17, i18, videoInfo);
            }
        }
        return jz5.f0.f384359a;
    }
}
