package qn4;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f446778a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f446779b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f446780c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f446781d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f446782e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f446783f;

    public static final void a(qn4.i iVar) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f;
        java.lang.ref.WeakReference weakReference = iVar.f446782e;
        if (weakReference != null && (c21466x35c7836f = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f) weakReference.get()) != null) {
            c21466x35c7836f.c();
            c21466x35c7836f.setVisibility(8);
        }
        java.lang.ref.WeakReference weakReference2 = iVar.f446781d;
        android.widget.ProgressBar progressBar = weakReference2 != null ? (android.widget.ProgressBar) weakReference2.get() : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        java.lang.ref.WeakReference weakReference3 = iVar.f446780c;
        android.widget.FrameLayout frameLayout = weakReference3 != null ? (android.widget.FrameLayout) weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechIndicator", "hideAll: all indicators GONE");
    }

    public final boolean b() {
        java.lang.ref.WeakReference weakReference = this.f446779b;
        android.widget.LinearLayout linearLayout = weakReference != null ? (android.widget.LinearLayout) weakReference.get() : null;
        if (linearLayout != null && linearLayout.getParent() != null) {
            return true;
        }
        java.lang.ref.WeakReference weakReference2 = this.f446778a;
        android.view.View view = weakReference2 != null ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5) weakReference2.get() : null;
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView is null");
            return false;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView has no parent");
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView not found in parent");
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return false;
        }
        android.content.Context context = view.getContext();
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setTag("translation_speech_indicator_wrapper");
        viewGroup.removeViewAt(indexOfChild);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(context, null, 0, com.p314xaae8f345.mm.R.C30868x68b1db1.f576351x4);
        progressBar.setClickable(false);
        progressBar.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressBar, layoutParams2);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f c21466x35c7836f = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21466x35c7836f(context);
        c21466x35c7836f.m78868x7650bebc(3);
        c21466x35c7836f.m78867x600f4566(!this.f446783f);
        c21466x35c7836f.setVisibility(8);
        c21466x35c7836f.setClickable(true);
        c21466x35c7836f.setOnClickListener(qn4.b.f446771d);
        frameLayout.addView(c21466x35c7836f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f446783f) {
            layoutParams3.rightMargin = dimensionPixelSize3;
            linearLayout2.addView(frameLayout, layoutParams3);
            linearLayout2.addView(view, layoutParams4);
        } else {
            layoutParams3.leftMargin = dimensionPixelSize3;
            linearLayout2.addView(view, layoutParams4);
            linearLayout2.addView(frameLayout, layoutParams3);
        }
        viewGroup.addView(linearLayout2, indexOfChild, layoutParams);
        this.f446779b = new java.lang.ref.WeakReference(linearLayout2);
        this.f446780c = new java.lang.ref.WeakReference(frameLayout);
        this.f446781d = new java.lang.ref.WeakReference(progressBar);
        this.f446782e = new java.lang.ref.WeakReference(c21466x35c7836f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: created wrapper at index=" + indexOfChild + ", isSent=" + this.f446783f);
        return true;
    }
}
