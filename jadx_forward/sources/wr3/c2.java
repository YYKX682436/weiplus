package wr3;

/* loaded from: classes11.dex */
public final class c2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac f530298d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac) {
        this.f530298d = c16903x22327ac;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.ul ulVar;
        java.util.LinkedList linkedList;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        r45.wl wlVar2 = new r45.wl();
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1964x32b09e.C16903x22327ac c16903x22327ac = this.f530298d;
        c16903x22327ac.getClass();
        c16903x22327ac.f235946f = wlVar2;
        c16903x22327ac.m0().f470770h = wlVar.f470770h;
        r45.gl glVar = c16903x22327ac.m0().f470770h;
        if ((glVar == null || (linkedList = glVar.f456856d) == null || !(linkedList.isEmpty() ^ true)) ? false : true) {
            java.util.List list = c16903x22327ac.f235981s;
            ((java.util.ArrayList) list).clear();
            java.util.LinkedList Msg = wlVar.f470770h.f456856d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Msg, "Msg");
            ((java.util.ArrayList) list).addAll(Msg);
            wr3.z1 z1Var = c16903x22327ac.f235980r;
            if (z1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                throw null;
            }
            z1Var.m8146xced61ae5();
            r45.gl glVar2 = c16903x22327ac.m0().f470770h;
            if (glVar2 != null && (ulVar = glVar2.f456859g) != null) {
                wr3.z1 z1Var2 = c16903x22327ac.f235980r;
                if (z1Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var2.x(ulVar.f468986e == 0);
            }
        } else {
            wr3.z1 z1Var3 = c16903x22327ac.f235980r;
            if (z1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
                throw null;
            }
            z1Var3.x(false);
        }
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b.b(c16903x22327ac.mo7438x76847179(), 64, wlVar);
        wr3.z1 z1Var4 = c16903x22327ac.f235980r;
        if (z1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mVideoAdapter");
            throw null;
        }
        if (b17 == null) {
            b17 = "";
        }
        z1Var4.f530463m = b17;
    }
}
