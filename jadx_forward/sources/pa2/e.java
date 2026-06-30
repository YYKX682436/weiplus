package pa2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f434506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa2.g f434507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, pa2.g gVar) {
        super(1);
        this.f434506d = u3Var;
        this.f434507e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f434506d.dismiss();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doUnpublish failed: errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderTemplateShareHandler", sb6.toString());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f434507e.f515691a;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(activityC0065xcd7aa112);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f571924to);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
