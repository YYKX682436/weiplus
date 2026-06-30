package ek4;

/* loaded from: classes12.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ek4.s sVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f335184d = sVar;
        this.f335185e = str;
        this.f335186f = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dn.n nVar;
        ek4.s sVar = this.f335184d;
        java.util.HashMap hashMap = sVar.f335218a;
        java.lang.String str = this.f335185e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null && (nVar = oVar.f323348c2) != null) {
            ek4.s.a(sVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onM3U8Ready mediaId:");
            sb6.append(str);
            sb6.append(" m3u8:");
            java.lang.String str2 = this.f335186f;
            sb6.append(str2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
            nVar.mo65707xc5dd699b(str, str2);
        }
        return jz5.f0.f384359a;
    }
}
