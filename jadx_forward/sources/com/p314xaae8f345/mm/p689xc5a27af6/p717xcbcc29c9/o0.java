package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f147044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f147045e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f147045e = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.o0(this.f147045e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var = this.f147045e;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f147044d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f147044d = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(300L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            if (b1Var.f146893w.getAndSet(false) && b1Var.f146886p == oy.k.f431359g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onResume resuming playback");
                b1Var.rj();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onResume skipped, shouldResume=false or state changed");
            }
        } catch (java.util.concurrent.CancellationException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTtsService", "onAudioFocusChange onResume cancellation");
        }
        return jz5.f0.f384359a;
    }
}
