package qn4;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.text.style.CharacterStyle f446788a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f446789b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f446790c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f446791d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f446792e;

    public final void a() {
        this.f446792e = false;
        this.f446788a = null;
        java.lang.ref.WeakReference weakReference = this.f446789b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f446789b = null;
        java.lang.ref.WeakReference weakReference2 = this.f446790c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f446790c = null;
        this.f446791d = null;
    }

    public final void b(android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039, java.lang.CharSequence charSequence, boolean z17) {
        android.content.Context context;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechMarque", "startMarquee, text length: " + charSequence.length() + ", isFromUser: " + z17);
        if (textView != null) {
            this.f446789b = new java.lang.ref.WeakReference(textView);
        }
        if (c22624x85d69039 != null) {
            this.f446790c = new java.lang.ref.WeakReference(c22624x85d69039);
        }
        this.f446791d = charSequence;
        this.f446792e = true;
        if (textView == null || (context = textView.getContext()) == null) {
            context = c22624x85d69039 != null ? c22624x85d69039.getContext() : null;
        }
        if (context == null) {
            a();
            return;
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        this.f446788a = foregroundColorSpan;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(foregroundColorSpan, 0, charSequence.length(), 33);
        if (textView != null) {
            textView.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
        }
        if (c22624x85d69039 != null) {
            c22624x85d69039.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        }
    }
}
