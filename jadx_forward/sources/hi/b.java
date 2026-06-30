package hi;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f363015d;

    public b(java.lang.String str) {
        this.f363015d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Throwable th6;
        java.io.BufferedReader bufferedReader;
        try {
            java.lang.String str = this.f363015d;
            java.io.File file = new java.io.File(str);
            if (!file.exists()) {
                oj.j.b("MemGuard", "Dump file %s does not exist, dump failure ?", str);
                return;
            }
            try {
                bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
                while (true) {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader.close();
                                return;
                            } catch (java.lang.Throwable unused) {
                                return;
                            }
                        }
                        oj.j.f("MemGuard", "[DumpedIssue] >> %s", readLine);
                    } catch (java.lang.Throwable th7) {
                        th6 = th7;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (java.lang.Throwable unused2) {
                            }
                        }
                        throw th6;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th6 = th8;
                bufferedReader = null;
            }
        } catch (java.lang.Throwable th9) {
            oj.j.d("MemGuard", th9, "Exception was thrown when onIssueDumpped was called.", new java.lang.Object[0]);
        }
    }
}
