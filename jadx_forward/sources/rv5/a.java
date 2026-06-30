package rv5;

/* loaded from: classes13.dex */
public class a implements rv5.c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f482097a;

    public a(android.content.Context context) {
        this.f482097a = context;
    }

    @Override // rv5.c
    public void a(java.io.File file, int i17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPackageCheckFail: load patch package check fail file path: %s, errorCode: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(this.f482097a).f503901a);
    }

    @Override // rv5.c
    public void b(int i17, java.lang.Throwable th6) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", java.lang.Integer.valueOf(i17), th6);
        if (i17 == 0) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret ok", new java.lang.Object[0]);
        } else if (i17 == 1) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new java.lang.Object[0]);
        } else if (i17 == 2) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new java.lang.Object[0]);
        }
        j();
    }

    @Override // rv5.c
    public void c(java.io.File file, int i17, long j17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadResult: patch load result, path:%s, code: %d, cost: %dms", file.getAbsolutePath(), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
    }

    @Override // rv5.c
    public void d(java.io.File file, int i17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch load Reporter onLoadFileMd5Mismatch: patch file md5 mismatch file: %s, fileType: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(this.f482097a).f503901a);
    }

    @Override // rv5.c
    public void e(java.lang.Throwable th6, int i17) {
        android.content.Context context = this.f482097a;
        if (i17 == -4) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unCatch exception: %s", th6);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104761xd655e5e6(context);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "unCaught exception disable tinker forever with sp", new java.lang.Object[0]);
            java.lang.String m104665x9fa1ddd5 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104665x9fa1ddd5(context);
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104743x83891ddd(m104665x9fa1ddd5)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104682x8e55de5b(context));
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "tinker uncaught real exception:" + m104665x9fa1ddd5, new java.lang.Object[0]);
            }
        } else if (i17 == -3) {
            if (th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55628xc392eb38)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker res check fail:" + th6.getMessage(), new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load resource exception: %s", th6);
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104761xd655e5e6(context);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "res exception disable tinker forever with sp", new java.lang.Object[0]);
        } else if (i17 == -2) {
            if (th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55625xd6edb921)) {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: tinker dex check fail:" + th6.getMessage(), new java.lang.Object[0]);
            } else {
                com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load dex exception: %s", th6);
            }
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104761xd655e5e6(context);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "dex exception disable tinker forever with sp", new java.lang.Object[0]);
        } else if (i17 == -1) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadException: patch load unknown exception: %s", th6);
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultLoadReporter", "tinker load exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new java.lang.Object[0]);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35("Tinker.DefaultLoadReporter", th6, "tinker load exception", new java.lang.Object[0]);
        tv5.b.b(context).f503910j = 0;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(context).f503901a);
    }

    @Override // rv5.c
    public void f(java.io.File file, int i17, boolean z17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType: %d, isDirectory: %b", file.getAbsolutePath(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (i17 == 4) {
            j();
        } else {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(this.f482097a).f503901a);
        }
    }

    @Override // rv5.c
    public void g(java.lang.String str, java.lang.String str2, java.io.File file) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchInfoCorrupted: patch info file damage: %s, from version: %s to version: %s", file.getAbsolutePath(), str, str2);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(this.f482097a).f503901a);
    }

    @Override // rv5.c
    public void h(java.io.File file, int i17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchListenerReceiveFail: patch receive fail: %s, code: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(i17));
    }

    @Override // rv5.c
    public void i(java.lang.String str, java.lang.String str2, java.io.File file, java.lang.String str3) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "patch loadReporter onLoadPatchVersionChanged: patch version change from " + str + " to " + str2, new java.lang.Object[0]);
        if (str == null || str2 == null || str.equals(str2)) {
            return;
        }
        android.content.Context context = this.f482097a;
        if (tv5.b.b(context).f503908h) {
            uv5.c.b(context).d(str2);
        }
    }

    public boolean j() {
        java.io.File file;
        android.content.Context context = this.f482097a;
        tv5.b b17 = tv5.b.b(context);
        if (!b17.f503908h || (file = b17.f503911k.f503919g) == null || !uv5.c.b(context).c(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104676xb5885268(file))) {
            return false;
        }
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultLoadReporter", "try to repair oat file on patch process", new java.lang.Object[0]);
        tv5.b.b(context).f503903c.a(file.getAbsolutePath());
        return true;
    }
}
