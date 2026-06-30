package qt1;

/* loaded from: classes7.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qt1.c f448039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f448040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ im5.c f448041c;

    public a(qt1.c cVar, p3325xe03a0797.p3326xc267989b.q qVar, im5.c cVar2) {
        this.f448039a = cVar;
        this.f448040b = qVar;
        this.f448041c = cVar2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        qt1.c cVar = this.f448039a;
        cVar.d("runCgi onTerminate, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f448040b;
        if (i18 == 0 && i17 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type RESPONSE of com.tencent.mm.plugin.car_license_plate.cgi.CarLicensePlateCgiBase.send$lambda$2");
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((r45.js5) fVar));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new qt1.f(i17, i18, str, cVar))));
        }
        this.f448041c.mo10668x2efc64();
    }
}
