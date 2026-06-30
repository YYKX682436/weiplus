package mi4;

/* loaded from: classes9.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi4.h f408314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.w f408315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mi4.h hVar, mj4.w wVar, android.content.Context context) {
        super(1);
        this.f408314d = hVar;
        this.f408315e = wVar;
        this.f408316f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f408314d.L;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        android.content.Context context = this.f408316f;
        if (booleanValue) {
            mj4.w Ai = ((ki4.x) i95.n0.c(ki4.x.class)).Ai(this.f408315e.f76642xbed8694c);
            if (Ai != null) {
                Ai.f76637x95576e57 = 1;
                ni4.x.f419309d.n().mo9952xce0038c9(Ai, new java.lang.String[0]);
            }
            db5.t7.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvz), new mi4.e(context));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMHalfBottomDialog", "greeting reply failed");
            db5.e1.s(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f81514xe34e69a8), "");
        }
        return jz5.f0.f384359a;
    }
}
