package so2;

/* loaded from: classes8.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f492034a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f492035b;

    /* renamed from: c, reason: collision with root package name */
    public int f492036c;

    /* renamed from: d, reason: collision with root package name */
    public int f492037d;

    /* renamed from: e, reason: collision with root package name */
    public final so2.p6 f492038e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.a f492039f;

    /* renamed from: g, reason: collision with root package name */
    public final so2.m f492040g;

    /* renamed from: h, reason: collision with root package name */
    public final int f492041h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.gb4 f492042i;

    /* renamed from: j, reason: collision with root package name */
    public final long f492043j;

    public n6(java.lang.String old, java.lang.String str, int i17, int i18, so2.p6 textType, so2.a actionType, so2.m contentType, int i19, r45.gb4 gb4Var, long j17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        old = (i27 & 1) != 0 ? "" : old;
        str = (i27 & 2) != 0 ? "" : str;
        i17 = (i27 & 4) != 0 ? 0 : i17;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        actionType = (i27 & 32) != 0 ? so2.a.f491773d : actionType;
        contentType = (i27 & 64) != 0 ? so2.m.f492008d : contentType;
        i19 = (i27 & 128) != 0 ? 0 : i19;
        gb4Var = (i27 & 256) != 0 ? null : gb4Var;
        j17 = (i27 & 512) != 0 ? java.lang.System.currentTimeMillis() : j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(old, "old");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "new");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textType, "textType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionType, "actionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentType, "contentType");
        this.f492034a = old;
        this.f492035b = str;
        this.f492036c = i17;
        this.f492037d = i18;
        this.f492038e = textType;
        this.f492039f = actionType;
        this.f492040g = contentType;
        this.f492041h = i19;
        this.f492042i = gb4Var;
        this.f492043j = j17;
    }
}
