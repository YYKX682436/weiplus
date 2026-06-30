package sc2;

/* loaded from: classes2.dex */
public final class p8 extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487685w = "Finder.CarouselCardObserver";

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f487686x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.myLooper());

    /* renamed from: y, reason: collision with root package name */
    public boolean f487687y;

    public final void G(android.view.View view, xc2.p0 p0Var, java.lang.String str) {
        r45.av avVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f487686x;
        java.lang.Object obj = null;
        n3Var.mo50302x6b17ad39(null);
        boolean z17 = this.f487687y;
        java.lang.String str2 = this.f487685w;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkLoopCard: cancel loop isFocus=false, source=" + str);
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.wf6) next).m75939xb282bd08(2) == 21) {
                obj = next;
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var == null || (avVar = (r45.av) wf6Var.m75936x14adae67(29)) == null) {
            return;
        }
        if (avVar.m75939xb282bd08(5) > 0) {
            n3Var.mo50297x7c4d7ca2(new sc2.e8(view, this, str, avVar, p0Var), avVar.m75939xb282bd08(5));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "checkLoopCard: source=" + str + ", carousel_time=" + avVar.m75939xb282bd08(5));
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487685w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136  */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.tencent.mm.plugin.finder.feed.component.FinderJumperCarouselCardObserver$onBindView$1$2] */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r24, in5.s0 r25, android.view.View r26, xc2.p0 r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.p8.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        this.f487687y = true;
        G(jumpView, infoEx, "onJumpViewFocus");
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        this.f487687y = false;
        this.f487686x.mo50302x6b17ad39(null);
    }

    @Override // ad2.h
    public void x(android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.x(jumpView, infoEx);
        this.f487687y = false;
        this.f487686x.mo50302x6b17ad39(null);
    }
}
