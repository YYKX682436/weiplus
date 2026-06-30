package mm1;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f410161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm1.b0 f410162f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f410163g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f410164h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 f410165i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f410166m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.os.Bundle bundle, mm1.b0 b0Var, pi0.l1 l1Var, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, java.lang.Long l17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410161e = bundle;
        this.f410162f = b0Var;
        this.f410163g = l1Var;
        this.f410164h = context;
        this.f410165i = c10716x931597c6;
        this.f410166m = l17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm1.a0(this.f410161e, this.f410162f, this.f410163g, this.f410164h, this.f410165i, this.f410166m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410160d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.os.Bundle bundle = this.f410161e;
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            android.os.Bundle bundle2 = bundle;
            bundle2.putString("session_id", this.f410162f.f410172e);
            pi0.l1 l1Var = this.f410163g;
            android.content.Context context = this.f410164h;
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f410165i;
            um1.a aVar2 = mm1.b0.f410168i;
            java.lang.Long l17 = this.f410166m;
            this.f410160d = 1;
            obj = l1Var.d(context, c10716x931597c6, com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.ActivityC12823xa4912a28.class, l17, bundle2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.content.Intent intent = (android.content.Intent) obj;
        if (intent != null) {
            android.content.Context context2 = this.f410164h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/audio/BizAudioRouter$showBizStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/audio/BizAudioRouter$showBizStyle$3", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
