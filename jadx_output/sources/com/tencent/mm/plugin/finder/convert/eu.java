package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class eu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f103290e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.l f103291f;

    /* renamed from: g, reason: collision with root package name */
    public final int f103292g;

    public eu(boolean z17, jz5.l lVar) {
        int i17;
        this.f103290e = z17;
        this.f103291f = lVar;
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z18 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z18 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        this.f103292g = i18;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7h;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ms2.b item = (ms2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.itemView.findViewById(com.tencent.mm.R.id.f484927fz0);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486464lb1);
        android.widget.TextView textView2 = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486463lb0);
        boolean z18 = this.f103290e;
        android.content.Context context = holder.f293121e;
        int dimensionPixelSize = (this.f103292g - (z18 ? context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479724dg) : context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl))) / 2;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479686cl);
        if (dimensionPixelSize > dimensionPixelOffset) {
            dimensionPixelSize = dimensionPixelOffset;
        }
        if (dimensionPixelSize > 0) {
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            imageView.setLayoutParams(layoutParams);
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        r45.vx0 vx0Var = item.f330968d;
        mn2.q3 q3Var = new mn2.q3(vx0Var.getString(3), com.tencent.mm.plugin.finder.storage.y90.f128355e);
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329953d));
        textView.setText(vx0Var.getString(1));
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f0a, java.lang.Integer.valueOf(vx0Var.getInteger(4))));
        if (this.f103291f == null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.itemView, "audio_collection_card");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.du(holder, item));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(holder.itemView, 40, 25496);
        } else {
            android.view.View view = holder.itemView;
            kotlin.jvm.internal.o.d(view);
            dy1.a.i(view, "biz_aduio_colle_page_content");
            dy1.a.l(view, 40, 29426);
            dy1.a.a(view, new com.tencent.mm.plugin.finder.convert.cu(item, this));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
