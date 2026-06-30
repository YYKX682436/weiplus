package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class ap extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f102897e;

    public ap(int i17) {
        this.f102897e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487853f;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.l3 item = (so2.l3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.text.SpannableString spannableString = item.f410470f;
        if (spannableString == null || spannableString.length() == 0) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o_w);
            if (textView != null) {
                textView.setVisibility(8);
            }
            n(holder, item, i17);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o_w);
        if (textView2 != null) {
            textView2.setText(spannableString);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o_w);
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        n(holder, item, i17);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.itemView, "split_horizontal_bar");
        aVar.Rj(holder.itemView, iy1.a.Finder);
        aVar.Tj(holder.itemView, 32, 1, false);
        aVar.Ai(holder.itemView, new com.tencent.mm.plugin.finder.convert.zo(holder));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.o_w);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
    }

    public final void n(in5.s0 s0Var, so2.l3 l3Var, int i17) {
        androidx.recyclerview.widget.RecyclerView S6;
        r45.eo eoVar = (r45.eo) l3Var.f410468d.getCustom(8);
        java.lang.String string = eoVar != null ? eoVar.getString(0) : null;
        boolean z17 = string == null || string.length() == 0;
        r45.yw2 yw2Var = l3Var.f410468d;
        if (!z17) {
            r45.eo eoVar2 = (r45.eo) yw2Var.getCustom(8);
            if ((eoVar2 != null ? eoVar2.getInteger(1) : 0) > 0) {
                android.content.Context context = s0Var.f293121e;
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerConvert", "insertBubbleToNextFeed fail, context is not activity!");
                    return;
                }
                pf5.z zVar = pf5.z.f353948a;
                if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
                int i18 = this.f102897e;
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = finderHomeUIC.U6(i18);
                if (U6 == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerConvert", "insertBubbleToNextFeed fail, get tabType:" + i18 + " fragment fail!");
                    return;
                }
                com.tencent.mm.plugin.finder.viewmodel.component.bp bpVar = (com.tencent.mm.plugin.finder.viewmodel.component.bp) pf5.z.f353948a.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.bp.class);
                bpVar.getClass();
                android.content.Context context2 = s0Var.f293121e;
                android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                if (activity2 == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail, context is not activity!");
                    return;
                }
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(activity2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U62 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i18);
                if (U62 == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail, get tabType:" + i18 + " fragment fail!");
                    return;
                }
                bpVar.f133915d = i18;
                androidx.lifecycle.c1 a17 = zVar2.b(U62).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
                if (!((com.tencent.mm.plugin.finder.viewmodel.component.t80) a17).V6()) {
                    a17 = null;
                }
                com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) a17;
                if (t80Var != null && (S6 = t80Var.S6()) != null) {
                    androidx.recyclerview.widget.w2 w2Var = bpVar.f133919h;
                    if (w2Var != null) {
                        S6.V0(w2Var);
                    }
                    com.tencent.mm.plugin.finder.viewmodel.component.ap apVar = new com.tencent.mm.plugin.finder.viewmodel.component.ap(U62, bpVar, i18, i17);
                    bpVar.f133919h = apVar;
                    S6.i(apVar);
                    if (bpVar.f133918g == null) {
                        com.tencent.mm.plugin.finder.viewmodel.component.zo zoVar = new com.tencent.mm.plugin.finder.viewmodel.component.zo(bpVar);
                        androidx.appcompat.app.AppCompatActivity activity3 = bpVar.getActivity();
                        kotlin.jvm.internal.o.g(activity3, "activity");
                        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar2.a(activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.add(zoVar);
                        bpVar.f133918g = zoVar;
                    }
                    r3 = jz5.f0.f302826a;
                }
                if (r3 == null) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerUIC", "insertBubbleToNextFeed fail,tabType:" + i18 + " fragment's recyclerview null!");
                    return;
                }
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("insertBubbleToNextFeed fail,bubble info:");
        r45.eo eoVar3 = (r45.eo) yw2Var.getCustom(8);
        sb6.append(eoVar3 != null ? eoVar3.getString(0) : null);
        sb6.append(' ');
        r45.eo eoVar4 = (r45.eo) yw2Var.getCustom(8);
        sb6.append(eoVar4 != null ? java.lang.Integer.valueOf(eoVar4.getInteger(1)) : null);
        sb6.append("s, is invalid!");
        com.tencent.mars.xlog.Log.e("Finder.FinderMoreInterestDividerConvert", sb6.toString());
    }
}
