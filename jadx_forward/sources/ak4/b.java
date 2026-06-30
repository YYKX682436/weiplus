package ak4;

/* loaded from: classes11.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak4.d f87126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f87129g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f87130h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pj4.g0 f87131i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f87132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ak4.d dVar, java.lang.String str, java.lang.String str2, long j17, boolean z17, bi4.b bVar, pj4.g0 g0Var, int i17) {
        super(1);
        this.f87126d = dVar;
        this.f87127e = str;
        this.f87128f = str2;
        this.f87129g = j17;
        this.f87130h = z17;
        this.f87131i = g0Var;
        this.f87132m = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        long j17 = this.f87129g;
        java.lang.String str = this.f87128f;
        java.lang.String key = this.f87127e;
        ak4.d dVar = this.f87126d;
        if (bitmap == null || bitmap.isRecycled()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f87149t, key)) {
                dVar.f87149t = null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(dVar.P, "[TSItemSpan] asyncLoad callback bitmapInvalid iconId=" + str + " version=" + j17);
        } else {
            long j18 = dVar.f87148s;
            java.lang.String str2 = dVar.P;
            boolean z18 = this.f87130h;
            if (j17 == j18 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.f87137e) && z18 == (z17 = dVar.f87143n)) {
                boolean z19 = dVar.f87147r;
                bi4.b bVar = bi4.b.DEFAULT;
                xe0.u0 style = dVar.f87140h;
                pj4.g0 g0Var = this.f87131i;
                if (z19) {
                    dVar.f87151v.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
                    java.lang.String a17 = ak4.f.f87156a.a(this.f87128f, dVar.f87138f, bVar, bk4.g0.j(g0Var), style.f535333a, z17 ? style.f535336d : style.f535335c, dVar.f87143n);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f87149t, key)) {
                        dVar.f87149t = null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, key)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[TSItemSpan] asyncLoad callback skip: alreadyLoaded iconId=" + str + " version=" + j17);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE loadedKeyMismatch iconId=" + str + " requestKey=" + key + " currentKey=" + a17 + " — drop");
                    }
                } else {
                    try {
                        android.graphics.drawable.Drawable i17 = bk4.i.a().i(bitmap, bk4.g0.j(g0Var), dVar.f87138f, bVar);
                        if (!bk4.g0.j(g0Var)) {
                            com.p314xaae8f345.mm.ui.uk.f(i17, this.f87132m);
                        }
                        if (j17 == dVar.f87148s && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, dVar.f87137e) && z18 == dVar.f87143n) {
                            int i18 = style.f535333a;
                            i17.setBounds(0, 0, i18, i18);
                            dVar.f87146q = i17;
                            dVar.f87147r = true;
                            dVar.f87149t = null;
                            ak4.f fVar = ak4.f.f87156a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
                            if (true ^ r26.n0.N(key)) {
                                android.util.LruCache lruCache = ak4.f.f87157b;
                                lruCache.put(key, i17);
                                lruCache.size();
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[TSItemSpan] asyncLoad callback DONE iconId=" + str + " isRead=" + dVar.f87143n + " version=" + j17 + " — invalidate");
                            dVar.k("async_done", false);
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f87149t, key)) {
                            dVar.f87149t = null;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE beforeApply iconId=" + str + " currentIconId=" + dVar.f87137e + " isReadAtRequest=" + z18 + " isReadNow=" + dVar.f87143n + " versionAtRequest=" + j17 + " versionNow=" + dVar.f87148s + " — drop");
                    } catch (java.lang.Throwable th6) {
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f87149t, key)) {
                            dVar.f87149t = null;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, th6, "loadIconBitmap callback err", new java.lang.Object[0]);
                    }
                }
            } else {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f87149t, key)) {
                    dVar.f87149t = null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[TSItemSpan] asyncLoad callback STALE iconId=" + str + " currentIconId=" + dVar.f87137e + " isReadAtRequest=" + z18 + " isReadNow=" + dVar.f87143n + " versionAtRequest=" + j17 + " versionNow=" + dVar.f87148s + " — drop");
            }
        }
        return jz5.f0.f384359a;
    }
}
