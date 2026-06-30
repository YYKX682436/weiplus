package dv4;

/* loaded from: classes.dex */
public class q extends dv4.a {

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f325567c;

    public q(java.lang.String str, int i17) {
        super(str, i17);
        this.f325567c = java.util.Collections.emptyList();
    }

    @Override // dv4.a
    public void a(java.util.List list) {
        this.f325567c = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p13.y yVar = (p13.y) it.next();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f432720e, true);
            dv4.p pVar = new dv4.p();
            pVar.f325561a = n17.d1();
            pVar.f325562b = yVar.f432723h;
            pVar.f325563c = n17.P0();
            pVar.f325564d = n17.w0();
            pVar.f325565e = n17.t0();
            pVar.f325566f = n17.f318122y1;
            this.f325567c.add(pVar);
        }
    }
}
