package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class h0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f192903e;

    public h0(boolean z17) {
        this.f192903e = z17;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ajm;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.j0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ohd);
        android.content.Context context = holder.f374654e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.i0 i0Var = item.f192919d;
        if (textView != null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = i0Var.f192917b;
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str));
        }
        boolean z18 = item.f192920e;
        boolean z19 = this.f192903e;
        if (z18) {
            if (z19) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        } else {
            if (z19) {
                if (textView != null) {
                    textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                }
            } else if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.1f);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderAlbumFilterConvert", "item hash:" + item.hashCode() + ", topic:" + i0Var.f192917b + ", selected:" + item.f192920e);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ohd);
        if (textView != null) {
            textView.setTextSize(1, 14.0f);
        }
    }
}
