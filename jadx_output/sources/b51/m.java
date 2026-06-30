package b51;

/* loaded from: classes10.dex */
public final class m implements rj.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f18041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18042b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18043c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f18044d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18045e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18046f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f18047g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f18048h;

    public m(rj.o cfg) {
        kotlin.jvm.internal.o.g(cfg, "cfg");
        this.f18041a = "PagLoader";
        this.f18042b = 3;
        this.f18043c = 5;
        this.f18044d = "";
        this.f18047g = jz5.h.b(b51.e.f18013d);
        this.f18048h = jz5.h.b(new b51.l(this));
        this.f18044d = cfg.f396144a;
        this.f18045e = cfg.f396145b;
        this.f18046f = cfg.f396146c;
    }

    public static final boolean e(b51.m mVar, java.lang.String str) {
        mVar.getClass();
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        java.lang.String str2 = mVar.f18041a;
        com.tencent.mars.xlog.Log.i(str2, "fileExist = " + j17 + ", path = " + str);
        if (!j17) {
            return false;
        }
        org.libpag.PAGFile Load = org.libpag.PAGFile.Load(str);
        if (!(Load != null)) {
            Load = null;
        }
        if (Load != null) {
            return true;
        }
        if (!mVar.f18045e) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(str2, "[checkFileLoadSuccess], del path:" + str);
        com.tencent.mm.vfs.w6.h(str);
        return false;
    }

    public final boolean f(java.lang.String str) {
        if (!(this.f18044d.length() == 0)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e(this.f18041a, "tag = " + str + ", path is null, return ");
        return false;
    }

    public java.lang.String g(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f18044d);
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        return sb6.toString();
    }

    public java.lang.Object h(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (!f(str2)) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        boolean z17 = str.length() == 0;
        java.lang.String str3 = this.f18041a;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", empty return");
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        java.lang.String g17 = g(str);
        v65.n nVar = new v65.n(rVar);
        com.tencent.mars.xlog.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
        if (e(this, g17)) {
            com.tencent.mars.xlog.Log.i(str3, "[load] finished-cache tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
            nVar.a(org.libpag.PAGFile.Load(g17));
        } else {
            ((fp0.o) ((jz5.n) this.f18048h).getValue()).b(new c51.f(new d51.a(str, g17, this.f18045e, new b51.h(this, str2, str, g17, nVar))), new b51.i(this, str2, str, g17, nVar));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }

    public void i(java.lang.String url, android.view.View pagView, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        com.tencent.mars.xlog.Log.i(this.f18041a, "[load] tag:" + str + ", url:" + url);
        if (f(str)) {
            if (!(url.length() == 0)) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                ((ku5.t0) u0Var).h(new b51.g(this, url, str, pagView), this.f18041a + "-[load]");
                return;
            }
            com.tencent.mars.xlog.Log.i(this.f18041a, "[load] tag:" + str + ", url:" + url + ", empty return");
        }
    }

    public java.lang.Object j(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
        rVar.k();
        if (!f(str2)) {
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        boolean z17 = str.length() == 0;
        java.lang.String str3 = this.f18041a;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", empty return");
            rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        java.lang.String g17 = g(str);
        v65.n nVar = new v65.n(rVar);
        com.tencent.mars.xlog.Log.i(str3, "[load] tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
        if (e(this, g17)) {
            com.tencent.mars.xlog.Log.i(str3, "[load] finished-cache tag:" + str2 + ", url:" + str + ", path:" + g17 + '}');
            nVar.a(com.tencent.mm.rfx.RfxPagFile.Load(g17));
        } else {
            ((fp0.o) ((jz5.n) this.f18048h).getValue()).b(new c51.h(new d51.d(str, g17, this.f18045e, new b51.j(this, str2, str, g17, nVar))), new b51.k(this, str2, str, g17, nVar));
        }
        java.lang.Object j17 = rVar.j();
        pz5.a aVar = pz5.a.f359186d;
        return j17;
    }
}
