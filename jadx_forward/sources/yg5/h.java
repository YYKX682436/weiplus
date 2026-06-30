package yg5;

/* loaded from: classes2.dex */
public final class h extends in5.r {
    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egy, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        yg5.e item = (yg5.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View view = holder.f3639x46306858;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ung);
        textView.setText(item.f543884g);
        boolean z18 = item.f543885h;
        android.content.Context context = holder.f374654e;
        if (z18) {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agk, null));
            com.p314xaae8f345.mm.ui.fk.a(textView);
        } else {
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agj, null));
            com.p314xaae8f345.mm.ui.fk.c(textView);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.u0d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn));
        gradientDrawable.setColor(context.getResources().getColor(!com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : com.p314xaae8f345.mm.R.C30859x5a72f63.abz, null));
        frameLayout.setBackground(gradientDrawable);
    }
}
