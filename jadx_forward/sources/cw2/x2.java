package cw2;

/* loaded from: classes10.dex */
public final class x2 implements cw2.aa {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.ImageView f305636a;

    public x2(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305636a = new android.widget.ImageView(context);
    }

    @Override // cw2.aa
    public void a(yz5.a onReady, yz5.a onDestroy, yz5.l onSeekFrame) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onReady, "onReady");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onDestroy, "onDestroy");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onSeekFrame, "onSeekFrame");
    }

    @Override // cw2.aa
    /* renamed from: destroy */
    public void mo122847x5cd39ffa() {
    }

    @Override // cw2.aa
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo122848x12501425() {
        return ug5.x.b(this.f305636a);
    }

    @Override // cw2.aa
    /* renamed from: getCurrentPositionMs */
    public long mo122849xddd35a52() {
        return 0L;
    }

    @Override // cw2.aa
    /* renamed from: getView */
    public android.view.View mo122850xfb86a31b() {
        return this.f305636a;
    }

    @Override // cw2.aa
    /* renamed from: resume */
    public void mo122851xc84dc82d() {
    }

    @Override // cw2.aa
    /* renamed from: seekTo */
    public void mo122852xc9fc1b13(long j17) {
    }
}
