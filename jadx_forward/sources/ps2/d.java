package ps2;

/* loaded from: classes10.dex */
public class d extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f439592c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f439593d;

    /* renamed from: e, reason: collision with root package name */
    public long f439594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String TAG) {
        super(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(TAG, "TAG");
        this.f439592c = TAG;
        this.f439594e = -1L;
    }

    @Override // bi4.o0
    public bi4.d1 a() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
        if (c19792x256d2725 == null) {
            return null;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        ya2.b2 h17 = m76760x76845fea != null ? ya2.d.h(m76760x76845fea, null, false, 3, null) : null;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a.i(h17 != null ? h17.w0() : null, h17 != null ? h17.m176700xe5e0d2a0() : null, c19792x256d2725.m76784x5db1b11(), c19792x256d2725, null);
    }

    @Override // bi4.o0
    public boolean b(android.content.Context context) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        r45.xk a17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f439593d != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
            java.lang.String str2 = null;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((c19792x256d2725 == null || (m76760x76845fea3 = c19792x256d2725.m76760x76845fea()) == null) ? null : m76760x76845fea3.m76197x6c03c64c(), xy2.c.e(context));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = this.f439593d;
            if (c19792x256d27252 != null && (m76760x76845fea2 = c19792x256d27252.m76760x76845fea()) != null) {
                str2 = m76760x76845fea2.m76197x6c03c64c();
            }
            intent.putExtra("finder_username", str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = this.f439593d;
            if (c19792x256d27253 == null || (m76760x76845fea = c19792x256d27253.m76760x76845fea()) == null || (a17 = ya2.d.a(m76760x76845fea, false)) == null || (str = a17.m75945x2fec8307(0)) == null) {
                str = "";
            }
            intent.putExtra("key_biz_username", str);
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (b17) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.x(context, intent, 20, 2);
            } else {
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 32, intent);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                e1Var.w(context, intent);
            }
        }
        return this.f439593d != null;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f439592c, "[doJump]");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        pj4.j0 j0Var = this.f102607b;
        if (j0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "5")) {
            return false;
        }
        c19792x256d2725.mo11468x92b714fd(android.util.Base64.decode(j0Var.f436674f, 0));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("feed_object_id", c19792x256d2725.m76784x5db1b11());
        intent.putExtra("feed_object_nonceId", c19792x256d2725.m76803x6c285d75());
        intent.putExtra("key_need_related_list", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7 n7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a;
        intent.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(n7Var.h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(n7Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 0), false, null, 4, null)), null, null));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedId", pm0.v.u(c19792x256d2725.m76784x5db1b11()));
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        jSONObject.put("finderusername", m76760x76845fea != null ? m76760x76845fea.m76197x6c03c64c() : null);
        intent.putExtra("key_extra_info", jSONObject.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(20, 2, 25, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        zy2.ta.b(e1Var, context, intent, false, 4, null);
        return true;
    }

    @Override // bi4.o0
    public java.lang.CharSequence f() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        return (!l() || (c19792x256d2725 = this.f439593d) == null || (m76760x76845fea = c19792x256d2725.m76760x76845fea()) == null) ? "" : ya2.d.h(m76760x76845fea, null, false, 3, null).w0();
    }

    @Override // bi4.o0
    public java.lang.String h() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
        java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
        return r07;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        if (!l()) {
            return "";
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
        java.lang.String m76944x730bcac6 = (c19792x256d2725 == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null) ? null : m76802x2dd01666.m76944x730bcac6();
        return m76944x730bcac6 == null ? "" : m76944x730bcac6;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public boolean k() {
        return false;
    }

    @Override // bi4.o0
    public boolean l() {
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w.f214803o;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
        java.lang.Boolean bool = (java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.w.f214803o.get(java.lang.Long.valueOf(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        java.util.Objects.toString(j0Var);
        super.m(str, j0Var);
        if (j0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j0Var.f436674f)) {
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f436674f, 0);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
        this.f439593d = c19792x256d2725;
        c19792x256d2725.mo11468x92b714fd(decode);
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean o(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        container.removeAllViews();
        if (!l()) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(this.f439592c);
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.addView(imageView);
        r(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        container.toString();
        android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(this.f439592c);
        if (imageView == null) {
            imageView = new android.widget.ImageView(container.getContext());
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        container.removeAllViews();
        container.addView(imageView);
        r(imageView);
        return true;
    }

    @Override // bi4.o0
    public boolean q(android.widget.FrameLayout container) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        container.toString();
        boolean l17 = l();
        boolean z17 = false;
        java.lang.String str = this.f439592c;
        if (l17) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
            if (c19792x256d2725 == null) {
                f0Var = null;
            } else {
                if (c19792x256d2725.m76784x5db1b11() == this.f439594e) {
                    return true;
                }
                this.f439594e = c19792x256d2725.m76784x5db1b11();
                android.widget.ImageView imageView = (android.widget.ImageView) container.findViewWithTag(str);
                if (imageView == null) {
                    imageView = new android.widget.ImageView(container.getContext());
                    imageView.setTag(str);
                    container.removeAllViews();
                    container.addView(imageView);
                }
                imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, c19792x256d2725.m76805x2dd7a70f());
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd01666 != null && m76802x2dd01666.m76964x7f025288() == 2) {
                    z17 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(a17.m59264x7efe73ec())) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "setCustomThumbView: mediaList:" + a17.m59264x7efe73ec());
                } else {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    vo0.d e17 = g1Var.e();
                    r45.mb4 first = a17.m59264x7efe73ec().getFirst();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "getFirst(...)");
                    wo0.c b17 = e17.b(new mn2.u0(first, y90Var, null, 4, null), g1Var.h(mn2.f1.f411486d));
                    ps2.c cVar = new ps2.c(imageView);
                    b17.getClass();
                    b17.f529406d = cVar;
                    b17.a();
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "setCustomThumbView: finderObject is null");
            }
        } else {
            android.view.View findViewWithTag = container.findViewWithTag("Finder.TextStatusProvider.invalidView");
            if (findViewWithTag == null) {
                findViewWithTag = com.p314xaae8f345.mm.ui.id.b(container.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_5, (android.view.ViewGroup) container, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewWithTag, "inflate(...)");
                findViewWithTag.setTag("Finder.TextStatusProvider.invalidView");
                container.removeAllViews();
                container.addView(findViewWithTag);
            }
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str2 = (java.lang.String) m17;
            if (!(str2.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[checkShowValidLayout] wording=".concat(str2));
                android.widget.TextView textView = (android.widget.TextView) findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.hei);
                if (textView != null) {
                    textView.setText(str2);
                }
            }
            android.view.View findViewById = findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.heg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.heh);
            if (findViewById2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = findViewWithTag.findViewById(com.p314xaae8f345.mm.R.id.h0d);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/provider/FinderStatusCustomParts", "setCustomThumbView", "(Landroid/widget/FrameLayout;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return true;
    }

    public final void r(android.widget.ImageView imageView) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f439593d;
        java.lang.String m176700xe5e0d2a0 = (c19792x256d2725 == null || (m76760x76845fea = c19792x256d2725.m76760x76845fea()) == null) ? null : ya2.d.h(m76760x76845fea, null, false, 3, null).m176700xe5e0d2a0();
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.a().c(new mn2.n(m176700xe5e0d2a0, null, 2, null), imageView, g1Var.h(mn2.f1.f411490h));
    }
}
