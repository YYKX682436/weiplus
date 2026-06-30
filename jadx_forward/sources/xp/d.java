package xp;

/* loaded from: classes10.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static xp.i f537362j;

    /* renamed from: k, reason: collision with root package name */
    public static wp.d f537363k;

    /* renamed from: l, reason: collision with root package name */
    public static final android.text.TextPaint f537364l = new android.text.TextPaint();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f537365m = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final zp.g f537366a;

    /* renamed from: c, reason: collision with root package name */
    public final xp.g f537368c;

    /* renamed from: d, reason: collision with root package name */
    public final xp.f f537369d;

    /* renamed from: e, reason: collision with root package name */
    public final xp.e f537370e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f537371f;

    /* renamed from: h, reason: collision with root package name */
    public final xp.a f537373h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f537374i;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f537367b = new android.util.SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final yp.h f537372g = new yp.h();

    public d(xp.c cVar, xp.b bVar) {
        this.f537374i = "";
        cVar.getClass();
        xp.g gVar = cVar.f537356a;
        this.f537368c = gVar;
        this.f537369d = cVar.f537357b;
        this.f537370e = cVar.f537359d;
        this.f537373h = cVar.f537361f;
        this.f537374i = cVar.f537360e;
        this.f537366a = new zp.g();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f537371f = arrayList;
        arrayList.addAll(cVar.f537358c);
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("Danmaku module need an IDanmakuPlayTimeSupplier or is live setter for computing timeline");
        }
    }

    public static android.content.Context b() {
        android.content.Context context = vp.c.f520269a;
        if (context != null) {
            return context;
        }
        throw new java.lang.RuntimeException("Danmaku not init, please call DanmakuConfig.init()");
    }

    public static xp.i f() {
        if (f537362j == null) {
            synchronized (xp.d.class) {
                xp.i iVar = f537362j;
            }
        }
        if (f537362j == null) {
            f537362j = new xp.i();
        }
        return f537362j;
    }

    public void a() {
        zp.g gVar = this.f537366a;
        synchronized (gVar) {
            gVar.f556445a.trimToSize(0);
        }
    }

    public yp.a c(wp.a aVar) {
        yp.a aVar2;
        java.util.Iterator it = ((java.util.ArrayList) this.f537371f).iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar2 = null;
                break;
            }
            aVar2 = (yp.a) it.next();
            if (aVar2.a(aVar)) {
                break;
            }
        }
        return aVar2 == null ? this.f537372g : aVar2;
    }

    public xp.h d(int i17) {
        xp.h hVar = (xp.h) this.f537367b.get(i17);
        if (hVar == null) {
            synchronized (xp.d.class) {
                hVar = (xp.h) this.f537367b.get(i17);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (f537363k == null) {
            synchronized (xp.d.class) {
                if (f537363k == null) {
                    f537363k = new wp.d();
                }
            }
        }
        return f537363k;
    }

    public int e() {
        float f17 = f().f537388l;
        android.text.TextPaint textPaint = f537364l;
        textPaint.setTextSize(f17);
        java.util.HashMap hashMap = (java.util.HashMap) f537365m;
        java.lang.Float f18 = (java.lang.Float) hashMap.get(java.lang.Float.valueOf(f17));
        if (f18 == null) {
            android.graphics.Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            f18 = java.lang.Float.valueOf((fontMetrics.descent - fontMetrics.ascent) + fontMetrics.leading);
            hashMap.put(java.lang.Float.valueOf(f17), f18);
        }
        return (int) java.lang.Math.ceil(f18.floatValue() + (f().f537380d * 2) + (r0.f537389m * 2.0f) + (r0.f537390n * 2.0f));
    }

    public boolean g() {
        xp.g gVar = this.f537368c;
        return (gVar == null ? -1L : gVar.a()) < 0;
    }
}
