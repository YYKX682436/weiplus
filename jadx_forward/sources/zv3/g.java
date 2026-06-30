package zv3;

/* loaded from: classes10.dex */
public final class g implements zv3.b {

    /* renamed from: a, reason: collision with root package name */
    public final zv3.d f557978a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f557979b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f557980c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Canvas f557981d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Bitmap f557982e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Canvas f557983f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Matrix f557984g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f557985h;

    /* renamed from: i, reason: collision with root package name */
    public final wu3.o0 f557986i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Matrix f557987j;

    /* renamed from: k, reason: collision with root package name */
    public final zv3.e f557988k;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
    
        if ((r6[3] == 0.0f) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x033e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(zv3.d r35) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zv3.g.<init>(zv3.d):void");
    }

    @Override // zv3.b
    public zv3.a a() {
        long j17;
        android.graphics.Bitmap bitmap;
        if (this.f557978a.f557964c.size() == 0) {
            return null;
        }
        android.graphics.Canvas canvas = this.f557981d;
        int save = canvas.save();
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        canvas.concat(this.f557987j);
        zv3.e eVar = this.f557988k;
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        eVar.f557972a = canvas.save();
        canvas.concat(eVar.f557973b);
        try {
            j17 = this.f557986i.a(canvas, this.f557979b);
        } catch (java.lang.Exception unused) {
            j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        int i17 = eVar.f557972a;
        if (i17 < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RetrieverTransform", "canvas restore saveCount: " + eVar.f557972a);
        } else {
            canvas.restoreToCount(i17);
        }
        if (save < 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StoryFrameRetriever", "canvas restore saveCount: " + save);
        } else {
            canvas.restoreToCount(save);
        }
        android.graphics.Canvas canvas2 = this.f557983f;
        android.graphics.Bitmap bitmap2 = this.f557980c;
        if (canvas2 == null || (bitmap = this.f557982e) == null) {
            return new zv3.a(bitmap2, j17);
        }
        if (canvas2 != null) {
            canvas2.drawColor(0, android.graphics.PorterDuff.Mode.MULTIPLY);
        }
        if (canvas2 != null) {
            canvas2.save();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canvas2);
        canvas2.drawBitmap(bitmap2, this.f557984g, null);
        if (canvas2 != null) {
            canvas2.restore();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
        return new zv3.a(bitmap, j17);
    }

    public final float b(int i17, int i18, float f17, float f18) {
        float f19 = i17 / f17;
        float f27 = i18 / f18;
        if ((f19 == f27) || i17 > i18) {
            return f19;
        }
        if (f19 < f27) {
            return f27;
        }
        if (f19 > f27) {
            return f19;
        }
        return 1.0f;
    }

    public final void c() {
        try {
            java.util.Iterator it = this.f557978a.f557964c.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).b();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryFrameRetriever", e17, "destroy error", new java.lang.Object[0]);
        }
    }

    public final void d() {
        try {
            java.util.Iterator it = this.f557978a.f557964c.iterator();
            while (it.hasNext()) {
                ((av3.a) it.next()).d();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.StoryFrameRetriever", e17, "start error", new java.lang.Object[0]);
        }
    }
}
