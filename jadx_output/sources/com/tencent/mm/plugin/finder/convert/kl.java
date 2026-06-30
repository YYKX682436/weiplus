package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kl extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.convert.jl f103843e = new com.tencent.mm.plugin.finder.convert.jl(null);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ako;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Object obj;
        sc2.v8 item = (sc2.v8) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        xc2.p0 p0Var = item.f406317d;
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 21) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.av avVar = wf6Var != null ? (r45.av) wf6Var.getCustom(29) : null;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
        if (avVar == null) {
            com.tencent.mars.xlog.Log.e("CarouselCardConvert", "onBindViewHolder: carousel_card_style is null, jumpInfoId=" + finderJumpInfo.getJump_id());
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483592bd3);
        d92.f fVar = d92.f.f227470a;
        if (textView != null) {
            textView.setText(avVar.getString(1));
            fVar.l(textView, 14.0f, false);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f483589bd0);
        if (textView2 != null) {
            textView2.setText(avVar.getString(2));
            fVar.l(textView2, 12.0f, false);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.bcz);
        if (textView3 != null) {
            textView3.setText(avVar.getString(3));
            fVar.l(textView3, 12.0f, false);
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c b17 = g1Var.e().b(new mn2.q3(avVar.getString(0), com.tencent.mm.plugin.finder.storage.y90.f128356f), g1Var.h(mn2.f1.B));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f483591bd2);
        kotlin.jvm.internal.o.f(p17, "getView(...)");
        b17.c((android.widget.ImageView) p17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(avVar.getString(4)) || item.f406318e != -1) {
            try {
                int i19 = item.f406318e;
                if (i19 == -1) {
                    i19 = android.graphics.Color.parseColor(avVar.getString(4));
                }
                holder.p(com.tencent.mm.R.id.f483590bd1).setBackgroundColor(i19);
                ((android.widget.ImageView) holder.p(com.tencent.mm.R.id.gtg)).setImageDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, new int[]{i19, 0}));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("CarouselCardConvert", th6, "parse color crash, carouselStyle.bg_color=" + avVar.getString(4), new java.lang.Object[0]);
            }
        }
        com.tencent.mars.xlog.Log.i("CarouselCardConvert", "onBindViewHolder: pos=" + i17 + ", title=" + avVar.getString(1) + ", desc=" + avVar.getString(2) + ", btn_wording=" + avVar.getString(3) + ", bg_color=" + avVar.getString(4) + ", jumpId=" + finderJumpInfo.getJump_id());
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        com.tencent.mm.plugin.finder.convert.jl jlVar = f103843e;
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        layoutParams.width = jlVar.a(context);
    }
}
