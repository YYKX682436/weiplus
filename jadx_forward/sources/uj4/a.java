package uj4;

/* loaded from: classes11.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj4.e f509942d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uj4.e eVar) {
        super(1);
        this.f509942d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) obj;
        uj4.e eVar = this.f509942d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f509950d, "addStatusFeedVASFragmentToRoot: attach fragment, " + abstractActivityC22579xbed01a37);
        eVar.f509955i = new java.lang.ref.WeakReference(abstractActivityC22579xbed01a37);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f509950d, "doOnInit: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782 V6 = eVar.V6();
        if (V6 != null) {
            V6.f255319t = false;
            uj4.d listener = eVar.f509963t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            V6.f255313n.add(listener);
        }
        return jz5.f0.f384359a;
    }
}
