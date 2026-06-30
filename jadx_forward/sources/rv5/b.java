package rv5;

/* loaded from: classes13.dex */
public class b implements rv5.d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f482098b;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f482099a;

    public b(android.content.Context context) {
        this.f482099a = context;
    }

    @Override // rv5.d
    public void a(java.io.File file, java.io.File file2, java.lang.String str, int i17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchTypeExtractFail: file extract fail type: %s, path: %s, extractTo: %s, filename: %s", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104736x9973bfe1(i17), file.getPath(), file2.getPath(), str);
        tv5.b.b(this.f482099a).a(file);
    }

    @Override // rv5.d
    public void b(java.io.File file, java.util.List list, java.lang.Throwable th6) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchDexOptFail: dex opt fail path: %s, dex size: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(list.size()));
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35("Tinker.DefaultPatchReporter", th6, "onPatchDexOptFail:", new java.lang.Object[0]);
        if (!th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55626x99ea7522) && !th6.getMessage().contains(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55627x6a5b804a)) {
            tv5.b.b(this.f482099a).a(file);
            return;
        }
        f482098b = true;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134((java.io.File) it.next());
        }
    }

    @Override // rv5.d
    public void c(java.io.File file, int i17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchPackageCheckFail: package check failed. path: %s, code: %d", file.getAbsolutePath(), java.lang.Integer.valueOf(i17));
        if (i17 == -3 || i17 == -4 || i17 == -8) {
            tv5.b.b(this.f482099a).a(file);
        }
    }

    @Override // rv5.d
    public void d(java.io.File file, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchInfoCorrupted: patch info is corrupted. old: %s, new: %s", str, str2);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104725xcca2ff7f(tv5.b.b(this.f482099a).f503901a);
    }

    @Override // rv5.d
    public void e(java.io.File file, java.lang.Throwable th6) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchException: patch exception path: %s, throwable: %s", file.getAbsolutePath(), th6.getMessage());
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.DefaultPatchReporter", "tinker patch exception, welcome to submit issue to us: https://github.com/Tencent/tinker/issues", new java.lang.Object[0]);
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35("Tinker.DefaultPatchReporter", th6, "tinker patch exception", new java.lang.Object[0]);
        android.content.Context context = this.f482099a;
        tv5.b.b(context).f503910j = 0;
        tv5.b.b(context).a(file);
    }

    @Override // rv5.d
    public void f(java.io.File file, boolean z17, long j17) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchResult: patch all result path: %s, success: %b, cost: %d", file.getAbsolutePath(), java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        if (f482098b) {
            return;
        }
        java.io.File file2 = uv5.c.b(this.f482099a).f513007b;
        if (file2.exists()) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134(file2);
        }
    }

    @Override // rv5.d
    public void g(android.content.Intent intent) {
        uv5.b bVar;
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchServiceStart: patch service start", new java.lang.Object[0]);
        f482098b = false;
        uv5.c b17 = uv5.c.b(this.f482099a);
        b17.getClass();
        if (intent == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.e("Tinker.UpgradePatchRetry", "onPatchServiceStart intent is null, just return", new java.lang.Object[0]);
            return;
        }
        qv5.a aVar = com.p314xaae8f345.p3076xcbed6b1f.lib.p3079x7643c6b5.IntentServiceC26594x4aa6a22c.f297079d;
        java.lang.String m104654x7e63ed49 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26635x80afc5dd.m104654x7e63ed49(intent, "patch_path_extra");
        if (m104654x7e63ed49 == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch path is null, just return", new java.lang.Object[0]);
            return;
        }
        java.io.File file = new java.io.File(m104654x7e63ed49);
        java.lang.String m104676xb5885268 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104676xb5885268(file);
        if (m104676xb5885268 == null) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchServiceStart patch md5 is null, just return", new java.lang.Object[0]);
            return;
        }
        java.io.File file2 = b17.f513006a;
        if (file2.exists()) {
            bVar = uv5.b.a(file2);
            java.lang.String str = bVar.f513003a;
            if (str == null || bVar.f513004b == null || !m104676xb5885268.equals(str)) {
                b17.a(file);
                bVar.f513003a = m104676xb5885268;
                bVar.f513004b = "1";
            } else {
                int parseInt = java.lang.Integer.parseInt(bVar.f513004b);
                if (parseInt >= 20) {
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104690x85427134(b17.f513007b);
                    com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.w("Tinker.UpgradePatchRetry", "onPatchServiceStart retry more than max count, delete retry info file!", new java.lang.Object[0]);
                    return;
                }
                bVar.f513004b = java.lang.String.valueOf(parseInt + 1);
            }
        } else {
            b17.a(file);
            bVar = new uv5.b(m104676xb5885268, "1");
        }
        uv5.b.b(file2, bVar);
    }

    @Override // rv5.d
    public void h(java.io.File file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 c26638x12179c17, java.lang.String str) {
        com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.i("Tinker.DefaultPatchReporter", "patchReporter onPatchVersionCheckFail: patch version exist. path: %s, version: %s", file.getAbsolutePath(), str);
    }
}
