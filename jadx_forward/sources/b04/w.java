package b04;

/* loaded from: classes5.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b04.z f98473f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.util.List list, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185, b04.z zVar) {
        super(1);
        this.f98471d = list;
        this.f98472e = c22675xc8629185;
        this.f98473f = zVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 view = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ll5.a m48328xa0ab20ce = view.m48328xa0ab20ce();
        if (m48328xa0ab20ce != null && m48328xa0ab20ce.f400803h) {
            for (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 : this.f98471d) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c22675xc8629185, this.f98472e)) {
                    this.f98473f.getClass();
                    ll5.a m48328xa0ab20ce2 = c22675xc8629185.m48328xa0ab20ce();
                    if (m48328xa0ab20ce2 != null && m48328xa0ab20ce2.f400803h) {
                        m48328xa0ab20ce2.f400803h = false;
                        c22675xc8629185.m48330xfcfee142(m48328xa0ab20ce2);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
