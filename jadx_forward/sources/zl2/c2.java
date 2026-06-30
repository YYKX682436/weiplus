package zl2;

/* loaded from: classes2.dex */
public final class c2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f555228b;

    public c2(android.content.Context context, yz5.a aVar) {
        this.f555227a = context;
        this.f555228b = aVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUtil", "[CgiFinderFeedBack] errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        if (fVar.f152149b == 0 && fVar.f152148a == 0) {
            android.content.Context context = this.f555227a;
            db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573338ea5), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            pm0.v.X(new zl2.b2(this.f555228b));
        }
        return jz5.f0.f384359a;
    }
}
