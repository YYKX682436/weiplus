package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f289682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI f289683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f289683e = unreadConversationFmUI;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.o(this.f289683e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f289682d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.ActivityC22395xe70a9721.UnreadConversationFmUI unreadConversationFmUI = this.f289683e;
            c16718x7059cefe = unreadConversationFmUI.mvvmList;
            if (c16718x7059cefe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mvvmList");
                throw null;
            }
            p3325xe03a0797.p3326xc267989b.p3328x30012e.n2 n2Var = c16718x7059cefe.f233605v;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.n nVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.n(unreadConversationFmUI);
            this.f289682d = 1;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.q2 q2Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) n2Var;
            q2Var.getClass();
            if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l(q2Var, nVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}
