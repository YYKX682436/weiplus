package mn2;

/* loaded from: classes10.dex */
public final class o0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f411609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f411610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f411611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f411612g;

    public o0(mn2.q0 q0Var, c50.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, mn2.g4 g4Var) {
        this.f411609d = q0Var;
        this.f411610e = z0Var;
        this.f411611f = c14994x9b99c079;
        this.f411612g = g4Var;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        boolean z17 = hVar != null && hVar.f69553xb5f54fe9 == -21112;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f411611f;
        c50.z0 z0Var = this.f411610e;
        mn2.q0 q0Var = this.f411609d;
        if (z17) {
            mn2.q0.b(z0Var, c14994x9b99c079, q0Var, mediaId, -11);
            return;
        }
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(q0Var.f411625a, "[onPreloadCompleted] sceneResult == null");
            mn2.q0.b(z0Var, c14994x9b99c079, q0Var, mediaId, -21);
            return;
        }
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[2];
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        if (j17 <= 0 || j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(q0Var.f411625a, "[onPreloadCompleted] ERROR! mediaId=" + mediaId + " recvedBytes=" + j17 + " fileLength=" + j18 + " fileFormat=" + hVar.f69570xea0afd82 + " videoFormat=" + hVar.f69571x9373c88d);
            mn2.q0.b(z0Var, c14994x9b99c079, q0Var, mediaId, -21);
            return;
        }
        cu2.x xVar = cu2.x.f303982a;
        so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        c17.f68968x799e9d9e = j17;
        c17.f68989x78351860 = j18;
        c17.f68988x29d3a50c = j18 <= j17 ? 3 : 1;
        c17.f68987x74535930 = hVar.f69571x9373c88d;
        java.lang.String str = hVar.f69570xea0afd82;
        mn2.g4 g4Var = this.f411612g;
        if (str == null) {
            str = g4Var.g();
        }
        c17.f68976xe1500f8 = str;
        xVar.g(c17, "onPreloadCompleted");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f411625a, "[onPreloadCompleted] successfully! mediaId=" + mediaId + " receivedBytes=" + j17 + " (query[0]:" + jArr[0] + " x:" + hVar.f69548xe026fea1 + ") fileLength=" + j18 + " result=" + ((int) ((((float) j17) * 100.0f) / ((float) j18))) + "% fileFormat=" + hVar.f69570xea0afd82 + " videoFormat=" + hVar.f69571x9373c88d);
        z0Var.a(c14994x9b99c079.m59251x5db1b11(), 0, g4Var.j());
        q0Var.f411626b.remove(mediaId);
    }
}
