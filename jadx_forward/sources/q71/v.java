package q71;

/* loaded from: classes12.dex */
public class v extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 f441903d;

    public v() {
        super(0);
    }

    public final void b(int i17, boolean z17) {
        am.lp lpVar = this.f441903d.f136177h;
        lpVar.f88786a = i17;
        if (i17 != 0) {
            lpVar.f88787b = false;
        } else if (z17) {
            lpVar.f88787b = true;
            o71.l.wi();
            s71.a aVar = o71.l.Bi().f441872a;
            if (aVar.f485502d.size() > 0) {
                java.util.LinkedList linkedList = aVar.f485502d;
                s71.b bVar = (s71.b) linkedList.getFirst();
                am.lp lpVar2 = this.f441903d.f136177h;
                lpVar2.f88788c = bVar.f485512p;
                lpVar2.f88790e = bVar.f485510n;
                lpVar2.f88789d = bVar.f485511o;
                lpVar2.f88791f = bVar.f485508i;
                lpVar2.f88792g = bVar.f485505f;
                lpVar2.f88793h = bVar.f485506g;
                lpVar2.f88794i = bVar.f485507h;
                lpVar2.f88795j = bVar.f485513q;
                lpVar2.f88796k = bVar.f485509m;
                lpVar2.f88797l = linkedList;
            }
        } else {
            lpVar.f88787b = false;
        }
        java.lang.Runnable runnable = this.f441903d.f273897d;
        if (runnable != null) {
            runnable.run();
        }
        this.f441903d = null;
        c01.d9.e().q(417, this);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839) abstractC20979x809547d1;
        if (c5868xe54ea839 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839) {
            this.f441903d = c5868xe54ea839;
            c01.d9.e().a(417, this);
            am.kp kpVar = this.f441903d.f136176g;
            c01.d9.e().g(new q71.o(0, kpVar.f88707b, kpVar.f88706a, 1));
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof q71.o) {
            if (i18 == 0) {
                b(i18, true);
            } else {
                b(i18, false);
            }
        }
    }
}
