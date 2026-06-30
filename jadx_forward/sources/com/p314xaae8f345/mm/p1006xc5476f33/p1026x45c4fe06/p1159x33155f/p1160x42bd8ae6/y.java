package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f167474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f167475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.b0 f167476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.MenuItem menuItem, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.b0 b0Var, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f167475e = menuItem;
        this.f167476f = b0Var;
        this.f167477g = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.y(this.f167475e, this.f167476f, this.f167477g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f167474d;
        android.view.MenuItem menuItem = this.f167475e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int itemId = menuItem.getItemId();
            java.lang.String str = itemId != 0 ? itemId != 1 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "burst" : "one";
            ix5.h hVar = ix5.h.f377164b;
            java.util.Map e17 = kz5.b1.e(new jz5.l("mode", str));
            this.f167474d = 1;
            obj = hVar.g("frameCapture", e17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Object obj2 = ((java.util.Map) obj).get("result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        android.content.Context context = this.f167477g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.b0 b0Var = this.f167476f;
        if (booleanValue) {
            java.lang.String str2 = ((java.lang.Object) menuItem.getTitle()) + "成功";
            b0Var.getClass();
            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.a0(context, str2));
        } else {
            java.lang.String str3 = ((java.lang.Object) menuItem.getTitle()) + "失败";
            b0Var.getClass();
            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.a0(context, str3));
        }
        return jz5.f0.f384359a;
    }
}
