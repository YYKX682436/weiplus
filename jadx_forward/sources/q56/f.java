package q56;

/* loaded from: classes16.dex */
public abstract class f {
    public static void a(java.util.List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new q56.e(list);
        }
        java.lang.Throwable th6 = (java.lang.Throwable) list.get(0);
        if (th6 instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th6);
        }
        if (!(th6 instanceof java.lang.Error)) {
            throw new java.lang.RuntimeException(th6);
        }
        throw ((java.lang.Error) th6);
    }

    public static void b(java.lang.Throwable th6) {
        if (th6 instanceof q56.j) {
            throw ((q56.j) th6);
        }
        if (th6 instanceof q56.i) {
            throw ((q56.i) th6);
        }
        if (th6 instanceof q56.h) {
            throw ((q56.h) th6);
        }
        if (th6 instanceof java.lang.StackOverflowError) {
            throw ((java.lang.StackOverflowError) th6);
        }
        if (th6 instanceof java.lang.VirtualMachineError) {
            throw ((java.lang.VirtualMachineError) th6);
        }
        if (th6 instanceof java.lang.ThreadDeath) {
            throw ((java.lang.ThreadDeath) th6);
        }
        if (th6 instanceof java.lang.LinkageError) {
            throw ((java.lang.LinkageError) th6);
        }
    }

    public static void c(java.lang.Throwable th6, p56.m mVar) {
        b(th6);
        mVar.mo157869xaf8aa769(th6);
    }

    public static void d(java.lang.Throwable th6, p56.m mVar, java.lang.Object obj) {
        b(th6);
        mVar.mo157869xaf8aa769(q56.m.a(th6, obj));
    }
}
