package xk0;

/* loaded from: classes10.dex */
public class d implements java.lang.Cloneable {

    /* renamed from: o, reason: collision with root package name */
    public static final android.graphics.Paint f536469o;

    /* renamed from: p, reason: collision with root package name */
    public static final android.graphics.Paint f536470p;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f536471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536472e;

    /* renamed from: f, reason: collision with root package name */
    public final float f536473f;

    /* renamed from: g, reason: collision with root package name */
    public final float f536474g = cm5.h.b(5.0f);

    /* renamed from: h, reason: collision with root package name */
    public final float f536475h = cm5.h.b(9.0f);

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f536476i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f536477m = false;

    /* renamed from: n, reason: collision with root package name */
    public long f536478n;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f536469o = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        f536470p = paint2;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.STROKE);
        paint2.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint2.setColor(-1);
    }

    public d(android.graphics.Path path, float f17, int i17) {
        this.f536473f = 1.0f;
        this.f536471d = path;
        this.f536473f = f17;
        this.f536472e = i17;
    }

    public void a(android.graphics.Canvas canvas) {
        android.graphics.Paint paint = f536469o;
        paint.setColor(this.f536472e);
        float f17 = this.f536474g;
        float f18 = this.f536473f;
        paint.setStrokeWidth(f17 * f18);
        android.graphics.Paint paint2 = f536470p;
        paint2.setStrokeWidth(this.f536475h * f18);
        boolean z17 = this.f536477m;
        android.graphics.Path path = this.f536471d;
        if (z17) {
            paint.setAlpha(150);
            canvas.drawPath(path, paint2);
        } else {
            paint.setAlpha(255);
        }
        if (path.isEmpty()) {
            return;
        }
        canvas.drawPath(path, paint);
    }
}
