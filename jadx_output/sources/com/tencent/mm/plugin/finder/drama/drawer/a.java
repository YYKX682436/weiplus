package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class a extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.c f105197e;

    public a(com.tencent.mm.plugin.finder.drama.drawer.c cVar) {
        this.f105197e = cVar;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e6o;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        zb2.b item = (zb2.b) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.t8d);
        r45.oj2 oj2Var = item.f471258d;
        r45.bn2 bn2Var = (r45.bn2) oj2Var.getCustom(1);
        java.lang.Integer valueOf = bn2Var != null ? java.lang.Integer.valueOf(bn2Var.getInteger(2)) : null;
        if (textView != null) {
            r45.bn2 bn2Var2 = (r45.bn2) oj2Var.getCustom(1);
            textView.setText(bn2Var2 != null ? java.lang.Integer.valueOf(bn2Var2.getInteger(2)).toString() : null);
        }
        boolean z18 = valueOf != null && valueOf.intValue() == this.f105197e.f105203f;
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.content.Context context = holder.f293121e;
        if (z18) {
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481912d62);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478544ae));
        } else {
            textView.setBackgroundResource(com.tencent.mm.R.drawable.f481866cp3);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.abw));
        }
    }
}
