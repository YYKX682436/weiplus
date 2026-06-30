package ui2;

/* loaded from: classes8.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final si2.a f509637e;

    public n(si2.a aVar) {
        this.f509637e = aVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eaj;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vi2.b item = (vi2.b) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.ViewGroup.LayoutParams layoutParams = holder.f3639x46306858.getLayoutParams();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.f93474i = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 c22644xc8fbf3b2 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566254tm3);
        if (c22644xc8fbf3b2 != null) {
            float dimensionPixelSize = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            c22644xc8fbf3b2.c(dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566256tm5);
        if (textView != null) {
            int i19 = item.f519071h;
            if (i19 == 0) {
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dm8));
            } else {
                textView.setText(textView.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573132nr2, java.lang.Integer.valueOf(i19)));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566255tm4);
        if (imageView != null) {
            imageView.setOnClickListener(new ui2.m(this));
        }
    }
}
