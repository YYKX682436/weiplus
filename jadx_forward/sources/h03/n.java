package h03;

/* loaded from: classes2.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 f359434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h03.q f359435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f359436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f359437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f359438h;

    public n(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195, h03.q qVar, long j17, byte[] bArr, android.app.Activity activity) {
        this.f359434d = c24451x12373195;
        this.f359435e = qVar;
        this.f359436f = j17;
        this.f359437g = bArr;
        this.f359438h = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc2.q f76;
        fc2.q f77;
        fc2.q f78;
        so2.u1 d17 = c03.i.d(this.f359434d);
        if (d17 != null) {
            this.f359435e.b(d17.getFeedObject(), (int) this.f359436f);
            byte[] bArr = this.f359437g;
            android.app.Activity context = this.f359438h;
            if (bArr != null) {
                bw5.jd0 mo11468x92b714fd = new bw5.jd0().mo11468x92b714fd(bArr);
                int i17 = mo11468x92b714fd.f110472o;
                int i18 = mo11468x92b714fd.f110469i;
                int m59300x36bbd779 = d17.getFeedObject().m59300x36bbd779() * 1000;
                if (m59300x36bbd779 > 0) {
                    ec2.f fVar = new ec2.f(3);
                    fVar.f332497i = m59300x36bbd779;
                    float f17 = m59300x36bbd779;
                    fVar.f332496h = (int) ((i17 / 100.0f) * f17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    if (nyVar != null && (f78 = nyVar.f7()) != null) {
                        f78.a(fVar);
                    }
                    ec2.f fVar2 = new ec2.f(3);
                    fVar2.f332497i = m59300x36bbd779;
                    fVar2.f332496h = (int) ((i18 / 100.0f) * f17);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                    if (nyVar2 != null && (f77 = nyVar2.f7()) != null) {
                        f77.a(fVar2);
                    }
                }
            }
            ec2.f fVar3 = new ec2.f(6);
            fVar3.f332498j = d17.mo2128x1ed62e84();
            fVar3.f332499k = d17.w();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar3 == null || (f76 = nyVar3.f7()) == null) {
                return;
            }
            f76.a(fVar3);
        }
    }
}
