package dk2;

/* loaded from: classes3.dex */
public final class v4 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f315764d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f315765e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f315766f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f315767g;

    public v4(android.content.Context context, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f315764d = context;
        this.f315765e = buContext;
        this.f315766f = "";
        this.f315767g = true;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveBlackResultCa", "onModifyResult black: " + this.f315767g + " userName: " + this.f315766f + " :" + ret.m75939xb282bd08(1));
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        android.content.Context context = this.f315764d;
        if (m75939xb282bd08 != 0) {
            java.lang.String string = this.f315767g ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7h) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            db5.t7.g(context, string);
        } else {
            ((mm2.c1) this.f315765e.a(mm2.c1.class)).S5.put(this.f315766f, java.lang.Boolean.valueOf(this.f315767g));
            java.lang.String string2 = this.f315767g ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7g) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e7v);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            db5.t7.h(context, string2);
        }
    }
}
