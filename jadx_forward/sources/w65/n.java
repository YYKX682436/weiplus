package w65;

/* loaded from: classes12.dex */
public interface n extends i95.m {
    static /* synthetic */ java.lang.Object Jd(w65.n nVar, w65.m mVar, long j17, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTaskSync");
        }
        if ((i17 & 2) != 0) {
            j17 = 300000;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            weakReference = null;
        }
        return ((lm.r) nVar).Zi(mVar, j18, weakReference, interfaceC29045xdcb5ca57);
    }
}
