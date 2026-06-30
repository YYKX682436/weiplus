package xz3;

/* loaded from: classes15.dex */
public final class d implements tz3.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xz3.f f539745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz3.x0 f539746b;

    public d(xz3.f fVar, sz3.x0 x0Var) {
        this.f539745a = fVar;
        this.f539746b = x0Var;
    }

    @Override // tz3.c
    public void a() {
        xz3.f fVar = this.f539745a;
        fVar.f539749e.j(fVar);
    }

    @Override // tz3.c
    public void b(sz3.c1 c1Var) {
        java.util.ArrayList arrayList;
        sz3.a1 a1Var;
        java.util.ArrayList arrayList2;
        sz3.x0 x0Var = this.f539746b;
        if (c1Var == null || c1Var.f495514h.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d.a(24, x0Var.f495685f);
        }
        int i17 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.o(false);
        xz3.f fVar = this.f539745a;
        if (c1Var != null && (arrayList2 = c1Var.f495514h) != null) {
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                sz3.a1 a1Var2 = (sz3.a1) it.next();
                sz3.a1 a1Var3 = fVar.f539748d.f495478b;
                sz3.y0 y0Var = a1Var3.f495496e;
                y0Var.f495699g = a1Var2.f495496e.f495699g;
                sz3.b1 b1Var = a1Var3.f495495d;
                a1Var2.f495494c = b1Var;
                a1Var2.f495495d = b1Var;
                a1Var2.f495496e = y0Var;
                a1Var2.f495497f = x0Var.f495685f;
            }
        }
        java.util.Iterator it6 = x0Var.f495684e.iterator();
        while (true) {
            if (!it6.hasNext()) {
                if ((c1Var != null ? c1Var.f495515i : null) == null && c1Var != null) {
                    c1Var.f495515i = c1Var.a();
                }
                fVar.f539749e.f(c1Var, x0Var, new xz3.c(fVar, x0Var));
                return;
            }
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sz3.w0 w0Var = (sz3.w0) next;
            if (c1Var != null && (arrayList = c1Var.f495514h) != null && (a1Var = (sz3.a1) kz5.n0.a0(arrayList, i17)) != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(w0Var.f495671i);
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.C17282x335f2f60 c17282x335f2f60 = a1Var.f495492a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanImageGetProductTask", "getProductTask uploadFullImage success set origin trackId: %s, trackId: %s, hashCode: %s", valueOf, java.lang.Integer.valueOf(c17282x335f2f60.getId()), java.lang.Integer.valueOf(a1Var.hashCode()));
                w0Var.f495671i = c17282x335f2f60.getId();
            }
            i17 = i18;
        }
    }
}
