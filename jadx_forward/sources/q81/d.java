package q81;

/* loaded from: classes7.dex */
public class d implements k91.c5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f442231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f442232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f442233c;

    public d(q81.f fVar, java.lang.String str, km5.b bVar, int i17) {
        this.f442231a = str;
        this.f442232b = bVar;
        this.f442233c = i17;
    }

    @Override // k91.c5
    public void a(k91.b5 b5Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Predownload.CmdGetContact", "onGetContact with username[%s] result[%s]", this.f442231a, b5Var);
        this.f442232b.c(java.lang.Boolean.FALSE);
        int ordinal = b5Var.ordinal();
        int i17 = this.f442233c;
        if (ordinal != 0) {
            if (ordinal == 1) {
                r81.f.INSTANCE.b(i17, 25);
                return;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    return;
                }
                r81.f.INSTANCE.b(i17, 26);
                return;
            }
        }
        r81.f.INSTANCE.b(i17, 27);
    }
}
