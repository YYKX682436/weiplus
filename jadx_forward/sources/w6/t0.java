package w6;

/* loaded from: classes12.dex */
public final class t0 extends java.lang.Exception {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.StackTraceElement[] f524763i = new java.lang.StackTraceElement[0];

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f524764d;

    /* renamed from: e, reason: collision with root package name */
    public t6.h f524765e;

    /* renamed from: f, reason: collision with root package name */
    public t6.a f524766f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Class f524767g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f524768h;

    public t0(java.lang.String str) {
        this(str, java.util.Collections.emptyList());
    }

    public static void b(java.util.List list, java.lang.Appendable appendable) {
        try {
            c(list, appendable);
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public static void c(java.util.List list, java.lang.Appendable appendable) {
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 1;
            appendable.append("Cause (").append(java.lang.String.valueOf(i18)).append(" of ").append(java.lang.String.valueOf(size)).append("): ");
            java.lang.Throwable th6 = (java.lang.Throwable) list.get(i17);
            if (th6 instanceof w6.t0) {
                ((w6.t0) th6).e(appendable);
            } else {
                d(th6, appendable);
            }
            i17 = i18;
        }
    }

    public static void d(java.lang.Throwable th6, java.lang.Appendable appendable) {
        try {
            appendable.append(th6.getClass().toString()).append(": ").append(th6.getMessage()).append('\n');
        } catch (java.io.IOException unused) {
            throw new java.lang.RuntimeException(th6);
        }
    }

    public final void a(java.lang.Throwable th6, java.util.List list) {
        if (!(th6 instanceof w6.t0)) {
            list.add(th6);
            return;
        }
        java.util.Iterator it = ((w6.t0) th6).f524764d.iterator();
        while (it.hasNext()) {
            a((java.lang.Throwable) it.next(), list);
        }
    }

    public final void e(java.lang.Appendable appendable) {
        d(this, appendable);
        b(this.f524764d, new w6.s0(appendable));
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(71);
        sb6.append(this.f524768h);
        java.lang.String str3 = "";
        if (this.f524767g != null) {
            str = ", " + this.f524767g;
        } else {
            str = "";
        }
        sb6.append(str);
        if (this.f524766f != null) {
            str2 = ", " + this.f524766f;
        } else {
            str2 = "";
        }
        sb6.append(str2);
        if (this.f524765e != null) {
            str3 = ", " + this.f524765e;
        }
        sb6.append(str3);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb6.toString();
        }
        if (arrayList.size() == 1) {
            sb6.append("\nThere was 1 cause:");
        } else {
            sb6.append("\nThere were ");
            sb6.append(arrayList.size());
            sb6.append(" causes:");
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Throwable th6 = (java.lang.Throwable) it.next();
            sb6.append('\n');
            sb6.append(th6.getClass().getName());
            sb6.append('(');
            sb6.append(th6.getMessage());
            sb6.append(')');
        }
        sb6.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb6.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        e(java.lang.System.err);
    }

    public t0(java.lang.String str, java.util.List list) {
        this.f524768h = str;
        setStackTrace(f524763i);
        this.f524764d = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter printWriter) {
        e(printWriter);
    }
}
