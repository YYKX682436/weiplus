package av3;

/* loaded from: classes10.dex */
public final class e extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f95759e;

    /* renamed from: f, reason: collision with root package name */
    public wq.d f95760f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f95761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, android.graphics.Matrix matrix) {
        super(matrix);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        this.f95759e = emojiInfo;
    }

    @Override // av3.a
    public long a(long j17) {
        return super.a(j17);
    }

    @Override // av3.a
    public void b() {
        wq.d dVar = this.f95760f;
        if (dVar != null) {
            dVar.mo174305x5cd39ffa();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
            throw null;
        }
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paint, "paint");
        if (g()) {
            canvas.save();
            canvas.concat(this.f95744a);
            android.graphics.Bitmap bitmap = this.f95761g;
            if (bitmap != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo = this.f95759e;
        emojiInfo.N0();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b1) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d6.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        this.f95760f = com.p314xaae8f345.mm.p679x5c28046.p680xb06291ee.C10437x90aa8ac9.INSTANCE.m43681x99bce80e((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) emojiInfo);
    }

    @Override // av3.a
    public long e() {
        wq.d dVar = this.f95760f;
        if (dVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
            throw null;
        }
        dVar.c();
        wq.d dVar2 = this.f95760f;
        if (dVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
            throw null;
        }
        this.f95761g = dVar2.mo174306x74704fb7();
        if (this.f95760f != null) {
            return r0.a();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
        throw null;
    }

    @Override // av3.a
    public void f(long j17) {
        this.f95747d = j17;
        if (g()) {
            wq.d dVar = this.f95760f;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
                throw null;
            }
            dVar.mo174307xc9fc1b13(j17);
            wq.d dVar2 = this.f95760f;
            if (dVar2 != null) {
                this.f95761g = dVar2.mo174306x74704fb7();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("decoder");
                throw null;
            }
        }
    }
}
