package oh2;

/* loaded from: classes10.dex */
public final class f extends oh2.d {

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f426903x;

    /* renamed from: y, reason: collision with root package name */
    public oh2.e f426904y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f426903x = "FinderLiveNormalRoomHorizontalLyricsDrawer";
        this.f426904y = oh2.e.f426899d;
        this.f426896u = i65.a.a(context, 24.0f);
        this.f426897v = i65.a.a(context, 24.0f);
        this.f426894s = (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x - this.f426896u) - this.f426897v;
        this.f426895t = i65.a.a(context, 80.0f);
    }

    @Override // oh2.d
    public void a(my5.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        super.a(data);
        if (data.b() > 0) {
            this.f426886k = 0;
            this.f426887l = -1;
            this.f426888m = this.f426889n - 1;
            this.f426890o = 0.0f;
            this.f426891p = this.f426876a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    @Override // oh2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.graphics.Canvas r18, int r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oh2.f.c(android.graphics.Canvas, int):void");
    }

    @Override // oh2.d
    public java.lang.String e() {
        return this.f426903x;
    }

    @Override // oh2.d
    public void h() {
        this.f426886k = -1;
        this.f426890o = 0.0f;
        float f17 = this.f426876a;
        this.f426891p = f17;
        this.f426892q = f17;
        this.f426887l = -1;
        this.f426888m = this.f426889n - 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomHorizontalLyricsDrawer", "reset");
    }

    @Override // oh2.d
    public void k(int i17) {
        b(i17 * (this.f426879d + this.f426880e), true).start();
    }

    @Override // oh2.d
    public void l(int i17, float f17) {
        float f18 = i17;
        float f19 = this.f426885j;
        float f27 = f18 * f19 * 2;
        int ordinal = this.f426904y.ordinal();
        if (ordinal == 0) {
            this.f426896u = f18 * f19;
            this.f426897v = f18 * f19;
        } else if (ordinal == 1) {
            this.f426896u = 0.0f;
            this.f426897v = f27;
        } else if (ordinal == 2) {
            this.f426896u = f27;
            this.f426897v = 0.0f;
        }
        super.l(i17, f17);
    }

    public final float m(my5.c cVar, int i17) {
        long j17 = i17;
        if (j17 < cVar.f414391b) {
            return 0.0f;
        }
        int d17 = d(cVar, i17);
        android.graphics.Paint paint = this.f426881f;
        if (d17 < 0) {
            return paint.measureText(cVar.f414390a);
        }
        my5.b bVar = (my5.b) cVar.f414393d.get(d17);
        java.lang.String mText = cVar.f414390a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mText, "mText");
        java.lang.String substring = mText.substring(0, bVar.f414388c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.String mText2 = cVar.f414390a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mText2, "mText");
        java.lang.String substring2 = mText2.substring(bVar.f414388c, bVar.f414389d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        float measureText = paint.measureText(substring);
        float f17 = ((float) (j17 - bVar.f414386a)) / ((float) bVar.f414387b);
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        return measureText + (paint.measureText(substring2) * f17);
    }
}
