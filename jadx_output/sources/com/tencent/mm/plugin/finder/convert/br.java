package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class br extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102995e;

    public br(boolean z17) {
        this.f102995e = z17;
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveFollowAllDividerConvert", "#init");
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        int i19;
        com.tencent.mm.plugin.finder.feed.ys item = (com.tencent.mm.plugin.finder.feed.ys) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveFollowAllDividerConvert", "onBindViewHolder size:" + item.f111194f.size() + " continueAtTheEnd:" + item.f111192d.getBoolean(10));
        item.f111196h = i17;
        android.view.View findViewById = holder.itemView.findViewById(com.tencent.mm.R.id.k6_);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        boolean z18 = this.f102995e;
        if (z18) {
            findViewById.setBackground(findViewById.getResources().getDrawable(com.tencent.mm.R.drawable.ast));
        } else {
            findViewById.setBackground(findViewById.getResources().getDrawable(com.tencent.mm.R.drawable.ass));
        }
        android.view.View findViewById2 = holder.itemView.findViewById(com.tencent.mm.R.id.k6b);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        if (z18) {
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            textView.setTextSize(0, i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f480434xt));
        }
        android.view.View findViewById3 = holder.itemView.findViewById(com.tencent.mm.R.id.i_c);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById3;
        if (z18) {
            weImageView.setIconColor(weImageView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        java.lang.String valueOf = item.f111194f.size() > 0 ? java.lang.String.valueOf(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) item.f111194f.get(0)).getFeedObject().getNickNameSpan()) : "";
        boolean z19 = true;
        java.lang.String valueOf2 = item.f111194f.size() > 1 ? java.lang.String.valueOf(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) item.f111194f.get(1)).getFeedObject().getNickNameSpan()) : "";
        int integer = item.f111192d.getInteger(24);
        int size = item.f111194f.size();
        android.content.Context context = holder.f293121e;
        java.lang.String string2 = size == 2 ? context.getResources().getString(com.tencent.mm.R.string.h6p) : context.getResources().getString(com.tencent.mm.R.string.h6o, java.lang.Integer.valueOf(integer));
        kotlin.jvm.internal.o.d(string2);
        if (android.text.TextUtils.isEmpty(valueOf) || android.text.TextUtils.isEmpty(valueOf2)) {
            string = context.getResources().getString(com.tencent.mm.R.string.h6q);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.k6b);
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
            z19 = false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i27 = a17.f197135a;
        if (!z19 && i27 > (i19 = a17.f197136b)) {
            i27 = i19;
        }
        int dimensionPixelOffset = (i27 - textView2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz)) - textView2.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);
        android.text.TextPaint paint = textView2.getPaint();
        float measureText = paint.measureText(string);
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips before textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + measureText + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        float f17 = (float) dimensionPixelOffset;
        if (measureText > f17) {
            if (valueOf2.length() > 4) {
                java.lang.String substring = valueOf2.substring(0, 4);
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                valueOf2 = substring.concat("...");
            }
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        float measureText2 = paint.measureText(string);
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips after nickname1 textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + measureText2 + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        if (measureText2 > f17) {
            if (valueOf.length() > 4) {
                java.lang.String substring2 = valueOf.substring(0, 4);
                kotlin.jvm.internal.o.f(substring2, "substring(...)");
                valueOf = substring2.concat("...");
            }
            string = valueOf + (char) 12289 + valueOf2 + ' ' + string2;
        }
        com.tencent.mars.xlog.Log.i("FinderNearbyLiveFollowAllDividerConvert", "setTips after nickname2 textShowWidth:" + dimensionPixelOffset + " textPaintWidth:" + paint.measureText(string) + " nickname1:" + valueOf + " nickname2:" + valueOf2 + " dividerTips:" + string);
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        holder.s(com.tencent.mm.R.id.k6b, string);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
