package kh;

/* loaded from: classes10.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.f0 f389317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(kh.f0 f0Var, java.lang.String str) {
        super(0);
        this.f389317d = f0Var;
        this.f389318e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            this.f389317d.f389326d.run();
            return jz5.f0.f384359a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Matrix.battery.ChoreographerTracker", e17, "run err: " + e17.getMessage(), new java.lang.Object[0]);
            ap.a.a(1, "errTrackChoreographer", e17, null, "errAction", "run", this.f389318e, e17.getMessage());
            throw e17;
        }
    }
}
