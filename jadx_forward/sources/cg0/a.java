package cg0;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f122567a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f122568b;

    /* renamed from: c, reason: collision with root package name */
    public final long f122569c;

    /* renamed from: d, reason: collision with root package name */
    public final long f122570d;

    /* renamed from: e, reason: collision with root package name */
    public final long f122571e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f122572f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f122573g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f122574h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f122575i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String fileName, java.lang.String msgTalker, long j17, long j18, long j19) {
        this(fileName, msgTalker, j17, j18, j19, false, 32, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
    }

    public a(java.lang.String fileName, java.lang.String msgTalker, long j17, long j18, long j19, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 32) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileName, "fileName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        this.f122567a = fileName;
        this.f122568b = msgTalker;
        this.f122569c = j17;
        this.f122570d = j18;
        this.f122571e = j19;
        this.f122572f = z17;
        this.f122573g = new java.util.LinkedHashMap();
        this.f122575i = true;
    }
}
