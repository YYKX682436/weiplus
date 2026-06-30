package c8;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f121174a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.e f121175b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.d f121176c;

    /* renamed from: d, reason: collision with root package name */
    public c8.f f121177d;

    public h() {
        c8.i iVar = new c8.i();
        c8.b bVar = new c8.b();
        this.f121174a = new java.util.HashSet();
        this.f121175b = iVar;
        this.f121176c = bVar;
    }

    public java.io.File a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String b17 = ((c8.i) this.f121175b).b(str);
        if (str2 == null || str2.length() == 0) {
            return new java.io.File(context.getDir(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428, 0), b17);
        }
        return new java.io.File(context.getDir(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428, 0), b17 + "." + str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0150, code lost:
    
        if (r14 != null) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.h.b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public void c(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String format = java.lang.String.format(java.util.Locale.US, str, objArr);
        if (this.f121177d != null) {
            io.p3284xd2ae381c.Log.d(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.TAG, format);
        }
    }
}
