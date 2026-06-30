package rv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final rv.c f481365e;

    /* renamed from: f, reason: collision with root package name */
    public static final rv.d f481366f;

    /* renamed from: g, reason: collision with root package name */
    public static final rv.d f481367g;

    /* renamed from: h, reason: collision with root package name */
    public static final rv.d f481368h;

    /* renamed from: i, reason: collision with root package name */
    public static final rv.d f481369i;

    /* renamed from: m, reason: collision with root package name */
    public static final rv.d f481370m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rv.d[] f481371n;

    /* renamed from: d, reason: collision with root package name */
    public final int f481372d;

    static {
        rv.d dVar = new rv.d(com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7429x859b4284, 0, 10000);
        f481366f = dVar;
        rv.d dVar2 = new rv.d("EMBED_EXCERPT", 1, 312);
        f481367g = dVar2;
        rv.d dVar3 = new rv.d("EMBED_EXCERPT_FOR_COMMENT_SHARE", 2, 313);
        f481368h = dVar3;
        rv.d dVar4 = new rv.d("EMBED_EXCERPT_FOR_ADDED_INFO", 3, 314);
        f481369i = dVar4;
        rv.d dVar5 = new rv.d("EMBED_EXCERPT_FOR_UNDERLINE_COMMENT", 4, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e);
        f481370m = dVar5;
        rv.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f481371n = dVarArr;
        rz5.b.a(dVarArr);
        f481365e = new rv.c(null);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f481372d = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final rv.d a(java.lang.String r3) {
        /*
            rv.d r0 = rv.d.f481366f
            rv.c r1 = rv.d.f481365e
            r1.getClass()
            java.lang.String r1 = "url"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r1)
            kotlin.Result$Companion r1 = p3321xbce91901.C29043x91b2b43d.INSTANCE     // Catch: java.lang.Throwable -> L5b
            android.net.Uri r1 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "fromsharesource"
            java.lang.String r1 = r1.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L55
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L5b
            switch(r2) {
                case -1026963764: goto L48;
                case 501138862: goto L3c;
                case 950398559: goto L30;
                case 1642146323: goto L23;
                default: goto L22;
            }     // Catch: java.lang.Throwable -> L5b
        L22:
            goto L55
        L23:
            java.lang.String r2 = "underlinecomment"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L2d
            goto L55
        L2d:
            rv.d r1 = rv.d.f481370m     // Catch: java.lang.Throwable -> L5b
            goto L56
        L30:
            java.lang.String r2 = "comment"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L39
            goto L55
        L39:
            rv.d r1 = rv.d.f481368h     // Catch: java.lang.Throwable -> L5b
            goto L56
        L3c:
            java.lang.String r2 = "addedinfo"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L45
            goto L55
        L45:
            rv.d r1 = rv.d.f481369i     // Catch: java.lang.Throwable -> L5b
            goto L56
        L48:
            java.lang.String r2 = "underline"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L52
            goto L55
        L52:
            rv.d r1 = rv.d.f481367g     // Catch: java.lang.Throwable -> L5b
            goto L56
        L55:
            r1 = r0
        L56:
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)     // Catch: java.lang.Throwable -> L5b
            goto L66
        L5b:
            r1 = move-exception
            kotlin.Result$Companion r2 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Object r1 = p3321xbce91901.C29044xefd6a286.m143914x452354ee(r1)
            java.lang.Object r1 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r1)
        L66:
            boolean r2 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r1)
            if (r2 == 0) goto L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            rv.d r0 = (rv.d) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getEmbedExcerptSceneWithUrl: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ", scene="
            r1.append(r3)
            int r3 = r0.f481372d
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "BrandEmbedExcerptOpenArticleScene"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv.d.a(java.lang.String):rv.d");
    }

    /* renamed from: valueOf */
    public static rv.d m163077xdce0328(java.lang.String str) {
        return (rv.d) java.lang.Enum.valueOf(rv.d.class, str);
    }

    /* renamed from: values */
    public static rv.d[] m163078xcee59d22() {
        return (rv.d[]) f481371n.clone();
    }
}
