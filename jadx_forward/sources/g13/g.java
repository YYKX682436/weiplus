package g13;

/* loaded from: classes10.dex */
public final class g extends g13.b {
    @Override // g13.b
    public int n() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bba;
    }

    @Override // g13.b
    public void o(in5.s0 holder, i13.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.p item = (i13.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z18 = k13.l1.I.a().f384746g;
        android.content.Context context = holder.f374654e;
        if (z18) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560680rb));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.po8);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.r_));
            }
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.odf);
            if (textView3 != null) {
                textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560679r9));
            }
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.po8);
            if (textView4 != null) {
                textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560677r7));
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        if (r26.i0.o(item.f368808d, "@miniapp", false, 2, null)) {
            n11.a.b().g(item.f368850o, imageView);
        } else {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, item.f368846h, 0.12f);
        }
        android.widget.TextView textView5 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView5.getContext();
        float textSize = textView5.getTextSize();
        ((ke0.e) xVar).getClass();
        textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, item.f368847i, textSize));
        ((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.po8)).setText(item.f368848m);
        textView5.requestLayout();
    }

    @Override // g13.b
    public void p(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
