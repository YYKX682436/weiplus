package ho1;

/* loaded from: classes5.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f364377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f364378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f364380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, yz5.l lVar, po1.d dVar) {
        super(0);
        this.f364377d = u3Var;
        this.f364378e = c0Var;
        this.f364379f = lVar;
        this.f364380g = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f364377d.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("save new device returned, isOk=");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f364378e;
        sb6.append(c0Var.f391645d);
        sb6.append('.');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
        boolean z17 = c0Var.f391645d;
        yz5.l lVar = this.f364379f;
        if (z17) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(this.f364380g.f438828a)));
        } else {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("error_permission_denied")));
        }
        return jz5.f0.f384359a;
    }
}
