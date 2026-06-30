package j12;

/* loaded from: classes15.dex */
public class f implements java.lang.Cloneable, java.lang.Iterable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f378691d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f378692e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f378693f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f378694g;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.s sVar) {
        java.util.List list = sVar == null ? null : sVar.f179133b;
        this.f378692e = new java.util.HashMap();
        this.f378693f = new java.util.HashMap();
        this.f378694g = c01.z1.y();
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f378691d = arrayList;
        arrayList.addAll(list);
    }

    /* renamed from: clone */
    public java.lang.Object m140185x5a5dd5d() {
        try {
            j12.f fVar = (j12.f) super.clone();
            try {
                java.util.ArrayList arrayList = this.f378691d;
                if (arrayList == null) {
                    return fVar;
                }
                fVar.f378691d = (java.util.ArrayList) arrayList.clone();
                return fVar;
            } catch (java.lang.CloneNotSupportedException unused) {
                return fVar;
            }
        } catch (java.lang.CloneNotSupportedException unused2) {
            return null;
        }
    }

    public void d() {
        if (this.f378691d == null || ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().f179131b == null) {
            return;
        }
        java.util.Iterator it = this.f378691d.iterator();
        while (it.hasNext()) {
            j12.i iVar = (j12.i) it.next();
            r45.zj0 zj0Var = iVar.f378700b;
            if (zj0Var != null) {
                int b17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().b(zj0Var.f473661d);
                if (b17 >= 0) {
                    iVar.c(6);
                    iVar.f378703e = b17;
                }
                if (b17 < 0 && iVar.f378704f == 6) {
                    iVar.c(3);
                }
            }
        }
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.f5 e(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f5) this.f378692e.get(str);
        if (f5Var != null) {
            return f5Var;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f5 f5Var2 = new com.p314xaae8f345.mm.p2621x8fb0427b.f5(str);
        this.f378692e.put(str, f5Var2);
        return f5Var2;
    }

    public j12.i g(java.lang.String str) {
        java.lang.String str2;
        java.util.ArrayList arrayList = this.f378691d;
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j12.i iVar = (j12.i) it.next();
            r45.zj0 zj0Var = iVar.f378700b;
            if (zj0Var != null && (str2 = zj0Var.f473661d) != null && str2.equals(str)) {
                return iVar;
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new j12.e(this, null);
    }
}
