package dk5;

/* loaded from: classes5.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f316215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f316216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f316217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, int i17, java.util.List list) {
        super(0);
        this.f316215d = u3Var;
        this.f316216e = activityC0065xcd7aa112;
        this.f316217f = i17;
        this.f316218g = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f316215d.setMessage(this.f316216e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oa6, java.lang.Integer.valueOf(this.f316217f + 1), java.lang.Integer.valueOf(this.f316218g.size())));
        return jz5.f0.f384359a;
    }
}
