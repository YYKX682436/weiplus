package g61;

/* loaded from: classes9.dex */
public class f0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public f0() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9 c6253xea7119b9 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6253xea7119b9) abstractC20979x809547d1;
        java.lang.String str = c6253xea7119b9.f136500g.f89583a;
        j61.d wi6 = e61.e.wi();
        wi6.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) j61.d.f379410g;
        if (hashMap.containsKey(str)) {
            i17 = ((j61.c) hashMap.get(str)).f65953x10a0fed7;
        } else {
            j61.c z07 = wi6.z0(str);
            if (z07 != null) {
                hashMap.put(str, z07);
                i17 = z07.f65953x10a0fed7;
            } else {
                i17 = -1;
            }
        }
        c6253xea7119b9.f136501h.f89696a = i17;
        return false;
    }
}
