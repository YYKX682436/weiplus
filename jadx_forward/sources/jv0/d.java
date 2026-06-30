package jv0;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jv0.g f383715d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jv0.g gVar) {
        super(1);
        this.f383715d = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        jv0.g gVar = this.f383715d;
        ex0.f fVar = gVar.f383721q;
        if (fVar != null) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a612 = fVar.l().m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a612, "getEndTime(...)");
            fVar.z(m34007xde00a612);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34007xde00a6122 = gVar.f383720p.m34007xde00a612();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34007xde00a6122, "getEndTime(...)");
            fVar.y(m34007xde00a6122);
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a m34005x51e8b0a = gVar.f383720p.m34005x51e8b0a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m34005x51e8b0a, "getDuration(...)");
            fVar.z(m34005x51e8b0a);
        }
        gVar.s7();
        return java.lang.Boolean.TRUE;
    }
}
