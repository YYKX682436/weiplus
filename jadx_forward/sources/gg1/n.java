package gg1;

/* loaded from: classes7.dex */
public final class n extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.l f353141d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gg1.w f353142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg1.p f353143f;

    public n(gg1.l lVar, gg1.w wVar, gg1.p pVar) {
        this.f353141d = lVar;
        this.f353142e = wVar;
        this.f353143f = pVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gg1.o(this.f353141d, this.f353142e, this.f353143f));
    }
}
