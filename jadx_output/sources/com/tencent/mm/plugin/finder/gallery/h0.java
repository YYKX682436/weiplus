package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class h0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f111370e;

    public h0(boolean z17) {
        this.f111370e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.ajm;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.gallery.j0 item = (com.tencent.mm.plugin.finder.gallery.j0) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ohd);
        android.content.Context context = holder.f293121e;
        com.tencent.mm.plugin.finder.gallery.i0 i0Var = item.f111386d;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = i0Var.f111384b;
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str));
        }
        boolean z18 = item.f111387e;
        boolean z19 = this.f111370e;
        if (z18) {
            if (z19) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            if (z19) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
            }
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderAlbumFilterConvert", "item hash:" + item.hashCode() + ", topic:" + i0Var.f111384b + ", selected:" + item.f111387e);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ohd);
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
    }
}
