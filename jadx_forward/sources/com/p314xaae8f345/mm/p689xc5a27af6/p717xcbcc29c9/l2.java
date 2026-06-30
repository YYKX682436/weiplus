package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes8.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e f147034d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e) {
        super(0);
        this.f147034d = c10511xc2ae2c6e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.C10511xc2ae2c6e c10511xc2ae2c6e = this.f147034d;
        if (c10511xc2ae2c6e.f146863e.mo273xed6858b4().b() != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            c10511xc2ae2c6e.f146863e.mo273xed6858b4().a(c10511xc2ae2c6e);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatRecordsTts.LifecycleScope", "leak this scope, because lifecycle is already destroy");
        }
        return jz5.f0.f384359a;
    }
}
