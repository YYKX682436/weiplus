package fr4;

/* loaded from: classes11.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr4.g0 f347349d;

    public d0(fr4.g0 g0Var) {
        this.f347349d = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr4.k kVar;
        java.lang.ref.WeakReference weakReference = this.f347349d.f347363q;
        if (weakReference == null || (kVar = (lr4.k) weakReference.get()) == null) {
            return;
        }
        java.util.Iterator it = kVar.f402276f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((kr4.g) next).t0()) {
                kVar.m8147xed6e4d18(i17);
            }
            i17 = i18;
        }
        kVar.m8146xced61ae5();
    }
}
