package nd1;

/* loaded from: classes7.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417863f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417864g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f417865h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.m0 f417866i;

    public l0(nd1.m0 m0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2, int i17) {
        this.f417866i = m0Var;
        this.f417861d = yVar;
        this.f417862e = str;
        this.f417863f = jSONObject;
        this.f417864g = str2;
        this.f417865h = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417861d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar.mo32091x9a3f0ba2().x0();
        x07.getClass();
        x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m4(x07, this.f417862e, this.f417863f, this.f417864g));
        yVar.a(this.f417865h, this.f417866i.o("ok"));
    }
}
