package in1;

/* loaded from: classes11.dex */
public final class e extends android.graphics.drawable.BitmapDrawable implements com.p314xaae8f345.mm.p2470x93e71c27.ui.a0, hn1.z {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f374311d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374312e;

    /* renamed from: f, reason: collision with root package name */
    public float f374313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f374314g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374315h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Paint f374316i;

    /* renamed from: m, reason: collision with root package name */
    public final kv.b0 f374317m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.Bitmap f374318n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Bitmap f374319o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f374320p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f374321q;

    public e(com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a workerScope, java.lang.String username, float f17, boolean z17, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i17 & 4) != 0 ? 0.1f : f17;
        z17 = (i17 & 8) != 0 ? false : z17;
        str = (i17 & 16) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerScope, "workerScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f374311d = workerScope;
        this.f374312e = username;
        this.f374313f = f17;
        this.f374314g = z17;
        this.f374315h = str;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f374316i = paint;
        i95.m c17 = i95.n0.c(kv.b0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        kv.b0 b0Var = (kv.b0) c17;
        this.f374317m = b0Var;
        this.f374318n = ((hn1.s) b0Var).Ri(this.f374313f);
        this.f374320p = jz5.h.b(in1.c.f374309d);
        this.f374321q = new in1.d(this);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public static void c(in1.e eVar, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a workerScope, java.lang.String username, float f17, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            f17 = 0.1f;
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        if ((i17 & 16) != 0) {
            str = null;
        }
        eVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerScope, "workerScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        eVar.f374311d = workerScope;
        eVar.f374312e = username;
        eVar.f374313f = f17;
        eVar.f374314g = z17;
        eVar.f374315h = str;
    }

    @Override // hn1.z
    public void a(java.lang.String imageKey, android.graphics.Bitmap bitmap, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageKey, "imageKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String Zi = ((hn1.s) this.f374317m).Zi(this.f374312e, this.f374313f);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374319o, bitmap) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(Zi, imageKey)) {
            return;
        }
        jz5.g gVar = this.f374320p;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o3) ((jz5.n) gVar).mo141623x754a37bb();
        java.lang.Runnable runnable = this.f374321q;
        o3Var.mo50300x3fa464aa(runnable);
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o3) ((jz5.n) gVar).mo141623x754a37bb()).e(runnable, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[Catch: Exception -> 0x00fa, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fa, blocks: (B:14:0x004a, B:16:0x004f, B:18:0x005f, B:20:0x0068, B:22:0x007c, B:24:0x007f, B:27:0x0084, B:29:0x008b, B:31:0x0095, B:34:0x00be, B:36:0x00ef, B:37:0x00a0, B:38:0x00a7, B:41:0x00b8, B:45:0x00e6, B:46:0x00eb, B:48:0x0082), top: B:13:0x004a }] */
    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in1.e.draw(android.graphics.Canvas):void");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.a0
    /* renamed from: onScrollStateChanged */
    public void mo75389x4d79408f(boolean z17) {
    }
}
