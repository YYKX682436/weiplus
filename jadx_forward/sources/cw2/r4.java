package cw2;

/* loaded from: classes5.dex */
public final class r4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f305501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.s4 f305502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f305503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(java.util.List list, cw2.s4 s4Var, yz5.p pVar) {
        super(0);
        this.f305501d = list;
        this.f305502e = s4Var;
        this.f305503f = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap;
        java.util.Iterator it = this.f305501d.iterator();
        android.graphics.Bitmap bitmap2 = null;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            gp.d dVar = this.f305502e.f305524b;
            if (dVar != null) {
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                aVar.c(2);
                aVar.c(java.lang.Long.valueOf(1000 * longValue));
                yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/finder/video/FinderNormalVideoThumbFetcher$requestFrames$1", "invoke", "()V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                zj0.c.f554818a.set(aVar);
                bitmap = dVar.getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
                yj0.a.e(dVar, bitmap, "com/tencent/mm/plugin/finder/video/FinderNormalVideoThumbFetcher$requestFrames$1", "invoke", "()V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap2 = bitmap;
            }
            this.f305503f.mo149xb9724478(java.lang.Long.valueOf(longValue), bitmap2);
        }
        return jz5.f0.f384359a;
    }
}
