package xh4;

/* loaded from: classes.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f536153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f536154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f536155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f536156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.app.Activity activity, yz5.a aVar, yz5.a aVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f536154e = activity;
        this.f536155f = aVar;
        this.f536156g = aVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xh4.o(this.f536154e, this.f536155f, this.f536156g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xh4.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f536153d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (uh4.c0.m168057xb411027f().T2()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] checkSysPwd");
                android.app.Activity activity = this.f536154e;
                this.f536153d = 1;
                p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
                rVar.k();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkSysPwd]");
                android.content.Intent intent = new android.content.Intent("com.android.action.PARENTAL_CREDENTIAL_AUTHENTICATE");
                intent.putExtra("key_authentication_messenger", new android.os.Messenger(new xh4.r(rVar, android.os.Looper.getMainLooper())));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(999);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/utils/TeenModeUtil", "checkSysPwd", "(Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                obj = rVar.j();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f536155f.mo152xb9724478();
            return jz5.f0.f384359a;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (obj != xh4.k.f536141d) {
            yz5.a aVar2 = this.f536156g;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
            return jz5.f0.f384359a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkNeedShowDialogAfterVerifyPwd] checkSysPwd success");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        xh4.n nVar = new xh4.n(this.f536154e, null);
        this.f536153d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, nVar, this) == aVar) {
            return aVar;
        }
        this.f536155f.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
