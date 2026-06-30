package qg5;

/* loaded from: classes8.dex */
public final class k5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444575d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qg5.n5 f444577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444578g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444579h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444580i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444581m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444582n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(qg5.n5 n5Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444577f = n5Var;
        this.f444578g = context;
        this.f444579h = str;
        this.f444580i = str2;
        this.f444581m = str3;
        this.f444582n = str4;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qg5.k5 k5Var = new qg5.k5(this.f444577f, this.f444578g, this.f444579h, this.f444580i, this.f444581m, this.f444582n, interfaceC29045xdcb5ca57);
        k5Var.f444576e = obj;
        return k5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.k5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444575d;
        qg5.n5 n5Var = this.f444577f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f444576e;
            p3325xe03a0797.p3326xc267989b.z a17 = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new qg5.g5(a17, n5Var, this.f444580i, null), 3, null);
            qg5.j5 j5Var = new qg5.j5(a17, null);
            this.f444576e = y0Var;
            this.f444575d = 1;
            obj = p3325xe03a0797.p3326xc267989b.a4.c(600L, j5Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        ((qg5.l0) qg5.n5.T6(n5Var)).ij();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoSummarizeFSC", "saveStagedDataToFile failed");
            return f0Var;
        }
        jz5.g gVar = n5Var.f444633i;
        ((ht.w) ((jt.c0) ((jz5.n) gVar).mo141623x754a37bb())).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4 h4Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4.f270870a;
        zk.a aVar2 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.f135244e;
        android.content.Context context = this.f444578g;
        android.net.Uri d17 = aVar2.d(context);
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.hunyuan.app.chat");
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(d17)));
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(128);
        intent.addFlags(64);
        intent.putExtra(this.f444581m, true);
        intent.putExtra("com.tencent.mm.intent.extra.WECHAT_CHAT_RECORDS_PROVIDER_SESSION_ID", this.f444582n);
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.p2586x14f51cd8.C20849x15dfd767());
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("gVer", f17);
        java.lang.String str = this.f444579h;
        if (str != null) {
            ((wj.j0) ((xj.i) ((jz5.n) n5Var.f444631g).mo141623x754a37bb())).bj(str, new xj.n(wj.r0.f528032e, intent, this.f444578g, null, 8, null), new qg5.h5(n5Var));
        } else {
            java.lang.String wi6 = ((ht.w) ((jt.c0) ((jz5.n) gVar).mo141623x754a37bb())).wi(context);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            ((kt.c) ((lt.i0) ((jz5.n) n5Var.f444634m).mo141623x754a37bb())).hj(context.getApplicationContext(), intent, wi6, 0, string, new qg5.i5(n5Var), null);
        }
        return f0Var;
    }
}
