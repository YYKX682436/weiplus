package p32;

/* loaded from: classes4.dex */
public class n extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f433038f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f433039g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f433040h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433041i;

    public n(h32.b bVar) {
        this.f433041i = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.as3();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.bs3();
    }

    @Override // h32.a
    public /* bridge */ /* synthetic */ void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1758;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmoc-bin/hardware/getwerunfollowerlist";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        if (i18 == 0 && i19 == 0) {
            r45.bs3 bs3Var = (r45.bs3) H();
            this.f433040h = new java.util.ArrayList();
            java.util.Iterator it = bs3Var.f452555d.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(str2)) {
                    this.f433040h.add(str2);
                }
            }
            this.f433038f = new java.util.ArrayList();
            this.f433039g = new java.util.ArrayList();
            java.util.LinkedList linkedList = bs3Var.f452556e;
            if (linkedList != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.j43 j43Var = (r45.j43) it6.next();
                    if (j43Var.f459109e) {
                        this.f433039g.add(j43Var.f459108d);
                    }
                    if (((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(j43Var.f459108d)) {
                        this.f433038f.add(j43Var.f459108d);
                    }
                }
            }
            this.f433039g.size();
            this.f433039g.toString();
            this.f433038f.size();
        }
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        java.lang.ref.WeakReference weakReference = this.f433041i;
        if (weakReference == null || (bVar = (h32.b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i18, i19, str, this);
    }
}
