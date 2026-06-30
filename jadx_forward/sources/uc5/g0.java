package uc5;

/* loaded from: classes4.dex */
public final class g0 extends in5.r {
    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekn, (android.view.ViewGroup) recyclerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        uc5.l0 item = (uc5.l0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        uc5.i0 i0Var = item instanceof uc5.i0 ? (uc5.i0) item : null;
        if (i0Var == null) {
            return;
        }
        android.view.View view = holder.f3639x46306858;
        android.content.Context context = view.getContext();
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ups)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbv));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view.findViewById(com.p314xaae8f345.mm.R.id.upr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c1163xf1deaba4, "getPersonRecommendRv(...)");
        if (c1163xf1deaba4.getLayoutManager() == null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
            c1163xf1deaba4.N(new uc5.f0(context));
        }
        java.lang.Object context2 = holder.f3639x46306858.getContext();
        uc5.r rVar = context2 instanceof uc5.r ? (uc5.r) context2 : null;
        java.lang.String j76 = rVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar).j7() : "";
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        uc5.e0 e0Var = mo7946xf939df19 instanceof uc5.e0 ? (uc5.e0) mo7946xf939df19 : null;
        java.util.List newItems = i0Var.f508034d;
        if (e0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newItems, "newItems");
            e0Var.f508013d = newItems;
            e0Var.f508014e = j76;
            e0Var.m8146xced61ae5();
        } else {
            c1163xf1deaba4.mo7960x6cab2c8d(new uc5.e0(newItems, j76));
        }
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.f93474i = true;
    }
}
