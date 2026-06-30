package d55;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public final d55.x f308162a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f308163b;

    public z(android.content.Context context) {
        d55.v vVar = new d55.v(context, "recovery_log");
        vVar.a();
        this.f308162a = vVar;
        java.lang.String absolutePath = new java.io.File(new java.io.File(context.getFilesDir().getParentFile(), "MicroMsg/recovery"), ".log").getAbsolutePath();
        java.lang.String mo123527x2fec8307 = vVar.mo123527x2fec8307("setting_log_path", absolutePath);
        try {
            d55.m0.b(new java.io.File(mo123527x2fec8307));
            absolutePath = mo123527x2fec8307;
        } catch (java.lang.Throwable unused) {
            ((d55.v) this.f308162a).e("setting_log_path");
        }
        this.f308163b = absolutePath;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        java.util.LinkedList linkedList;
        java.io.PrintWriter printWriter;
        boolean hasNext;
        java.io.File file = new java.io.File(this.f308163b);
        java.util.List list = d55.o0.f308136a;
        if (!file.exists()) {
            try {
                d55.m0.b(file);
            } catch (java.io.IOException e17) {
                d55.q0.a("MicroMsg.recovery.logFile", "create log file error", e17);
                return;
            }
        }
        synchronized (d55.o0.class) {
            java.util.List list2 = d55.o0.f308136a;
            linkedList = new java.util.LinkedList(list2);
            ((java.util.LinkedList) list2).clear();
        }
        java.io.PrintWriter printWriter2 = null;
        java.io.PrintWriter printWriter3 = null;
        try {
            try {
                printWriter = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Throwable th6) {
                th = th6;
                printWriter = printWriter2;
            }
        } catch (java.io.IOException e18) {
            e = e18;
        }
        try {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                hasNext = it.hasNext();
                if (hasNext == 0) {
                    break;
                } else {
                    printWriter.println(((d55.p0) it.next()).a());
                }
            }
            d55.m0.c(printWriter);
            printWriter2 = hasNext;
        } catch (java.io.IOException e19) {
            e = e19;
            printWriter3 = printWriter;
            d55.q0.a("MicroMsg.recovery.logFile", "write to file error", e);
            d55.m0.c(printWriter3);
            printWriter2 = printWriter3;
        } catch (java.lang.Throwable th7) {
            th = th7;
            d55.m0.c(printWriter);
            throw th;
        }
    }

    public java.lang.String b() {
        java.io.BufferedReader bufferedReader;
        java.io.File file = new java.io.File(this.f308163b);
        java.io.BufferedReader bufferedReader2 = null;
        if (!file.exists()) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            bufferedReader = new java.io.BufferedReader(new java.io.FileReader(file));
            while (true) {
                try {
                    try {
                        java.lang.String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            d55.m0.c(bufferedReader);
                            return sb6.toString();
                        }
                        sb6.append(readLine);
                        sb6.append('\n');
                    } catch (java.io.IOException e17) {
                        e = e17;
                        d55.q0.a("MicroMsg.recovery.logConfig", "read log content fail", e);
                        d55.m0.c(bufferedReader);
                        return null;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    bufferedReader2 = bufferedReader;
                    d55.m0.c(bufferedReader2);
                    throw th;
                }
            }
        } catch (java.io.IOException e18) {
            e = e18;
            bufferedReader = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            d55.m0.c(bufferedReader2);
            throw th;
        }
    }
}
