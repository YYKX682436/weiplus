package ni2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub f418865a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.TextureView f418866b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f418867c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418868d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f418869e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.TextureView.SurfaceTextureListener f418870f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.SurfaceTexture f418871g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f418872h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f418873i;

    /* renamed from: j, reason: collision with root package name */
    public final ni2.i f418874j;

    public j(android.view.ViewGroup root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        this.f418865a = basePlugin;
        this.f418866b = (android.view.TextureView) root.findViewById(com.p314xaae8f345.mm.R.id.b58);
        this.f418867c = root.findViewById(com.p314xaae8f345.mm.R.id.oxy);
        this.f418868d = root.findViewById(com.p314xaae8f345.mm.R.id.imn);
        this.f418869e = (android.view.ViewGroup) root.findViewById(com.p314xaae8f345.mm.R.id.f565071b54);
        this.f418873i = true;
        this.f418874j = new ni2.i(this);
        b();
    }

    public final void a(android.view.ViewGroup viewGroup, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = this.f418872h;
        if (imageView != null) {
            viewGroup.removeView(imageView);
        }
        android.widget.ImageView imageView2 = this.f418872h;
        if (imageView2 == null) {
            imageView2 = new android.widget.ImageView(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        this.f418872h = imageView2;
        imageView2.setImageBitmap(bitmap);
        viewGroup.addView(this.f418872h, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public final void b() {
        android.view.View view = this.f418867c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f418868d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicCameraPreviewManager", "initCameraView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f418866b.setSurfaceTextureListener(this.f418874j);
    }
}
