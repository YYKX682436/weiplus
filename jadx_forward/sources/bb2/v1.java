package bb2;

/* loaded from: classes.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f100556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(java.util.List list, java.util.List list2, java.util.Map map, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100554d = list;
        this.f100555e = list2;
        this.f100556f = map;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bb2.v1(this.f100554d, this.f100555e, this.f100556f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bb2.v1 v1Var = (bb2.v1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Map map;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.Iterator it = kz5.n0.N(this.f100554d, 100).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            map = this.f100556f;
            if (!hasNext) {
                break;
            }
            java.util.List list = (java.util.List) it.next();
            java.util.Map t17 = kz5.c1.t(map);
            t17.put("bs_list", list.toString());
            i95.m c17 = i95.n0.c(dy1.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((cy1.a) ((dy1.r) c17)).Bj("finder_barrage_comments", "view_exp", t17, 1, false);
        }
        for (java.util.Map map2 : this.f100555e) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map2);
            java.util.Map t18 = kz5.c1.t(map2);
            t18.putAll(map);
            i95.m c18 = i95.n0.c(dy1.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ((cy1.a) ((dy1.r) c18)).Bj("finder_barrage_comments_add_one", "view_exp", t18, 1, false);
        }
        return jz5.f0.f384359a;
    }
}
