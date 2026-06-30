package cm2;

/* loaded from: classes3.dex */
public final class s extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f124916e;

    /* renamed from: f, reason: collision with root package name */
    public final qo0.c f124917f;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin, qo0.c statusMonitor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f124916e = basePlugin;
        this.f124917f = statusMonitor;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b0w;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.CharSequence charSequence;
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        java.lang.String str2;
        cm2.p item = (cm2.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nz_);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nzg);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.nza);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kvq);
        r45.fr1 fr1Var = item.f124910h;
        java.lang.String str3 = "";
        boolean z18 = true;
        if (textView != null) {
            if (fr1Var == null || (str2 = fr1Var.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (textView2 != null) {
            if (fr1Var == null || (str = fr1Var.m75945x2fec8307(2)) == null) {
                str = "";
            }
            textView2.setText(str);
        }
        if (textView3 != null) {
            if (fr1Var != null && (m75945x2fec8307 = fr1Var.m75945x2fec8307(3)) != null) {
                str3 = m75945x2fec8307;
            }
            textView3.setText(str3);
        }
        java.lang.Integer valueOf = fr1Var != null ? java.lang.Integer.valueOf(fr1Var.m75939xb282bd08(0)) : null;
        int b17 = i65.a.b(holder.f374654e, 6);
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            charSequence = null;
            textView4.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            textView4.setText(holder.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572931cz2));
            textView4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0x);
            int i19 = b17 * 2;
            textView4.setPadding(i19, b17, i19, b17);
        } else if ((valueOf != null && valueOf.intValue() == 3) || (valueOf != null && valueOf.intValue() == 4)) {
            textView4.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
            textView4.setText(holder.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e4x));
            charSequence = null;
            textView4.setBackground(null);
            textView4.setPadding(0, 0, 0, 0);
        } else {
            textView4.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            textView4.setText(holder.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572931cz2));
            textView4.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0x);
            int i27 = b17 * 2;
            textView4.setPadding(i27, b17, i27, b17);
            charSequence = null;
        }
        textView4.setOnClickListener(new cm2.r(fr1Var, holder, item, this));
        java.lang.CharSequence text = textView2 != null ? textView2.getText() : charSequence;
        if (text == null || text.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
        }
        java.lang.CharSequence text2 = textView3 != null ? textView3.getText() : charSequence;
        if (text2 == null || text2.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        if (textView != null) {
            charSequence = textView.getText();
        }
        if (charSequence != null && charSequence.length() != 0) {
            z18 = false;
        }
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
