package cw1;

/* loaded from: classes12.dex */
public final class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304622d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f304623e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f304624f;

    public k6(cw1.l6 l6Var, int i17, int i18) {
        this.f304622d = l6Var;
        this.f304623e = i17;
        this.f304624f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.l6 l6Var = this.f304622d;
        l6Var.f304645g.m82049x3ae760af(this.f304623e);
        java.lang.String string = l6Var.f304639a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f304624f)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        l6Var.f304648j.setText(format);
    }
}
