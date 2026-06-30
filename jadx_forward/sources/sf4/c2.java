package sf4;

/* loaded from: classes4.dex */
public final class c2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f488961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f488963f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f488964g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf4.d2 f488965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(sf4.j2 j2Var, java.lang.String str, long j17, long j18, sf4.d2 d2Var) {
        super(0);
        this.f488961d = j2Var;
        this.f488962e = str;
        this.f488963f = j17;
        this.f488964g = j18;
        this.f488965h = d2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        sf4.d2 d2Var;
        long j17;
        java.lang.String str2;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPauseOnProgress, isVideoPause:false, ");
        sf4.j2 j2Var = this.f488961d;
        j2Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
        sb6.append(c18499x2fc2446b != null ? c18499x2fc2446b.mo66135x23a7af9b() : null);
        sb6.append(", ");
        sb6.append(j2Var.f489035d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b2 = j2Var.f489032a;
        if (c18499x2fc2446b2 != null) {
            c18499x2fc2446b2.f(this.f488962e, this.f488963f, this.f488964g);
        }
        sf4.d2 d2Var2 = this.f488965h;
        nf4.o oVar = d2Var2.f488983f;
        long j18 = this.f488964g;
        if (oVar != null) {
            oVar.f66552x78351860 = (int) j18;
        }
        long j19 = this.f488963f;
        if (oVar != null) {
            oVar.f66549x799e9d9e = (int) j19;
        }
        ef4.v vVar = ef4.w.f334001t;
        boolean mo9952xce0038c9 = vVar.k().mo9952xce0038c9(d2Var2.f488983f, new java.lang.String[0]);
        if4.h hVar = d2Var2.f488984g;
        java.lang.String str3 = this.f488962e;
        if (hVar != null) {
            nf4.f y07 = vVar.g().y0(hVar.f372789d);
            long j27 = y07.f66294x10ed17fb;
            long j28 = hVar.f372787b;
            if (j27 == j28 && y07.m149512x7b953cf2() && d2Var2.f488983f != null) {
                java.lang.String Id = hVar.f372791f.f471554d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Id, "Id");
                nf4.o oVar2 = d2Var2.f488983f;
                int i17 = oVar2 != null ? oVar2.f66549x799e9d9e : 0;
                if (j28 == y07.f66294x10ed17fb) {
                    y07.f66289x3194108c = j28;
                    y07.f66288xd9f687bb = Id;
                    y07.f66287x90029412 = i17;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("markPreloadCompleted onProgress, mediaId:");
                    sb7.append(str3);
                    sb7.append(", offset:");
                    sb7.append(j19);
                    sb7.append(", total:");
                    j17 = j18;
                    sb7.append(j17);
                    str2 = " this:";
                    sb7.append(str2);
                    sb7.append(d2Var2);
                    str = "MicroMsg.VideoPlayProxy";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
                    nf4.g g17 = vVar.g();
                    d2Var = d2Var2;
                    if (g17.d1((int) y07.f72763xa3c65b86, y07) >= 0) {
                        g17.mo142179xf35bbb4("notify_story_preload", 3, y07);
                    }
                } else {
                    d2Var = d2Var2;
                }
            } else {
                d2Var = d2Var2;
            }
            str = "MicroMsg.VideoPlayProxy";
            str2 = " this:";
            j17 = j18;
        } else {
            str = "MicroMsg.VideoPlayProxy";
            d2Var = d2Var2;
            j17 = j18;
            str2 = " this:";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onProgress, update ret " + mo9952xce0038c9 + " mediaId:" + str3 + ", offset:" + j19 + ", total:" + j17 + str2 + d2Var);
        return jz5.f0.f384359a;
    }
}
