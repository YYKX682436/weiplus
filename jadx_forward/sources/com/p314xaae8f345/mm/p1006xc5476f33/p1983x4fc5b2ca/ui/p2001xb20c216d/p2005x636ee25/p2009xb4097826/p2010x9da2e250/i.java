package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250;

/* loaded from: classes5.dex */
public final class i implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17071x2a51bffd f237904a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17071x2a51bffd c17071x2a51bffd) {
        this.f237904a = c17071x2a51bffd;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgmList, "bgmList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2009xb4097826.p2010x9da2e250.C17071x2a51bffd c17071x2a51bffd = this.f237904a;
        if (c17071x2a51bffd.f237874t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17071x2a51bffd.f237870p, "EditorView has been destroyed, skip callback");
            return;
        }
        dv3.c cVar = c17071x2a51bffd.f237914e;
        if (cVar != null) {
            cVar.P0(1);
        }
        c17071x2a51bffd.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 0;
        for (java.lang.Object obj : bgmList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.vv0 vv0Var = (r45.vv0) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.a(vv0Var, 1, c17071x2a51bffd.f237868n);
            a17.f237252p = 15;
            a17.f237259w = 0;
            a17.f237260x = 0L;
            nv3.t.f422235o.a(c17071x2a51bffd.mo7438x76847179(), vv0Var, a17);
            arrayList.add(a17);
            a17.h();
            i17 = i18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c17071x2a51bffd.f237870p, "handleResult:audioList size=" + bgmList.size() + ", loadFirstPage=" + z17 + ", hasNextPage=" + z18);
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            c16997xb0aa383a.f237251o = 5;
            arrayList.add(c16997xb0aa383a);
        }
        if (bgmList.isEmpty()) {
            dv3.c cVar2 = c17071x2a51bffd.f237914e;
            if (cVar2 != null && cVar2.K == 1) {
                c17071x2a51bffd.y0();
                return;
            }
        }
        c17071x2a51bffd.z0();
        if (z17) {
            dv3.c cVar3 = c17071x2a51bffd.f237914e;
            if (cVar3 != null) {
                cVar3.T0(arrayList);
                return;
            }
            return;
        }
        dv3.c cVar4 = c17071x2a51bffd.f237914e;
        if (cVar4 != null) {
            dv3.c.F0(cVar4, arrayList, false, 2, null);
        }
    }

    @Override // wt3.i0
    /* renamed from: getActivity */
    public android.app.Activity mo68371x19263085() {
        return this.f237904a.mo7430x19263085();
    }
}
