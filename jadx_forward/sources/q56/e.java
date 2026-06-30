package q56;

/* loaded from: classes13.dex */
public final class e extends java.lang.RuntimeException {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f441742d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f441743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Throwable f441744f;

    public e(java.util.Collection collection) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (collection != null) {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                java.lang.Throwable th6 = (java.lang.Throwable) it.next();
                if (th6 instanceof q56.e) {
                    linkedHashSet.addAll(((q56.e) th6).f441742d);
                } else if (th6 != null) {
                    linkedHashSet.add(th6);
                } else {
                    linkedHashSet.add(new java.lang.NullPointerException());
                }
            }
        } else {
            linkedHashSet.add(new java.lang.NullPointerException());
        }
        arrayList.addAll(linkedHashSet);
        java.util.List unmodifiableList = java.util.Collections.unmodifiableList(arrayList);
        this.f441742d = unmodifiableList;
        this.f441743e = unmodifiableList.size() + " exceptions occurred. ";
    }

    public final void a(java.lang.StringBuilder sb6, java.lang.Throwable th6, java.lang.String str) {
        sb6.append(str);
        sb6.append(th6);
        sb6.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : th6.getStackTrace()) {
            sb6.append("\t\tat ");
            sb6.append(stackTraceElement);
            sb6.append('\n');
        }
        if (th6.getCause() != null) {
            sb6.append("\tCaused by: ");
            a(sb6, th6.getCause(), "");
        }
    }

    public final void b(q56.b bVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(128);
        sb6.append(this);
        sb6.append('\n');
        for (java.lang.StackTraceElement stackTraceElement : getStackTrace()) {
            sb6.append("\tat ");
            sb6.append(stackTraceElement);
            sb6.append('\n');
        }
        int i17 = 1;
        for (java.lang.Throwable th6 : this.f441742d) {
            sb6.append("  ComposedException ");
            sb6.append(i17);
            sb6.append(" :\n");
            a(sb6, th6, "\t");
            i17++;
        }
        synchronized (bVar.a()) {
            bVar.b(sb6.toString());
        }
    }

    @Override // java.lang.Throwable
    public synchronized java.lang.Throwable getCause() {
        if (this.f441744f == null) {
            q56.a aVar = new q56.a();
            java.util.HashSet hashSet = new java.util.HashSet();
            q56.a aVar2 = aVar;
            for (java.lang.Throwable th6 : this.f441742d) {
                if (!hashSet.contains(th6)) {
                    hashSet.add(th6);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.Throwable cause = th6.getCause();
                    if (cause != null && cause != th6) {
                        while (true) {
                            arrayList.add(cause);
                            java.lang.Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause.getCause();
                        }
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.Throwable th7 = (java.lang.Throwable) it.next();
                        if (hashSet.contains(th7)) {
                            th6 = new java.lang.RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th7);
                        }
                    }
                    try {
                        aVar2.initCause(th6);
                    } catch (java.lang.Throwable unused) {
                    }
                    java.lang.Throwable cause3 = aVar2.getCause();
                    if (cause3 != null && cause3 != aVar2) {
                        while (true) {
                            java.lang.Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause3.getCause();
                        }
                        aVar2 = cause3;
                    }
                }
            }
            this.f441744f = aVar;
        }
        return this.f441744f;
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        return this.f441743e;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(java.lang.System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream printStream) {
        b(new q56.c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter printWriter) {
        b(new q56.d(printWriter));
    }
}
