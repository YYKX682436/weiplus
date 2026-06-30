package of4;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 f426639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f426640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426641f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f426642g;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 activityC18468x57f0fe93, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        this.f426639d = activityC18468x57f0fe93;
        this.f426640e = h0Var;
        this.f426641f = str;
        this.f426642g = h0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.ActivityC18468x57f0fe93 activityC18468x57f0fe93 = this.f426639d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502 = activityC18468x57f0fe93.f253398f;
        if (c18497x85806502 != null) {
            c18497x85806502.o(false, true);
            c18497x85806502.mo71374xed71df24(activityC18468x57f0fe93.f253397e);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f426640e;
        if (h0Var.f391656d == null) {
            h0Var.f391656d = new java.util.ArrayList();
        }
        mf4.d dVar = mf4.d.f407693a;
        long j17 = mf4.d.f407696d.f142452e;
        if (j17 == 4 || j17 == 6) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Di((java.util.List) h0Var.f391656d, mf4.d.f407696d.f142452e);
        } else if (j17 == 5) {
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).Di(kz5.c0.d(this.f426641f), mf4.d.f407696d.f142452e);
        } else if (j17 == 12 || j17 == 13) {
            java.lang.Object obj = this.f426642g.f391656d;
        }
    }
}
