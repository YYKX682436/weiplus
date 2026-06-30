package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df;

/* loaded from: classes8.dex */
public class o0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0 f272515e = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0(null);

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e5d;
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w data, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12475x7cfc32b2 c12475x7cfc32b2;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o0 o0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e1s);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e1t);
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.tad);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ta9);
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(null);
        }
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        holder.f3639x46306858.setEnabled(true);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(8);
        }
        if (i18 == 1) {
            textView.setText(holder.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_v));
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8j);
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f78984xf70b1c1a, com.p314xaae8f345.mm.R.C30859x5a72f63.abw);
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0 n0Var = f272515e;
        if (i18 == 2) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = data.f272547d;
            if (xVar != null) {
                textView.setText(xVar.f272562e.toString());
                if (xVar.f272563f == null) {
                    android.content.Context context = holder.f3639x46306858.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    android.content.pm.ResolveInfo ri6 = xVar.f272561d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ri6, "ri");
                    xVar.f272563f = n0Var.b(context, ri6);
                }
                imageView.setImageDrawable(xVar.f272563f);
                return;
            }
            return;
        }
        if (i18 == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = data.f272548e;
            if (c12474x8b872a21 == null || (c12475x7cfc32b2 = c12474x8b872a21.f167788d) == null) {
                return;
            }
            textView.setText(c12475x7cfc32b2.f167800i);
            imageView2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8i);
            imageView2.setImageResource(com.p314xaae8f345.mm.R.raw.f78469x693e23ce);
            java.lang.String str = c12475x7cfc32b2.f167798g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0.d(n0Var, str, imageView, 0.0f, false, 12, null);
            imageView2.setVisibility(0);
            return;
        }
        if (i18 != 4) {
            if (i18 == 5 && (o0Var = data.f272550g) != null) {
                textView.setText(o0Var.f270923b);
                java.lang.Integer num = o0Var.f270925d;
                if (num != null) {
                    imageView.setImageResource(num.intValue());
                    imageView.setColorFilter(0);
                }
                holder.f3639x46306858.setEnabled(o0Var.f270926e);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p742x782d98c9.C10597xb1f0d2 c10597xb1f0d2 = data.f272549f;
        if (c10597xb1f0d2 != null) {
            if (imageView != null) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d8j);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.n0.d(n0Var, c10597xb1f0d2.f148122g, c22699x3dcdb352, 0.0f, false, 12, null);
            }
            textView.setText(c10597xb1f0d2.f148121f);
        }
    }
}
