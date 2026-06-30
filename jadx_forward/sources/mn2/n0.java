package mn2;

/* loaded from: classes10.dex */
public final class n0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f411600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f411601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f411602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f411603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f411604h;

    public n0(mn2.q0 q0Var, java.lang.String str, mn2.g4 g4Var, c50.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        this.f411600d = q0Var;
        this.f411601e = str;
        this.f411602f = g4Var;
        this.f411603g = z0Var;
        this.f411604h = c14994x9b99c079;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        boolean z18 = hVar != null && hVar.f69553xb5f54fe9 == -21112;
        c50.z0 z0Var = this.f411603g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f411604h;
        mn2.q0 q0Var = this.f411600d;
        if (z18) {
            mn2.q0.b(z0Var, c14994x9b99c079, q0Var, mediaId, -11);
            return -1;
        }
        java.lang.String str = this.f411601e;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(q0Var.f411625a, "feedId:" + str + " media is error! startRet=" + i17 + " mediaId=" + mediaId);
            if (-21006 != i17) {
                cu2.x.f303982a.n(mediaId, 0L, 0L, -1);
            }
            mn2.q0.b(z0Var, c14994x9b99c079, q0Var, mediaId, -21);
            return -2;
        }
        if (gVar != null) {
            long j17 = gVar.f69500x8ab84c59;
            if (j17 > 0) {
                long j18 = gVar.f69496x83ec3dd;
                int i18 = j18 >= j17 ? 3 : 1;
                cu2.x xVar = cu2.x.f303982a;
                xVar.n(mediaId, j18, j17, i18);
                java.lang.Integer valueOf = hVar != null ? java.lang.Integer.valueOf(hVar.f69571x9373c88d) : null;
                java.lang.String str2 = hVar != null ? hVar.f69570xea0afd82 : null;
                mn2.g4 g4Var = this.f411602f;
                if (str2 == null) {
                    str2 = g4Var.g();
                }
                xVar.j(mediaId, valueOf, str2);
                this.f411603g.b(c14994x9b99c079.m59251x5db1b11(), j18, j17);
                if (j18 >= j17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q0Var.f411625a, "feedId:" + str + " mediaId=" + mediaId + ", success");
                    z0Var.a(c14994x9b99c079.m59251x5db1b11(), 0, g4Var.j());
                    q0Var.f411626b.remove(mediaId);
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
