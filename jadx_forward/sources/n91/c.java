package n91;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td {

    /* renamed from: d, reason: collision with root package name */
    public final n91.g f417388d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f417389e = new n91.b(this);

    public c(n91.g gVar) {
        this.f417388d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 Cf() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0.HIDE;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void Cg(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public boolean D0() {
        return this.f417388d.f417406c.ordinal() == 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void Q5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.sd sdVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public boolean S1() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void Yh() {
        n91.g gVar = this.f417388d;
        if (gVar.f417406c == n91.j.ENTERING_FULL_SCREEN) {
            n91.c0 c0Var = (n91.c0) gVar.f417404a;
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onRotationDone");
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("rotationDone", c0Var.f417392c, "");
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] onFullScreenDone");
            ((ne0.n) ((oe0.r) i95.n0.c(oe0.r.class))).Ai("fullScreenDone", c0Var.f417392c, "");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = c0Var.f417401l;
            if (c22644xc8fbf3b2 != null) {
                c22644xc8fbf3b2.setVisibility(4);
            }
            gVar.f417406c = n91.j.FULL_SCREEN;
            java.util.LinkedList linkedList = gVar.f417407d;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.lang.Runnable) it.next()).run();
            }
            linkedList.clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = gVar.f417405b;
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.C12618xdf005494(o6Var, o6Var.S2(false), true).d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    /* renamed from: bringToFront */
    public void mo50929xffe5a7c() {
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td tdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td) obj;
        if (tdVar instanceof n91.c) {
            if (this.f417388d == ((n91.c) tdVar).f417388d) {
                return 0;
            }
        }
        return hashCode() - tdVar.hashCode();
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return ((n91.b) this.f417389e).f417386d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.td
    public void h2() {
    }
}
