package qt3;

/* loaded from: classes4.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.g f448166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f448167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 f448168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f448169g;

    public d(qt3.g gVar, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        this.f448166d = gVar;
        this.f448167e = context;
        this.f448168f = c16991x15ced046;
        this.f448169g = bundle;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 model = this.f448168f;
        android.content.Context context = this.f448167e;
        qt3.g gVar = this.f448166d;
        if (i17 == 0) {
            gVar.getClass();
            if (model != null) {
                java.lang.String str = model.f237195f;
                if (str == null || str.length() == 0) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_extra_data", this.f448169g);
                intent.putExtra("KSEGMENTMEDIAINFO", model);
                intent.putExtra("Op_Replace_Source_Pic", true);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            gVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new qt3.f(gVar, context, model), new qt3.e(context));
            return;
        }
        java.lang.String str2 = model.f237195f;
        if (str2 == null) {
            str2 = "";
        }
        gVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMRecordUI", "gotoSelectConversationUI: path=".concat(str2));
        gVar.f448174d = str2;
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(str2);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        n13.r rVar = new n13.r();
        rVar.f415651b = 1;
        rVar.f415653d.f415672a = 9;
        ((dk5.b0) b0Var).Bi(context, aVar, rVar);
    }
}
