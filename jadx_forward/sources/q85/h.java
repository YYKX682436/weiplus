package q85;

/* loaded from: classes3.dex */
public final /* synthetic */ class h extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public h(java.lang.Object obj) {
        super(1, obj, q85.g.class, "getPlayer", "getPlayer(Landroid/content/Context;)Landroid/view/View;", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.content.Context p07 = (android.content.Context) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        q85.g gVar = (q85.g) this.f72685xcfcbe9ef;
        gVar.getClass();
        if (gVar.f442340i == null) {
            java.util.List list = q85.g.f442334o;
            if (list.size() > 0) {
                gVar.f442340i = (pk4.d) fp.l.a(list);
            }
            if (gVar.f442340i == null) {
                i95.m c17 = i95.n0.c(df0.t.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                gVar.f442340i = df0.t.P5((df0.t) c17, p07, null, 0, 6, null);
                list.size();
            }
        }
        v65.i.b(gVar.f442339h, null, new q85.e(gVar, null), 1, null);
        java.lang.Object obj2 = gVar.f442340i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        return (android.view.View) obj2;
    }
}
