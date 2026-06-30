package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class bu extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f102998e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f102999f = jz5.h.b(com.tencent.mm.plugin.finder.convert.au.f102903d);

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b7o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.rz6 rz6Var;
        r45.b70 b70Var;
        r45.rz6 rz6Var2;
        r45.b70 b70Var2;
        r45.rz6 rz6Var3;
        r45.b70 b70Var3;
        r45.rz6 rz6Var4;
        r45.b70 b70Var4;
        so2.d5 item = (so2.d5) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odp);
        jz5.g gVar = this.f102999f;
        android.content.Context context = holder.f293121e;
        if (textView != null) {
            le0.x xVar = (le0.x) ((jz5.n) gVar).getValue();
            java.lang.String b17 = item.b();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, b17));
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.odm);
        java.lang.String str = null;
        r45.r03 r03Var = item.f410314d;
        if (textView2 != null) {
            le0.x xVar2 = (le0.x) ((jz5.n) gVar).getValue();
            r45.r23 r23Var = (r45.r23) r03Var.getCustom(23);
            java.lang.String str2 = (r23Var == null || (rz6Var4 = (r45.rz6) r23Var.getCustom(1)) == null || (b70Var4 = rz6Var4.f385323g) == null) ? null : b70Var4.f370589n;
            if (str2 == null) {
                str2 = "";
            }
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.cl7);
        if (imageView != null) {
            float measuredWidth = (holder.o().getMeasuredWidth() - (3 * context.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv))) / 2.0f;
            int[] iArr = new int[2];
            r45.r23 r23Var2 = (r45.r23) r03Var.getCustom(23);
            iArr[0] = (r23Var2 == null || (rz6Var3 = (r45.rz6) r23Var2.getCustom(1)) == null || (b70Var3 = rz6Var3.f385323g) == null) ? 0 : b70Var3.f370592q;
            r45.r23 r23Var3 = (r45.r23) r03Var.getCustom(23);
            int i19 = (r23Var3 == null || (rz6Var2 = (r45.rz6) r23Var3.getCustom(1)) == null || (b70Var2 = rz6Var2.f385323g) == null) ? 0 : b70Var2.f370591p;
            iArr[1] = i19;
            float f17 = i19 > iArr[0] ? 1.0f : 1.3333334f;
            android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = a06.d.b(measuredWidth);
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = a06.d.b(f17 * measuredWidth);
            }
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d e17 = g1Var.e();
            r45.r23 r23Var4 = (r45.r23) r03Var.getCustom(23);
            if (r23Var4 != null && (rz6Var = (r45.rz6) r23Var4.getCustom(1)) != null && (b70Var = rz6Var.f385323g) != null) {
                str = b70Var.f370590o;
            }
            e17.c(new mn2.q3(str != null ? str : "", com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329953d));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.zt(holder, this, recyclerView));
    }
}
