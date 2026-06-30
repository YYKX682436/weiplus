package j93;

/* loaded from: classes3.dex */
public final class r extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f380019d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f380020e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f380019d = jz5.h.b(j93.q.f380014d);
        this.f380020e = jz5.h.b(new j93.p(this));
    }

    public final java.lang.String O6() {
        return (java.lang.String) ((jz5.n) this.f380019d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            cy1.a aVar = (cy1.a) rVar;
            aVar.Mj(m158354x19263085());
            cy1.a aVar2 = (cy1.a) aVar.ak(m158354x19263085(), iy1.c.LabelSelectPage);
            aVar2.fk(m158354x19263085(), "label_select_sessionid", O6());
            aVar2.fk(m158354x19263085(), "has_manage_btn", "1");
            aVar2.fk(m158354x19263085(), "has_create_btn", "1");
            aVar2.fk(m158354x19263085(), "label_business_type", (java.lang.String) ((jz5.n) this.f380020e).mo141623x754a37bb());
            aVar2.ik(m158354x19263085(), 12, 33926);
        }
    }
}
