package qg5;

/* loaded from: classes8.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f444621d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f444622e;

    /* renamed from: f, reason: collision with root package name */
    public int f444623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f444624g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444625h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qg5.q4 f444626i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xj.m f444627m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f444628n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f444629o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, android.content.Context context, qg5.q4 q4Var, xj.m mVar, yz5.a aVar, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444624g = c20976x6ba6452a;
        this.f444625h = context;
        this.f444626i = q4Var;
        this.f444627m = mVar;
        this.f444628n = aVar;
        this.f444629o = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.n4(this.f444624g, this.f444625h, this.f444626i, this.f444627m, this.f444628n, this.f444629o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.n4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f444623f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f(0L, 1, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            p3325xe03a0797.p3326xc267989b.r2 b17 = v65.i.b(this.f444624g, null, new qg5.m4(this.f444629o, null), 1, null);
            android.content.Context context = this.f444625h;
            fVar.b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pag), true, 0, new qg5.l4(c0Var2, b17));
            this.f444621d = fVar;
            this.f444622e = c0Var2;
            this.f444623f = 1;
            if (b17.C(this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f444622e;
            fVar = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f) this.f444621d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        fVar.a();
        boolean z17 = c0Var.f391645d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "user cancelled loading");
            return f0Var;
        }
        qg5.q4 q4Var = this.f444626i;
        ((ht.w) ((jt.c0) ((jz5.n) q4Var.f444678g).mo141623x754a37bb())).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4 h4Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.h4.f270870a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("content://");
        android.content.Context context2 = this.f444625h;
        sb6.append(context2.getPackageName());
        sb6.append(".app.provider.ShareableChatRecords/");
        android.net.Uri parse = android.net.Uri.parse(sb6.toString());
        if (parse == null) {
            parse = android.net.Uri.EMPTY;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.tencent.hunyuan.app.chat");
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("*/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new java.util.ArrayList<>(kz5.b0.c(parse)));
        intent.addFlags(268435456);
        intent.addFlags(1);
        intent.addFlags(128);
        intent.addFlags(64);
        intent.putExtra("com.tencent.mm.intent.extra.FORWARD_PANEL", true);
        java.lang.String f17 = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2585xce036727.p2586x14f51cd8.C20847xf68aface());
        if (f17 == null) {
            f17 = "";
        }
        intent.putExtra("gVer", f17);
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n4l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String string2 = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "launch yuanbao app for forward");
        xj.m mVar = this.f444627m;
        yz5.a aVar2 = this.f444628n;
        if (mVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("launch app via ad, aid=");
            java.lang.String str = mVar.f536286a;
            sb7.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", sb7.toString());
            ((wj.j0) ((xj.i) ((jz5.n) q4Var.f444680i).mo141623x754a37bb())).bj(str, new xj.n(wj.r0.f528032e, intent, context2, null, 8, null), new qg5.e4(q4Var, aVar2));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoForwardChatRecordsFSC", "launch app fallback (no ad info)");
            q4Var.Y6();
            ((kt.c) ((lt.i0) ((jz5.n) q4Var.f444679h).mo141623x754a37bb())).hj(context2, intent, string, 0, string2, new qg5.f4(q4Var, aVar2), null);
        }
        return f0Var;
    }
}
