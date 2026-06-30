package qg5;

/* loaded from: classes8.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444688d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444689e;

    /* renamed from: f, reason: collision with root package name */
    public int f444690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f444691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg5.u3 f444693i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f444694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444695n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444696o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, android.content.Context context, qg5.u3 u3Var, xj.m mVar, yz5.a aVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444691g = c20976x6ba6452a;
        this.f444692h = context;
        this.f444693i = u3Var;
        this.f444694m = mVar;
        this.f444695n = aVar;
        this.f444696o = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.r3(this.f444691g, this.f444692h, this.f444693i, this.f444694m, this.f444695n, this.f444696o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444690f;
        android.content.Context context = this.f444692h;
        qg5.u3 u3Var = this.f444693i;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f(0L, 1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            p3325xe03a0797.p3326xc267989b.r2 b17 = v65.i.b(this.f444691g, null, new qg5.q3(u3Var, this.f444696o, null), 1, null);
            fVar.b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pag), true, 0, new qg5.p3(c0Var2, b17));
            this.f444688d = fVar;
            this.f444689e = c0Var2;
            this.f444690f = 1;
            if (b17.C(this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f444689e;
            fVar = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f) this.f444688d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fVar.a();
        boolean z17 = c0Var.f391645d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "user cancelled loading");
            return f0Var;
        }
        boolean z18 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.C20835x8e215671()) == 1;
        xj.m mVar = this.f444694m;
        yz5.a callback = this.f444695n;
        if (!z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            kk5.i1.f390184m = callback;
            kk5.i1.f390185n = mVar;
            android.content.Intent intent = new android.content.Intent();
            pf5.j0.a(intent, kk5.i1.class);
            bh5.c cVar = new bh5.c();
            cVar.d(intent);
            cVar.f102455a.f102457a = context;
            cVar.c(false);
            cVar.f(false);
            cVar.a(com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class.getName());
            cVar.b(com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22416x4a36f104.class);
            cVar.g();
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "skip dialog");
        ((ht.w) ((jt.c0) ((jz5.n) u3Var.f444747m).mo141623x754a37bb())).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4 h4Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4.f270870a;
        android.net.Uri parse = android.net.Uri.parse("content://" + context.getPackageName() + ".app.provider.ShareableChatRecords/");
        if (parse == null) {
            parse = android.net.Uri.EMPTY;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.setPackage("com.tencent.hunyuan.app.chat");
        intent2.setAction("android.intent.action.SEND_MULTIPLE");
        intent2.setType("*/*");
        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(parse)));
        intent2.addFlags(268435456);
        intent2.addFlags(1);
        intent2.addFlags(128);
        intent2.addFlags(64);
        intent2.putExtra("com.tencent.mm.intent.extra.FROM_CHAT_RECORDS_COPY", true);
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.p2586x14f51cd8.C20847xf68aface());
        if (f17 == null) {
            f17 = "";
        }
        intent2.putExtra("gVer", f17);
        java.lang.String wi6 = ((ht.w) ((jt.c0) ((jz5.n) u3Var.f444747m).mo141623x754a37bb())).wi(context);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Context applicationContext = context.getApplicationContext();
        if (mVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "launch app via ad");
            ((wj.j0) ((xj.i) ((jz5.n) u3Var.f444745h).mo141623x754a37bb())).bj(mVar.f536286a, new xj.n(wj.r0.f528032e, intent2, applicationContext, null, 8, null), new qg5.j3(u3Var, callback));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoCopyChatRecordsFSC", "launch app fallback");
            ((kt.c) ((lt.i0) ((jz5.n) u3Var.f444748n).mo141623x754a37bb())).hj(applicationContext, intent2, wi6, 0, string, new qg5.k3(u3Var, callback), null);
        }
        return f0Var;
    }
}
