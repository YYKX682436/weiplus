package oc2;

/* loaded from: classes8.dex */
public final class z extends oc2.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425857f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b, android.content.Context context) {
        super(c13738xbdff117b, context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425857f = c13738xbdff117b;
    }

    public int i(oc2.l0 renderContext, oc2.y0 split) {
        float f17;
        r45.lp lpVar;
        r45.kn knVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderContext, "renderContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(split, "split");
        m150999x53b4dbd8(split);
        oc2.y yVar = (oc2.y) kz5.n0.Z(split.f425855b);
        float f18 = 0.0f;
        if (yVar != null) {
            oc2.w wVar = renderContext.f425752a;
            r45.cp5 a17 = a(wVar);
            if (a17 != null) {
                int intValue = ((java.lang.Number) d(((java.lang.Number) oc2.v.f425815a.r(a17, wVar).f384366d).intValue()).f384366d).intValue();
                if (intValue == -2) {
                    intValue = this.f425857f.f187343e;
                }
                f17 = (intValue / 2) + 0.0f;
            } else {
                f17 = 0.0f;
            }
            oc2.v vVar = oc2.v.f425815a;
            r45.cp5 cp5Var = yVar.f425844a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getContext(), "getContext(...)");
            float width = f17 + oc2.v.d(vVar, cp5Var, r3, wVar, 0.0f, 4, null).getWidth();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getContext(), "getContext(...)");
            r45.yo5 yo5Var = yVar.f425844a.f453303f;
            f18 = width + (vVar.m(r1, (yo5Var == null || (lpVar = yo5Var.f472795e) == null || (knVar = lpVar.f461221g) == null) ? 0 : knVar.f460374d, 0.0f) * 2);
        }
        return (int) f18;
    }

    public void j(oc2.l0 renderContext, oc2.y0 split) {
        wo0.c b17;
        r45.t60 t60Var;
        r45.lp lpVar;
        r45.lp lpVar2;
        r45.lp lpVar3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderContext, "renderContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(split, "split");
        m150999x53b4dbd8(split);
        oc2.y yVar = (oc2.y) kz5.n0.Z(split.f425855b);
        if (yVar != null) {
            oc2.w wVar = renderContext.f425752a;
            oc2.v vVar = oc2.v.f425815a;
            r45.cp5 cp5Var = yVar.f425844a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.util.Size d17 = oc2.v.d(vVar, cp5Var, context, wVar, 0.0f, 4, null);
            r45.cp5 cp5Var2 = yVar.f425844a;
            java.lang.String o17 = vVar.o(cp5Var2, wVar);
            r45.yo5 yo5Var = cp5Var2.f453303f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425857f;
            float floatValue = ((yo5Var == null || (lpVar3 = yo5Var.f472795e) == null) ? java.lang.Integer.valueOf(c13738xbdff117b.f187345g) : java.lang.Float.valueOf(lpVar3.f461220f)).floatValue();
            r45.yo5 yo5Var2 = cp5Var2.f453303f;
            boolean a17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.a((yo5Var2 == null || (lpVar2 = yo5Var2.f472795e) == null) ? null : java.lang.Float.valueOf(lpVar2.f461220f), 0.5f);
            r45.yo5 yo5Var3 = cp5Var2.f453303f;
            r45.kn knVar = (yo5Var3 == null || (lpVar = yo5Var3.f472795e) == null) ? null : lpVar.f461221g;
            int c17 = c(knVar != null ? knVar.f460375e : null, this.f425741e.f187342d);
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            int m17 = vVar.m(context2, knVar != null ? knVar.f460374d : 0, 0.0f);
            android.content.Context context3 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            android.widget.ImageView b0Var = new oc2.b0(context3, c17, m17, a17 ? d17.getWidth() : floatValue);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(d17.getWidth(), d17.getHeight());
            layoutParams.gravity = 17;
            b0Var.setLayoutParams(layoutParams);
            b0Var.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            b0Var.setId(com.p314xaae8f345.mm.R.id.g19);
            java.lang.String g17 = vVar.g(cp5Var2, wVar);
            r45.yo5 yo5Var4 = cp5Var2.f453303f;
            int alpha = android.graphics.Color.alpha(c((yo5Var4 == null || (t60Var = yo5Var4.f472794d) == null) ? null : t60Var.f467700e, android.graphics.Color.parseColor("#FFFFFFFF")));
            b0Var.setVisibility(0);
            b0Var.setAlpha(alpha / 255.0f);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70 z70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (!((java.lang.Boolean) z70Var.d(t70Var, "视频号红点头像模拟弱网", bool, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.u70("FINDER_RED_DOT_IMAGE_VIEW_MOCK_POOR_NET"))).booleanValue() || ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(z70Var, t70Var, "视频号发现页红点头像预加载开关", e42.c0.clicfg_finder_red_dot_avatar_pre_load, bool, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.xf0.f209841d, 8, null)).booleanValue()) {
                android.graphics.Bitmap q17 = vVar.q(g17, a17, floatValue);
                if (q17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RenderView", "loadAvatar clientAvatarUsername=" + g17 + ",isRound=" + a17 + ",radius=" + floatValue);
                    b0Var.setImageBitmap(q17);
                } else {
                    if (o17.length() > 0) {
                        boolean z17 = floatValue == 0.0f;
                        mn2.g1 g1Var = mn2.g1.f411508a;
                        if (z17) {
                            b17 = g1Var.i().b(new mn2.n(o17, c13738xbdff117b.f187361z ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V), g1Var.h(mn2.f1.f411494o));
                        } else if (a17) {
                            b17 = g1Var.a().b(new mn2.n(o17, c13738xbdff117b.f187361z ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V), g1Var.h(mn2.f1.f411490h));
                        } else {
                            b17 = g1Var.l().b(new mn2.n(o17, c13738xbdff117b.f187361z ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.W : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.V), g1Var.h(mn2.f1.f411494o));
                        }
                        vVar.u(b17, c13738xbdff117b.h(), c13738xbdff117b.getCtrlInfo(), c13738xbdff117b.getShowInfo(), o17);
                        b17.c(b0Var);
                    } else {
                        b0Var.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RenderView", "mock a poor network environment!");
            }
            addView(b0Var);
            r45.cp5 a18 = a(wVar);
            if (a18 != null) {
                int s17 = vVar.s(a18, wVar, 2);
                jz5.l r17 = vVar.r(a18, wVar);
                int intValue = ((java.lang.Number) r17.f384366d).intValue();
                java.lang.String str = (java.lang.String) r17.f384367e;
                jz5.l d18 = d(intValue);
                int intValue2 = ((java.lang.Number) d18.f384366d).intValue();
                int intValue3 = ((java.lang.Number) d18.f384367e).intValue();
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(intValue2, intValue3);
                if (intValue2 == -2) {
                    intValue2 = c13738xbdff117b.f187343e;
                }
                g(layoutParams2, s17, 0, (-intValue2) / 2);
                if (s17 == 6) {
                    layoutParams2.setMarginEnd(layoutParams2.getMarginEnd() - (c13738xbdff117b.f187345g + (intValue2 / 2)));
                }
                if (s17 == 7) {
                    layoutParams2.setMarginStart(layoutParams2.getMarginStart() - (c13738xbdff117b.f187345g + (intValue2 / 2)));
                }
                imageView.setLayoutParams(layoutParams2);
                e(imageView, str, intValue);
                f(this, imageView);
                addView(imageView);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13738xbdff117b.h(), "avatar render size=" + d17);
        }
    }
}
