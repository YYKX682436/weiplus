package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class ym extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.fd2 f186560e;

    public ym(r45.fd2 fd2Var) {
        this.f186560e = fd2Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570531b03;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        so2.u2 item = (so2.u2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fmv);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fmt);
        r45.fd2 fd2Var = item.f492168d;
        if (textView2 != null) {
            textView2.setText(fd2Var.m75945x2fec8307(1));
        }
        r45.fd2 fd2Var2 = this.f186560e;
        if (fd2Var2 != null) {
            if (!(fd2Var2.m75939xb282bd08(0) == -1)) {
                if (fd2Var2.m75939xb282bd08(0) == fd2Var.m75939xb282bd08(0)) {
                    r45.fd2 fd2Var3 = (r45.fd2) fd2Var2.m75936x14adae67(3);
                    if (fd2Var3 != null && fd2Var3.m75939xb282bd08(4) == 1) {
                        android.content.Context context = textView.getContext();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(fd2Var2.m75945x2fec8307(1));
                        sb6.append('-');
                        r45.fd2 fd2Var4 = (r45.fd2) fd2Var2.m75936x14adae67(3);
                        sb6.append(fd2Var4 != null ? fd2Var4.m75945x2fec8307(1) : null);
                        objArr[0] = sb6.toString();
                        string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eft, objArr);
                    } else {
                        android.content.Context context2 = textView.getContext();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        r45.fd2 fd2Var5 = (r45.fd2) fd2Var2.m75936x14adae67(3);
                        objArr2[0] = fd2Var5 != null ? fd2Var5.m75945x2fec8307(1) : null;
                        string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.eft, objArr2);
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    textView.setVisibility(0);
                    textView.setText(string);
                    return;
                }
            }
        }
        textView.setVisibility(8);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
