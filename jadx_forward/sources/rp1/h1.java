package rp1;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f479942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 f479943e;

    public h1(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12929x567537a0 c12929x567537a0, float f17) {
        this.f479943e = c12929x567537a0;
        this.f479942d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17 = this.f479942d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallView", "setFloatBallAlpha when animation ends, alpha:%s", java.lang.Float.valueOf(f17));
        this.f479943e.m54185xeecc7282(f17);
    }
}
