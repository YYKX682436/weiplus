package qn4;

/* loaded from: classes12.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.i f446773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qn4.i iVar) {
        super(0);
        this.f446773d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.ref.WeakReference weakReference = this.f446773d.f446781d;
        android.widget.ProgressBar progressBar = weakReference != null ? (android.widget.ProgressBar) weakReference.get() : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechIndicator", "hideLoading: set GONE");
        }
        return jz5.f0.f384359a;
    }
}
