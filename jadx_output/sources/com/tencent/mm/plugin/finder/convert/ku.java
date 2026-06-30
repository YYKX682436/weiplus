package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class ku extends com.tencent.mm.plugin.finder.convert.mu {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103859f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f103860g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f103861h;

    public ku(boolean z17) {
        this.f103859f = z17;
    }

    public static final void o(com.tencent.mm.plugin.finder.convert.ku kuVar, android.view.View view, ms2.c cVar) {
        kuVar.getClass();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderProfileAudio;
        bw5.v70 d17 = ms2.d.a(cVar.f330969d).d();
        i95.m c17 = i95.n0.c(qk.a8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        qk.a8 a8Var = (qk.a8) c17;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        kotlin.jvm.internal.o.d(d17);
        qk.a8.E8(a8Var, (com.tencent.mm.ui.MMActivity) context, ar0Var, d17, null, 0, 0, view, null, null, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7j;
    }

    @Override // in5.r
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, ms2.c item, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.ProgressBar progressBar;
        int i19;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        java.lang.String format;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484927fz0);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l_x);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l_o);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.l_v);
        android.widget.TextView textView3 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.l_w);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.l_p);
        android.widget.ProgressBar progressBar2 = (android.widget.ProgressBar) holder.itemView.findViewById(com.tencent.mm.R.id.l_y);
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.jyc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f103860g = findViewById;
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.f486048k01);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById2;
        this.f103861h = mMPAGView;
        mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
        holder.j();
        kotlinx.coroutines.y0 y0Var = holder.f293120d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.convert.iu(this, null), 3, null);
        }
        r45.ig4 ig4Var = item.f330969d;
        java.lang.String str = ig4Var.f377031u;
        kotlin.jvm.internal.o.d(imageView);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329963q));
        }
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.qnw);
        if (findViewById3 == null) {
            weImageView = weImageView2;
            progressBar = progressBar2;
            i19 = 0;
        } else if (this.f103859f) {
            progressBar = progressBar2;
            i19 = 0;
            r45.eg4 eg4Var = ig4Var.f377020g;
            int i27 = eg4Var != null ? eg4Var.f373449i : 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            weImageView = weImageView2;
            yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert", "setSelfScenePlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingAudioListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert", "setSelfScenePlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingAudioListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.q08)).setImageResource(com.tencent.mm.R.drawable.cl7);
            android.widget.TextView textView4 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.q07);
            if (textView4 != null) {
                textView4.setText(n(i27));
            }
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            progressBar = progressBar2;
            i19 = 0;
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert", "setSelfScenePlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingAudioListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/convert/FinderProfileTingAudioPatchItemConvert", "setSelfScenePlayInfoLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/profile/ting/FinderTingAudioListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            weImageView = weImageView2;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.qnv);
        if (weImageView3 != null) {
            weImageView3.setImageResource(((ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class))).Bi() ? com.tencent.mm.R.raw.star_heavy : com.tencent.mm.R.raw.icons_outlined_listen_later_medium);
            android.view.View findViewById4 = holder.itemView.findViewById(com.tencent.mm.R.id.u8z);
            com.tencent.mm.ui.tools.d8.a(weImageView3);
            weImageView3.setVisibility(i19);
            weImageView3.setOnClickListener(new com.tencent.mm.plugin.finder.convert.gu(this, holder, item));
            findViewById4.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hu(this, holder, item));
        }
        textView.setText(ig4Var.f377029s);
        int i28 = (ig4Var.f377032v / 1000) / 60;
        android.content.Context context = holder.f293121e;
        if (i28 > 0) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f8c);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((ig4Var.f377032v / 1000) / 60)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
        } else {
            java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.f8d);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(ig4Var.f377032v / 1000)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
        }
        textView2.setText(format);
        if (linearLayout != null) {
            r45.gg4 gg4Var = ig4Var.B;
            int i29 = gg4Var != null ? gg4Var.f375232r : i19;
            if (i29 != 0) {
                linearLayout.setVisibility(i19);
                textView2.setVisibility(8);
                if (i29 == 1) {
                    textView3.setText(context.getResources().getString(com.tencent.mm.R.string.ey9));
                    textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
                    weImageView.setVisibility(8);
                    progressBar.setVisibility(i19);
                } else if (i29 != 2) {
                    linearLayout.setVisibility(8);
                } else {
                    textView3.setText(context.getResources().getString(com.tencent.mm.R.string.ey8));
                    textView3.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478549aj));
                    weImageView.setVisibility(i19);
                    progressBar.setVisibility(8);
                }
            } else {
                linearLayout.setVisibility(8);
                textView2.setVisibility(i19);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "audio_content");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.ju(holder, item));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25496);
    }
}
