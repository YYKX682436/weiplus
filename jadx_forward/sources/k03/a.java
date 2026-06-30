package k03;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f384636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f384637e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 f384638f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f384639g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k03.e f384640h;

    public a(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, k03.e eVar) {
        this.f384636d = h0Var;
        this.f384637e = h0Var2;
        this.f384638f = c28688xe8dbe4c2;
        this.f384639g = h0Var3;
        this.f384640h = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = k03.e.f384649e;
        java.util.Map map2 = k03.e.f384649e;
        java.lang.Object obj = this.f384636d.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f384637e;
        map2.put(obj, h0Var.f391656d);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = this.f384638f;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("refresh", null);
        }
        com.p314xaae8f345.mm.rfx.C20942x379cf5ee m77391x243906 = com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77391x243906((java.lang.String) h0Var.f391656d);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f384639g;
        h0Var2.f391656d = m77391x243906;
        k03.e eVar = this.f384640h;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = eVar.f384650d;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) h0Var2.f391656d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = eVar.f384650d;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.m82583xcde73672(-1);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = eVar.f384650d;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.g();
        }
    }
}
