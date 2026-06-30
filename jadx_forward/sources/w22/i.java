package w22;

/* loaded from: classes10.dex */
public final class i implements r22.e {

    /* renamed from: a, reason: collision with root package name */
    public final r22.f f524077a;

    /* renamed from: b, reason: collision with root package name */
    public final bw3.e f524078b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.RectF f524079c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f524080d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f524081e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f524082f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f524083g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f524084h;

    /* renamed from: i, reason: collision with root package name */
    public float f524085i;

    /* renamed from: j, reason: collision with root package name */
    public float f524086j;

    /* renamed from: k, reason: collision with root package name */
    public float f524087k;

    /* renamed from: l, reason: collision with root package name */
    public final float f524088l;

    /* renamed from: m, reason: collision with root package name */
    public final float f524089m;

    /* renamed from: n, reason: collision with root package name */
    public final float f524090n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f524091o;

    /* JADX WARN: Multi-variable type inference failed */
    public i(r22.f view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f524077a = view;
        bw3.e eVar = new bw3.e();
        this.f524078b = eVar;
        this.f524079c = new android.graphics.RectF();
        this.f524080d = new android.graphics.Path();
        this.f524081e = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f524082f = paint;
        this.f524084h = true;
        this.f524085i = 1.0f;
        this.f524086j = 2.0f;
        this.f524087k = 0.25f;
        this.f524091o = new float[2];
        android.content.res.Resources resources = ((android.view.View) view).getContext().getResources();
        eVar.f106460q = this.f524086j;
        eVar.f106461r = this.f524087k;
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561867uv));
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f524088l = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561867uv);
        this.f524089m = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561865ut);
        this.f524090n = resources.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561866uu);
    }

    public final void a() {
        bw3.e eVar = this.f524078b;
        eVar.f106450g.reset();
        android.graphics.Matrix matrix = eVar.f106450g;
        android.graphics.Rect rect = this.f524081e;
        matrix.postTranslate((-rect.width()) / 2.0f, (-rect.height()) / 2.0f);
        android.graphics.RectF rectF = this.f524079c;
        if (!rectF.isEmpty() && !rect.isEmpty()) {
            float width = rectF.width() / java.lang.Math.max(rect.width(), rect.height());
            this.f524085i = width;
            float f17 = 0.5f * width;
            float f18 = 2.0f * width;
            this.f524086j = f18;
            float f19 = width * 0.25f;
            this.f524087k = f19;
            eVar.f106460q = f18;
            eVar.f106461r = f19;
            eVar.f106450g.postScale(f17, f17);
        }
        float f27 = 2;
        eVar.f106450g.postTranslate((rectF.left + rectF.right) / f27, (rectF.top + rectF.bottom) / f27);
    }
}
