package mm2;

/* loaded from: classes3.dex */
public final class p1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f410876d;

    public p1(mm2.s1 s1Var) {
        this.f410876d = s1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.fd2 fd2Var = (r45.fd2) obj;
        mm2.s1 s1Var = this.f410876d;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) s1Var.f410921h).mo144003x754a37bb();
        r45.p12 p12Var = null;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.p12 p12Var2 = (r45.p12) next;
                r45.q12 q12Var = (r45.q12) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).f410601f).mo144003x754a37bb();
                boolean z17 = false;
                if (q12Var != null && p12Var2.m75939xb282bd08(0) == q12Var.m75939xb282bd08(0)) {
                    z17 = true;
                }
                if (z17) {
                    p12Var = next;
                    break;
                }
            }
            p12Var = p12Var;
        }
        if (p12Var != null) {
            p12Var.set(2, fd2Var);
        }
        return jz5.f0.f384359a;
    }
}
