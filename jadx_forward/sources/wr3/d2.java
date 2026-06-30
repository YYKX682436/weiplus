package wr3;

/* loaded from: classes11.dex */
public final class d2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac f530301d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac) {
        this.f530301d = c16903x22327ac;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.ul ulVar;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac = this.f530301d;
        if (c16903x22327ac.m0().f470770h == null) {
            wlVar.f470770h = wlVar.f470770h;
        } else {
            r45.gl glVar = wlVar.f470770h;
            if (glVar != null && (ulVar = glVar.f456859g) != null) {
                c16903x22327ac.m0().f470770h.f456859g = ulVar;
            }
        }
        r45.gl glVar2 = wlVar.f470770h;
        if (glVar2 != null) {
            java.util.LinkedList linkedList = glVar2.f456856d;
            if (linkedList != null && (!linkedList.isEmpty())) {
                java.util.List list = c16903x22327ac.f235981s;
                int size = ((java.util.ArrayList) list).size();
                ((java.util.ArrayList) list).addAll(linkedList);
                wr3.z1 z1Var = c16903x22327ac.f235980r;
                if (z1Var == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var.m8153xd399a4d9(size, linkedList.size());
            }
            wr3.z1 z1Var2 = c16903x22327ac.f235980r;
            if (z1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                throw null;
            }
            r45.ul ulVar2 = glVar2.f456859g;
            z1Var2.x(ulVar2 != null && ulVar2.f468986e == 0);
        }
    }
}
