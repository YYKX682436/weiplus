package com.tencent.mm.plugin.address.ui;

/* loaded from: classes5.dex */
public class g0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView f74548d;

    public g0(com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView) {
        this.f74548d = invoiceQrcodeTextView;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        android.widget.TextView textView = (android.widget.TextView) view;
        if (textView.getText() != null) {
            java.lang.CharSequence text = textView.getText();
            android.text.SpannableString spannableString = new android.text.SpannableString(text);
            spannableString.setSpan(new android.text.style.BackgroundColorSpan(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1)), 0, text.length(), 33);
            textView.setText(spannableString);
            rl5.r rVar = new rl5.r(textView.getContext(), textView);
            rVar.f397351u = new com.tencent.mm.plugin.address.ui.d0(this, textView);
            rVar.f397354x = new com.tencent.mm.plugin.address.ui.e0(this, textView);
            rVar.L = new com.tencent.mm.plugin.address.ui.f0(this, textView, text);
            com.tencent.mm.plugin.address.ui.InvoiceQrcodeTextView invoiceQrcodeTextView = this.f74548d;
            rVar.n(invoiceQrcodeTextView.f74442p, invoiceQrcodeTextView.f74443q);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
