package tf5;

/* loaded from: classes.dex */
public final class j extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f500529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f500529d = jz5.h.b(new tf5.i(this));
    }

    public static final void O6(android.content.Context context, java.lang.String viewId) {
        tf5.j jVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewId, "viewId");
        if (context == null) {
            jVar = null;
        } else {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            jVar = (tf5.j) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(tf5.j.class);
        }
        if (jVar != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", kz5.c1.l(new jz5.l("page_sessionid", java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) jVar.f500529d).mo141623x754a37bb()).longValue())), new jz5.l("new_friends_page_type", 1), new jz5.l("view_id", viewId)), 33926);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        cy1.a aVar = (cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(m158354x19263085(), iy1.c.FMessageConversationUI)).ik(m158354x19263085(), 4, 33926);
        aVar.fk(m158354x19263085(), "page_sessionid", java.lang.Long.valueOf(((java.lang.Number) ((jz5.n) this.f500529d).mo141623x754a37bb()).longValue()));
        aVar.fk(m158354x19263085(), "new_friends_page_type", 1);
    }
}
