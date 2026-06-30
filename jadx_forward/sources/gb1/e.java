package gb1;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f351518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 f351519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f351520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f351521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gb1.f f351522h;

    public e(gb1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        this.f351522h = fVar;
        this.f351518d = lVar;
        this.f351519e = c0Var;
        this.f351520f = jSONObject;
        this.f351521g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f351522h.I(this.f351518d, this.f351519e, this.f351520f, this.f351521g);
    }
}
