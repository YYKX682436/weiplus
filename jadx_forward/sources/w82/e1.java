package w82;

/* loaded from: classes12.dex */
public class e1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 f525371d;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505) {
        this.f525371d = viewOnClickListenerC13625xe5fb4505;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.ViewOnClickListenerC13625xe5fb4505 viewOnClickListenerC13625xe5fb4505 = this.f525371d;
        viewOnClickListenerC13625xe5fb4505.f183114v = viewOnClickListenerC13625xe5fb4505.m55404x7d13d4fd();
        viewOnClickListenerC13625xe5fb4505.f183107o.a(java.lang.Math.max(0, viewOnClickListenerC13625xe5fb4505.f183114v / 1000));
        return true;
    }
}
