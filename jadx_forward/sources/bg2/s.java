package bg2;

/* loaded from: classes3.dex */
public final class s implements we2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f102012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg2.u f102013b;

    public s(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, bg2.u uVar) {
        this.f102012a = c19792x256d2725;
        this.f102013b = uVar;
    }

    @Override // we2.a
    public boolean r() {
        bg2.k0 k0Var = (bg2.k0) this.f102013b.N6(bg2.k0.class);
        if (k0Var == null) {
            return false;
        }
        return k0Var.f101771g || k0Var.f101772h;
    }

    @Override // we2.a
    public boolean t() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f102012a;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19792x256d2725 != null ? c19792x256d2725.m76836x6c03c64c() : null, g92.b.f351302e.T0());
    }

    @Override // we2.a
    public boolean v(java.util.LinkedList linkedList) {
        java.lang.Object obj = null;
        if (linkedList == null) {
            bg2.k0 k0Var = (bg2.k0) this.f102013b.N6(bg2.k0.class);
            linkedList = k0Var != null ? k0Var.f101774m : null;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).m75939xb282bd08(0) == 10) {
                    obj = next;
                    break;
                }
            }
            obj = (r45.yl1) obj;
        }
        return obj != null;
    }

    @Override // we2.a
    public java.lang.String w() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f102012a;
        java.lang.String m76836x6c03c64c = c19792x256d2725 != null ? c19792x256d2725.m76836x6c03c64c() : null;
        return m76836x6c03c64c == null ? "" : m76836x6c03c64c;
    }
}
