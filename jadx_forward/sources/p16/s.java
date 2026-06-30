package p16;

/* loaded from: classes16.dex */
public abstract class s extends p16.v implements p16.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final p16.n f432876d;

    public s() {
        this.f432876d = new p16.n();
    }

    public boolean d() {
        int i17 = 0;
        while (true) {
            p16.n nVar = this.f432876d;
            p16.w0 w0Var = nVar.f432857a;
            if (i17 >= w0Var.f432898e.size()) {
                java.util.Iterator it = w0Var.c().iterator();
                while (it.hasNext()) {
                    if (!nVar.f((java.util.Map.Entry) it.next())) {
                        return false;
                    }
                }
                return true;
            }
            if (!nVar.f((java.util.Map.Entry) w0Var.f432898e.get(i17))) {
                return false;
            }
            i17++;
        }
    }

    public int e() {
        p16.w0 w0Var;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            w0Var = this.f432876d.f432857a;
            if (i17 >= w0Var.f432898e.size()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) w0Var.f432898e.get(i17);
            i18 += p16.n.d((p16.m) entry.getKey(), entry.getValue());
            i17++;
        }
        for (java.util.Map.Entry entry2 : w0Var.c()) {
            i18 += p16.n.d((p16.m) entry2.getKey(), entry2.getValue());
        }
        return i18;
    }

    public final java.lang.Object f(p16.u uVar) {
        k(uVar);
        p16.n nVar = this.f432876d;
        p16.t tVar = uVar.f432889d;
        java.lang.Object e17 = nVar.e(tVar);
        if (e17 == null) {
            return uVar.f432887b;
        }
        if (!tVar.f432881f) {
            return uVar.a(e17);
        }
        if (tVar.f432880e.f432823d != p16.h1.ENUM) {
            return e17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) e17).iterator();
        while (it.hasNext()) {
            arrayList.add(uVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean g(p16.u uVar) {
        k(uVar);
        p16.n nVar = this.f432876d;
        nVar.getClass();
        p16.t tVar = uVar.f432889d;
        if (tVar.f432881f) {
            throw new java.lang.IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return nVar.f432857a.get(tVar) != null;
    }

    public void h() {
        this.f432876d.g();
    }

    public p16.r i() {
        return new p16.r(this, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j(p16.h r9, p16.j r10, p16.l r11, int r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p16.s.j(p16.h, p16.j, p16.l, int):boolean");
    }

    public final void k(p16.u uVar) {
        if (uVar.f432886a != mo134575x786693c3()) {
            throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public s(p16.q qVar) {
        qVar.f432871e.g();
        qVar.f432872f = false;
        this.f432876d = qVar.f432871e;
    }
}
