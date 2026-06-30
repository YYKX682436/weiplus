package wk;

/* loaded from: classes12.dex */
public class g extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {

    /* renamed from: d, reason: collision with root package name */
    public sl.j f528404d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f528405e;

    public g() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        sl.j jVar;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5396xade28778 c5396xade28778 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5396xade28778) abstractC20979x809547d1;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5396xade28778.f135737g.f88858b);
        am.m8 m8Var = c5396xade28778.f135737g;
        if (K0 && m8Var.f88857a == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtPlayerEventListener", "fileName(%s) is null or nil.", m8Var.f88858b);
        } else {
            int i17 = m8Var.f88857a;
            am.n8 n8Var = c5396xade28778.f135738h;
            if (i17 == 1) {
                if (this.f528404d == null) {
                    this.f528404d = new sl.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0);
                } else if (!m8Var.f88858b.equals(this.f528405e)) {
                    if (this.f528404d.c()) {
                        this.f528404d.h(false);
                    }
                    this.f528405e = m8Var.f88858b;
                } else if (this.f528404d.b()) {
                    this.f528404d.e();
                    n8Var.getClass();
                } else if (this.f528404d.c()) {
                    n8Var.getClass();
                }
                sl.j jVar2 = this.f528404d;
                jVar2.f490576p = m8Var.f88861e;
                jVar2.f490575o = m8Var.f88862f;
                jVar2.g(m8Var.f88858b, m8Var.f88860d, m8Var.f88859c, -1);
                n8Var.getClass();
            } else if (i17 == 2) {
                sl.j jVar3 = this.f528404d;
                if (jVar3 != null) {
                    jVar3.h(false);
                }
            } else if (i17 == 4 && (jVar = this.f528404d) != null && jVar.c()) {
                this.f528404d.d(true);
                n8Var.getClass();
            }
        }
        return true;
    }
}
