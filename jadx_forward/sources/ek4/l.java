package ek4;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335194e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f335195f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f335196g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f335197h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ek4.v f335198i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ek4.s sVar, java.lang.String str, long j17, long j18, int i17, ek4.v vVar) {
        super(0);
        this.f335193d = sVar;
        this.f335194e = str;
        this.f335195f = j17;
        this.f335196g = j18;
        this.f335197h = i17;
        this.f335198i = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek4.s sVar = this.f335193d;
        java.util.HashMap hashMap = sVar.f335218a;
        java.lang.String str = this.f335194e;
        boolean containsKey = hashMap.containsKey(str);
        ek4.v vVar = this.f335198i;
        if (containsKey) {
            int Ni = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Ni(this.f335194e, this.f335195f, this.f335196g, this.f335197h);
            if (vVar != null) {
                vVar.a(Ni);
            }
            ek4.s.a(sVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "requestVideoData in cdn thread mediaId:" + str + " offset:" + this.f335195f + " length:" + this.f335196g + " ret:" + Ni);
        } else {
            if (vVar != null) {
                vVar.a(-1);
            }
            ek4.s.a(sVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TP.CdnTaskController", "requestVideoData not running id " + str);
        }
        return jz5.f0.f384359a;
    }
}
