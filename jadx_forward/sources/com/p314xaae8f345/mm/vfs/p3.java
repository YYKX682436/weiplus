package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public class p3 implements com.p314xaae8f345.mm.vfs.x2 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.p3 f294657b = new com.p314xaae8f345.mm.vfs.p3();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashSet f294658a = new java.util.LinkedHashSet();

    @Override // com.p314xaae8f345.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        synchronized (this) {
            java.util.Iterator it = this.f294658a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.vfs.x2) it.next()).a(cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public boolean b(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, android.os.CancellationSignal cancellationSignal) {
        boolean z17;
        synchronized (this) {
            java.util.Iterator it = this.f294658a.iterator();
            z17 = true;
            while (it.hasNext()) {
                z17 &= ((com.p314xaae8f345.mm.vfs.x2) it.next()).b(str, q2Var, cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
        synchronized (this) {
            java.util.Iterator it = this.f294658a.iterator();
            while (it.hasNext()) {
                ((com.p314xaae8f345.mm.vfs.x2) it.next()).c(z17, z18, cancellationSignal);
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
        }
    }
}
