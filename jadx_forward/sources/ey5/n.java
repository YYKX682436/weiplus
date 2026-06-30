package ey5;

/* loaded from: classes13.dex */
public class n implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener f339191d;

    public n(ey5.r rVar, com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.f339191d = onIndoorStateChangeListener;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingDeactivated */
    public boolean mo37004xf3e3a8aa() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f339191d;
        if (onIndoorStateChangeListener == null) {
            return false;
        }
        return onIndoorStateChangeListener.mo65975xf3e3a8aa();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorBuildingFocused */
    public boolean mo37005xa4a722b1() {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.InterfaceC25945x718093f7.OnIndoorStateChangeListener onIndoorStateChangeListener = this.f339191d;
        if (onIndoorStateChangeListener == null) {
            return false;
        }
        return onIndoorStateChangeListener.mo65976xa4a722b1();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.OnIndoorStateChangeListener
    /* renamed from: onIndoorLevelActivated */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo37006xc2ec745f(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26034x15ff5647 r7) {
        /*
            r6 = this;
            com.tencent.tencentmap.mapsdk.map.TencentMap$OnIndoorStateChangeListener r0 = r6.f339191d
            if (r0 != 0) goto L6
            r7 = 0
            return r7
        L6:
            r1 = 0
            if (r7 != 0) goto La
            goto L50
        La:
            java.util.List r2 = r7.m99469x2328f865()
            if (r2 != 0) goto L11
            goto L2d
        L11:
            java.util.concurrent.CopyOnWriteArrayList r3 = new java.util.concurrent.CopyOnWriteArrayList
            r3.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            com.tencent.tencentmap.mapsdk.maps.model.IndoorLevel r4 = (com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26036x18de38d1) r4
            if (r4 != 0) goto L2f
        L2d:
            r2 = r1
            goto L3c
        L2f:
            com.tencent.mapsdk.raster.model.IndoorLevel r5 = new com.tencent.mapsdk.raster.model.IndoorLevel
            java.lang.String r4 = r4.m99474xfb82e301()
            r5.<init>(r4)
            r2.add(r5)
            goto L1f
        L3c:
            if (r2 != 0) goto L3f
            goto L50
        L3f:
            com.tencent.mapsdk.raster.model.IndoorBuilding r1 = new com.tencent.mapsdk.raster.model.IndoorBuilding
            java.lang.String r3 = r7.m99466x3935e1d5()
            java.lang.String r4 = r7.m99468x266119d5()
            int r7 = r7.m99465xd84262ca()
            r1.<init>(r3, r4, r2, r7)
        L50:
            boolean r7 = r0.mo65977xc2ec745f(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.n.mo37006xc2ec745f(com.tencent.tencentmap.mapsdk.maps.model.IndoorBuilding):boolean");
    }
}
