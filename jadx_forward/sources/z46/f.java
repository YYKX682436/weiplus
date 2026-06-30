package z46;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f551687a;

    /* renamed from: b, reason: collision with root package name */
    public final z46.b f551688b;

    /* renamed from: c, reason: collision with root package name */
    public final z46.a f551689c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f551690d;

    public f() {
        z46.j jVar = new z46.j();
        z46.h hVar = new z46.h();
        this.f551687a = new java.util.HashSet();
        this.f551688b = jVar;
        this.f551689c = hVar;
    }

    public java.io.File a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String b17 = ((z46.j) this.f551688b).b(str);
        if (str2 == null || str2.length() == 0) {
            return new java.io.File(context.getDir(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428, 0), b17);
        }
        return new java.io.File(context.getDir(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55725xb2d42428, 0), b17 + "." + str2);
    }

    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, z46.c cVar) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        if (str == null || str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Given library is either null or empty");
        }
        d("Beginning load of %s...", str);
        if (cVar == null) {
            c(context, str, str2);
            return;
        }
        try {
            new java.lang.Thread(new z46.d(this, context, str, str2, cVar)).start();
        } catch (java.lang.Error | java.lang.Exception e17) {
            cVar.a(e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0114, code lost:
    
        r10.b(r14);
        r10.b(r7);
        r6.setReadable(true, false);
        r6.setExecutable(true, false);
        r6.setWritable(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0125, code lost:
    
        r15.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z46.f.c(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String.format(java.util.Locale.US, str, objArr);
    }
}
