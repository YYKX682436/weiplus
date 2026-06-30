package xk0;

/* loaded from: classes10.dex */
public class c implements java.lang.Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final float f536454i;

    /* renamed from: m, reason: collision with root package name */
    public static final float f536455m;

    /* renamed from: n, reason: collision with root package name */
    public static final android.graphics.Path f536456n;

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Path f536457o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f536458p;

    /* renamed from: q, reason: collision with root package name */
    public static final android.graphics.Paint f536459q;

    /* renamed from: r, reason: collision with root package name */
    public static final android.graphics.Paint f536460r;

    /* renamed from: s, reason: collision with root package name */
    public static final android.graphics.Paint f536461s;

    /* renamed from: t, reason: collision with root package name */
    public static final android.graphics.Paint f536462t;

    /* renamed from: u, reason: collision with root package name */
    public static final android.graphics.Rect f536463u;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Rect f536464d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f536465e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Matrix f536466f;

    /* renamed from: g, reason: collision with root package name */
    public int f536467g;

    /* renamed from: h, reason: collision with root package name */
    public int f536468h;

    static {
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561681pn);
        int dimension2 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561680pm);
        float dimension3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561789sp);
        f536454i = dimension3;
        f536455m = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561788so);
        f536456n = new android.graphics.Path();
        f536457o = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        f536458p = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f536459q = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        f536460r = paint3;
        android.graphics.Paint paint4 = new android.graphics.Paint();
        f536461s = paint4;
        android.graphics.Paint paint5 = new android.graphics.Paint();
        f536462t = paint5;
        f536463u = new android.graphics.Rect();
        paint3.setColor(-16777216);
        paint.setColor(-1);
        paint.setStrokeWidth(dimension);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint4.set(paint);
        paint4.setStrokeWidth(dimension2);
        paint5.set(paint);
        paint5.setStrokeWidth(dimension3);
        paint2.set(paint);
        paint2.setStrokeWidth(dimension * 7);
        paint2.setColor(549174203);
    }

    public c(android.graphics.Rect rect) {
        new android.graphics.Rect();
        this.f536465e = new android.graphics.Rect();
        this.f536466f = new android.graphics.Matrix();
        this.f536467g = 1;
        this.f536468h = 1;
        this.f536464d = rect;
    }

    /* renamed from: clone */
    public java.lang.Object m175633x5a5dd5d() {
        return super.clone();
    }

    public c() {
        new android.graphics.Rect();
        this.f536465e = new android.graphics.Rect();
        this.f536466f = new android.graphics.Matrix();
        this.f536467g = 1;
        this.f536468h = 1;
    }
}
