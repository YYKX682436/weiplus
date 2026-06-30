package yn2;

/* loaded from: classes2.dex */
public class n extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dkb;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        o(holder);
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, zn2.b item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        vn2.u0 u0Var = vn2.u0.f519920a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindViewHolder ");
        java.lang.String str = item.f556022d;
        sb6.append(str);
        u0Var.l("Finder.MegaVideo.TitleConvert", sb6.toString());
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.obc);
        textView.setText(str);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = item.f556023e.height;
    }

    public void o(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.obc);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
            textView.setTextColor(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
        }
    }
}
