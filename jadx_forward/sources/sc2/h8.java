package sc2;

/* loaded from: classes2.dex */
public final class h8 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc2.p8 f487485a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.av f487486b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f487487c;

    public h8(sc2.p8 p8Var, r45.av avVar, yz5.l lVar) {
        this.f487485a = p8Var;
        this.f487486b = avVar;
        this.f487487c = lVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        r45.av avVar = this.f487486b;
        sc2.p8 p8Var = this.f487485a;
        if (bitmap != null) {
            pm0.v.X(new sc2.g8(avVar, bitmap, p8Var, this.f487487c));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p8Var.f487685w, "getImage resource :" + bitmap + ' ' + avVar.m75945x2fec8307(0));
    }
}
