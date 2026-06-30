package qn4;

/* loaded from: classes12.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.i f446776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(qn4.i iVar) {
        super(0);
        this.f446776d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f;
        qn4.i iVar = this.f446776d;
        if (iVar.b()) {
            java.lang.ref.WeakReference weakReference = iVar.f446780c;
            android.widget.FrameLayout frameLayout = weakReference != null ? (android.widget.FrameLayout) weakReference.get() : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            java.lang.ref.WeakReference weakReference2 = iVar.f446781d;
            android.widget.ProgressBar progressBar = weakReference2 != null ? (android.widget.ProgressBar) weakReference2.get() : null;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            java.lang.ref.WeakReference weakReference3 = iVar.f446782e;
            if (weakReference3 != null && (c21466x35c7836f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f) weakReference3.get()) != null) {
                c21466x35c7836f.setVisibility(0);
                c21466x35c7836f.b();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechIndicator", "showSpeechAnim: Loading GONE, speechAnim VISIBLE + startAnim");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslationSpeechSpeechIndicator", "showSpeechAnim: failed to create wrapper");
        }
        return jz5.f0.f384359a;
    }
}
