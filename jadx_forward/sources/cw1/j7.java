package cw1;

/* loaded from: classes12.dex */
public final class j7 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f304580a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f304581b;

    /* renamed from: c, reason: collision with root package name */
    public long f304582c;

    /* renamed from: d, reason: collision with root package name */
    public int f304583d;

    /* renamed from: e, reason: collision with root package name */
    public long f304584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da f304585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f304586g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f304587h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f304588i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304589j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304590k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304591l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304592m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304593n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f304594o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304595p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304596q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f304597r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304598s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f304599t;

    public j7(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13123x212a66da activityC13123x212a66da, boolean z17, yv1.g1 g1Var, long j17, android.view.View view, android.view.View view2, android.view.View view3, android.widget.TextView textView, android.widget.TextView textView2, boolean z18, android.widget.TextView textView3, android.widget.TextView textView4, int i17, android.widget.TextView textView5, android.widget.TextView textView6) {
        this.f304585f = activityC13123x212a66da;
        this.f304586g = z17;
        this.f304587h = g1Var;
        this.f304588i = j17;
        this.f304589j = view;
        this.f304590k = view2;
        this.f304591l = view3;
        this.f304592m = textView;
        this.f304593n = textView2;
        this.f304594o = z18;
        this.f304595p = textView3;
        this.f304596q = textView4;
        this.f304597r = i17;
        this.f304598s = textView5;
        this.f304599t = textView6;
        java.lang.String string = activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572448ey3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        this.f304580a = string;
        java.lang.String string2 = activityC13123x212a66da.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        this.f304581b = string2;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
        this.f304583d = i17;
        this.f304582c = j17;
        c(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0296  */
    @Override // aw1.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r36, long r37, int r39) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw1.j7.b(boolean, long, int):void");
    }

    public final void c(int i17) {
        int i18;
        yv1.h1.f(2, this.f304585f.f177330g);
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f304584e;
        if (i17 <= 0 || currentTimeMillis <= 0 || (i18 = this.f304597r) <= 0) {
            return;
        }
        int f17 = e06.p.f((i17 * 100) / i18, 0, 100);
        int i19 = (int) (((this.f304597r - i17) / (i17 / ((float) currentTimeMillis))) / com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8);
        ((ku5.t0) ku5.t0.f394148d).B(new cw1.i7(this.f304598s, this, f17, this.f304599t, i19 < 0 ? 0 : i19));
    }
}
