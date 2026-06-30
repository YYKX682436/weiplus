package sc2;

/* loaded from: classes2.dex */
public final class c4 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487341w = "FeedJumperEnhanceBubbleObserver";

    public final int G(r45.ay0 ay0Var) {
        java.lang.Object m143895xf1229813;
        java.lang.String m75945x2fec8307 = ay0Var != null ? com.p314xaae8f345.mm.ui.bk.C() ? ay0Var.m75945x2fec8307(1) : ay0Var.m75945x2fec8307(0) : null;
        if (m75945x2fec8307 != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Integer.valueOf(android.graphics.Color.parseColor(m75945x2fec8307)));
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Integer num = (java.lang.Integer) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487341w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.String str;
        java.lang.Object obj;
        r45.sk0 sk0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 32) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var != null && (sk0Var = (r45.sk0) wf6Var.m75936x14adae67(41)) != null) {
            str = sk0Var.m75945x2fec8307(2);
        }
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r21, in5.s0 r22, android.view.View r23, xc2.p0 r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.c4.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }
}
