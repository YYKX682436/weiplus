package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class t2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI f99676e;

    public t2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI) {
        this.f99676e = exdeviceFollowsUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.a9r;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.exdevice.ui.r2 item = (com.tencent.mm.plugin.exdevice.ui.r2) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.djg);
        r45.e43 e43Var = item.f99639e;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, e43Var.f373005e, null);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.djh);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String str = e43Var.f373005e;
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(str);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI = this.f99676e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(exdeviceFollowsUI, e17, textSize));
        int i19 = e43Var.f373006f;
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.dic)).setText(java.lang.String.valueOf(i19));
        if (i19 >= 10000) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.dic)).setTextColor(i65.a.d(exdeviceFollowsUI, com.tencent.mm.R.color.f478937ld));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.dic)).setTextColor(i65.a.d(exdeviceFollowsUI, com.tencent.mm.R.color.f478936lc));
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.exdevice.ui.s2(exdeviceFollowsUI, item));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
