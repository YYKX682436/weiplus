package qe5;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.e f443616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(qe5.e eVar) {
        super(1);
        this.f443616d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kd5.e state = (kd5.e) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(state.a(kd5.o.class));
        if (((kd5.q) state.a(kd5.q.class)) != null) {
            qe5.e eVar = this.f443616d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a abstractC16084xdca2b46a = eVar.f443621d;
            if (abstractC16084xdca2b46a == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.AppAttachHandOffUIC", "mHandOffFile is null");
            } else if (abstractC16084xdca2b46a.getFileStatus() != 1) {
                abstractC16084xdca2b46a.mo65014x87c0aa90(1);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = eVar.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d T6 = ((qe5.h) pf5.z.f435481a.a(activity).a(qe5.h.class)).T6();
                if (T6 != null) {
                    java.lang.String str = T6.f68099xfeae815;
                    int i17 = x51.t1.f533619a;
                    if (str == null) {
                        str = "";
                    }
                    abstractC16084xdca2b46a.mo65015xc5e6b9d6(str);
                }
                d73.i iVar = (d73.i) i95.n0.c(d73.i.class);
                iVar.Ja(abstractC16084xdca2b46a);
                iVar.Jc(abstractC16084xdca2b46a);
            }
        }
        return jz5.f0.f384359a;
    }
}
