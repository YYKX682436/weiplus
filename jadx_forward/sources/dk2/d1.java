package dk2;

/* loaded from: classes3.dex */
public final class d1 implements ke2.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f314839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f314841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314842d;

    public d1(dk2.r4 r4Var, java.lang.String str, int i17, yz5.p pVar) {
        this.f314839a = r4Var;
        this.f314840b = str;
        this.f314841c = i17;
        this.f314842d = pVar;
    }

    @Override // ke2.i
    public void a(int i17, int i18, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f314839a.f315542d, "doDisableComment fail, enable:" + z17 + " username:" + this.f314840b + " errType:" + i17 + " errCode:" + i18);
        yz5.p pVar = this.f314842d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // ke2.i
    public void b(boolean z17) {
        dk2.r4 r4Var = this.f314839a;
        java.lang.String str = r4Var.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doDisableComment success, enable:");
        sb6.append(z17);
        sb6.append(" username:");
        java.lang.String str2 = this.f314840b;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int i17 = this.f314841c;
        if (i17 == 2) {
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410313b2.put(str2, java.lang.Boolean.valueOf(!z17));
        } else if (i17 == 3) {
            ((mm2.c1) r4Var.m(mm2.c1.class)).f410318c2.put(str2, java.lang.Boolean.valueOf(!z17));
        }
        yz5.p pVar = this.f314842d;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf(z17));
        }
    }
}
