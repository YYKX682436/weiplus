package kv3;

/* loaded from: classes5.dex */
public final class d implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv3.h f394209d;

    public d(kv3.h hVar) {
        this.f394209d = hVar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m0)) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m0) obj).a(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f394209d.I, "onTabUnselected " + obj);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        java.lang.Object obj;
        if (iVar == null || (obj = iVar.f425311a) == null || !(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m0)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m0 m0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.m0) obj;
        m0Var.a(true);
        kv3.h hVar = this.f394209d;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = hVar.Q;
        if (c1190x18d3c3fe != null) {
            c1190x18d3c3fe.m8316x940d026a(m0Var.f237826c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hVar.I, "onTabSelected " + obj);
    }
}
