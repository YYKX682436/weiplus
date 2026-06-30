package av3;

/* loaded from: classes10.dex */
public final class f extends av3.h {
    public long A;

    /* renamed from: z, reason: collision with root package name */
    public final long f95762z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List lyricsBitmaps, android.graphics.Matrix matrix, long j17) {
        super(lyricsBitmaps, matrix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lyricsBitmaps, "lyricsBitmaps");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95762z = j17;
    }

    @Override // av3.h, av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        canvas.save();
        av3.g gVar = (av3.g) kz5.n0.a0(this.f95765e, this.f95766f);
        android.graphics.Bitmap bitmap = gVar != null ? gVar.f95764b : null;
        if (bitmap != null) {
            k();
            i();
            paint.setAlpha(this.f95769i);
            canvas.concat(this.f95744a);
            h(canvas);
            canvas.drawBitmap(bitmap, 0.0f, this.f95780t, paint);
            paint.setAlpha(255);
        }
        canvas.restore();
    }

    @Override // av3.a
    public void f(long j17) {
        this.A = j17;
        while (true) {
            long j18 = this.A;
            long j19 = this.f95762z;
            long j27 = this.f95774n;
            java.util.List list = this.f95765e;
            if (j18 <= (j19 > 0 ? j19 : ((av3.g) kz5.n0.i0(list)).f95763a.f456701e + j27)) {
                this.f95747d = j17;
                return;
            }
            long j28 = this.A;
            if (j19 <= 0) {
                j19 = ((av3.g) kz5.n0.i0(list)).f95763a.f456701e + j27;
            }
            this.A = j28 - j19;
        }
    }

    @Override // av3.h
    public void h(android.graphics.Canvas canvas) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.util.List list = this.f95765e;
        if (!list.isEmpty()) {
            long j17 = this.f95768h;
            android.graphics.RectF[] rectFArr = this.f95783w;
            if (j17 == 0 || this.A - j17 > this.f95772l) {
                this.f95768h = this.A;
                int length = rectFArr.length;
                float f17 = 0.0f;
                int i18 = 0;
                int i19 = 0;
                while (i18 < length) {
                    android.graphics.RectF rectF = rectFArr[i18];
                    int i27 = i19 + 1;
                    float height = rectF.height();
                    int i28 = this.f95778r;
                    float f18 = i28;
                    float f19 = this.f95777q;
                    float[] fArr = this.f95784x;
                    if (height <= f18) {
                        i17 = i19;
                        fArr[i17] = (float) (f19 * java.lang.Math.random());
                    } else {
                        i17 = i19;
                        if (height >= fArr[i17]) {
                            fArr[i17] = i28;
                        }
                    }
                    float min = height <= fArr[i17] ? java.lang.Math.min(height + this.f95781u, f19) : java.lang.Math.max(height - this.f95782v, i28);
                    float f27 = this.f95779s;
                    float f28 = 2;
                    float f29 = min / f28;
                    rectF.set(f17 + f27, (f19 / f28) - f29, f17 + f27 + this.f95776p, (f19 / f28) + f29);
                    f17 = rectF.right;
                    i18++;
                    i19 = i27;
                }
            }
            j(((av3.g) list.get(0)).f95763a.f456701e);
            android.graphics.Paint paint = this.f95785y;
            paint.setAlpha(this.f95770j);
            for (android.graphics.RectF rectF2 : rectFArr) {
                canvas.drawRect(rectF2, paint);
            }
        }
    }

    @Override // av3.h
    public void i() {
        r45.ge4 ge4Var;
        int i17 = this.f95766f;
        java.util.List list = this.f95765e;
        if (i17 < list.size()) {
            long j17 = ((av3.g) list.get(this.f95766f)).f95763a.f456701e;
            av3.g gVar = (av3.g) kz5.n0.a0(list, this.f95766f + 1);
            long j18 = (gVar == null || (ge4Var = gVar.f95763a) == null) ? ((av3.g) list.get(this.f95766f)).f95763a.f456701e + this.f95774n : ge4Var.f456701e;
            long j19 = this.A;
            long j27 = j19 - j17;
            long j28 = this.f95773m;
            if (0 <= j27 && j27 <= j28) {
                this.f95769i = (int) ((255 * ((float) (j19 - j17))) / ((float) j28));
                return;
            }
            long j29 = j18 - j19;
            if (0 <= j29 && j29 <= j28) {
                this.f95769i = (int) (255 * (((float) (j18 - j19)) / ((float) j28)));
            } else if (j19 - j17 <= j28 || j18 - j19 <= j28) {
                this.f95769i = 0;
            } else {
                this.f95769i = 255;
            }
        }
    }

    @Override // av3.h
    public void j(long j17) {
        if (this.f95770j < 255) {
            long j18 = this.f95747d - j17;
            boolean z17 = false;
            long j19 = this.f95773m;
            if (0 <= j18 && j18 <= j19) {
                z17 = true;
            }
            if (z17) {
                this.f95770j = (int) ((255 * ((float) (this.A - j17))) / ((float) j19));
            } else if (this.A - j17 > j19) {
                this.f95770j = 255;
            }
        }
    }

    @Override // av3.h
    public void k() {
        int i17;
        java.util.List list = this.f95765e;
        if (list.isEmpty()) {
            return;
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (this.A >= ((av3.g) listIterator.previous()).f95763a.f456701e) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        this.f95766f = java.lang.Math.max(0, i17);
    }
}
