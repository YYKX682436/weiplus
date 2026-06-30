package h7;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final s6.b f360882a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f360883b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f360884c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p147xb1cd08cc.p148x5de23a5.r f360885d;

    /* renamed from: e, reason: collision with root package name */
    public final x6.d f360886e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360887f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f360888g;

    /* renamed from: h, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.o f360889h;

    /* renamed from: i, reason: collision with root package name */
    public h7.j f360890i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f360891j;

    /* renamed from: k, reason: collision with root package name */
    public h7.j f360892k;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Bitmap f360893l;

    /* renamed from: m, reason: collision with root package name */
    public h7.j f360894m;

    /* renamed from: n, reason: collision with root package name */
    public int f360895n;

    /* renamed from: o, reason: collision with root package name */
    public int f360896o;

    /* renamed from: p, reason: collision with root package name */
    public int f360897p;

    public m(com.p147xb1cd08cc.p148x5de23a5.c cVar, s6.b bVar, int i17, int i18, t6.p pVar, android.graphics.Bitmap bitmap) {
        x6.d dVar = cVar.f125455d;
        com.p147xb1cd08cc.p148x5de23a5.f fVar = cVar.f125457f;
        com.p147xb1cd08cc.p148x5de23a5.r d17 = com.p147xb1cd08cc.p148x5de23a5.c.d(fVar.getBaseContext());
        com.p147xb1cd08cc.p148x5de23a5.r d18 = com.p147xb1cd08cc.p148x5de23a5.c.d(fVar.getBaseContext());
        d18.getClass();
        com.p147xb1cd08cc.p148x5de23a5.o p17 = new com.p147xb1cd08cc.p148x5de23a5.o(d18.f125515d, d18, android.graphics.Bitmap.class, d18.f125516e).p(com.p147xb1cd08cc.p148x5de23a5.r.f125514r).p(((m7.e) ((m7.e) ((m7.e) new m7.e().d(w6.z.f524784a)).o(true)).l(true)).g(i17, i18));
        this.f360884c = new java.util.ArrayList();
        this.f360885d = d17;
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper(), new h7.l(this));
        this.f360886e = dVar;
        this.f360883b = handler;
        this.f360889h = p17;
        this.f360882a = bVar;
        c(pVar, bitmap);
    }

    public final void a() {
        int i17;
        if (!this.f360887f || this.f360888g) {
            return;
        }
        h7.j jVar = this.f360894m;
        if (jVar != null) {
            this.f360894m = null;
            b(jVar);
            return;
        }
        this.f360888g = true;
        s6.b bVar = this.f360882a;
        s6.f fVar = (s6.f) bVar;
        int i18 = fVar.f484837l.f484813c;
        long uptimeMillis = android.os.SystemClock.uptimeMillis() + ((i18 <= 0 || (i17 = fVar.f484836k) < 0) ? 0 : (i17 < 0 || i17 >= i18) ? -1 : ((s6.c) ((java.util.ArrayList) r4.f484815e).get(i17)).f484808i);
        int i19 = (fVar.f484836k + 1) % fVar.f484837l.f484813c;
        fVar.f484836k = i19;
        this.f360892k = new h7.j(this.f360883b, i19, uptimeMillis);
        com.p147xb1cd08cc.p148x5de23a5.o p17 = this.f360889h.p((m7.e) new m7.e().k(new p7.b(java.lang.Double.valueOf(java.lang.Math.random()))));
        p17.L = bVar;
        p17.M = true;
        p17.r(this.f360892k, null, p17, q7.i.f441831a);
    }

    public void b(h7.j jVar) {
        this.f360888g = false;
        boolean z17 = this.f360891j;
        android.os.Handler handler = this.f360883b;
        if (z17) {
            handler.obtainMessage(2, jVar).sendToTarget();
            return;
        }
        if (!this.f360887f) {
            this.f360894m = jVar;
            return;
        }
        if (jVar.f360880m != null) {
            android.graphics.Bitmap bitmap = this.f360893l;
            if (bitmap != null) {
                this.f360886e.b(bitmap);
                this.f360893l = null;
            }
            h7.j jVar2 = this.f360890i;
            this.f360890i = jVar;
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f360884c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                h7.f fVar = (h7.f) ((h7.k) arrayList.get(size));
                java.lang.Object callback = fVar.getCallback();
                while (callback instanceof android.graphics.drawable.Drawable) {
                    callback = ((android.graphics.drawable.Drawable) callback).getCallback();
                }
                if (callback == null) {
                    fVar.stop();
                    fVar.invalidateSelf();
                } else {
                    fVar.invalidateSelf();
                    h7.j jVar3 = fVar.f360866d.f360865a.f360890i;
                    if ((jVar3 != null ? jVar3.f360878h : -1) == ((s6.f) r6.f360882a).f484837l.f484813c - 1) {
                        fVar.f360871i++;
                    }
                    int i17 = fVar.f360872m;
                    if (i17 != -1 && fVar.f360871i >= i17) {
                        fVar.stop();
                    }
                }
            }
            if (jVar2 != null) {
                handler.obtainMessage(2, jVar2).sendToTarget();
            }
        }
        a();
    }

    public void c(t6.p pVar, android.graphics.Bitmap bitmap) {
        q7.n.b(pVar);
        q7.n.b(bitmap);
        this.f360893l = bitmap;
        this.f360889h = this.f360889h.p(new m7.e().n(pVar, true));
        this.f360895n = q7.p.c(bitmap);
        this.f360896o = bitmap.getWidth();
        this.f360897p = bitmap.getHeight();
    }
}
