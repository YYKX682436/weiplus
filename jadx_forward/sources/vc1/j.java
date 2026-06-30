package vc1;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 f516519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f516520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f516521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f516522g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ double f516523h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f516524i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f516525m;

    public j(vc1.p1 p1Var, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7 interfaceC25945x718093f7, float f17, float f18, float f19, double d17, double d18) {
        this.f516525m = p1Var;
        this.f516519d = interfaceC25945x718093f7;
        this.f516520e = f17;
        this.f516521f = f18;
        this.f516522g = f19;
        this.f516523h = d17;
        this.f516524i = d18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.C25936xd5528c6e I = this.f516525m.I(this.f516519d, this.f516520e, this.f516521f, this.f516522g, this.f516523h, this.f516524i);
        vc1.p1 p1Var = this.f516525m;
        p1Var.f516592J = false;
        this.f516519d.mo98953x59b77566(I, vc1.p1.F0, p1Var.T);
    }
}
