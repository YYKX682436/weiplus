package cu2;

/* loaded from: classes.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f303970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar, android.content.Context context) {
        super(1);
        this.f303970d = u3Var;
        this.f303971e = lVar;
        this.f303972f = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f303970d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        yz5.l lVar = this.f303971e;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
        }
        db5.t7.m123882x26a183b(this.f303972f, com.p314xaae8f345.mm.R.C30867xcad56011.eyh, 0).show();
        return jz5.f0.f384359a;
    }
}
