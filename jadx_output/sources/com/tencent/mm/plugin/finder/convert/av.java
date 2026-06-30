package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class av extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b8g;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.r1 item = (so2.r1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.mfh);
        android.content.Context context = holder.f293121e;
        if (p17 != null) {
            p17.setBackground(context.getResources().getDrawable(com.tencent.mm.R.color.BW_0));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.me_);
        if (textView != null) {
            textView.setTextSize(1, 15.0f);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.me_);
        if (textView2 != null) {
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.me_);
        if (textView3 != null) {
            textView3.setText(context.getResources().getString(com.tencent.mm.R.string.f2x, "\"" + item.f410573d + '\"'));
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.me_);
        if (textView4 != null) {
            textView4.setTag(com.tencent.mm.R.id.g1x, item.f410573d);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.me9);
        if (weImageView != null) {
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
