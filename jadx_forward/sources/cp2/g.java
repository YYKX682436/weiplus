package cp2;

/* loaded from: classes2.dex */
public class g implements db2.v3 {

    /* renamed from: a, reason: collision with root package name */
    public final fp0.t f302337a;

    /* renamed from: b, reason: collision with root package name */
    public final fp0.r f302338b;

    public g(fp0.t tVar, fp0.r task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f302337a = tVar;
        this.f302338b = task;
    }

    @Override // db2.v3
    public boolean a(int i17, int i18, java.lang.String str, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        fp0.t tVar = this.f302337a;
        if (tVar == null) {
            return false;
        }
        int i19 = tVar.f346819f;
        fp0.r rVar = this.f302338b;
        if (i19 == rVar.f346812h) {
            return false;
        }
        rVar.b(fp0.u.f346823f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CgiConsumeCallback", "[isFetchConsume] executorToken=" + tVar.f346819f + " taskToken=" + rVar.f346812h);
        return true;
    }
}
