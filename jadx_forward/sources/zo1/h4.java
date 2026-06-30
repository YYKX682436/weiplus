package zo1;

/* loaded from: classes5.dex */
public final class h4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f556168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f556169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f556170f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(zo1.k4 k4Var, qo1.f0 f0Var, float f17) {
        super(0);
        this.f556168d = k4Var;
        this.f556169e = f0Var;
        this.f556170f = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qo1.f0 f0Var;
        zo1.k4 k4Var = this.f556168d;
        java.util.Iterator it = k4Var.f556207e.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            f0Var = this.f556169e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) it.next()).f297362d == f0Var.f447016i) {
                break;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pkgId=");
        sb6.append(f0Var.f447016i);
        sb6.append(", position = ");
        sb6.append(i17);
        sb6.append(", percentage=");
        float f17 = this.f556170f;
        sb6.append(f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        if (i17 != -1) {
            k4Var.m8148xed6e4d18(i17, kz5.c0.i(1, java.lang.Float.valueOf(f17), f0Var));
        }
        return jz5.f0.f384359a;
    }
}
