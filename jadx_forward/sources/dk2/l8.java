package dk2;

/* loaded from: classes.dex */
public final class l8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(android.content.Context context, yz5.p pVar) {
        super(0);
        this.f315261d = context;
        this.f315262e = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f315261d;
        db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573041db0), 0).show();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "checkAppBrand:" + context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573041db0));
        this.f315262e.mo149xb9724478(java.lang.Boolean.FALSE, "app_brand");
        return jz5.f0.f384359a;
    }
}
