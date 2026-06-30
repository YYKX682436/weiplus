package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0001H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView;", "Landroid/widget/FrameLayout;", "Lzy2/y7;", "", "alpha", "Ljz5/f0;", "setIconAlpha", "scale", "setScale", "", "ms", "setInterval", "getView", "Lcom/tencent/mm/sdk/platformtools/b4;", "u", "Ljz5/g;", "getTimeHandler", "()Lcom/tencent/mm/sdk/platformtools/b4;", "timeHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.FinderLiveConfettiView */
/* loaded from: classes3.dex */
public final class C14394xb058b2bf extends android.widget.FrameLayout implements zy2.y7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199120d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f199121e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f199122f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f199123g;

    /* renamed from: h, reason: collision with root package name */
    public final zl2.b f199124h;

    /* renamed from: i, reason: collision with root package name */
    public int f199125i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f199126m;

    /* renamed from: n, reason: collision with root package name */
    public long f199127n;

    /* renamed from: o, reason: collision with root package name */
    public long f199128o;

    /* renamed from: p, reason: collision with root package name */
    public int f199129p;

    /* renamed from: q, reason: collision with root package name */
    public int f199130q;

    /* renamed from: r, reason: collision with root package name */
    public float f199131r;

    /* renamed from: s, reason: collision with root package name */
    public float f199132s;

    /* renamed from: t, reason: collision with root package name */
    public long f199133t;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final jz5.g timeHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14394xb058b2bf(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199120d = "FinderLiveConfettiView";
        this.f199121e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199122f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199123g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199124h = new zl2.b();
        this.f199126m = true;
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.f199128o = 500L;
        this.f199131r = 1.0f;
        this.f199132s = 1.0f;
        this.timeHandler = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bd(this));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14394xb058b2bf c14394xb058b2bf) {
        android.graphics.Bitmap bitmap;
        e51.k kVar = new e51.k(c14394xb058b2bf.f199129p, c14394xb058b2bf.f199130q);
        int i17 = 0;
        try {
            java.util.List confettiBitmaps = c14394xb058b2bf.f199121e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confettiBitmaps, "confettiBitmaps");
            int size = c14394xb058b2bf.f199121e.size();
            bitmap = (android.graphics.Bitmap) kz5.n0.a0(confettiBitmaps, size <= 0 ? 0 : c06.e.f119249d.e(0, size));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14394xb058b2bf.f199120d, "[rollNextBitmap] e: " + e17.getMessage());
            bitmap = null;
        }
        if (c14394xb058b2bf.f199122f.size() > 0 && c14394xb058b2bf.f199125i > 0) {
            java.util.List customConfettiBitmaps = c14394xb058b2bf.f199122f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(customConfettiBitmaps, "customConfettiBitmaps");
            synchronized (customConfettiBitmaps) {
                java.util.List customConfettiRate = c14394xb058b2bf.f199123g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(customConfettiRate, "customConfettiRate");
                java.util.Iterator it = customConfettiRate.iterator();
                if (!it.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it.next();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) it.next();
                    int intValue = ((java.lang.Integer) next).intValue();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    next = java.lang.Integer.valueOf(intValue + num.intValue());
                }
                java.lang.Integer num2 = (java.lang.Integer) next;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                int intValue2 = (num2.intValue() < 100 ? 100 : num2).intValue();
                int e18 = intValue2 <= 0 ? 0 : c06.e.f119249d.e(0, intValue2);
                if (e18 <= num2.intValue()) {
                    java.util.List customConfettiRate2 = c14394xb058b2bf.f199123g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(customConfettiRate2, "customConfettiRate");
                    java.util.Iterator it6 = customConfettiRate2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it6.next();
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        java.lang.Integer num3 = (java.lang.Integer) next2;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num3);
                        if (e18 <= num3.intValue()) {
                            java.util.List customConfettiBitmaps2 = c14394xb058b2bf.f199122f;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(customConfettiBitmaps2, "customConfettiBitmaps");
                            android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) kz5.n0.a0(customConfettiBitmaps2, i17);
                            if (bitmap2 != null) {
                                bitmap = bitmap2;
                            }
                        } else {
                            e18 -= num3.intValue();
                            i17 = i18;
                        }
                    }
                }
            }
        }
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zc zcVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zc(bitmap, c14394xb058b2bf);
            zl2.b bVar = c14394xb058b2bf.f199124h;
            android.content.Context context = c14394xb058b2bf.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            e51.j a17 = bVar.a(context, zcVar, kVar, new g51.b(c14394xb058b2bf));
            a17.d();
            a17.g();
        }
    }

    /* renamed from: getTimeHandler */
    private final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 m57882x2d149287() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.b4) this.timeHandler.mo141623x754a37bb();
    }

    public void b(java.util.ArrayList bitmaps, java.util.ArrayList rates) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmaps, "bitmaps");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rates, "rates");
        this.f199122f.addAll(bitmaps);
        this.f199123g.addAll(rates);
        java.util.Iterator it = rates.iterator();
        while (it.hasNext()) {
            this.f199125i += ((java.lang.Number) it.next()).intValue();
        }
    }

    public void c(java.util.ArrayList bitmaps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmaps, "bitmaps");
        java.util.List list = this.f199121e;
        list.clear();
        java.util.Iterator it = bitmaps.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            int i17 = no0.i.f420260a;
            int i18 = (int) (no0.i.f420260a * this.f199131r);
            android.content.res.Resources resources = getContext().getResources();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            arrayList.add(resources);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView", "addDefaultBitmap", "(Ljava/util/ArrayList;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.e(obj, decodeResource, "com/tencent/mm/plugin/finder/live/widget/FinderLiveConfettiView", "addDefaultBitmap", "(Ljava/util/ArrayList;)V", "android/graphics/BitmapFactory_EXEC_", "decodeResource", "(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;");
            list.add(android.graphics.Bitmap.createScaledBitmap(decodeResource, i18, i18, true));
        }
    }

    public void d() {
        m57882x2d149287().d();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 m57882x2d149287 = m57882x2d149287();
        long j17 = this.f199128o;
        m57882x2d149287.c(j17, j17);
        this.f199133t = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199120d, "[start]  time = " + this.f199133t);
    }

    public void e() {
        m57882x2d149287().d();
        this.f199121e.clear();
        this.f199122f.clear();
        this.f199123g.clear();
        this.f199125i = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199120d, "[stopAndDestroy]  startTime = " + this.f199133t);
    }

    @Override // zy2.y7
    /* renamed from: getView */
    public android.widget.FrameLayout mo57883xfb86a31b() {
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* renamed from: setIconAlpha */
    public void m57884x7369a23(float f17) {
        this.f199132s = f17;
    }

    @Override // zy2.y7
    /* renamed from: setInterval */
    public void mo57885x98928347(long j17) {
        this.f199128o = j17;
    }

    @Override // zy2.y7
    /* renamed from: setScale */
    public void mo57886x53aeca08(float f17) {
        this.f199131r = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14394xb058b2bf(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199120d = "FinderLiveConfettiView";
        this.f199121e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199122f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199123g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199124h = new zl2.b();
        this.f199126m = true;
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.f199128o = 500L;
        this.f199131r = 1.0f;
        this.f199132s = 1.0f;
        this.timeHandler = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bd(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14394xb058b2bf(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f199120d = "FinderLiveConfettiView";
        this.f199121e = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199122f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199123g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f199124h = new zl2.b();
        this.f199126m = true;
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.f199128o = 500L;
        this.f199131r = 1.0f;
        this.f199132s = 1.0f;
        this.timeHandler = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bd(this));
    }
}
