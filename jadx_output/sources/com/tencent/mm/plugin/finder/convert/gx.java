package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class gx extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b_n;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.e5 item = (so2.e5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.ogs);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ohd);
        android.content.Context context = holder.f293121e;
        r45.r03 r03Var = item.f410330d;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = r03Var.getString(0);
            if (string == null) {
                string = "";
            }
            java.lang.String concat = "#".concat(string);
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, concat));
        }
        if (item.f410332f) {
            if (item.f410333g) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            if (item.f410333g) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        }
        if (p17 != null) {
            java.lang.CharSequence text = textView != null ? textView.getText() : null;
            p17.setTag(com.tencent.mm.R.id.e7l, text != null ? text : "");
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTopicFilterConvert", "item hash:" + item.hashCode() + ", topic:" + r03Var.getString(0) + ", selected:" + item.f410332f);
    }
}
