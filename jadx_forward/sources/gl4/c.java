package gl4;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f354380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f354381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354382f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354383g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f354384h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, boolean z18, gl4.z zVar, android.content.Context context, yz5.l lVar) {
        super(1);
        this.f354380d = z17;
        this.f354381e = z18;
        this.f354382f = zVar;
        this.f354383g = context;
        this.f354384h = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bw5.p80 p80Var = (bw5.p80) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMembershipStatus fetchMembershipAsync callback membershipInfo: ");
        sb6.append(p80Var != null ? java.lang.Integer.valueOf(p80Var.f113026d) : null);
        sb6.append(", needRetry: ");
        sb6.append(this.f354380d);
        sb6.append(", isRetry: ");
        sb6.append(this.f354381e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        if (!this.f354381e) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f354382f.f354433b;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            gl4.z zVar = this.f354382f;
            android.content.Context context = this.f354383g;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, 0, null);
            f17.show();
            zVar.f354433b = f17;
        }
        if (p80Var != null && p80Var.f113026d == 1) {
            yz5.l lVar = this.f354384h;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f354382f.f354433b;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        } else if (this.f354380d) {
            ((ku5.t0) ku5.t0.f394148d).k(new gl4.b(this.f354382f, this.f354383g, this.f354384h), 2000L);
        } else {
            yz5.l lVar2 = this.f354384h;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.FALSE);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f354382f.f354433b;
            if (u3Var3 != null) {
                u3Var3.dismiss();
            }
        }
        return jz5.f0.f384359a;
    }
}
