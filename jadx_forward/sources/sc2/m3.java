package sc2;

/* loaded from: classes2.dex */
public final class m3 extends ad2.h implements android.view.ViewTreeObserver.OnPreDrawListener {
    public static final sc2.e3 A = new sc2.e3(null);
    public static final int[] B = {-1, -1, -1};
    public static final java.util.HashMap C = new java.util.HashMap();
    public static final java.util.List D = kz5.c0.i(java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ef_), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.ef8), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f566020ee5));

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487604w = "Finder.FeedJumperBubbleObserver";

    /* renamed from: x, reason: collision with root package name */
    public boolean f487605x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f487606y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f487607z;

    public static final void G(sc2.m3 m3Var, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        m3Var.getClass();
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(s0Var.f374654e);
        int i17 = a17.f278668a;
        float f17 = (i17 * 2532.0f) / 1170.0f;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (int) f17;
        view.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m3Var.f487604w, "[updateRedPacketCoverHeight] translationY, top:" + view.getTop() + " height:" + f17 + " screenWidth:" + i17 + " screenHeight:" + a17.f278669b + " source:" + str);
    }

    @Override // ad2.h
    public void A(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        r45.iw4 iw4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.A(holder, jumpView, infoEx);
        r45.wf6 wf6Var = this.f84682m;
        java.lang.String m75945x2fec8307 = (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) == null) ? null : iw4Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            return;
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        K(jumpView, I(context));
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        r45.iw4 iw4Var;
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.C(holder);
        android.view.View view = this.f84676d;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        r45.wf6 wf6Var = this.f84682m;
        boolean z17 = false;
        if (wf6Var != null && (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) != null && iw4Var.m75939xb282bd08(11) == 1) {
            z17 = true;
        }
        if (z17) {
            H();
        }
    }

    public final void H() {
        java.lang.Runnable runnable = this.f487606y;
        if (runnable != null) {
            android.widget.TextView textView = this.f487607z;
            if (textView != null) {
                textView.removeCallbacks(runnable);
            }
            this.f487606y = null;
        }
        this.f487607z = null;
    }

    public final int I(android.content.Context context) {
        return (int) ((com.p314xaae8f345.mm.ui.bh.a(context).f278668a * 0.6d) - context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561258dh));
    }

    public final void J(java.lang.String str, yz5.l lVar) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(java.lang.Integer.valueOf(android.graphics.Color.parseColor(str)));
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
    }

    public final void K(android.view.View view, int i17) {
        java.lang.String str;
        r45.iw4 iw4Var;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566046tf4);
        if (textView != null) {
            r45.wf6 wf6Var = this.f84682m;
            if (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) == null || (str = iw4Var.m75945x2fec8307(9)) == null) {
                str = "";
            }
            textView.setText(str);
        }
        if (textView != null && textView.getVisibility() == 8) {
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.edj);
            if (textView2 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                L(textView, textView2, i17);
            }
            if (textView == null) {
                return;
            }
            textView.setVisibility(0);
        }
    }

    public final void L(android.widget.TextView textView, android.widget.TextView textView2, int i17) {
        int i18;
        int measureText = (int) textView.getPaint().measureText(textView.getText().toString());
        int measureText2 = (int) textView2.getPaint().measureText(textView2.getText().toString());
        if (measureText < i17) {
            textView.setWidth(measureText);
            i18 = java.lang.Math.min(measureText2, i17 - measureText);
        } else {
            i18 = i17 / 2;
            textView.setWidth(i18);
        }
        java.lang.CharSequence ellipsize = android.text.TextUtils.ellipsize(textView2.getText(), textView2.getPaint(), i18, android.text.TextUtils.TruncateAt.END);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ellipsize, "ellipsize(...)");
        textView2.setWidth((int) textView2.getPaint().measureText(ellipsize.toString()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487604w, "updateTitleWidth, maxWidth: " + i17 + ", subtitleWidth: " + textView.getWidth() + ", titleWidth: " + textView2.getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(in5.s0 r27, android.view.View r28, boolean r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m3.M(in5.s0, android.view.View, boolean, java.lang.String):void");
    }

    public final int N(android.view.View view) {
        boolean z17 = false;
        int height = (view != null ? view.getHeight() : 0) + 0;
        int b17 = view != null ? com.p314xaae8f345.mm.ui.kk.b(view) : 0;
        if (view != null && view.getVisibility() == 0) {
            z17 = true;
        }
        return z17 ? height + b17 : height;
    }

    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        r45.iw4 iw4Var;
        r45.iw4 iw4Var2;
        r45.iw4 iw4Var3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
        r45.wf6 wf6Var = this.f84682m;
        boolean z18 = false;
        if (wf6Var != null && (iw4Var3 = (r45.iw4) wf6Var.m75936x14adae67(3)) != null && iw4Var3.m75939xb282bd08(11) == 1) {
            z18 = true;
        }
        if (z18) {
            H();
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.f566046tf4);
            if (textView == null || textView.getVisibility() == 0) {
                return;
            }
            this.f487607z = textView;
            sc2.h3 h3Var = new sc2.h3(this, jumpView, holder);
            this.f487606y = h3Var;
            r45.wf6 wf6Var2 = this.f84682m;
            textView.postDelayed(h3Var, ((wf6Var2 == null || (iw4Var2 = (r45.iw4) wf6Var2.m75936x14adae67(3)) == null) ? 0L : iw4Var2.m75942xfb822ef2(10)) * 1000);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("postDelayed, ");
            r45.wf6 wf6Var3 = this.f84682m;
            sb6.append((wf6Var3 == null || (iw4Var = (r45.iw4) wf6Var3.m75936x14adae67(3)) == null) ? null : java.lang.Long.valueOf(iw4Var.m75942xfb822ef2(10)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487604w, sb6.toString());
        }
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        r45.iw4 iw4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
        r45.wf6 wf6Var = this.f84682m;
        boolean z18 = false;
        if (wf6Var != null && (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) != null && iw4Var.m75939xb282bd08(11) == 1) {
            z18 = true;
        }
        if (z18) {
            H();
        }
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        int m76480xe2ee1ca3 = info.m76480xe2ee1ca3();
        if (m76480xe2ee1ca3 != 2) {
            return m76480xe2ee1ca3 != 101 ? super.j(info) : gs2.a.E;
        }
        xc2.p0 p0Var = this.f84680h;
        return p0Var != null && p0Var.f534789r == 2 ? gs2.a.f356586i : gs2.a.f356587m;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487604w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.iw4 iw4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        if (super.m(infoEx)) {
            return true;
        }
        r45.wf6 wf6Var = this.f84682m;
        java.lang.String m75945x2fec8307 = (wf6Var == null || (iw4Var = (r45.iw4) wf6Var.m75936x14adae67(3)) == null) ? null : iw4Var.m75945x2fec8307(1);
        return !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.f487605x) {
            return true;
        }
        android.view.View view = this.f84676d;
        in5.s0 s0Var = this.f84681i;
        xc2.p0 p0Var = this.f84680h;
        if (view != null && s0Var != null && p0Var != null) {
            view.post(new sc2.g3(s0Var, this, view));
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f487605x = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0413  */
    @Override // ad2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r28, in5.s0 r29, android.view.View r30, xc2.p0 r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.m3.q(com.tencent.mm.plugin.finder.model.BaseFinderFeed, in5.s0, android.view.View, xc2.p0, java.lang.String):void");
    }

    @Override // ad2.h
    public void s(android.content.res.Configuration newConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newConfig, "newConfig");
        android.view.View view = this.f84676d;
        in5.s0 s0Var = this.f84681i;
        xc2.p0 p0Var = this.f84680h;
        if (view == null || s0Var == null || p0Var == null || this.f84683n != 75) {
            return;
        }
        view.post(new sc2.f3(s0Var, this, view));
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        android.widget.TextView textView;
        r45.iw4 iw4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        r45.iw4 iw4Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        r45.wf6 wf6Var = this.f84682m;
        boolean z17 = false;
        if (wf6Var != null && (iw4Var2 = (r45.iw4) wf6Var.m75936x14adae67(3)) != null && iw4Var2.m75939xb282bd08(11) == 2) {
            z17 = true;
        }
        if (!z17 || (textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.f566046tf4)) == null || textView.getVisibility() == 0) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long j17 = 0;
        long b17 = ((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : bu2.z.b(feedObject2)) / 1000;
        r45.wf6 wf6Var2 = this.f84682m;
        if (wf6Var2 != null && (iw4Var = (r45.iw4) wf6Var2.m75936x14adae67(3)) != null) {
            j17 = iw4Var.m75942xfb822ef2(10);
        }
        if (b17 <= i17 + j17) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            K(jumpView, I(context));
        }
    }
}
