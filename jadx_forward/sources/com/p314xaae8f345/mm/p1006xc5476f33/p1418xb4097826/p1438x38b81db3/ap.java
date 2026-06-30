package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class ap extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f184430e;

    public ap(int i17) {
        this.f184430e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569386f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.l3 item = (so2.l3) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.text.SpannableString spannableString = item.f492003f;
        if (spannableString == null || spannableString.length() == 0) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o_w);
            if (textView != null) {
                textView.setVisibility(8);
            }
            n(holder, item, i17);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o_w);
        if (textView2 != null) {
            textView2.setText(spannableString);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o_w);
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        n(holder, item, i17);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "split_horizontal_bar");
        aVar.Rj(holder.f3639x46306858, iy1.a.Finder);
        aVar.Tj(holder.f3639x46306858, 32, 1, false);
        aVar.Ai(holder.f3639x46306858, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zo(holder));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.o_w);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
    }

    public final void n(in5.s0 s0Var, so2.l3 l3Var, int i17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 S6;
        r45.eo eoVar = (r45.eo) l3Var.f492001d.m75936x14adae67(8);
        java.lang.String m75945x2fec8307 = eoVar != null ? eoVar.m75945x2fec8307(0) : null;
        boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
        r45.yw2 yw2Var = l3Var.f492001d;
        if (!z17) {
            r45.eo eoVar2 = (r45.eo) yw2Var.m75936x14adae67(8);
            if ((eoVar2 != null ? eoVar2.m75939xb282bd08(1) : 0) > 0) {
                android.content.Context context = s0Var.f374654e;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerConvert", "insertBubbleToNextFeed fail, context is not activity!");
                    return;
                }
                pf5.z zVar = pf5.z.f435481a;
                if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
                int i18 = this.f184430e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U6 = c15456x2c452bca.U6(i18);
                if (U6 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerConvert", "insertBubbleToNextFeed fail, get tabType:" + i18 + " fragment fail!");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp bpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp) pf5.z.f435481a.b(U6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bp.class);
                bpVar.getClass();
                android.content.Context context2 = s0Var.f374654e;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                if (activity2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail, context is not activity!");
                    return;
                }
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(activity2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 U62 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).U6(i18);
                if (U62 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail, get tabType:" + i18 + " fragment fail!");
                    return;
                }
                bpVar.f215448d = i18;
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar2.b(U62).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80.class);
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) a17).V6()) {
                    a17 = null;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80 t80Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.t80) a17;
                if (t80Var != null && (S6 = t80Var.S6()) != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = bpVar.f215452h;
                    if (w2Var != null) {
                        S6.V0(w2Var);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ap apVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ap(U62, bpVar, i18, i17);
                    bpVar.f215452h = apVar;
                    S6.i(apVar);
                    if (bpVar.f215451g == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zo zoVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.zo(bpVar);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = bpVar.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar2.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).f215108o.add(zoVar);
                        bpVar.f215451g = zoVar;
                    }
                    r3 = jz5.f0.f384359a;
                }
                if (r3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail,tabType:" + i18 + " fragment's recyclerview null!");
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertBubbleToNextFeed fail,bubble info:");
        r45.eo eoVar3 = (r45.eo) yw2Var.m75936x14adae67(8);
        sb6.append(eoVar3 != null ? eoVar3.m75945x2fec8307(0) : null);
        sb6.append(' ');
        r45.eo eoVar4 = (r45.eo) yw2Var.m75936x14adae67(8);
        sb6.append(eoVar4 != null ? java.lang.Integer.valueOf(eoVar4.m75939xb282bd08(1)) : null);
        sb6.append("s, is invalid!");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderMoreInterestDividerConvert", sb6.toString());
    }
}
