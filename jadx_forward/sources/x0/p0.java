package x0;

/* loaded from: classes14.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r0 f532452d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(x0.r0 r0Var) {
        super(2);
        this.f532452d = r0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.util.Set applied = (java.util.Set) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(applied, "applied");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((x0.m) obj2, "<anonymous parameter 1>");
        x0.r0 r0Var = this.f532452d;
        synchronized (r0Var.f532468d) {
            o0.i iVar = r0Var.f532468d;
            int i18 = iVar.f423385f;
            i17 = 0;
            if (i18 > 0) {
                java.lang.Object[] objArr = iVar.f423383d;
                int i19 = 0;
                do {
                    x0.n0 n0Var = (x0.n0) objArr[i17];
                    java.util.HashSet hashSet = n0Var.f532448c;
                    o0.e eVar = n0Var.f532447b;
                    java.util.Iterator it = applied.iterator();
                    while (it.hasNext()) {
                        int b17 = eVar.b(it.next());
                        if (b17 >= 0) {
                            java.util.Iterator it6 = eVar.d(b17).iterator();
                            while (true) {
                                o0.c cVar = (o0.c) it6;
                                if (cVar.hasNext()) {
                                    hashSet.add(cVar.next());
                                    i19 = 1;
                                }
                            }
                        }
                    }
                    i17++;
                } while (i17 < i18);
                i17 = i19;
            }
        }
        if (i17 != 0) {
            x0.r0 r0Var2 = this.f532452d;
            r0Var2.f532465a.mo146xb9724478(new x0.o0(r0Var2));
        }
        return jz5.f0.f384359a;
    }
}
