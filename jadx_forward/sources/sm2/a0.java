package sm2;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f490883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(sm2.o4 o4Var, java.lang.String str, int i17, int i18) {
        super(0);
        this.f490880d = o4Var;
        this.f490881e = str;
        this.f490882f = i17;
        this.f490883g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        sm2.o4 o4Var = this.f490880d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = o4Var.f101127b;
        java.lang.String str2 = this.f490881e;
        if (str2 == null) {
            str = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        } else {
            str = str2;
        }
        db5.t7.m123883x26a183b(activityC0065xcd7aa112, str, 0).show();
        dk2.xf g17 = o4Var.g();
        if (g17 != null) {
            dk2.xf.f(g17, 0, new sm2.z(o4Var), 1, null);
        }
        sm2.o4 o4Var2 = this.f490880d;
        int i17 = this.f490882f;
        int i18 = this.f490883g;
        if (str2 == null) {
            str2 = "";
        }
        o4Var2.z(i17, i18, str2, null, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p8.f183993a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t8.B.f184073b, null, false, true, 6, null);
        return jz5.f0.f384359a;
    }
}
