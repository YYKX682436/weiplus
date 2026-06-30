package rp4;

/* loaded from: classes10.dex */
public final class g implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 f480182d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f480183e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f480184f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f480185g;

    /* renamed from: h, reason: collision with root package name */
    public fp.e f480186h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f480187i;

    /* renamed from: m, reason: collision with root package name */
    public int f480188m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f480189n;

    /* renamed from: o, reason: collision with root package name */
    public int f480190o;

    /* renamed from: p, reason: collision with root package name */
    public int f480191p;

    /* renamed from: q, reason: collision with root package name */
    public rp4.x f480192q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f480193r;

    /* renamed from: s, reason: collision with root package name */
    public final rp4.f f480194s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f480195t;

    public g(com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68, ju3.d0 status, android.widget.TextView textView, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f480182d = textureViewSurfaceTextureListenerC22778x581fb68;
        this.f480183e = status;
        this.f480184f = textView;
        this.f480185g = context;
        this.f480188m = 10000;
        this.f480193r = true;
        this.f480194s = new rp4.f(this);
        this.f480195t = jz5.h.b(rp4.b.f480144d);
    }

    public final android.view.ViewGroup a() {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        return (android.view.ViewGroup) (textureViewSurfaceTextureListenerC22778x581fb68 != null ? textureViewSurfaceTextureListenerC22778x581fb68.getParent() : null);
    }

    public final void b(boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        this.f480189n = false;
        android.view.ViewGroup a17 = a();
        android.view.ViewPropertyAnimator translationY = (a17 == null || (animate = a17.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null) ? null : scaleY.translationY(0.0f);
        if (translationY != null) {
            translationY.setDuration(300L);
        }
        if (z17) {
            return;
        }
        this.f480190o = 0;
        ct0.b bVar = this.f480187i;
        this.f480191p = bVar != null ? bVar.f303741e : 10000;
    }

    public final void c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("releaseVideo >> ");
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        sb6.append(textureViewSurfaceTextureListenerC22778x581fb68 != null ? java.lang.Integer.valueOf(textureViewSurfaceTextureListenerC22778x581fb68.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", sb6.toString());
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb682 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb682 != null) {
            if (textureViewSurfaceTextureListenerC22778x581fb682 != null) {
                textureViewSurfaceTextureListenerC22778x581fb682.g();
            }
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb683 = this.f480182d;
            if (textureViewSurfaceTextureListenerC22778x581fb683 != null) {
                textureViewSurfaceTextureListenerC22778x581fb683.m82516xd24ee348(null);
            }
            this.f480182d = null;
        }
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.f(z17);
        }
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "onDetach");
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb68 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(textureViewSurfaceTextureListenerC22778x581fb68, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        textureViewSurfaceTextureListenerC22778x581fb68.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(textureViewSurfaceTextureListenerC22778x581fb68, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "onPause");
        fp.e eVar = this.f480186h;
        if (eVar != null) {
            eVar.a();
        }
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.mo58788x65825f6();
        }
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "onResume");
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureViewSurfaceTextureListenerC22778x581fb68);
            if (textureViewSurfaceTextureListenerC22778x581fb68.m82510xc00617a4()) {
                return;
            }
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb682 = this.f480182d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textureViewSurfaceTextureListenerC22778x581fb682);
            textureViewSurfaceTextureListenerC22778x581fb682.h();
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "onRelease");
        c();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "reset");
        fp.e eVar = this.f480186h;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f480182d;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.setVisibility(i17);
        }
        android.widget.TextView textView = this.f480184f;
        if (textView == null) {
            return;
        }
        textView.setVisibility(i17);
    }
}
