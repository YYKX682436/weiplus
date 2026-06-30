package wu2;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 f531217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 f531218e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3) {
        super(0);
        this.f531217d = c5445x963cab3;
        this.f531218e = c15118xbecd3ba3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5445x963cab3 c5445x963cab3 = this.f531217d;
        c5445x963cab3.f135785g.getClass();
        am.ia iaVar = c5445x963cab3.f135785g;
        if (iaVar.f88452b == 5) {
            int i17 = iaVar.f88453c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.C15118xbecd3ba3 c15118xbecd3ba3 = this.f531218e;
            if (i17 == 2) {
                java.util.HashSet hashSet2 = c15118xbecd3ba3.f210793z;
                if (hashSet2 != null) {
                    hashSet2.add(java.lang.Long.valueOf(iaVar.f88451a));
                }
            } else if (i17 == 1 && (hashSet = c15118xbecd3ba3.f210793z) != null) {
                hashSet.remove(java.lang.Long.valueOf(iaVar.f88451a));
            }
        }
        return jz5.f0.f384359a;
    }
}
