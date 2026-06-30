package di3;

/* loaded from: classes10.dex */
public class z implements di3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f314307b;

    public z(di3.b0 b0Var, java.lang.String str, t21.v2 v2Var) {
        this.f314306a = str;
        this.f314307b = v2Var;
    }

    @Override // di3.i
    public boolean a() {
        java.lang.String str = this.f314306a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightVideoMsgSendCallback", "iUpdateVideoFile1 %s", str);
        int t17 = t21.w2.t(str);
        t21.v2 v2Var = this.f314307b;
        v2Var.f496541f = t17;
        v2Var.U = 32;
        t21.o2.Ui().C(v2Var);
        return true;
    }
}
