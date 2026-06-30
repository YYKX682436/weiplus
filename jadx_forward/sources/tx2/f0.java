package tx2;

/* loaded from: classes3.dex */
public final class f0 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f504088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f504089b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f504090c;

    public f0(r45.h32 h32Var, tx2.i0 i0Var, java.lang.String str) {
        this.f504088a = h32Var;
        this.f504089b = i0Var;
        this.f504090c = str;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String m75945x2fec8307 = this.f504088a.m75945x2fec8307(4);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            linkedHashMap.put("notice_id", m75945x2fec8307);
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.u1 u1Var = ml2.u1.B;
            android.content.Context context = this.f504089b.f199914d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            zy2.zb.I8(zbVar, u1Var, linkedHashMap, null, java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6().m75939xb282bd08(5)), null, this.f504090c, false, 84, null);
        }
    }
}
