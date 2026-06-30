package sc2;

/* loaded from: classes2.dex */
public class e5 extends ad2.h {

    /* renamed from: x, reason: collision with root package name */
    public boolean f487393x;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487392w = "Finder.FeedJumperSubtitleBubbleObserver";

    /* renamed from: y, reason: collision with root package name */
    public final int f487394y = 10000;

    @Override // ad2.h
    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.C(holder);
        this.f487393x = false;
    }

    public final gs2.a G(android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        boolean z17 = false;
        int i17 = nyVar != null ? nyVar.f216913n : 0;
        if (c19786x6a1e2862.m76480xe2ee1ca3() == 66) {
            return gs2.a.f356582e;
        }
        if (c19786x6a1e2862.m76480xe2ee1ca3() == 82) {
            return gs2.a.f356581d;
        }
        if ((context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe) && i17 == 172) {
            z17 = true;
        }
        return z17 ? gs2.a.f356583f : gs2.a.f356596v;
    }

    public final r45.ci6 H(xc2.p0 p0Var) {
        java.lang.Object obj;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        if (m76521x7528c3fb == null) {
            return null;
        }
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 18) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        if (wf6Var != null) {
            return (r45.ci6) wf6Var.m75936x14adae67(25);
        }
        return null;
    }

    public final void I(android.view.View view, boolean z17, java.lang.String str) {
        int i17;
        boolean z18 = true;
        if (z17) {
            if (this.f487393x) {
                return;
            } else {
                this.f487393x = true;
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.egg);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.egf);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f566045tf3);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566044tf2);
        if (z17) {
            textView.setText(str);
            textView3.setVisibility(0);
            linearLayout.setOrientation(1);
        } else {
            textView3.setVisibility(8);
            linearLayout.setOrientation(0);
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        if (!com.p314xaae8f345.mm.ui.bk.y() && !com.p314xaae8f345.mm.ui.bk.Q() && !com.p314xaae8f345.mm.ui.bk.A()) {
            z18 = false;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z18 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        float dimensionPixelOffset = (i18 * 0.6f) - view.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
        float dimensionPixelOffset2 = view.getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float measureText = textView2.getPaint().measureText(textView2.getText().toString());
        float measureText2 = textView.getPaint().measureText(str);
        float max = (z17 ? java.lang.Math.max(measureText, measureText2) : measureText2 + measureText) + dimensionPixelOffset2;
        if (!z17 || max <= dimensionPixelOffset) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.width = -2;
            linearLayout.setLayoutParams(layoutParams);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            layoutParams2.width = (int) dimensionPixelOffset;
            linearLayout.setLayoutParams(layoutParams2);
        }
        if (z17 || max < dimensionPixelOffset) {
            return;
        }
        textView.setText(android.text.TextUtils.ellipsize(str, textView.getPaint(), (dimensionPixelOffset - measureText) - dimensionPixelOffset2, android.text.TextUtils.TruncateAt.END));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487392w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public boolean o(in5.s0 holder, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        gs2.c cVar = gs2.c.f356605a;
        int hashCode = holder.hashCode();
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return cVar.c(hashCode, G(context, info));
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        android.content.Context context;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        r45.vx0 vx0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.ci6 H = H(infoEx);
        if (H == null) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = infoEx.f534767a;
        if (!o(holder, c19786x6a1e28622)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487392w, "[onBindView] priority not ok");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        if (abstractC14490x69736cb5 == null) {
            return;
        }
        android.content.Context context2 = holder.f374654e;
        java.lang.String m75945x2fec8307 = H.m75945x2fec8307(1);
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = H.m75945x2fec8307(2);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        java.lang.String m75945x2fec83073 = H.m75945x2fec8307(3);
        java.lang.String str2 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.egg);
        android.widget.TextView textView2 = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.egf);
        android.widget.TextView textView3 = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.f566044tf2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) jumpView.findViewById(com.p314xaae8f345.mm.R.id.egc);
        java.lang.String m76497x4fe38a1f = c19786x6a1e28622.m76497x4fe38a1f();
        boolean z17 = m76497x4fe38a1f == null || m76497x4fe38a1f.length() == 0;
        android.content.Context context3 = holder.f374654e;
        if (z17) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79173x912fb83f);
            c22699x3dcdb352.m82040x7541828(context3.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            context = context3;
            c19786x6a1e2862 = c19786x6a1e28622;
        } else {
            c22699x3dcdb352.clearColorFilter();
            c22699x3dcdb352.setLayerPaint(null);
            c22699x3dcdb352.m82040x7541828(0);
            mn2.g1 g1Var = mn2.g1.f411508a;
            context = context3;
            c19786x6a1e2862 = c19786x6a1e28622;
            g1Var.e().b(new mn2.q3(c19786x6a1e28622.m76497x4fe38a1f(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.B)).c(c22699x3dcdb352);
        }
        textView.setText(str);
        textView2.setText(m75945x2fec83072);
        textView3.setText(str2);
        textView3.setOnClickListener(new sc2.d5(this, context2, infoEx, jumpView, str2));
        I(jumpView, this.f487393x, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) textView.getText());
        sb6.append((java.lang.Object) textView2.getText());
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        int m75939xb282bd08 = nyVar != null ? nyVar.V6().m75939xb282bd08(5) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        java.lang.String str3 = m75939xb282bd08 + "-14-$172-" + java.lang.System.currentTimeMillis();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sourceid", str3);
        jSONObject.put("traceid", str3);
        jz5.l[] lVarArr = new jz5.l[4];
        r45.dm2 m76806xdef68064 = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76806xdef68064();
        lVarArr[0] = new jz5.l("collection_id", pm0.v.u((m76806xdef68064 == null || (vx0Var = (r45.vx0) m76806xdef68064.m75936x14adae67(0)) == null) ? 0L : vx0Var.m75942xfb822ef2(0)));
        lVarArr[1] = new jz5.l("bubble_text", sb7);
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[3] = new jz5.l("jump_id", jSONObject.toString());
        android.content.Context context4 = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.m(d2Var, jumpView, "feed_jumpicon", 0, 0, kz5.c1.k(lVarArr), null, 44, null);
        gs2.c cVar = gs2.c.f356605a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        cVar.e(holder, jumpView, G(context4, c19786x6a1e2862), false);
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        r45.ci6 H;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        int m76503x92bc3c07 = c19786x6a1e2862.m76503x92bc3c07();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19801x2fd32185 m76506x42318aa0 = c19786x6a1e2862.m76506x42318aa0();
        java.lang.Integer valueOf = m76506x42318aa0 != null ? java.lang.Integer.valueOf(m76506x42318aa0.m77224x4236b52c()) : null;
        if ((m76503x92bc3c07 == 3 && ((valueOf != null && valueOf.intValue() == 55) || (valueOf != null && valueOf.intValue() == 31))) && (H = H(infoEx)) != null) {
            java.lang.String m75945x2fec8307 = H.m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            if (jumpView.getContext() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14104x32508bfe) {
                return;
            }
            if (m75945x2fec8307.length() > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
                long b17 = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (feedObject2 = feedObject.getFeedObject()) == null) ? 0L : bu2.z.b(feedObject2);
                int i18 = i17 * 1000;
                float f17 = (float) b17;
                float f18 = f17 > 0.0f ? i18 / f17 : 1.0f;
                if (b17 - i18 < this.f487394y || f18 > 0.9d) {
                    if (!this.f487393x) {
                        xc2.n nVar = xc2.n.f534745a;
                        android.content.Context context = jumpView.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("phase", 1);
                        xc2.n.c(nVar, context, jumpView, infoEx, 0, null, null, jSONObject, null, 184, null);
                    }
                    java.lang.String m75945x2fec83072 = H.m75945x2fec8307(1);
                    I(jumpView, true, m75945x2fec83072 != null ? m75945x2fec83072 : "");
                }
            }
        }
    }
}
