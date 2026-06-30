package c34;

/* loaded from: classes11.dex */
public class p implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.q f119756d;

    public p(c34.q qVar) {
        this.f119756d = qVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getlocaion lat %f lng %f hasGetLbsInfo ");
        c34.q qVar = this.f119756d;
        sb6.append(qVar.f119761i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeFriendService", sb6.toString(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        if (!z17) {
            return true;
        }
        if (qVar.f119762m && qVar.f119757e == -85.0f && qVar.f119758f == -1000.0f) {
            qVar.f119762m = false;
            qVar.f119757e = f18;
            qVar.f119758f = f17;
            qVar.f119760h = (int) d18;
            qVar.f119759g = i17;
            qVar.f119761i = true;
        }
        return false;
    }
}
