package zc;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f552845d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc.b0 f552846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f552847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552848g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552849h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552850i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552851m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552852n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552853o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 f552854p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zc.b0 b0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 c3707xe60c5943, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f552846e = b0Var;
        this.f552847f = j17;
        this.f552848g = str;
        this.f552849h = str2;
        this.f552850i = str3;
        this.f552851m = str4;
        this.f552852n = str5;
        this.f552853o = str6;
        this.f552854p = c3707xe60c5943;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zc.a0(this.f552846e, this.f552847f, this.f552848g, this.f552849h, this.f552850i, this.f552851m, this.f552852n, this.f552853o, this.f552854p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zc.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f552845d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.z zVar = this.f552846e.f552868n;
            this.f552845d = 1;
            if (((p3325xe03a0797.p3326xc267989b.a0) zVar).k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = (int) this.f552847f;
        java.lang.Long l17 = this.f552846e.f552870p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        int longValue = (int) l17.longValue();
        int hashCode = this.f552846e.hashCode();
        java.lang.String str = this.f552848g;
        java.lang.String str2 = this.f552849h;
        java.lang.String str3 = this.f552850i;
        java.lang.String str4 = this.f552851m;
        java.lang.String str5 = this.f552852n;
        java.lang.String str6 = this.f552853o;
        com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24244x84f3e062 c24244x84f3e062 = this.f552846e.f552867m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c24244x84f3e062);
        android.content.Context context = this.f552846e.f552864g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e = this.f552846e.f552863f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28580x69eec95e);
        android.app.Activity activity = this.f552846e.f552861d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
        java.lang.Object obj2 = this.f552846e.f552862e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f552846e.f552865h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f2);
        com.p314xaae8f345.p362xadfe2b3.p371xc84c5534.C3707xe60c5943 startReport = this.f552854p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(startReport, "$startReport");
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28624x6307ecb0 interfaceC28624x6307ecb0 = this.f552846e.f552866i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28624x6307ecb0);
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = new com.p314xaae8f345.p362xadfe2b3.C3646xcf902238(i18, longValue, hashCode, str, str2, str3, str4, str5, str6, c24244x84f3e062, context, c28580x69eec95e, activity, obj2, interfaceC28679x1b8c77f2, startReport, interfaceC28624x6307ecb0);
        c3646xcf902238.f127511t.D = java.lang.System.currentTimeMillis();
        if (c3646xcf902238.f127511t.I != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, c3646xcf902238.f127502h);
            c3646xcf902238.f127511t.I.mo28895x775d9b7e(com.p314xaae8f345.p362xadfe2b3.gen.EnumC3705xd4888518.LOAD_HOME_PAGE, hashMap);
        }
        kx5.n h17 = kx5.n.h();
        h17.f394849f.put(c3646xcf902238.mo28568x146a8a26(), c3646xcf902238);
        h17.f394848e = c3646xcf902238;
        c3646xcf902238.f127515x = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65439x6a0f1ce7(c3646xcf902238.f127501g, c3646xcf902238.f127505n, c3646xcf902238.f127506o, c3646xcf902238.f127502h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback lVUICallback = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.LVUICallback(c3646xcf902238.f127501g, c3646xcf902238);
        c3646xcf902238.f127516y = lVUICallback;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.OpenExtraData m65492x30fe4db = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65492x30fe4db(c3646xcf902238.f127498d, lVUICallback);
        if ((m65492x30fe4db != null ? m65492x30fe4db.f37265x66f18c8 : null) != null) {
            java.lang.String query = m65492x30fe4db.f37265x66f18c8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(query, "query");
            c3646xcf902238.f127503i = query;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65474x16e2655c(java.util.Locale.getDefault().getLanguage(), java.util.Locale.getDefault().getCountry());
        md.n.c(c3646xcf902238.f127508q);
        c3646xcf902238.f127517z = c3646xcf902238.f127508q.getResources().getConfiguration().orientation == 2;
        boolean m65381x1cd9fc48 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65381x1cd9fc48();
        c3646xcf902238.A = m65381x1cd9fc48;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(m65381x1cd9fc48);
        float f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b ? c3646xcf902238.f127508q.getResources().getConfiguration().fontScale : com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37145xa386663b;
        c3646xcf902238.B = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65472xfe6fc4cb(c3646xcf902238.f127498d, false);
        ld.d.f399579b.a().a(new ld.a(c3646xcf902238.f127501g));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig = c3646xcf902238.f127515x;
        c3646xcf902238.mo28590xdaac6ff(pageConfig != null ? pageConfig.f37279xf2725bc1 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig2 = c3646xcf902238.f127515x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pageConfig2);
        if (pageConfig2.f37274x4d0b70cd != null && c3646xcf902238.P == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig3 = c3646xcf902238.f127515x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pageConfig3);
            java.lang.String m65632x5d71f75c = pageConfig3.m65632x5d71f75c(c3646xcf902238.A);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m65632x5d71f75c, "getBackgroundImagePath(...)");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("./");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            java.lang.String replaceFirst = compile.matcher(m65632x5d71f75c).replaceFirst("");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceFirst, "replaceFirst(...)");
            java.lang.String str7 = c3646xcf902238.f127505n + "/pkg/" + replaceFirst;
            android.app.Activity activity2 = c3646xcf902238.f127508q;
            android.widget.ImageView imageView = new android.widget.ImageView(activity2);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.PageConfig pageConfig4 = c3646xcf902238.f127515x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pageConfig4);
            android.widget.ImageView.ScaleType m65631x5d70ccda = pageConfig4.m65631x5d70ccda();
            imageView.setScaleType(m65631x5d70ccda);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str7);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/liteapp/WxaLiteAppWidgetAdapter", "addBackgroundImage", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj3, decodeFile, "com/tencent/liteapp/WxaLiteAppWidgetAdapter", "addBackgroundImage", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            if (decodeFile == null) {
                kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "backgroundImage load fail, path: " + str7, new java.lang.Object[0]);
            }
            imageView.setImageBitmap(decodeFile);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity2);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.addView(imageView);
            activity2.addContentView(frameLayout, layoutParams);
            c3646xcf902238.P = imageView;
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "add backgroundImage | relativeImagePath: " + replaceFirst + " | absoluteImagePath: " + str7 + " | scaleType: " + m65631x5d70ccda, new java.lang.Object[0]);
        }
        if (c3646xcf902238.f127514w == null) {
            com.p314xaae8f345.p362xadfe2b3.ui.i iVar = new com.p314xaae8f345.p362xadfe2b3.ui.i(c3646xcf902238.f127508q);
            c3646xcf902238.f127514w = iVar;
            iVar.f127702b = c3646xcf902238;
        }
        if (c3646xcf902238.N == null) {
            c3646xcf902238.N = new md.j(c3646xcf902238.f127508q, 2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65440x9f16b22e(c3646xcf902238.f127508q);
        zc.x c17 = c3646xcf902238.c();
        if (c17 != null) {
            java.lang.String appId = c3646xcf902238.f127501g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) c17).f218851s = new f03.a();
        }
        zc.x c18 = c3646xcf902238.c();
        if (c18 != null) {
            zc.u uVar = new zc.u(c3646xcf902238);
            f03.a aVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1701xd2ae381c.ui.ActivityC15553x533c7950) c18).f218851s;
            if (aVar2 != null) {
                aVar2.f339949a = uVar;
            }
        }
        java.lang.Object obj4 = c3646xcf902238.f127509r;
        if (obj4 instanceof io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b) {
            ((io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3296xedfae76a.C28634xcda7566b) obj4).m137995xed6858b4().a(c3646xcf902238);
        }
        java.lang.String m65264x84cad301 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65264x84cad301(c3646xcf902238.f127515x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m65264x84cad301, "checkGlobalPkg(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65496xebcec342(c3646xcf902238.f127501g, c3646xcf902238.f127502h, c3646xcf902238.f127503i, c3646xcf902238.f127504m, "", c3646xcf902238.f127505n, c3646xcf902238.f127506o, c3646xcf902238.f127499e, c3646xcf902238.f127498d, false, "", new java.lang.String[0], new java.lang.String[0], null, 0, m65264x84cad301, "");
        this.f552846e.f552869o.put(new java.lang.Integer((int) this.f552847f), c3646xcf902238);
        return jz5.f0.f384359a;
    }
}
