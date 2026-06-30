package tm2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f502075f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(tm2.s2 s2Var, java.lang.String str, int i17) {
        super(0);
        this.f502073d = s2Var;
        this.f502074e = str;
        this.f502075f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tm2.s2 s2Var = this.f502073d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = s2Var.f101133b;
        java.lang.String str = this.f502074e;
        if (str == null) {
            str = activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cla);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        db5.t7.m123883x26a183b(activityC0065xcd7aa112, str, 0).show();
        fm2.b bVar = s2Var.f101134c;
        if (bVar != null) {
            qo0.c.a(bVar, qo0.b.f446896i, null, 2, null);
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("live_user_exit_reason", this.f502075f);
        fm2.b bVar2 = s2Var.f101134c;
        if (bVar2 != null) {
            bVar2.mo46557x60d69242(qo0.b.D1, bundle);
        }
        return jz5.f0.f384359a;
    }
}
