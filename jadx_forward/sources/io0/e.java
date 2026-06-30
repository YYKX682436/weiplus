package io0;

/* loaded from: classes3.dex */
public final class e extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView f374982f;

    /* renamed from: g, reason: collision with root package name */
    public final int f374983g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.TextureView textureView = new android.view.TextureView(context);
        this.f374982f = textureView;
        this.f374983g = -1;
        addView(textureView, new android.view.ViewGroup.LayoutParams(-1, -1));
        int hashCode = this.f374982f.hashCode();
        this.f374983g = hashCode;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCVideoRatioLayout", "init add cameraView:" + hashCode);
    }

    public final void d(boolean z17) {
        removeView(this.f374982f);
        if (this.f374982f.getParent() == null) {
            if (z17) {
                removeAllViews();
            }
            addView(this.f374982f, new android.view.ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TRTCVideoRatioLayout", "refreshView fail,camera view have attach to " + this.f374982f.getParent());
        fn0.g gVar = fn0.g.f345728a;
        hn0.g gVar2 = fn0.g.f345729b;
        if (gVar2 != null) {
            ((vd2.l5) gVar2).wi("liveAnchorRefreshCameraFail", false);
        }
    }

    /* renamed from: getCameraView */
    public final android.view.TextureView m139651x76530f60() {
        return this.f374982f;
    }

    /* renamed from: setCameraView */
    public final void m139652xa4775d6c(android.view.TextureView cameraView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cameraView, "cameraView");
        if (cameraView.getParent() != null) {
            android.view.ViewParent parent = cameraView.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(cameraView);
            }
        }
        addView(cameraView, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f374982f = cameraView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TRTCVideoRatioLayout", "setCameraView cameraView:" + cameraView.hashCode());
        if (cameraView.hashCode() != this.f374983g) {
            fn0.g gVar = fn0.g.f345728a;
            hn0.g gVar2 = fn0.g.f345729b;
            if (gVar2 != null) {
                ((vd2.l5) gVar2).wi("liveSetAnchorCameraError", false);
            }
        }
    }
}
