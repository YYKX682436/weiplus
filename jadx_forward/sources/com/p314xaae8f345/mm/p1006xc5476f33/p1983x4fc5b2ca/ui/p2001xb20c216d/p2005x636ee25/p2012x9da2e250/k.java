package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 f237950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 c17084x670031c3) {
        super(1);
        this.f237950d = c17084x670031c3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        wt3.v vVar;
        java.util.LinkedList it = (java.util.LinkedList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2012x9da2e250.C17084x670031c3 c17084x670031c3 = this.f237950d;
        boolean z17 = c17084x670031c3.f237931q;
        java.lang.String str = c17084x670031c3.f237929o;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "EditorView has been destroyed, skip callback");
        } else {
            c17084x670031c3.f237933s = !it.isEmpty();
            dv3.c cVar = c17084x670031c3.f237914e;
            if (cVar != null) {
                cVar.P0(1);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it6 = it.iterator();
            int i17 = 0;
            while (true) {
                if (it6.hasNext()) {
                    java.lang.Object next = it6.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a.M.c((r45.mh4) next, 1);
                    c17.h();
                    c17.f237252p = c17084x670031c3.J0();
                    c17.f237259w = i17;
                    wt3.e eVar = c17084x670031c3.f237930p;
                    if (eVar != null) {
                        r8 = eVar.f530927c;
                    }
                    c17.f237260x = r8;
                    arrayList.add(c17);
                    i17 = i18;
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult:audioList size=");
                    sb6.append(it.size());
                    sb6.append(", mAdapter oldItemCount=");
                    dv3.c cVar2 = c17084x670031c3.f237914e;
                    sb6.append(cVar2 != null ? java.lang.Integer.valueOf(cVar2.mo1894x7e414b06()) : null);
                    sb6.append(", pendingKeepSelected=");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = c17084x670031c3.f237935u;
                    sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.f237256t : null);
                    sb6.append(", suppressAutoPlayThisRefresh=");
                    sb6.append(c17084x670031c3.f237936v);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                    dv3.c cVar3 = c17084x670031c3.f237914e;
                    if ((cVar3 != null && cVar3.mo1894x7e414b06() == 0) && arrayList.isEmpty()) {
                        c17084x670031c3.y0();
                    } else {
                        c17084x670031c3.z0();
                        dv3.c cVar4 = c17084x670031c3.f237914e;
                        if (cVar4 != null) {
                            dv3.c.F0(cVar4, arrayList, false, 2, null);
                        }
                    }
                    dv3.c cVar5 = c17084x670031c3.f237914e;
                    if (cVar5 != null && cVar5.K == 1) {
                        c17084x670031c3.A0();
                    }
                    if (c17084x670031c3.f237933s && (vVar = wt3.v.f531038i) != null) {
                        wt3.e eVar2 = c17084x670031c3.f237930p;
                        vVar.f531043d = eVar2 != null ? eVar2.f530927c : -1L;
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
