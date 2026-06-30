package cg0;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f41034a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f41035b;

    /* renamed from: c, reason: collision with root package name */
    public final long f41036c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41037d;

    /* renamed from: e, reason: collision with root package name */
    public final long f41038e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41039f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f41040g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41041h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41042i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String fileName, java.lang.String msgTalker, long j17, long j18, long j19) {
        this(fileName, msgTalker, j17, j18, j19, false, 32, null);
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
    }

    public a(java.lang.String fileName, java.lang.String msgTalker, long j17, long j18, long j19, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 32) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(fileName, "fileName");
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        this.f41034a = fileName;
        this.f41035b = msgTalker;
        this.f41036c = j17;
        this.f41037d = j18;
        this.f41038e = j19;
        this.f41039f = z17;
        this.f41040g = new java.util.LinkedHashMap();
        this.f41042i = true;
    }
}
