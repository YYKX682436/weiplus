package g13;

/* loaded from: classes10.dex */
public abstract class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbd;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        i13.c item = (i13.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.String c17 = item.c();
        android.graphics.drawable.Drawable b17 = item.b();
        int a17 = item.a();
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bcj);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6y);
        if (textView != null) {
            textView.setText(c17);
        }
        c22699x3dcdb352.setVisibility(b17 != null ? 0 : 8);
        c22699x3dcdb352.setImageDrawable(b17);
        c22699x3dcdb352.m82040x7541828(a17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565020b03);
        if (p17 != null) {
            p17.setOnClickListener(new g13.a(item));
        }
        o(holder, item, i17, i18, z17, list);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.cgz);
        android.content.Context context = holder.f374654e;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(n(), (android.view.ViewGroup) null);
        p(recyclerView, holder, i17);
        frameLayout.addView(inflate);
        if (k13.l1.I.a().f384746g) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.b98);
            if (p17 != null) {
                p17.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.adq));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6y);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.r_));
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bcj);
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.r_));
            }
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f565020b03);
            if (p18 != null) {
                p18.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562803p2));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f565023b06);
            if (c22699x3dcdb3522 != null) {
                c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560672r2));
            }
        } else {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.b98);
            if (p19 != null) {
                p19.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.adp));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.h6y);
            if (c22699x3dcdb3523 != null) {
                c22699x3dcdb3523.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560677r7));
            }
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.bcj);
            if (textView2 != null) {
                textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560677r7));
            }
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f565020b03);
            if (p27 != null) {
                p27.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562804p3));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f565023b06);
            if (c22699x3dcdb3524 != null) {
                c22699x3dcdb3524.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560671r1));
            }
        }
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.odf)).getPaint(), 0.8f);
    }

    public abstract int n();

    public abstract void o(in5.s0 s0Var, i13.c cVar, int i17, int i18, boolean z17, java.util.List list);

    public abstract void p(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.s0 s0Var, int i17);
}
