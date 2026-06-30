package ci2;

/* loaded from: classes10.dex */
public final class n extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final ci2.o f41690d;

    /* renamed from: e, reason: collision with root package name */
    public final fg2.p f41691e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f41692f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41693g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41694h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.content.Context context, ci2.o service) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        this.f41690d = service;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e9i, (android.view.ViewGroup) this, false);
        addView(inflate);
        int i17 = com.tencent.mm.R.id.th7;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.th7);
        if (constraintLayout != null) {
            i17 = com.tencent.mm.R.id.th8;
            androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) x4.b.a(inflate, com.tencent.mm.R.id.th8);
            if (appCompatTextView != null) {
                i17 = com.tencent.mm.R.id.th9;
                com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = (com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView) x4.b.a(inflate, com.tencent.mm.R.id.th9);
                if (ripperAnimateView != null) {
                    i17 = com.tencent.mm.R.id.qrn;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.qrn);
                    if (imageView != null) {
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = (androidx.constraintlayout.widget.ConstraintLayout) inflate;
                        this.f41691e = new fg2.p(constraintLayout2, constraintLayout, appCompatTextView, ripperAnimateView, imageView);
                        com.tencent.mars.xlog.Log.i("ChatVoiceRoomPreviewContentLayout", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                        android.view.ViewTreeObserver viewTreeObserver = constraintLayout2.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.addOnGlobalLayoutListener(new ci2.k(this));
                            return;
                        }
                        return;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    public final ci2.o getService() {
        return this.f41690d;
    }

    public final android.view.View getView() {
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = this.f41691e.f262200a;
        kotlin.jvm.internal.o.f(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }
}
