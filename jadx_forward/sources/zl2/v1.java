package zl2;

/* loaded from: classes2.dex */
public final class v1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f555529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f555530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f555532g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(db5.g4 g4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        super(1);
        this.f555529d = g4Var;
        this.f555530e = abstractC14490x69736cb5;
        this.f555531f = context;
        this.f555532g = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        jz5.o it = (jz5.o) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ((java.util.ArrayList) this.f555529d.f309877d).clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f555530e;
        boolean z17 = !abstractC14490x69736cb5.getFeedObject().m59203x7541886a(103);
        if (z17) {
            this.f555529d.j(103, (java.lang.CharSequence) it.f384375e, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
        } else {
            db5.g4 g4Var = this.f555529d;
            android.content.Context context = this.f555531f;
            g4Var.j(103, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54), com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z17);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            ml2.u1 u1Var = ml2.u1.f409598n;
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((b92.d1) zbVar).sj(u1Var, abstractC14490x69736cb5, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6());
        }
        this.f555532g.j();
        return jz5.f0.f384359a;
    }
}
