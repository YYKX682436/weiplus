package io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1", f = "PatchedConnectivityPlugin.kt", l = {47}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1 */
/* loaded from: classes11.dex */
public final class C28755xa38fe13e extends qz5.l implements yz5.p {

    /* renamed from: $call */
    final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff f71942x229c882;

    /* renamed from: $result */
    final /* synthetic */ io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result f71943x38ae1d41;
    java.lang.Object L$0;

    /* renamed from: label */
    int f71944x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28754x2f206af1 f71945xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28755xa38fe13e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result, io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28754x2f206af1 c28754x2f206af1, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28755xa38fe13e> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f71942x229c882 = c28687x4bb242ff;
        this.f71943x38ae1d41 = result;
        this.f71945xcbdd23aa = c28754x2f206af1;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28755xa38fe13e(this.f71942x229c882, this.f71943x38ae1d41, this.f71945xcbdd23aa, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result;
        io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e c28749xce279e1e;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result2;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f71944x61f7ef4;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f71942x229c882.f71610xbfc5d0e1, "check")) {
                this.f71943x38ae1d41.mo65719xbc9fa82f();
                return jz5.f0.f384359a;
            }
            result = this.f71943x38ae1d41;
            c28749xce279e1e = this.f71945xcbdd23aa.connectivity;
            if (c28749xce279e1e != null) {
                this.L$0 = result;
                this.f71944x61f7ef4 = 1;
                java.lang.Object m138868x8c549688 = c28749xce279e1e.m138868x8c549688(this);
                if (m138868x8c549688 == aVar) {
                    return aVar;
                }
                result2 = result;
                obj = m138868x8c549688;
            }
            result2 = result;
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
            result2.mo65720x90b54003(str);
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        result2 = (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result) this.L$0;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        str = (java.lang.String) obj;
        if (str == null) {
            result = result2;
            result2 = result;
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37138xa03a0bfc;
        }
        result2.mo65720x90b54003(str);
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28755xa38fe13e) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
