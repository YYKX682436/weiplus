package gg3;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f353259a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f353260b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f353261c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f353262d;

    /* renamed from: e, reason: collision with root package name */
    public final long f353263e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f353264f;

    public c(java.lang.String id6, java.lang.String thumbPath, java.lang.String filePath, java.lang.String originFileName, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbPath, "thumbPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originFileName, "originFileName");
        this.f353259a = id6;
        this.f353260b = thumbPath;
        this.f353261c = filePath;
        this.f353262d = originFileName;
        this.f353263e = j17;
        this.f353264f = z17;
    }

    public /* synthetic */ c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) == 0 ? str4 : "", (i17 & 16) != 0 ? 0L : j17, (i17 & 32) != 0 ? false : z17);
    }
}
