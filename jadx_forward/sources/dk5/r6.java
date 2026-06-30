package dk5;

/* loaded from: classes9.dex */
public final class r6 implements dk5.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk5.e6 f316385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m f316386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f316388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f316391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f316392h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f316393i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316394j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ dk5.f6 f316395k;

    public r6(dk5.e6 e6Var, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, int i17, boolean z17, boolean z18, java.lang.String str3, dk5.f6 f6Var) {
        this.f316385a = e6Var;
        this.f316386b = mVar;
        this.f316387c = c11286x34a5504;
        this.f316388d = linkedList;
        this.f316389e = str;
        this.f316390f = str2;
        this.f316391g = i17;
        this.f316392h = z17;
        this.f316393i = z18;
        this.f316394j = str3;
        this.f316395k = f6Var;
    }

    @Override // dk5.h2
    public final void a(java.lang.String str, boolean z17) {
        dk5.e6 e6Var = this.f316385a;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SendWXMediaMessageHelper", "thumb img CDN upload fail!");
            if (e6Var != null) {
                dk5.e6.a(e6Var, 5, null, 2, null);
                return;
            }
            return;
        }
        if (e6Var != null) {
            dk5.e6.a(e6Var, 4, null, 2, null);
        }
        dk5.y6.f316543a.j(this.f316386b, this.f316387c, this.f316388d, this.f316389e, this.f316390f, this.f316391g, this.f316392h, this.f316393i, this.f316394j, str, null, this.f316385a, this.f316395k);
        if (e6Var != null) {
            dk5.e6.a(e6Var, 6, null, 2, null);
        }
    }
}
