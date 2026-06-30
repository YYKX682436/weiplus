package kz3;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final kz3.r f395464a;

    /* renamed from: b, reason: collision with root package name */
    public sy3.a f395465b;

    /* renamed from: c, reason: collision with root package name */
    public kz3.m f395466c;

    /* renamed from: d, reason: collision with root package name */
    public kz3.q f395467d;

    /* renamed from: e, reason: collision with root package name */
    public int f395468e;

    /* renamed from: f, reason: collision with root package name */
    public float f395469f;

    /* renamed from: g, reason: collision with root package name */
    public int f395470g;

    /* renamed from: h, reason: collision with root package name */
    public float f395471h;

    /* renamed from: i, reason: collision with root package name */
    public float f395472i;

    /* renamed from: j, reason: collision with root package name */
    public final kz3.s f395473j;

    public w(kz3.r ocrViewModel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ocrViewModel, "ocrViewModel");
        this.f395464a = ocrViewModel;
        this.f395471h = 0.01f;
        this.f395472i = 0.01f;
        this.f395473j = new kz3.s();
    }

    public final boolean a() {
        kz3.p pVar = ((kz3.l) this.f395464a).f395426k;
        return (pVar != null ? pVar.f395455w : false) || this.f395473j.f395459a;
    }

    public final void b(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageOCRZoomHelper", "onZoomStateChanged currentZoomState: %s, target: %s", java.lang.Integer.valueOf(this.f395468e), java.lang.Integer.valueOf(i17));
        if (this.f395468e != i17) {
            this.f395468e = i17;
            uy3.q qVar = ((kz3.l) this.f395464a).f395430o;
            if (qVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd c17272xd6a1a6fd = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd) qVar;
                if (i17 == 1) {
                    android.widget.ImageView imageView = c17272xd6a1a6fd.f240246e;
                    if (imageView != null) {
                        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c77);
                    }
                    android.widget.ImageView imageView2 = c17272xd6a1a6fd.f240246e;
                    if (imageView2 == null) {
                        return;
                    }
                    imageView2.setContentDescription(c17272xd6a1a6fd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i_9));
                    return;
                }
                android.widget.ImageView imageView3 = c17272xd6a1a6fd.f240246e;
                if (imageView3 != null) {
                    imageView3.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c78);
                }
                android.widget.ImageView imageView4 = c17272xd6a1a6fd.f240246e;
                if (imageView4 == null) {
                    return;
                }
                imageView4.setContentDescription(c17272xd6a1a6fd.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i__));
            }
        }
    }

    public final void c(float f17, float f18) {
        d();
        sy3.a aVar = this.f395465b;
        if (aVar == null) {
            return;
        }
        float d17 = aVar.d();
        float c17 = aVar.c();
        java.lang.Float valueOf = java.lang.Float.valueOf(d17);
        kz3.q qVar = this.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(qVar.f395456a);
        kz3.q qVar2 = this.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar2);
        java.lang.Float valueOf3 = java.lang.Float.valueOf(qVar2.f395457b);
        kz3.q qVar3 = this.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageOCRZoomHelper", "processZoom currentScale: %s, isLongImage: %s, showDoubleScale: %s, showDefaultScale: %s, scaleRate: %s, centerX: %s, centerY: %s, zoomState: %s", valueOf, valueOf2, valueOf3, java.lang.Float.valueOf(qVar3.f395458c), java.lang.Float.valueOf(c17), java.lang.Float.valueOf(f17), java.lang.Float.valueOf(f18), java.lang.Integer.valueOf(this.f395468e));
        kz3.q qVar4 = this.f395467d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar4);
        boolean z17 = qVar4.f395456a;
        kz3.s sVar = this.f395473j;
        if (!z17) {
            int i17 = this.f395468e;
            if (i17 == 1) {
                float b17 = aVar.b(f17, f18);
                sVar.getClass();
                sVar.f395460b = b17;
                sVar.f395459a = true;
                kz3.m mVar = this.f395466c;
                if (mVar != null) {
                    ((kz3.n) mVar).a(2);
                }
                b(2);
                return;
            }
            if (i17 == 2) {
                sVar.getClass();
                kz3.q qVar5 = this.f395467d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar5);
                sVar.f395460b = qVar5.f395458c;
                sVar.f395459a = true;
                kz3.m mVar2 = this.f395466c;
                if (mVar2 != null) {
                    ((kz3.n) mVar2).b(2);
                }
                b(1);
                kz3.q qVar6 = this.f395467d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar6);
                aVar.a(qVar6.f395458c, f17, f18);
                return;
            }
            return;
        }
        int i18 = this.f395468e;
        if (i18 == 1) {
            sVar.getClass();
            kz3.q qVar7 = this.f395467d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar7);
            sVar.f395460b = qVar7.f395457b;
            sVar.f395459a = true;
            kz3.m mVar3 = this.f395466c;
            if (mVar3 != null) {
                ((kz3.n) mVar3).a(2);
            }
            kz3.q qVar8 = this.f395467d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar8);
            aVar.a(qVar8.f395457b, f17, f18);
            b(2);
            return;
        }
        if (i18 == 2) {
            sVar.getClass();
            kz3.q qVar9 = this.f395467d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar9);
            sVar.f395460b = qVar9.f395458c;
            sVar.f395459a = true;
            kz3.m mVar4 = this.f395466c;
            if (mVar4 != null) {
                ((kz3.n) mVar4).b(2);
            }
            kz3.q qVar10 = this.f395467d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar10);
            aVar.a(qVar10.f395458c, f17, f18);
            b(1);
        }
    }

    public final void d() {
        if (this.f395467d == null) {
            kz3.p pVar = ((kz3.l) this.f395464a).f395426k;
            this.f395467d = pVar != null ? pVar.f395450r : new kz3.q();
        }
        if (this.f395465b instanceof kz3.z) {
            return;
        }
        kz3.q qVar = this.f395467d;
        if (qVar != null) {
            qVar.f395458c = 1.0f;
        }
        if (qVar == null) {
            return;
        }
        qVar.f395457b = 2.0f;
    }
}
