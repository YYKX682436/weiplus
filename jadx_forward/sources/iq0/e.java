package iq0;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f375190a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f375191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f375192c;

    public e(java.lang.String path, java.lang.String query, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        query = (i19 & 2) != 0 ? "" : query;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        this.f375190a = path;
        this.f375191b = query;
        this.f375192c = i17;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f375191b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f375190a;
        if (z17) {
            return str2;
        }
        return str2 + '-' + str;
    }
}
