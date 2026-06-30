package hs;

@j95.b
/* loaded from: classes10.dex */
public final class z extends i95.w implements qk.t7 {
    public y51.c Ai(a61.a config, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        config.f83251b.getClass();
        y51.b bVar = new y51.b(context);
        java.util.HashMap hashMap = bVar.f540999d;
        java.lang.String canonicalName = z51.r.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName);
        hashMap.put(canonicalName, new z51.r(bVar));
        java.lang.String canonicalName2 = z51.p.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName2);
        hashMap.put(canonicalName2, new z51.p(bVar));
        java.lang.String canonicalName3 = z51.w.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName3);
        hashMap.put(canonicalName3, new z51.w(bVar));
        java.lang.String canonicalName4 = z51.c.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName4);
        hashMap.put(canonicalName4, new z51.c(bVar));
        java.lang.String canonicalName5 = z51.h.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName5);
        hashMap.put(canonicalName5, new z51.h(bVar));
        java.lang.String canonicalName6 = z51.g.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName6);
        hashMap.put(canonicalName6, new z51.g(bVar));
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((z51.x) ((java.util.Map.Entry) it.next()).getValue()).d(config);
        }
        android.widget.RelativeLayout relativeLayout = bVar.f541000e;
        z51.w wVar = (z51.w) bVar.a(z51.w.class);
        android.content.Context context2 = bVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        android.view.View view = null;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a(context2, null);
        wVar.f551761f = c21524xecd57b9a;
        c21524xecd57b9a.m79192x50bca671(android.widget.ImageView.ScaleType.FIT_CENTER);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a2 = wVar.f551761f;
        if (c21524xecd57b9a2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
            throw null;
        }
        c21524xecd57b9a2.setVisibility(wVar.f551765j ? 0 : 4);
        wVar.f551762g = p3325xe03a0797.p3326xc267989b.l.d(wVar.f551769c, null, null, new z51.t(wVar, null), 3, null);
        if (wVar.f551764i) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a3 = wVar.f551761f;
            if (c21524xecd57b9a3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
                throw null;
            }
            c21524xecd57b9a3.setOnLongClickListener(new z51.u(wVar));
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a4 = wVar.f551761f;
            if (c21524xecd57b9a4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
                throw null;
            }
            c21524xecd57b9a4.setOnTouchListener(new z51.v(wVar));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21524xecd57b9a c21524xecd57b9a5 = wVar.f551761f;
        if (c21524xecd57b9a5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("thumbView");
            throw null;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        relativeLayout.addView(c21524xecd57b9a5, layoutParams);
        z51.p pVar = (z51.p) bVar.a(z51.p.class);
        android.content.Context context3 = bVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pVar.f551732f = new android.widget.FrameLayout(context3);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c3465 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465(context3, null, 0, 6, null);
        pVar.f551733g = c18697xb57c3465;
        c18697xb57c3465.setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34652 = pVar.f551733g;
        if (c18697xb57c34652 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        a61.d dVar = pVar.f551738l;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiConfig");
            throw null;
        }
        c18697xb57c34652.mo69318x764d819b(dVar.f83263g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34653 = pVar.f551733g;
        if (c18697xb57c34653 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        if (pVar.f551738l == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiConfig");
            throw null;
        }
        c18697xb57c34653.mo69431xebd28962(com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.DEFAULT);
        android.widget.FrameLayout frameLayout = pVar.f551732f;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34654 = pVar.f551733g;
        if (c18697xb57c34654 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        frameLayout.addView(c18697xb57c34654, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34655 = pVar.f551733g;
        if (c18697xb57c34655 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c34655.mo69321x146557f1(new z51.i(pVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34656 = pVar.f551733g;
        if (c18697xb57c34656 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c34656.mo69319xe6781b94(new z51.j(pVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18697xb57c3465 c18697xb57c34657 = pVar.f551733g;
        if (c18697xb57c34657 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tpPlayerView");
            throw null;
        }
        c18697xb57c34657.mo69326x360a109e(new z51.k(pVar));
        android.widget.FrameLayout frameLayout2 = pVar.f551732f;
        if (frameLayout2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoViewContainer");
            throw null;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13, -1);
        relativeLayout.addView(frameLayout2, layoutParams2);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(13, -1);
        bVar.addView(relativeLayout, layoutParams3);
        z51.r rVar = (z51.r) bVar.a(z51.r.class);
        android.content.Context context4 = bVar.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        if (rVar.f551744f) {
            android.view.View view2 = rVar.f551745g;
            if (view2 != null) {
                rVar.f551747i = view2;
            } else {
                com.p314xaae8f345.mm.p1005xc53e9ae1.ui.C11328x10ba22af c11328x10ba22af = new com.p314xaae8f345.mm.p1005xc53e9ae1.ui.C11328x10ba22af(context4);
                rVar.f551747i = c11328x10ba22af;
                c11328x10ba22af.setOnClickListener(new z51.q(rVar));
                qk.t7 t7Var = (qk.t7) i95.n0.c(qk.t7.class);
                android.view.View view3 = rVar.f551747i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view3);
                ((hs.z) t7Var).wi(view3);
            }
            view = rVar.f551747i;
        }
        if (view != null) {
            bVar.addView(view, ((z51.r) bVar.a(z51.r.class)).l());
        }
        return bVar;
    }

    public void wi(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6);
        com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.Companion.m42550x8c53ca37(com.p314xaae8f345.mm.p606xf34bc14e.p608x2eaf9f.p609x2dd08d.C4882xbb3d954a.INSTANCE, view, b18, b17, b18, b17, false, 32, null);
    }
}
