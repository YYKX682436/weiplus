package j22;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f378796a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f378797b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.StringBuilder f378798c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f378799d;

    public l(long j17, java.lang.String setName, int i17, int i18, java.lang.StringBuilder md5String, java.lang.StringBuilder indexString, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i19 & 1) != 0 ? 0L : j17;
        setName = (i19 & 2) != 0 ? "" : setName;
        md5String = (i19 & 16) != 0 ? new java.lang.StringBuilder() : md5String;
        indexString = (i19 & 32) != 0 ? new java.lang.StringBuilder() : indexString;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setName, "setName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md5String, "md5String");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(indexString, "indexString");
        this.f378796a = j17;
        this.f378797b = setName;
        this.f378798c = md5String;
        this.f378799d = indexString;
    }
}
