package a2;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a2.j f714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f715b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f716c;

    /* renamed from: d, reason: collision with root package name */
    public final float f717d;

    /* renamed from: e, reason: collision with root package name */
    public final float f718e;

    /* renamed from: f, reason: collision with root package name */
    public final int f719f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f720g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f721h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public g(a2.j jVar, long j17, int i17, boolean z17, kotlin.jvm.internal.i iVar) {
        boolean z18;
        int i18;
        int g17;
        int i19;
        this.f714a = jVar;
        this.f715b = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = (java.util.ArrayList) jVar.f752e;
        int size = arrayList2.size();
        float f17 = 0.0f;
        int i27 = 0;
        int i28 = 0;
        while (i27 < size) {
            a2.n nVar = (a2.n) arrayList2.get(i27);
            a2.o paragraphIntrinsics = nVar.f784a;
            int h17 = p2.c.h(j17);
            if (p2.c.c(j17)) {
                i18 = i27;
                g17 = p2.c.g(j17) - ((int) java.lang.Math.ceil(f17));
            } else {
                i18 = i27;
                g17 = p2.c.g(j17);
            }
            long b17 = p2.d.b(0, h17, 0, g17, 5, null);
            int i29 = this.f715b - i28;
            kotlin.jvm.internal.o.g(paragraphIntrinsics, "paragraphIntrinsics");
            i2.c cVar = new i2.c((i2.e) paragraphIntrinsics, i29, z17, b17, null);
            float b18 = cVar.b() + f17;
            b2.t tVar = cVar.f287850d;
            int i37 = i28 + tVar.f17317c;
            arrayList.add(new a2.m(cVar, nVar.f785b, nVar.f786c, i28, i37, f17, b18));
            if (!tVar.f17315a) {
                if (i37 == this.f715b) {
                    i19 = i18;
                    if (i19 != kz5.c0.h(this.f714a.f752e)) {
                    }
                } else {
                    i19 = i18;
                }
                f17 = b18;
                i28 = i37;
                i27 = i19 + 1;
            }
            z18 = true;
            f17 = b18;
            i28 = i37;
            break;
        }
        z18 = false;
        this.f718e = f17;
        this.f719f = i28;
        this.f716c = z18;
        this.f721h = arrayList;
        this.f717d = p2.c.h(j17);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i38 = 0; i38 < size2; i38++) {
            a2.m mVar = (a2.m) arrayList.get(i38);
            java.util.List list = ((i2.c) mVar.f773a).f287851e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            int size3 = list.size();
            for (int i39 = 0; i39 < size3; i39++) {
                d1.g gVar = (d1.g) list.get(i39);
                arrayList4.add(gVar != null ? mVar.a(gVar) : null);
            }
            kz5.h0.u(arrayList3, arrayList4);
        }
        int size4 = arrayList3.size();
        java.util.ArrayList arrayList5 = arrayList3;
        if (size4 < this.f714a.f749b.size()) {
            int size5 = this.f714a.f749b.size() - arrayList3.size();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(size5);
            for (int i47 = 0; i47 < size5; i47++) {
                arrayList6.add(null);
            }
            arrayList5 = kz5.n0.t0(arrayList3, arrayList6);
        }
        this.f720g = arrayList5;
    }

    public final void a(e1.u canvas, e1.r brush, e1.z0 z0Var, l2.g gVar) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(brush, "brush");
        canvas.c();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f721h;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            a2.m mVar = (a2.m) arrayList.get(i17);
            i2.c cVar = (i2.c) mVar.f773a;
            cVar.getClass();
            i2.f fVar = cVar.f287847a.f287856c;
            long j17 = cVar.f287849c;
            fVar.a(brush, d1.l.a(p2.c.h(j17), cVar.b()));
            fVar.c(z0Var);
            fVar.d(gVar);
            android.graphics.Canvas canvas2 = e1.c.f246229a;
            android.graphics.Canvas canvas3 = ((e1.b) canvas).f246225a;
            b2.t tVar = cVar.f287850d;
            if (tVar.f17315a) {
                canvas3.save();
                canvas3.clipRect(0.0f, 0.0f, p2.c.h(j17), cVar.b());
            }
            tVar.f(canvas3);
            if (tVar.f17315a) {
                canvas3.restore();
            }
            canvas.e(0.0f, ((i2.c) mVar.f773a).b());
        }
        canvas.b();
    }

    public final void b(e1.u canvas, long j17, e1.z0 z0Var, l2.g gVar) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.c();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f721h;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            a2.m mVar = (a2.m) arrayList.get(i17);
            i2.c cVar = (i2.c) mVar.f773a;
            cVar.getClass();
            i2.f fVar = cVar.f287847a.f287856c;
            fVar.b(j17);
            fVar.c(z0Var);
            fVar.d(gVar);
            android.graphics.Canvas canvas2 = e1.c.f246229a;
            android.graphics.Canvas canvas3 = ((e1.b) canvas).f246225a;
            b2.t tVar = cVar.f287850d;
            if (tVar.f17315a) {
                canvas3.save();
                canvas3.clipRect(0.0f, 0.0f, p2.c.h(cVar.f287849c), cVar.b());
            }
            tVar.f(canvas3);
            if (tVar.f17315a) {
                canvas3.restore();
            }
            canvas.e(0.0f, ((i2.c) mVar.f773a).b());
        }
        canvas.b();
    }

    public final void c(int i17) {
        a2.j jVar = this.f714a;
        boolean z17 = false;
        if (i17 >= 0 && i17 <= jVar.f748a.f681d.length()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("offset(" + i17 + ") is out of bounds [0, " + jVar.f748a.length() + ']').toString());
    }

    public final void d(int i17) {
        boolean z17 = false;
        if (i17 >= 0 && i17 < this.f719f) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("lineIndex(" + i17 + ") is out of bounds [0, " + i17 + ')').toString());
    }
}
