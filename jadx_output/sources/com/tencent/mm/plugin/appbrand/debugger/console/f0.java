package com.tencent.mm.plugin.appbrand.debugger.console;

/* loaded from: classes8.dex */
public final class f0 extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f77665g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.SpannableStringBuilder f77666h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(android.content.Context context) {
        super(context, null);
        kotlin.jvm.internal.o.g(context, "context");
        setTextSize(0, i65.a.f(context, com.tencent.mm.R.dimen.f479929j9));
        setVerticalScrollBarEnabled(true);
        setMovementMethod(new android.text.method.ScrollingMovementMethod());
        this.f77665g = new java.util.LinkedList();
        this.f77666h = new android.text.SpannableStringBuilder();
    }

    public final void b(java.lang.String str, int i17) {
        java.util.LinkedList linkedList = this.f77665g;
        if (1000 <= linkedList.size()) {
            this.f77666h.delete(0, ((java.lang.String) linkedList.removeFirst()).length());
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(i17), 0, str.length(), 33);
        this.f77666h.append((java.lang.CharSequence) spannableString);
        setText(this.f77666h);
        post(new com.tencent.mm.plugin.appbrand.debugger.console.e0(this));
        linkedList.addLast(str);
    }
}
