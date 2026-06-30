package zl2;

/* loaded from: classes3.dex */
public final class h1 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f555330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f555331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f555332c;

    public h1(gk2.e eVar, android.content.Context context, yz5.a aVar) {
        this.f555330a = eVar;
        this.f555331b = context;
        this.f555332c = aVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notifyHideIdentitySwitch")) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f314905a;
        gk2.e eVar = this.f555330a;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 == null) {
            return false;
        }
        dk2.xf.i(k17, xy2.c.e(this.f555331b), 2, null, false, 0L, null, new zl2.g1(eVar, this.f555332c), 56, null);
        return false;
    }
}
