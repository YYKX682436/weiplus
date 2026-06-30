package uv0;

/* loaded from: classes5.dex */
public final class r implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512879d;

    public r(uv0.u uVar) {
        this.f512879d = uVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        vv0.j jVar;
        uv0.f m170582xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        uv0.u uVar = this.f512879d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = uVar.R;
        if (!(c1163xf1deaba4 != null && c1163xf1deaba4.mo7958x54496c8e() == 0) || (jVar = (vv0.j) kz5.n0.a0(uVar.W, tab.f425315e)) == null) {
            return;
        }
        m170582xf939df19 = uVar.m170582xf939df19();
        java.util.Iterator it = m170582xf939df19.f357503d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((vv0.k) it.next()).f521921d == jVar.f521915b) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 < 0) {
            return;
        }
        uv0.u.N(uVar, i17);
    }
}
