package c8;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f39641a;

    /* renamed from: b, reason: collision with root package name */
    public final c8.e f39642b;

    /* renamed from: c, reason: collision with root package name */
    public final c8.d f39643c;

    /* renamed from: d, reason: collision with root package name */
    public c8.f f39644d;

    public h() {
        c8.i iVar = new c8.i();
        c8.b bVar = new c8.b();
        this.f39641a = new java.util.HashSet();
        this.f39642b = iVar;
        this.f39643c = bVar;
    }

    public java.io.File a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String b17 = ((c8.i) this.f39642b).b(str);
        if (str2 == null || str2.length() == 0) {
            return new java.io.File(context.getDir(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH, 0), b17);
        }
        return new java.io.File(context.getDir(com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH, 0), b17 + "." + str2);
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
        if (this.f39644d != null) {
            io.flutter.Log.d(io.flutter.embedding.engine.FlutterJNI.TAG, format);
        }
    }
}
