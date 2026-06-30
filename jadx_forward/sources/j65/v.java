package j65;

/* loaded from: classes13.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    public static j65.v f379511c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f379512d = "";

    /* renamed from: e, reason: collision with root package name */
    public static boolean f379513e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f379514f = new byte[0];

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f379515g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public static volatile j65.w f379516h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile j65.o f379517i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile j65.u f379518j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile j65.w f379519k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile j65.o f379520l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile j65.u f379521m;

    /* renamed from: a, reason: collision with root package name */
    public boolean f379522a = false;

    /* renamed from: b, reason: collision with root package name */
    public j65.b f379523b = null;

    public v(android.content.res.AssetManager assetManager) {
    }

    public static void a() {
        if (f379516h != null) {
            j65.w wVar = f379516h;
            android.util.SparseIntArray sparseIntArray = wVar.f379526a;
            if (sparseIntArray != null) {
                sparseIntArray.clear();
            }
            if (wVar.f379527b != null) {
                wVar.f379527b = null;
            }
            f379516h = null;
        }
        if (f379517i != null) {
            j65.o oVar = f379517i;
            android.util.SparseArray sparseArray = oVar.f379502a;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            if (oVar.f379503b != null) {
                oVar.f379503b = null;
            }
            f379517i = null;
        }
        if (f379518j != null) {
            j65.u uVar = f379518j;
            android.util.SparseArray sparseArray2 = uVar.f379509a;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            }
            if (uVar.f379510b != null) {
                uVar.f379510b = null;
            }
            f379518j = null;
        }
        if (f379519k != null) {
            j65.w wVar2 = f379519k;
            android.util.SparseIntArray sparseIntArray2 = wVar2.f379526a;
            if (sparseIntArray2 != null) {
                sparseIntArray2.clear();
            }
            if (wVar2.f379527b != null) {
                wVar2.f379527b = null;
            }
            f379519k = null;
        }
        if (f379520l != null) {
            j65.o oVar2 = f379520l;
            android.util.SparseArray sparseArray3 = oVar2.f379502a;
            if (sparseArray3 != null) {
                sparseArray3.clear();
            }
            if (oVar2.f379503b != null) {
                oVar2.f379503b = null;
            }
            f379520l = null;
        }
        if (f379521m != null) {
            j65.u uVar2 = f379521m;
            android.util.SparseArray sparseArray4 = uVar2.f379509a;
            if (sparseArray4 != null) {
                sparseArray4.clear();
            }
            if (uVar2.f379510b != null) {
                uVar2.f379510b = null;
            }
            f379521m = null;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.v8.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571528hx) : "";
    }

    public static j65.v c(android.content.res.AssetManager assetManager) {
        j65.v vVar;
        synchronized (j65.v.class) {
            if (f379511c == null) {
                f379511c = new j65.v(assetManager);
            }
            vVar = f379511c;
        }
        return vVar;
    }

    public static j65.v f(android.content.Context context, java.lang.String str) {
        java.util.Locale locale;
        if (context.getResources() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.language.StringResouces", "the resource is null! why?");
            return null;
        }
        final android.content.res.AssetManager a17 = fp.q.a();
        if (a17 != null) {
            c(a17).getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str.equalsIgnoreCase("language_default")) {
                java.util.Locale locale2 = java.util.Locale.getDefault();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(context, locale2);
                locale = locale2;
            } else {
                locale = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(str);
            }
            java.lang.String locale3 = locale.toString();
            c(a17).getClass();
            boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274380a.contains(locale3);
            f379513e = z17;
            if (z17) {
                final j65.v c17 = c(a17);
                c17.getClass();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(locale3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.language.StringResouces", "local is null.");
                } else if (locale3.equals(f379512d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.language.StringResouces", "local no change. local is :%s", locale3);
                } else if (fp.q.b("strings")) {
                    int indexOf = locale3.indexOf("_");
                    if (indexOf > 0) {
                        java.lang.String substring = locale3.substring(0, indexOf);
                        if (!substring.equalsIgnoreCase("zh")) {
                            locale3 = substring;
                        }
                    }
                    a();
                    f379512d = locale3;
                    ((ku5.t0) ku5.t0.f394148d).a(new java.lang.Runnable() { // from class: j65.v$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            j65.v vVar = j65.v.this;
                            vVar.getClass();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.language.StringResouces", "Init strings async.");
                            vVar.i(a17, j65.v.f379512d);
                            vVar.h(j65.v.f379512d);
                        }
                    });
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.language.StringResouces", "expansions is not yet installed, skip");
                }
                return c(a17);
            }
            a();
            f379512d = locale3;
        }
        return null;
    }

    public java.lang.String d(int i17, int i18) {
        java.lang.String a17;
        if (f379517i == null) {
            i(fp.q.a(), f379512d);
        }
        if (f379517i != null && (a17 = f379517i.a(i17, i18, new java.lang.Object[0])) != null) {
            return a17;
        }
        if (f379520l == null) {
            h(f379512d);
        }
        if (f379520l != null) {
            return f379520l.a(i17, i18, new java.lang.Object[0]);
        }
        return null;
    }

    public java.lang.String e(int i17) {
        java.lang.String a17;
        if (f379516h == null) {
            i(fp.q.a(), f379512d);
        }
        if (f379516h != null && (a17 = f379516h.a(i17)) != null) {
            return a17;
        }
        if (f379519k == null) {
            h(f379512d);
        }
        if (f379519k != null) {
            return f379519k.a(i17);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.content.res.AssetManager r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.v.g(android.content.res.AssetManager, java.lang.String):void");
    }

    public final void h(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (f379515g) {
            j(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.language.StringResouces", "lazyInitBaseUDRStringsLocked spent = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public final void i(android.content.res.AssetManager assetManager, java.lang.String str) {
        if (f379516h == null && !this.f379522a) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (f379514f) {
                g(assetManager, str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.language.StringResouces", "lazyInitStringsLocked spent = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if ((r2 != null && ((p3325xe03a0797.p3326xc267989b.a) r2).a()) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j65.v.j(java.lang.String):void");
    }
}
