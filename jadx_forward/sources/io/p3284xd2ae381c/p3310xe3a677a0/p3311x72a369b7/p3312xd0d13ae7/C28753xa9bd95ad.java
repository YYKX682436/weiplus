package io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7;

@qz5.f(c = "io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1", f = "PatchedConnectivityBroadcastReceiver.kt", l = {71, 72}, m = "invokeSuspend")
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1 */
/* loaded from: classes11.dex */
public final class C28753xa9bd95ad extends qz5.l implements yz5.p {
    java.lang.Object L$0;
    java.lang.Object L$1;

    /* renamed from: label */
    int f71934x61f7ef4;

    /* renamed from: this$0 */
    final /* synthetic */ io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752 f71935xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28753xa9bd95ad(io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752 c28751x907cc752, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28753xa9bd95ad> interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f71935xcbdd23aa = c28751x907cc752;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<jz5.f0> mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<?> interfaceC29045xdcb5ca57) {
        return new io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28753xa9bd95ad(this.f71935xcbdd23aa, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.StringBuilder sb6;
        io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e c28749xce279e1e;
        java.lang.String str2;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink;
        io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28749xce279e1e c28749xce279e1e2;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f71934x61f7ef4;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            str = this.f71935xcbdd23aa.TAG;
            sb6 = new java.lang.StringBuilder();
            sb6.append("sendEvent, networkType:");
            c28749xce279e1e = this.f71935xcbdd23aa.connectivity;
            this.L$0 = str;
            this.L$1 = sb6;
            this.f71934x61f7ef4 = 1;
            java.lang.Object m138868x8c549688 = c28749xce279e1e.m138868x8c549688(this);
            if (m138868x8c549688 == aVar) {
                return aVar;
            }
            str2 = str;
            obj = m138868x8c549688;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventSink2 = (io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink) this.L$0;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                eventSink2.mo138418x90b54003(obj);
                return jz5.f0.f384359a;
            }
            sb6 = (java.lang.StringBuilder) this.L$1;
            str2 = (java.lang.String) this.L$0;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        sb6.append((java.lang.String) obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        eventSink = this.f71935xcbdd23aa.events;
        if (eventSink != null) {
            c28749xce279e1e2 = this.f71935xcbdd23aa.connectivity;
            this.L$0 = eventSink;
            this.L$1 = null;
            this.f71934x61f7ef4 = 2;
            java.lang.Object m138868x8c5496882 = c28749xce279e1e2.m138868x8c549688(this);
            if (m138868x8c5496882 == aVar) {
                return aVar;
            }
            eventSink2 = eventSink;
            obj = m138868x8c5496882;
            eventSink2.mo138418x90b54003(obj);
        }
        return jz5.f0.f384359a;
    }

    @Override // yz5.p
    /* renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object mo149xb9724478(p3325xe03a0797.p3326xc267989b.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<? super jz5.f0> interfaceC29045xdcb5ca57) {
        return ((io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28753xa9bd95ad) mo148xaf65a0fc(y0Var, interfaceC29045xdcb5ca57)).mo150x989b7ca4(jz5.f0.f384359a);
    }
}
