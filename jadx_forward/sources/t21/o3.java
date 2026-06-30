package t21;

/* loaded from: classes3.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f496390e;

    public o3(t21.p3 p3Var, java.lang.String str, int i17) {
        this.f496389d = str;
        this.f496390e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f496390e;
        java.lang.String str = this.f496389d;
        t21.d3.E(str, i17);
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null || h17.f496544i == 199) {
            return;
        }
        if (h17.j()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "start complete online video");
            t21.d3.K(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoService", "start complete offline video");
            t21.d3.L(str);
        }
    }
}
