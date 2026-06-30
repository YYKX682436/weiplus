package p32;

/* loaded from: classes12.dex */
public class h extends h32.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f432999f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f433000g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f433001h;

    public h(java.util.List list, h32.b bVar) {
        this.f432999f = list;
        this.f433001h = new java.lang.ref.WeakReference(bVar);
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f I() {
        return new r45.g4();
    }

    @Override // h32.a
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f J() {
        return new r45.h4();
    }

    @Override // h32.a
    public void K(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        r45.g4 g4Var = (r45.g4) fVar;
        java.util.Iterator it = this.f432999f.iterator();
        while (it.hasNext()) {
            g4Var.f456399d.add((java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 1777;
    }

    @Override // h32.a
    /* renamed from: getUri */
    public java.lang.String mo132826xb5887636() {
        return "/cgi-bin/mmoc-bin/hardware/addfollow";
    }

    @Override // h32.a, com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        h32.b bVar;
        if (i18 == 0 && i19 == 0) {
            r45.h4 h4Var = (r45.h4) H();
            this.f433000g = new java.util.ArrayList();
            java.util.LinkedList linkedList = h4Var.f457348d;
            if (linkedList != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    r45.e43 e43Var = (r45.e43) it.next();
                    int i27 = e43Var.f454537d;
                    this.f433000g.add(e43Var);
                }
                this.f433000g.toString();
                h4Var.f457348d.size();
            }
            s32.a Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri();
            java.util.ArrayList arrayList = this.f433000g;
            Ri.getClass();
            if (arrayList != null) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    r45.e43 e43Var2 = (r45.e43) it6.next();
                    r32.c cVar = new r32.c();
                    cVar.f67115xde6292c = "hardcode_rank_id";
                    cVar.f67117x2261aaf1 = e43Var2.f454539f;
                    cVar.f67118xdec927b = e43Var2.f454538e;
                    cVar.f67114x84a2aa32 = "hardcode_app_name";
                    Ri.L0(cVar);
                }
            }
        }
        super.mo804x5f9cdc6f(i17, i18, i19, str, v0Var, bArr);
        java.lang.ref.WeakReference weakReference = this.f433001h;
        if (weakReference == null || (bVar = (h32.b) weakReference.get()) == null) {
            return;
        }
        bVar.a(i18, i19, str, this);
    }
}
