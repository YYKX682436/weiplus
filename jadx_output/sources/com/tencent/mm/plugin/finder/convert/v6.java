package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public class v6 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104770e;

    public v6(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f104770e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c7y;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.a1 item = (so2.a1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f486418sa5);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        java.lang.CharSequence text = textView.getText();
        android.text.SpannableString spannableString = new android.text.SpannableString(text);
        java.lang.String obj = text.toString();
        android.content.Context context = holder.f293121e;
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(obj, context.getResources().getColor(com.tencent.mm.R.color.LinkFinder_100), context.getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.convert.u6(holder, this), 24, null), 10, text.length(), 17);
        textView.setText(spannableString);
    }
}
