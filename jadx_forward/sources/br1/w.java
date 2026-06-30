package br1;

/* loaded from: classes11.dex */
public interface w {
    static /* synthetic */ void c(br1.w wVar, boolean z17, int i17, hr1.a aVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDone");
        }
        if ((i18 & 4) != 0) {
            aVar = null;
        }
        wVar.b(z17, i17, aVar);
    }

    void a(int i17);

    void b(boolean z17, int i17, hr1.a aVar);
}
