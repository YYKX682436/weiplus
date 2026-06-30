package ak4;

/* loaded from: classes11.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak4.d f5593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5595f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5596g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f5597h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pj4.g0 f5598i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ak4.d dVar, java.lang.String str, java.lang.String str2, long j17, boolean z17, bi4.b bVar, pj4.g0 g0Var, int i17) {
        super(1);
        this.f5593d = dVar;
        this.f5594e = str;
        this.f5595f = str2;
        this.f5596g = j17;
        this.f5597h = z17;
        this.f5598i = g0Var;
        this.f5599m = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        long j17 = this.f5596g;
        java.lang.String str = this.f5595f;
        java.lang.String key = this.f5594e;
        ak4.d dVar = this.f5593d;
        if (bitmap == null || bitmap.isRecycled()) {
            if (kotlin.jvm.internal.o.b(dVar.f5616t, key)) {
                dVar.f5616t = null;
            }
            com.tencent.mars.xlog.Log.w(dVar.P, "[TSItemSpan] asyncLoad callback bitmapInvalid iconId=" + str + " version=" + j17);
        } else {
            long j18 = dVar.f5615s;
            java.lang.String str2 = dVar.P;
            boolean z18 = this.f5597h;
            if (j17 == j18 && kotlin.jvm.internal.o.b(str, dVar.f5604e) && z18 == (z17 = dVar.f5610n)) {
                boolean z19 = dVar.f5614r;
                bi4.b bVar = bi4.b.DEFAULT;
                xe0.u0 style = dVar.f5607h;
                pj4.g0 g0Var = this.f5598i;
                if (z19) {
                    dVar.f5618v.getClass();
                    kotlin.jvm.internal.o.g(style, "style");
                    java.lang.String a17 = ak4.f.f5623a.a(this.f5595f, dVar.f5605f, bVar, bk4.g0.j(g0Var), style.f453800a, z17 ? style.f453803d : style.f453802c, dVar.f5610n);
                    if (kotlin.jvm.internal.o.b(dVar.f5616t, key)) {
                        dVar.f5616t = null;
                    }
                    if (kotlin.jvm.internal.o.b(a17, key)) {
                        com.tencent.mars.xlog.Log.i(str2, "[TSItemSpan] asyncLoad callback skip: alreadyLoaded iconId=" + str + " version=" + j17);
                    } else {
                        com.tencent.mars.xlog.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE loadedKeyMismatch iconId=" + str + " requestKey=" + key + " currentKey=" + a17 + " — drop");
                    }
                } else {
                    try {
                        android.graphics.drawable.Drawable i17 = bk4.i.a().i(bitmap, bk4.g0.j(g0Var), dVar.f5605f, bVar);
                        if (!bk4.g0.j(g0Var)) {
                            com.tencent.mm.ui.uk.f(i17, this.f5599m);
                        }
                        if (j17 == dVar.f5615s && kotlin.jvm.internal.o.b(str, dVar.f5604e) && z18 == dVar.f5610n) {
                            int i18 = style.f453800a;
                            i17.setBounds(0, 0, i18, i18);
                            dVar.f5613q = i17;
                            dVar.f5614r = true;
                            dVar.f5616t = null;
                            ak4.f fVar = ak4.f.f5623a;
                            kotlin.jvm.internal.o.g(key, "key");
                            if (true ^ r26.n0.N(key)) {
                                android.util.LruCache lruCache = ak4.f.f5624b;
                                lruCache.put(key, i17);
                                lruCache.size();
                            }
                            com.tencent.mars.xlog.Log.i(str2, "[TSItemSpan] asyncLoad callback DONE iconId=" + str + " isRead=" + dVar.f5610n + " version=" + j17 + " — invalidate");
                            dVar.k("async_done", false);
                        }
                        if (kotlin.jvm.internal.o.b(dVar.f5616t, key)) {
                            dVar.f5616t = null;
                        }
                        com.tencent.mars.xlog.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE beforeApply iconId=" + str + " currentIconId=" + dVar.f5604e + " isReadAtRequest=" + z18 + " isReadNow=" + dVar.f5610n + " versionAtRequest=" + j17 + " versionNow=" + dVar.f5615s + " — drop");
                    } catch (java.lang.Throwable th6) {
                        if (kotlin.jvm.internal.o.b(dVar.f5616t, key)) {
                            dVar.f5616t = null;
                        }
                        com.tencent.mars.xlog.Log.printErrStackTrace(str2, th6, "loadIconBitmap callback err", new java.lang.Object[0]);
                    }
                }
            } else {
                if (kotlin.jvm.internal.o.b(dVar.f5616t, key)) {
                    dVar.f5616t = null;
                }
                com.tencent.mars.xlog.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE iconId=" + str + " currentIconId=" + dVar.f5604e + " isReadAtRequest=" + z18 + " isReadNow=" + dVar.f5610n + " versionAtRequest=" + j17 + " versionNow=" + dVar.f5615s + " — drop");
            }
        }
        return jz5.f0.f302826a;
    }
}
