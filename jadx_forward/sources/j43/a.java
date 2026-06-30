package j43;

/* loaded from: classes12.dex */
public abstract class a extends j43.d {
    public abstract void b(p75.k kVar, java.lang.Object obj);

    public final void c(java.lang.Iterable iterable) {
        p75.k z17;
        if (this.f379205a.compareAndSet(false, true)) {
            if (this.f379207c == null) {
                this.f379207c = this.f379206b.z(a());
            }
            z17 = this.f379207c;
        } else {
            z17 = this.f379206b.z(a());
        }
        try {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                b(z17, it.next());
                p75.e0 e0Var = (p75.e0) z17;
                com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = e0Var.f434167d;
                if (c26970x63d6eaa3 != null) {
                    c26970x63d6eaa3.m107869x22927a8e();
                } else {
                    com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = e0Var.f434168e;
                    if (c26915x63d6eaa3 != null) {
                        c26915x63d6eaa3.m106532x22927a8e();
                    }
                }
            }
        } finally {
            if (z17 == this.f379207c) {
                this.f379205a.set(false);
            }
        }
    }

    public final void d(java.lang.Object obj) {
        p75.k z17;
        if (this.f379205a.compareAndSet(false, true)) {
            if (this.f379207c == null) {
                this.f379207c = this.f379206b.z(a());
            }
            z17 = this.f379207c;
        } else {
            z17 = this.f379206b.z(a());
        }
        try {
            b(z17, obj);
            p75.e0 e0Var = (p75.e0) z17;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = e0Var.f434167d;
            if (c26970x63d6eaa3 != null) {
                c26970x63d6eaa3.m107869x22927a8e();
            } else {
                com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 c26915x63d6eaa3 = e0Var.f434168e;
                if (c26915x63d6eaa3 != null) {
                    c26915x63d6eaa3.m106532x22927a8e();
                }
            }
            if (e0Var == this.f379207c) {
                this.f379205a.set(false);
            }
        } catch (java.lang.Throwable th6) {
            if (z17 == this.f379207c) {
                this.f379205a.set(false);
            }
            throw th6;
        }
    }
}
