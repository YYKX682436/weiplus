package gr2;

/* loaded from: classes2.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f356335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gr2.p0 f356336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i17, gr2.p0 p0Var) {
        super(0);
        this.f356335d = i17;
        this.f356336e = p0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentItem pos: ");
        int i17 = this.f356335d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ThemeLivingViewPagerConvert", sb6.toString());
        gr2.p0 p0Var = this.f356336e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = p0Var.f356343f;
        zq2.c cVar = p0Var.f356344g;
        if (c15359x536ace78 != null && cVar != null) {
            c15359x536ace78.m8316x940d026a(i17);
        }
        return jz5.f0.f384359a;
    }
}
