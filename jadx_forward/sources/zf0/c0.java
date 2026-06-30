package zf0;

/* loaded from: classes11.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f553924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f553925f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str, zf0.v0 v0Var, java.lang.String str2) {
        super(1);
        this.f553923d = str;
        this.f553924e = v0Var;
        this.f553925f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a;
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 Ai = ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(this.f553923d);
        gm0.b bVar = gm0.j1.b().f354778h;
        if (bVar != null && (c20976x6ba6452a = bVar.f354678e) != null) {
            v65.i.b(c20976x6ba6452a, null, new zf0.b0(Ai, this.f553924e, reason, this.f553925f, this.f553923d, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
