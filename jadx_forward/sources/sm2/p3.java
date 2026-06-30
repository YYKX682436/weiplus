package sm2;

/* loaded from: classes3.dex */
public final class p3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(java.lang.String str, sm2.o4 o4Var) {
        super(1);
        this.f491186d = str;
        this.f491187e = o4Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        km2.q qVar = (km2.q) obj;
        java.lang.String str = qVar.f390703a;
        java.lang.String str2 = this.f491186d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2)) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f491187e.f101127b;
            db5.t7.m123883x26a183b(activityC0065xcd7aa112, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573149do2, qVar.f390706d), 0).show();
        }
        return java.lang.Boolean.valueOf(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar.f390703a, str2));
    }
}
