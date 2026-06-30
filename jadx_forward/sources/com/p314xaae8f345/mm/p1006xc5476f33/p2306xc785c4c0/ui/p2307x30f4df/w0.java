package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes8.dex */
public class w0 implements oa.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j f256627d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar) {
        this.f256627d = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r1 != 20001) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(oa.i r14) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.w0.h0(oa.i):void");
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.j jVar = this.f256627d;
        for (wm4.y yVar : jVar.f256532q) {
            if (yVar.f528862m.equals(iVar)) {
                jVar.K = yVar.f528851b;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "tab unselected, " + yVar.f528850a);
                yVar.f528864o.setTextColor(jVar.f256519d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9_));
                if (pm4.w.k(yVar.f528851b)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 activity = jVar.f256519d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d1.class)).getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.i0 i0Var = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).f529055f;
                    if (i0Var != null) {
                        i0Var.f202476o = false;
                        vn2.u0.f519920a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "unselect");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.j jVar2 = i0Var.f202472h;
                        if (jVar2 != null) {
                            jVar2.c();
                        }
                        vn2.q qVar = i0Var.f202475n;
                        if (qVar != null) {
                            qVar.c();
                        }
                        vn2.q qVar2 = i0Var.f202475n;
                        if (qVar2 != null) {
                            qVar2.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        this.f256627d.v(iVar, false);
    }
}
