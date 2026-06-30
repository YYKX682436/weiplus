package ri;

/* renamed from: ri.p$$j */
/* loaded from: classes12.dex */
public final /* synthetic */ class C30073x33757a implements m3.a {
    @Override // m3.a
    /* renamed from: accept */
    public final void mo3938xab27b508(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        java.util.List list = gi.p.f353610c;
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.util.List list2 = (java.util.List) list.get(i17);
            for (int i18 = 0; i18 < list2.size(); i18++) {
                m3.d dVar = (m3.d) list2.get(i18);
                map.put("net-info-type-" + i17 + "-" + i18, dVar.f404625a);
                map.put("net-info-name-" + i17 + "-" + i18, dVar.f404626b);
            }
        }
    }
}
