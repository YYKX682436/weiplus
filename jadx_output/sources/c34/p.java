package c34;

/* loaded from: classes11.dex */
public class p implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c34.q f38223d;

    public p(c34.q qVar) {
        this.f38223d = qVar;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getlocaion lat %f lng %f hasGetLbsInfo ");
        c34.q qVar = this.f38223d;
        sb6.append(qVar.f38228i);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeFriendService", sb6.toString(), java.lang.Float.valueOf(f18), java.lang.Float.valueOf(f17));
        if (!z17) {
            return true;
        }
        if (qVar.f38229m && qVar.f38224e == -85.0f && qVar.f38225f == -1000.0f) {
            qVar.f38229m = false;
            qVar.f38224e = f18;
            qVar.f38225f = f17;
            qVar.f38227h = (int) d18;
            qVar.f38226g = i17;
            qVar.f38228i = true;
        }
        return false;
    }
}
