package kl3;

/* loaded from: classes11.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f390385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kl3.z f390386e;

    public y(kl3.z zVar, kl3.v vVar) {
        this.f390386e = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String a17 = xl3.c.a(this.f390386e.o());
        int i17 = this.f390386e.f390388d;
        boolean z17 = false;
        for (int i18 = 0; i18 < this.f390385d.size(); i18++) {
            if (((java.lang.String) this.f390385d.get(i18)).equals(a17)) {
                z17 = true;
                i17 = i18;
            }
        }
        if (z17) {
            synchronized (this.f390386e.f390391g) {
                for (int i19 = i17 + 1; i19 < this.f390385d.size(); i19++) {
                    ((java.util.ArrayList) this.f390386e.f390389e).add((java.lang.String) this.f390385d.get(i19));
                }
                for (int i27 = 0; i27 < i17; i27++) {
                    ((java.util.ArrayList) this.f390386e.f390389e).add((java.lang.String) this.f390385d.get(i27));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "GetMusicWrapperListTask currentMusicSize=%d currentMusicIndex=%d", java.lang.Integer.valueOf(((java.util.ArrayList) this.f390386e.f390389e).size()), java.lang.Integer.valueOf(this.f390386e.f390388d));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
            c5722xb16ab0f4.f136045g.f88569b = 5;
            c5722xb16ab0f4.e();
        }
    }
}
