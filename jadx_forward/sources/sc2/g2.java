package sc2;

/* loaded from: classes2.dex */
public class g2 extends sc2.f2 {

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f487439z = "FeedBigCardJumperObserver";

    public final r45.su Y(xc2.p0 p0Var) {
        java.lang.Object obj;
        r45.wf6 wf6Var = this.f84682m;
        if (wf6Var == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 6) {
                    break;
                }
            }
            wf6Var = (r45.wf6) obj;
        }
        if (wf6Var != null) {
            return (r45.su) wf6Var.m75936x14adae67(9);
        }
        return null;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487439z;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Y(infoEx) != null ? r2.m75945x2fec8307(1) : null);
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = holder.f374658i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var != null) {
            long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
            if (infoEx.f534767a.m76480xe2ee1ca3() == 2) {
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2 c15447x4ebc90c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15447x4ebc90c2.class);
                if (c15447x4ebc90c2 != null) {
                    c15447x4ebc90c2.d7(mo2128x1ed62e84, 128);
                }
            }
        }
        J(feed, holder, jumpView, infoEx, source, Y(infoEx), false);
    }
}
