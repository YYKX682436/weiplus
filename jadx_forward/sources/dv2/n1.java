package dv2;

/* loaded from: classes8.dex */
public final class n1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dv2.o1 f325442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f325443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f325444c;

    public n1(dv2.o1 o1Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var) {
        this.f325442a = o1Var;
        this.f325443b = c0Var;
        this.f325444c = m8Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void a(com.p314xaae8f345.mm.p944x882e457a.f cgiBack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiBack, "cgiBack");
        java.lang.String str = cgiBack.f152150c;
        dv2.o1 o1Var = this.f325442a;
        if (str != null) {
            o1Var.f325458o.getClass();
            int i17 = 0;
            try {
                int mo15080xc3ca103c = new cl0.g(str).mo15080xc3ca103c("appera_times", 0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckHelper", "[getJumpAppearTimes] appearTimes:" + mo15080xc3ca103c);
                i17 = mo15080xc3ca103c;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderSafePreCheckHelper", "[getJumpAppearTimes] catch exception:" + e17.getMessage());
            }
            o1Var.f325452f = i17;
        }
        o1Var.f325456m = ((r45.l23) cgiBack.f152151d).m75934xbce7f2f(5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void b() {
        this.f325443b.f391645d = true;
        dv2.o1 o1Var = this.f325442a;
        o1Var.f325450d++;
        this.f325444c.b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[preCheckInner] onShowTipsDialog showCount:" + o1Var.f325450d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8
    public void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.h9 result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSafePreCheckUIC", "[preCheckInner] onEndCheck confirm:" + result.f183766a + " fromDialog:" + result.f183767b);
        this.f325443b.f391645d = true;
        dv2.o1.O6(this.f325442a, this.f325444c, result);
    }
}
