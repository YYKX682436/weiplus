package zp1;

/* renamed from: zp1.a$$d */
/* loaded from: classes12.dex */
public final /* synthetic */ class C30848x2ca3e3 implements vh.x {
    @Override // vh.x
    public final java.util.List a(java.util.List list) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1280xec41ae0d.p1281x68ac49f.ActivityC12952x7179b981.f175360m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e abstractC4640xe4c2b89e = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e) it.next();
            if (abstractC4640xe4c2b89e instanceof com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord eventStatRecord = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.AbstractC4640xe4c2b89e.EventStatRecord) abstractC4640xe4c2b89e;
                if ("BATTERY_STAT".equals(eventStatRecord.f134137g) && (eventStatRecord.f134138h.containsKey("battery-change") || eventStatRecord.f134138h.containsKey("battery-low"))) {
                    arrayList.add(abstractC4640xe4c2b89e);
                }
            }
        }
        return arrayList;
    }
}
