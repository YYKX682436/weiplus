package bg2;

/* loaded from: classes2.dex */
public final class l7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(bg2.l8 l8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101806d = l8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.l7(this.f101806d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.l7 l7Var = (bg2.l7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.View view;
        android.content.Context context;
        java.util.LinkedList<r45.lu5> m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.l8 l8Var = this.f101806d;
        in5.s0 s0Var = l8Var.f498674d.f498682i;
        if (s0Var == null || (context = s0Var.f374654e) == null) {
            view = null;
        } else {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570508dh2, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15351x41e69e8c c15351x41e69e8c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15351x41e69e8c) inflate.findViewById(com.p314xaae8f345.mm.R.id.qdo);
            r45.vw0 vw0Var = l8Var.f101810h;
            if (vw0Var != null && (m75941xfb821914 = vw0Var.m75941xfb821914(3)) != null) {
                for (r45.lu5 lu5Var : m75941xfb821914) {
                    android.widget.TextView textView = new android.widget.TextView(context);
                    android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMargins(layoutParams.leftMargin, l8Var.c7(), l8Var.c7() * 2, layoutParams.bottomMargin);
                    textView.setLayoutParams(layoutParams);
                    jz5.g gVar = l8Var.f101811i;
                    textView.setPadding(((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), l8Var.c7(), ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue(), l8Var.c7());
                    textView.setMinWidth(((java.lang.Number) ((jz5.n) l8Var.f101812m).mo141623x754a37bb()).intValue());
                    textView.setMinHeight(((java.lang.Number) ((jz5.n) l8Var.f101815p).mo141623x754a37bb()).intValue());
                    textView.setGravity(17);
                    textView.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.c48));
                    textView.setTextSize(14.0f);
                    textView.setTextColor(android.graphics.Color.parseColor("#99FFFFFF"));
                    java.lang.String m75945x2fec8307 = lu5Var.m75945x2fec8307(1);
                    if (m75945x2fec8307 == null) {
                        m75945x2fec8307 = "";
                    }
                    textView.setText(m75945x2fec8307);
                    textView.setOnClickListener(new bg2.u7(l8Var, lu5Var, context));
                    c15351x41e69e8c.addView(textView);
                }
            }
            view = inflate;
        }
        if (view != null) {
            android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            animationSet.addAnimation(alphaAnimation);
            android.view.animation.AnimationSet animationSet2 = new android.view.animation.AnimationSet(false);
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(1000L);
            animationSet2.addAnimation(alphaAnimation2);
            bg2.r4 r4Var = new bg2.r4(view, animationSet, animationSet2, l8Var.f101817r, new bg2.k7(l8Var));
            bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
            if (a5Var != null) {
                a5Var.e7(r4Var);
            }
            l8Var.f101818s = true;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.I8((zy2.zb) c17, ml2.u1.H2, kz5.c1.l(new jz5.l("liveId", bg2.l8.Z6(l8Var)), new jz5.l("feedId", bg2.l8.Y6(l8Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
            uc2.g gVar2 = (uc2.g) l8Var.O6(uc2.g.class);
            r45.qt2 c76 = gVar2 != null ? ((sb2.l) gVar2).c7() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = l8Var.f498674d.f498681h;
            if (abstractC14490x69736cb5 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3 v3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v3.f184154a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("feedActionType", 87);
                jSONObject.put("feedActionSubType", 401);
                jSONObject.put("value", 1);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                v3Var.a(c76, abstractC14490x69736cb5, jSONObject2);
            }
        }
        return jz5.f0.f384359a;
    }
}
