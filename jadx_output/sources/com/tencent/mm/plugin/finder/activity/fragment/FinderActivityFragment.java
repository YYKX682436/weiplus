package com.tencent.mm.plugin.finder.activity.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/fragment/FinderActivityFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderActivityFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {

    /* renamed from: t, reason: collision with root package name */
    public int f101752t;

    /* renamed from: u, reason: collision with root package name */
    public long f101753u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f101754v = "";

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.activity.uic.u1.class});
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "index : " + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r5 != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(r2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        r4.f125289p = true;
     */
    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.os.Bundle r5) {
        /*
            r2 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.o.g(r3, r0)
            android.view.View r3 = super.onCreateView(r3, r4, r5)
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
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
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) r0
            boolean r0 = kotlin.jvm.internal.o.b(r0, r2)
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
            com.tencent.mars.xlog.Log.i(r0, r4)
            if (r5 != 0) goto L66
            pf5.z r4 = pf5.z.f353948a
            pf5.v r4 = r4.b(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r5 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r4 = r4.a(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r4 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r4
            com.tencent.mm.plugin.finder.report.d5 r4 = r4.L
            if (r4 != 0) goto L63
            goto L66
        L63:
            r5 = 1
            r4.f125289p = r5
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.fragment.FinderActivityFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 59;
    }

    public com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC y0(androidx.fragment.app.FragmentActivity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC) a17;
    }
}
