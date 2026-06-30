package com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui;

/* loaded from: classes5.dex */
public class g0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d f156081d;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d) {
        this.f156081d = viewOnFocusChangeListenerC11490xd5b31b8d;
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
            spannableString.setSpan(new android.text.style.BackgroundColorSpan(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77630xad7ef28)), 0, text.length(), 33);
            textView.setText(spannableString);
            rl5.r rVar = new rl5.r(textView.getContext(), textView);
            rVar.f478884u = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.d0(this, textView);
            rVar.f478887x = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.e0(this, textView);
            rVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.f0(this, textView, text);
            com.p314xaae8f345.mm.p1006xc5476f33.p1018xbb979bf4.ui.ViewOnFocusChangeListenerC11490xd5b31b8d viewOnFocusChangeListenerC11490xd5b31b8d = this.f156081d;
            rVar.n(viewOnFocusChangeListenerC11490xd5b31b8d.f155975p, viewOnFocusChangeListenerC11490xd5b31b8d.f155976q);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/address/ui/InvoiceQrcodeTextView$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }
}
