package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes8.dex */
public class v6 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186303e;

    public v6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f186303e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c7y;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.a1 item = (so2.a1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567951sa5);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.lang.CharSequence text = textView.getText();
        android.text.SpannableString spannableString = new android.text.SpannableString(text);
        java.lang.String obj = text.toString();
        android.content.Context context = holder.f374654e;
        spannableString.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.yl(obj, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77825x7240a12), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e), false, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u6(holder, this), 24, null), 10, text.length(), 17);
        textView.setText(spannableString);
    }
}
