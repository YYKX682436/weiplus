package e72;

/* loaded from: classes14.dex */
public class k implements e72.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331444e;

    /* renamed from: f, reason: collision with root package name */
    public final long f331445f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f331440a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f331441b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f331442c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f331443d = null;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f331446g = false;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f331448i = false;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f331449j = false;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f331450k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new e72.i(this), true);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.Animation f331447h = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea);

    public k(java.lang.String str, long j17) {
        this.f331444e = str;
        this.f331445f = j17;
    }

    @Override // e72.h
    public e72.g a() {
        return this.f331440a ? new e72.g(90025, "user cancelled in intermediate page") : new e72.g(90004, "user cancelled in processing");
    }

    @Override // e72.h
    public void b(java.lang.String str) {
        j();
        if (j() == null) {
            return;
        }
        j().setText(str);
    }

    @Override // e72.h
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8) {
        return this.f331440a && c13513x253b41f8 != null && c13513x253b41f8.f181481d == 18;
    }

    @Override // e72.h
    public e72.f d() {
        if (!this.f331440a || this.f331449j) {
            return null;
        }
        this.f331449j = true;
        return new e72.f(1);
    }

    @Override // e72.h
    public void e(android.content.Context context, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        this.f331442c = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aab, viewGroup);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aac, viewGroup2);
        this.f331443d = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "initMotion", "(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (j() != null) {
            j().setText(this.f331444e);
        }
        long j17 = this.f331445f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NormalFaceMotion", "hy: starting tween timer: tween: %d", java.lang.Long.valueOf(j17));
        this.f331450k.d();
        this.f331446g = true;
        this.f331450k.c(0L, j17);
    }

    @Override // e72.h
    public boolean f(int i17, java.lang.CharSequence charSequence) {
        return false;
    }

    @Override // e72.h
    public boolean g(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8) {
        if (c13513x253b41f8.f181481d == -1) {
            this.f331440a = true;
            if (!this.f331448i) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v5.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.hpp);
                android.widget.TextView textView = (android.widget.TextView) this.f331442c.findViewById(com.p314xaae8f345.mm.R.id.h0f);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559312b8);
                android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
                loadAnimation.setDuration(500L);
                loadAnimation2.setDuration(500L);
                textView.startAnimation(loadAnimation);
                textView.setVisibility(4);
                android.view.View view = this.f331443d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/facedetect/motion/NormalFaceMotion", "startTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f331443d.startAnimation(loadAnimation2);
                this.f331443d.findViewById(com.p314xaae8f345.mm.R.id.do6).setOnClickListener(new e72.j(this));
                this.f331448i = true;
                return true;
            }
        }
        return false;
    }

    @Override // e72.h
    public void h() {
        this.f331446g = false;
        this.f331450k.d();
        this.f331440a = false;
        this.f331448i = false;
        this.f331449j = false;
        this.f331441b = false;
    }

    @Override // e72.h
    public boolean i() {
        return this.f331440a && this.f331441b;
    }

    public android.widget.TextView j() {
        android.view.View view;
        android.view.View view2;
        boolean z17 = this.f331440a;
        if (!z17 && (view2 = this.f331442c) != null) {
            return (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.h0f);
        }
        if (!z17 || (view = this.f331443d) == null) {
            return null;
        }
        return (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0f);
    }
}
