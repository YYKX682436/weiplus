package id2;

/* loaded from: classes.dex */
public final class s3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(id2.u3 u3Var, android.content.Context context) {
        super(2);
        this.f372327d = u3Var;
        this.f372328e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj;
        java.lang.String str = (java.lang.String) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLongFeedGen retCode:");
        sb6.append(num);
        sb6.append(", retMsg:");
        sb6.append(str == null ? "" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", sb6.toString());
        id2.u3 u3Var = this.f372327d;
        android.content.Context context = this.f372328e;
        if (num != null && num.intValue() == 0) {
            java.lang.String string = u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.now);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = string;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
        } else {
            if (str == null || str.length() == 0) {
                java.lang.String string2 = u3Var.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.not);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var2.f293309c = string2;
                e4Var2.c();
            } else {
                int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var3 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var3.f293309c = str;
                e4Var3.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
