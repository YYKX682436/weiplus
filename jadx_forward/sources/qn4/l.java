package qn4;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.m f446786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f446787e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qn4.m mVar, float f17) {
        super(0);
        this.f446786d = mVar;
        this.f446787e = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.CharSequence charSequence;
        android.text.style.CharacterStyle characterStyle;
        java.lang.Object m143895xf1229813;
        qn4.m mVar = this.f446786d;
        boolean z17 = mVar.f446792e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            java.lang.ref.WeakReference weakReference = mVar.f446789b;
            jz5.f0 f0Var2 = null;
            android.widget.TextView textView = weakReference != null ? (android.widget.TextView) weakReference.get() : null;
            java.lang.ref.WeakReference weakReference2 = mVar.f446790c;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = weakReference2 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) weakReference2.get() : null;
            if ((textView != null || c22624x85d69039 != null) && (charSequence = mVar.f446791d) != null && (characterStyle = mVar.f446788a) != null) {
                int ceil = (int) java.lang.Math.ceil(charSequence.length() * e06.p.e(this.f446787e, 0.0f, 1.0f));
                int length = charSequence.length();
                if (ceil > length) {
                    ceil = length;
                }
                charSequence.length();
                if (ceil < charSequence.length()) {
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                        spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(characterStyle, ceil, charSequence.length(), 33);
                        if (textView != null) {
                            textView.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        if (c22624x85d69039 != null) {
                            c22624x85d69039.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
                            f0Var2 = f0Var;
                        }
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
                    } catch (java.lang.Throwable th6) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                    }
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                    if (m143898xd4a2fc34 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechSpeechMarque", "Update progress failed", m143898xd4a2fc34);
                    }
                }
            }
        }
        return f0Var;
    }
}
