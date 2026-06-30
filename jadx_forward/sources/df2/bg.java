package df2;

/* loaded from: classes3.dex */
public final class bg extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f311332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f311333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f311334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xs2.p0 f311335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f311336h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(df2.ug ugVar, dk2.zf zfVar, android.view.View view, xs2.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e) {
        super(1);
        this.f311332d = ugVar;
        this.f311333e = zfVar;
        this.f311334f = view;
        this.f311335g = p0Var;
        this.f311336h = c14197x319b1b9e;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        df2.ug ugVar = this.f311332d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(ugVar.f313055m, "choose popupType:" + intValue + '!');
        if (intValue == 165 || intValue == 166) {
            df2.dg.a(ugVar, this.f311336h, this.f311333e, this.f311334f, this.f311335g);
        }
        return jz5.f0.f384359a;
    }
}
