package qn4;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.m f446784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qn4.m mVar) {
        super(0);
        this.f446784d = mVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        jz5.f0 f0Var = jz5.f0.f384359a;
        qn4.m mVar = this.f446784d;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechMarque", "stopMarquee");
        mVar.f446792e = false;
        java.lang.ref.WeakReference weakReference = mVar.f446789b;
        jz5.f0 f0Var2 = null;
        android.widget.TextView textView = weakReference != null ? (android.widget.TextView) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = mVar.f446790c;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = weakReference2 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) weakReference2.get() : null;
        android.text.style.CharacterStyle characterStyle = mVar.f446788a;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            if (textView != null) {
                java.lang.CharSequence text = textView.getText();
                if ((text instanceof android.text.Spannable) && characterStyle != null) {
                    ((android.text.Spannable) text).removeSpan(characterStyle);
                    textView.setText(text, android.widget.TextView.BufferType.SPANNABLE);
                }
            }
            if (c22624x85d69039 != null) {
                java.lang.CharSequence a17 = c22624x85d69039.a();
                if ((a17 instanceof android.text.Spannable) && characterStyle != null) {
                    ((android.text.Spannable) a17).removeSpan(characterStyle);
                    c22624x85d69039.c(a17, android.widget.TextView.BufferType.SPANNABLE, null);
                }
                f0Var2 = f0Var;
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechSpeechMarque", "stopMarqueeInternal: remove span failed", m143898xd4a2fc34);
        }
        mVar.a();
        return f0Var;
    }
}
