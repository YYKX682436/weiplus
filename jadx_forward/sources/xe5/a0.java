package xe5;

/* loaded from: classes10.dex */
public final class a0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f535511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xe5.i f535512b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535513c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f535515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f535516f;

    public a0(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, xe5.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f535511a = f0Var;
        this.f535512b = iVar;
        this.f535513c = str;
        this.f535514d = str2;
        this.f535515e = str3;
        this.f535516f = z17;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        boolean z17 = obj instanceof r45.l71;
        r45.l71 l71Var = z17 ? (r45.l71) obj : null;
        r45.nw1 nw1Var = l71Var != null ? (r45.nw1) l71Var.m75936x14adae67(1) : null;
        this.f535511a.f391649d = i17;
        java.lang.String str = this.f535514d;
        if (nw1Var == null) {
            xe5.i iVar = this.f535512b;
            java.lang.String str2 = this.f535513c;
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            iVar.b(1, j17, str2, str == null ? "" : str, i17);
        } else {
            qs5.n Vj = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Vj(this.f535515e, nw1Var);
            xe5.i iVar2 = this.f535512b;
            java.lang.String str3 = this.f535513c;
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            iVar2.c(2, j17, str3, str == null ? "" : str, Vj, nw1Var);
        }
        if (this.f535516f) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f517305a.b(z17 ? (r45.l71) obj : null);
        }
    }
}
