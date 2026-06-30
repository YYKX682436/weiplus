package vv4;

/* loaded from: classes4.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 f522054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f522055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522057g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f522058h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f522059i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1, int i17, java.lang.String str, java.lang.String str2, int i18, long j17) {
        super(0);
        this.f522054d = activityC19219x16fdfab1;
        this.f522055e = i17;
        this.f522056f = str;
        this.f522057g = str2;
        this.f522058h = i18;
        this.f522059i = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1 = this.f522054d;
        int intExtra = activityC19219x16fdfab1.getIntent().getIntExtra("key_source", 0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
        c6367x7875a8e4.r(activityC19219x16fdfab1.f263207n);
        c6367x7875a8e4.f137161f = intExtra;
        c6367x7875a8e4.f137160e = this.f522055e;
        switch (intExtra) {
            case 11:
            case 12:
            case 13:
            case 14:
                c6367x7875a8e4.f137162g = 83;
                break;
            case 15:
            case 16:
                c6367x7875a8e4.f137162g = activityC19219x16fdfab1.f263204h;
                break;
            case 17:
                c6367x7875a8e4.f137162g = activityC19219x16fdfab1.f263204h;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
                c6367x7875a8e4.f137162g = 100;
                break;
            default:
                c6367x7875a8e4.f137162g = 81;
                break;
        }
        c6367x7875a8e4.q("");
        c6367x7875a8e4.p("");
        c6367x7875a8e4.t(this.f522056f);
        c6367x7875a8e4.s(kk.k.e(this.f522057g));
        c6367x7875a8e4.f137169n = this.f522058h;
        c6367x7875a8e4.f137168m = this.f522059i;
        c6367x7875a8e4.k();
        su4.k3.m(c6367x7875a8e4);
        return jz5.f0.f384359a;
    }
}
