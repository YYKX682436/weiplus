package kx0;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f394793a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f394794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f394795c;

    /* renamed from: d, reason: collision with root package name */
    public final int f394796d;

    /* renamed from: e, reason: collision with root package name */
    public final int f394797e;

    /* renamed from: f, reason: collision with root package name */
    public final int f394798f;

    /* renamed from: g, reason: collision with root package name */
    public final int f394799g;

    /* renamed from: h, reason: collision with root package name */
    public final android.util.SizeF f394800h;

    /* renamed from: i, reason: collision with root package name */
    public final android.util.SizeF f394801i;

    /* renamed from: j, reason: collision with root package name */
    public final android.util.SizeF f394802j;

    /* renamed from: k, reason: collision with root package name */
    public final android.util.SizeF f394803k;

    /* renamed from: l, reason: collision with root package name */
    public final android.util.SizeF f394804l;

    /* renamed from: n, reason: collision with root package name */
    public final float f394806n;

    /* renamed from: o, reason: collision with root package name */
    public final float f394807o;

    /* renamed from: p, reason: collision with root package name */
    public float f394808p;

    /* renamed from: r, reason: collision with root package name */
    public final float f394810r;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f394805m = new android.graphics.RectF();

    /* renamed from: q, reason: collision with root package name */
    public float f394809q = 0.0f;

    public i(android.content.Context context, kx0.h hVar) {
        if (hVar == kx0.h.RECORD) {
            this.f394793a = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cpn, null);
            this.f394794b = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563418cp5, null);
            this.f394795c = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            this.f394796d = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            this.f394797e = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.adx);
            this.f394798f = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560930ad0);
            this.f394799g = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.ae9);
            this.f394800h = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja));
            this.f394801i = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja));
            this.f394802j = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aja));
            this.f394803k = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aht), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aht));
            android.util.SizeF sizeF = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562089aj4), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562089aj4));
            this.f394804l = sizeF;
            float f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ajc);
            this.f394806n = f17;
            this.f394807o = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.ajb);
            this.f394810r = java.lang.Math.min(f17 - (sizeF.getWidth() / 2.0f), 12.0f);
            return;
        }
        this.f394793a = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8h, null);
        this.f394794b = j65.q.a(context).getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a8h, null);
        this.f394795c = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560930ad0);
        this.f394796d = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.a6p);
        this.f394797e = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560930ad0);
        this.f394798f = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560930ad0);
        this.f394799g = i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560929a23);
        this.f394800h = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj7), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj7));
        this.f394801i = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj8), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj8));
        this.f394802j = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj7), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj7));
        this.f394803k = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562090aj5), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562090aj5));
        android.util.SizeF sizeF2 = new android.util.SizeF(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj6), i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj6));
        this.f394804l = sizeF2;
        float f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj_);
        this.f394806n = f18;
        this.f394807o = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aj9);
        this.f394810r = java.lang.Math.min(f18 - (sizeF2.getWidth() / 2.0f), 8.0f);
    }
}
