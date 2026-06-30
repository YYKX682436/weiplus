package b92;

/* loaded from: classes3.dex */
public final class k2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b92.m2 f99986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f99987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f99988f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f99989g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f99990h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f99991i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99992m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f99993n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(b92.m2 m2Var, int i17, long j17, android.os.Bundle bundle, int i18, int i19, java.lang.String str, int i27) {
        super(0);
        this.f99986d = m2Var;
        this.f99987e = i17;
        this.f99988f = j17;
        this.f99989g = bundle;
        this.f99990h = i18;
        this.f99991i = i19;
        this.f99992m = str;
        this.f99993n = i27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.v52 v52Var = new r45.v52();
        v52Var.set(0, java.lang.Long.valueOf(this.f99988f));
        android.os.Bundle bundle = this.f99989g;
        v52Var.set(1, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46336xe22331f7)));
        v52Var.set(2, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46332x487412f6)));
        v52Var.set(3, java.lang.Integer.valueOf(this.f99990h));
        v52Var.set(4, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46331x1cbcf0f9)));
        v52Var.set(5, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46325x901c335e)));
        v52Var.set(6, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46312x2cd62fb9)));
        v52Var.set(7, java.lang.Integer.valueOf(this.f99991i));
        v52Var.set(8, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46327xe105b3b3)));
        v52Var.set(9, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46314xbd390ace)));
        v52Var.set(10, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46338x720e4446)));
        v52Var.set(11, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46318x5ee342d1)));
        v52Var.set(12, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46319x52fadc5f)));
        v52Var.set(13, java.lang.Integer.valueOf((int) bundle.getFloat(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46315xfa37501a)));
        v52Var.set(14, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46321x5b407619)));
        v52Var.set(15, java.lang.Integer.valueOf(bundle.getInt(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46323x28b0e3f9)));
        long j17 = bundle.getLong("NET_STATUS_START_TIME", 0L);
        v52Var.set(19, java.lang.Integer.valueOf((int) (j17 / 1000)));
        v52Var.set(16, java.lang.Integer.valueOf((int) (c01.id.c() - j17)));
        if (bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46320xa2c7de7f) != null) {
            v52Var.set(26, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) kz5.n0.X(r26.n0.f0(r3, new java.lang.String[]{"/"}, false, 0, 6, null)), 0)));
            v52Var.set(27, java.lang.Float.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) kz5.n0.i0(r26.n0.f0(r3, new java.lang.String[]{"/"}, false, 0, 6, null)), 0)));
        }
        java.lang.String string = bundle.getString(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46324xc1721618);
        if (string == null) {
            string = "";
        }
        v52Var.set(24, string);
        v52Var.set(31, this.f99992m);
        v52Var.set(32, java.lang.Integer.valueOf(this.f99993n));
        b92.m2 m2Var = this.f99986d;
        int size = m2Var.f100023p.size();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = m2Var.f100023p;
        int i17 = this.f99987e;
        if (size > i17) {
            int i18 = size - i17;
            for (int i19 = 0; i19 < i18; i19++) {
                fp.l.a(copyOnWriteArrayList);
            }
        }
        copyOnWriteArrayList.add(v52Var);
        return jz5.f0.f384359a;
    }
}
