package nc5;

/* loaded from: classes10.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417740e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nc5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f417740e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        nc5.k kVar = new nc5.k(this.f417740e, interfaceC29045xdcb5ca57);
        kVar.f417739d = obj;
        return kVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        nc5.k kVar = (nc5.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f417739d;
        nc5.b bVar = nc5.b.f417722a;
        nc5.o oVar = this.f417740e;
        bVar.a(oVar.f417747b);
        nc5.b.f417724c = "";
        nc5.b.f417725d = oVar.f417753h;
        if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            oVar.f417757l = true;
            qk.x7 x7Var = (qk.x7) i95.n0.c(qk.x7.class);
            android.content.Context context = oVar.f417746a;
            ((c61.ec) x7Var).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryPlugin", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
            aq.p.f94463b = bVar;
            aq.o.f94454b = nc5.b.f417723b;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p2776x373aa5.p2777x9d4bf30f.ActivityC22818x36ce40ba.class);
            intent.putExtra("KEY_IS_INIT", true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/ImageQueryPlugin", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/ImageQueryPlugin", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "(Landroid/content/Context;Lcom/tencent/mm/api/IImageQueryComposeOp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
