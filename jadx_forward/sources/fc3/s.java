package fc3;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f342609a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f342610b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f342611c;

    /* renamed from: d, reason: collision with root package name */
    public long f342612d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.PointF f342613e;

    /* renamed from: f, reason: collision with root package name */
    public float f342614f;

    /* renamed from: g, reason: collision with root package name */
    public float f342615g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f342616h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.BaseInterpolator f342617i;

    /* renamed from: j, reason: collision with root package name */
    public int f342618j;

    /* renamed from: k, reason: collision with root package name */
    public android.graphics.Typeface f342619k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f342620l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f342621m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f342622n;

    /* renamed from: o, reason: collision with root package name */
    public final long f342623o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f342624p;

    public s(android.content.Context context, android.widget.FrameLayout layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        this.f342609a = context;
        this.f342610b = layout;
        this.f342611c = new java.util.ArrayList();
        this.f342612d = 300L;
        this.f342613e = new android.graphics.PointF(0.0f, 0.0f);
        this.f342614f = 12.0f;
        this.f342615g = 1.0f;
        this.f342617i = new android.view.animation.LinearInterpolator();
        this.f342618j = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
        this.f342620l = true;
        this.f342621m = true;
        this.f342623o = 2000L;
    }

    public static final void a(fc3.s sVar, fc3.k kVar) {
        if (!sVar.f342622n || la5.b.f399133a.g(true)) {
            sVar.f342624p = true;
            return;
        }
        int b17 = i65.a.b(sVar.f342609a, 10);
        float f17 = kVar.f342584b.x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar.f342587e);
        float width = f17 - (r3.getWidth() / 2);
        e06.k kVar2 = new e06.k(-b17, b17);
        c06.d dVar = c06.e.f119249d;
        float j17 = width + e06.p.j(kVar2, dVar);
        float f18 = kVar.f342584b.y;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar.f342587e);
        float height = (f18 - (r7.getHeight() / 2)) + e06.p.j(new e06.k(r5, b17), dVar);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kVar.f342587e, "translationX", j17);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(kVar.f342587e, "translationY", height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(sVar.f342623o);
        animatorSet.setInterpolator(new android.view.animation.AccelerateInterpolator());
        animatorSet.addListener(new fc3.p(new java.lang.ref.WeakReference(sVar), new java.lang.ref.WeakReference(kVar)));
        kVar.f342590h = animatorSet;
        animatorSet.start();
    }

    public final void b(fc3.k kVar) {
        boolean z17 = this.f342621m;
        android.widget.FrameLayout frameLayout = this.f342610b;
        java.util.List list = this.f342611c;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " removeText:" + kVar.f342583a + " tvList:" + ((java.util.ArrayList) list).size() + " layout count:" + frameLayout.getChildCount());
        }
        kVar.f342589g = 5;
        android.animation.AnimatorSet animatorSet = kVar.f342590h;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        frameLayout.removeView(kVar.f342587e);
        ((java.util.ArrayList) list).remove(kVar);
        if (this.f342621m) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " removeText2:" + kVar.f342583a + " tvList:" + ((java.util.ArrayList) list).size() + " layout count:" + frameLayout.getChildCount());
        }
    }

    public final void c(fc3.k walletText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(walletText, "walletText");
        boolean z17 = this.f342621m;
        android.widget.FrameLayout frameLayout = this.f342610b;
        java.lang.String str = walletText.f342583a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", "shootText:" + str + " to " + walletText.f342584b + " tvList:" + ((java.util.ArrayList) this.f342611c).size() + " child:" + frameLayout.getChildCount());
        }
        android.content.Context context = this.f342609a;
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(1, this.f342614f);
        textView.setX(this.f342613e.x);
        textView.setY(this.f342613e.y);
        if (this.f342620l) {
            textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i65.a.a(context, this.f342614f), -2));
            textView.setEms(1);
        } else {
            textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        }
        textView.setGravity(17);
        textView.setAlpha(0.0f);
        textView.setImportantForAccessibility(2);
        textView.setTextColor(this.f342618j);
        android.graphics.Typeface typeface = this.f342619k;
        if (typeface != null) {
            textView.setTypeface(typeface);
        }
        float f17 = walletText.f342588f;
        if (f17 > 0.01d) {
            textView.setLayerType(1, null);
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.MaskFilterSpan(new android.graphics.BlurMaskFilter(f17, android.graphics.BlurMaskFilter.Blur.NORMAL)), 0, spannableString.length(), 33);
            textView.setText(spannableString);
        } else {
            textView.setText(str);
        }
        textView.setLineSpacing(0.0f, 0.8f);
        frameLayout.addView(textView);
        walletText.f342587e = textView;
        textView.post(new fc3.o(textView, this, walletText));
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", hashCode() + " stopAll withAnimation:" + z17);
        this.f342624p = true;
        java.util.List list = this.f342611c;
        if (z17) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fc3.k) it.next()).f342589g = 4;
            }
            java.util.List S0 = kz5.n0.S0(list);
            ofFloat.addUpdateListener(new fc3.q(S0));
            ofFloat.addListener(new fc3.r(ofFloat, S0, this));
            ofFloat.start();
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" removeAllText size:");
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletTextAnimator", sb6.toString());
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            android.widget.FrameLayout frameLayout = this.f342610b;
            if (!hasNext) {
                frameLayout.removeAllViews();
                return;
            }
            fc3.k kVar = (fc3.k) it6.next();
            kVar.f342589g = 5;
            android.animation.AnimatorSet animatorSet = kVar.f342590h;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            frameLayout.removeView(kVar.f342587e);
            it6.remove();
        }
    }
}
