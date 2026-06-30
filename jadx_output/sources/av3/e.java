package av3;

/* loaded from: classes10.dex */
public final class e extends av3.a {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.api.IEmojiInfo f14226e;

    /* renamed from: f, reason: collision with root package name */
    public wq.d f14227f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f14228g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.api.IEmojiInfo emojiInfo, android.graphics.Matrix matrix) {
        super(matrix);
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        kotlin.jvm.internal.o.g(matrix, "matrix");
        this.f14226e = emojiInfo;
    }

    @Override // av3.a
    public long a(long j17) {
        return super.a(j17);
    }

    @Override // av3.a
    public void b() {
        wq.d dVar = this.f14227f;
        if (dVar != null) {
            dVar.destroy();
        } else {
            kotlin.jvm.internal.o.o("decoder");
            throw null;
        }
    }

    @Override // av3.a
    public void c(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        kotlin.jvm.internal.o.g(paint, "paint");
        if (g()) {
            canvas.save();
            canvas.concat(this.f14211a);
            android.graphics.Bitmap bitmap = this.f14228g;
            if (bitmap != null) {
                kotlin.jvm.internal.o.d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            }
            canvas.restore();
        }
    }

    @Override // av3.a
    public void d() {
        com.tencent.mm.api.IEmojiInfo emojiInfo = this.f14226e;
        emojiInfo.N0();
        ((com.tencent.mm.feature.emoji.b1) ((com.tencent.mm.feature.emoji.api.d6) i95.n0.c(com.tencent.mm.feature.emoji.api.d6.class))).getClass();
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        this.f14227f = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.getDecoder((com.tencent.mm.storage.emotion.EmojiInfo) emojiInfo);
    }

    @Override // av3.a
    public long e() {
        wq.d dVar = this.f14227f;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("decoder");
            throw null;
        }
        dVar.c();
        wq.d dVar2 = this.f14227f;
        if (dVar2 == null) {
            kotlin.jvm.internal.o.o("decoder");
            throw null;
        }
        this.f14228g = dVar2.getFrame();
        if (this.f14227f != null) {
            return r0.a();
        }
        kotlin.jvm.internal.o.o("decoder");
        throw null;
    }

    @Override // av3.a
    public void f(long j17) {
        this.f14214d = j17;
        if (g()) {
            wq.d dVar = this.f14227f;
            if (dVar == null) {
                kotlin.jvm.internal.o.o("decoder");
                throw null;
            }
            dVar.seekTo(j17);
            wq.d dVar2 = this.f14227f;
            if (dVar2 != null) {
                this.f14228g = dVar2.getFrame();
            } else {
                kotlin.jvm.internal.o.o("decoder");
                throw null;
            }
        }
    }
}
