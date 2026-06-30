package bw4;

/* loaded from: classes3.dex */
public class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar f24939d;

    public e(com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar webSearchVideoPlayerSeekBar) {
        this.f24939d = webSearchVideoPlayerSeekBar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i19 - i17 != i37 - i28) {
            this.f24939d.m();
        }
    }
}
