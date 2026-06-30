package ja2;

/* loaded from: classes9.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f380143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f380144b;

    public b(yz5.l lVar, yz5.a aVar) {
        this.f380143a = lVar;
        this.f380144b = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList<r45.aa5> m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.ml3 ml3Var = (r45.ml3) fVar.f152151d;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.z95 z95Var = (r45.z95) ml3Var.m75936x14adae67(1);
            if (z95Var != null && (m75941xfb821914 = z95Var.m75941xfb821914(0)) != null) {
                for (r45.aa5 aa5Var : m75941xfb821914) {
                    bw5.bh0 bh0Var = new bw5.bh0();
                    bh0Var.f107203d = aa5Var.m75945x2fec8307(0);
                    boolean[] zArr = bh0Var.f107206g;
                    zArr[1] = true;
                    bh0Var.f107204e = aa5Var.m75945x2fec8307(1);
                    zArr[2] = true;
                    bh0Var.f107205f = aa5Var.m75945x2fec8307(2);
                    zArr[3] = true;
                    linkedList.add(bh0Var);
                }
            }
            bw5.ah0 ah0Var = new bw5.ah0();
            ah0Var.f106734d = linkedList;
            ah0Var.f106735e[1] = true;
            this.f380143a.mo146xb9724478(ah0Var);
        } else {
            this.f380144b.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
