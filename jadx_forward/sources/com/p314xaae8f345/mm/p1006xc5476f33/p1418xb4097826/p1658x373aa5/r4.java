package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class r4 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b f214460g;

    public r4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b) {
        this.f214460g = c15260x406bbe1b;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return event instanceof ec2.f;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        ey2.u uVar;
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa;
        int i17;
        p012xc85e97e9.p093xedfae76a.j0 j0Var2;
        jz5.l lVar2;
        p012xc85e97e9.p093xedfae76a.j0 j0Var3;
        jz5.l lVar3;
        cw2.da videoView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b c15260x406bbe1b = this.f214460g;
            int i18 = fVar.f332492d;
            if (i18 == 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15260x406bbe1b.b(c15260x406bbe1b, c15260x406bbe1b.m61759x4905e9fa());
                java.lang.ref.WeakReference weakReference = c15260x406bbe1b.getColumnFeedSelectorAdapter().f325646x;
                in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
                if (s0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
                    int mo56685x3d7f3f1d = (c15196x85976f5f == null || (videoView = c15196x85976f5f.getVideoView()) == null) ? 0 : (int) ((((float) videoView.mo56685x3d7f3f1d()) / ((float) videoView.mo56695x7723e6ff())) * 100);
                    ey2.u uVar2 = c15260x406bbe1b.f212447r;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa2 = (uVar2 == null || (j0Var3 = uVar2.f339075x) == null || (lVar3 = (jz5.l) j0Var3.mo3195x754a37bb()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar3.f384366d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c13920xa5f564aa2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<com.tencent.mm.plugin.finder.model.RVFeed>");
                    if (c15260x406bbe1b.getLastSnappedPosition() != -1) {
                        java.lang.Object obj = c13920xa5f564aa2.get(c15260x406bbe1b.getLastSnappedPosition());
                        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                            abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
                        }
                    }
                    if (abstractC14490x69736cb5 != null) {
                        abstractC14490x69736cb5.Y1(mo56685x3d7f3f1d);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i18 == 2 && c15260x406bbe1b.getColumnFeedSelectorAdapter().f325644v) {
                ey2.u uVar3 = c15260x406bbe1b.f212447r;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa3 = (uVar3 == null || (j0Var2 = uVar3.f339075x) == null || (lVar2 = (jz5.l) j0Var2.mo3195x754a37bb()) == null) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar2.f384366d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c13920xa5f564aa3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<com.tencent.mm.plugin.finder.model.RVFeed>");
                if (c15260x406bbe1b.getLastSnappedPosition() != -1) {
                    java.lang.Object obj2 = c13920xa5f564aa3.get(c15260x406bbe1b.getLastSnappedPosition());
                    if (obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2;
                    }
                }
                if (abstractC14490x69736cb5 == null || abstractC14490x69736cb5.mo2128x1ed62e84() != fVar.f332498j || !((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Wb).mo141623x754a37bb()).r()).booleanValue() || (uVar = c15260x406bbe1b.f212447r) == null || (j0Var = uVar.f339075x) == null || (lVar = (jz5.l) j0Var.mo3195x754a37bb()) == null || (c13920xa5f564aa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa) lVar.f384366d) == null || (i17 = c15260x406bbe1b.lastSnappedPosition + 1) >= c13920xa5f564aa.size()) {
                    return;
                }
                c15260x406bbe1b.d(i17);
            }
        }
    }
}
