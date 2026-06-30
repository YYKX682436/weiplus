package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment */
/* loaded from: classes2.dex */
public class C13646x818616e5 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 {

    /* renamed from: t, reason: collision with root package name */
    public int f183285t;

    /* renamed from: u, reason: collision with root package name */
    public long f183286u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f183287v = "";

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    /* renamed from: l0 */
    public java.util.Set getF204828n() {
        return kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.u1.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639
    public void o0() {
        super.o0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", "index : " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r5 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(r2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r4.f206822p = true;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22277x94c24639, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "inflater"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            android.view.View r3 = super.mo7503x18bad100(r3, r4, r5)
            androidx.fragment.app.FragmentActivity r4 = r2.mo7430x19263085()
            if (r4 == 0) goto L66
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC r4 = r2.y0(r4)
            java.util.List r4 = r4.Y6()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L1c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r4.next()
            int r1 = r5 + 1
            if (r5 < 0) goto L35
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180) r0
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r2)
            if (r0 == 0) goto L33
            goto L3b
        L33:
            r5 = r1
            goto L1c
        L35:
            kz5.c0.p()
            r3 = 0
            throw r3
        L3a:
            r5 = -1
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "index : "
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "MicroMsg.UIComponentFragment"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r4)
            if (r5 != 0) goto L66
            pf5.z r4 = pf5.z.f435481a
            pf5.v r4 = r4.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class
            androidx.lifecycle.c1 r4 = r4.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) r4
            com.tencent.mm.plugin.finder.report.d5 r4 = r4.L
            if (r4 != 0) goto L63
            goto L66
        L63:
            r5 = 1
            r4.f206822p = r5
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1424x9da2e250.C13646x818616e5.mo7503x18bad100(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15133xf6dcb656
    /* renamed from: r0 */
    public int getB() {
        return 59;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860 y0(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.uic.C13669xe2583a4f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.AbstractC15479x2de36860) a17;
    }
}
