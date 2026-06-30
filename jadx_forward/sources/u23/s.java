package u23;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final u23.e0 f505637a;

    /* renamed from: b, reason: collision with root package name */
    public final u23.k f505638b;

    /* renamed from: c, reason: collision with root package name */
    public final u23.b f505639c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f505640d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f505641e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f505642f;

    public s(u23.e0 e0Var, u23.k kVar, u23.b bVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        u23.e0 queryConfig;
        if ((i17 & 1) != 0) {
            jz5.g gVar = u23.e0.f505587n;
            java.util.Comparator comparator = (java.util.Comparator) ((jz5.n) u23.e0.f505587n).mo141623x754a37bb();
            java.lang.String str = (java.lang.String) ((jz5.n) u23.e0.f505588o).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "access$getDEFAULT_ALL_MEDIA_FOLDER_NAME(...)");
            java.lang.String str2 = (java.lang.String) ((jz5.n) u23.e0.f505589p).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "access$getDEFAULT_ALL_IMAGE_FOLDER_NAME(...)");
            java.lang.String str3 = (java.lang.String) ((jz5.n) u23.e0.f505590q).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "access$getDEFAULT_ALL_VIDEO_FOLDER_NAME(...)");
            java.lang.String str4 = (java.lang.String) ((jz5.n) u23.e0.f505591r).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "access$getDEFAULT_FAVORITE_FOLDER_NAME(...)");
            queryConfig = new u23.e0(3, 2, true, false, false, 10240L, comparator, str, str2, str3, str4, (u23.w) ((jz5.n) u23.e0.f505592s).mo141623x754a37bb(), new u23.c0(), false, false, true, false, null);
        } else {
            queryConfig = e0Var;
        }
        u23.k queryConst = (i17 & 2) != 0 ? new u23.k() : kVar;
        u23.b mediaFilter = (i17 & 4) != 0 ? new u23.a(queryConfig.f505593a) : bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryConfig, "queryConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryConst, "queryConst");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFilter, "mediaFilter");
        this.f505637a = queryConfig;
        this.f505638b = queryConst;
        this.f505639c = mediaFilter;
        java.lang.String str5 = "MicroMsg.MediaLoaderRequest[" + hashCode() + ']';
        this.f505640d = str5;
        this.f505642f = jz5.h.b(u23.r.f505636d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, "init: ");
    }

    public final void a(u23.n nVar) {
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505640d, "started: failed");
            return;
        }
        if (this.f505641e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505640d, "started: skip");
            return;
        }
        this.f505641e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505640d, "start: controller[" + nVar.hashCode() + "] ");
        u23.e eVar = (u23.e) ((jz5.n) this.f505642f).mo141623x754a37bb();
        eVar.getClass();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        nVar.f505635f = eVar;
        u23.d dVar = new u23.d(nVar, eVar, uptimeMillis, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f505577a, "【start】ready, controller[" + nVar.hashCode() + "] isCancelled=" + nVar.f505634e + ", runnable=" + dVar);
        ((ku5.t0) ku5.t0.f394148d).g(dVar);
    }
}
