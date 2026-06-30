package io.p3277xa1c40a32.p3278x9b169b86;

/* renamed from: io.clipworks.analytics.ALEventBridge */
/* loaded from: classes16.dex */
public class C28516x24ab8d98 {

    /* renamed from: _eventSinks */
    private final java.util.Set<cz5.a> f70357x7adc7765 = new android.util.ArraySet();

    /* renamed from: addEventSink */
    public void m136805xf9a6b4ac(cz5.a aVar) {
        this.f70357x7adc7765.add(aVar);
    }

    /* renamed from: hasAnyEventSink */
    public boolean m136806x196fc77b() {
        return !this.f70357x7adc7765.isEmpty();
    }

    /* renamed from: removeEventSink */
    public void m136807x7fbb6429(cz5.a aVar) {
        this.f70357x7adc7765.remove(aVar);
    }

    /* renamed from: sinkEventS12 */
    public void m136808x8b318c8d(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return;
        }
        try {
            cz5.f fVar = (cz5.f) cz5.f.f306582o.mo20640x92b714fd(byteBuffer);
            int i17 = fVar.f306587h;
            int i18 = fVar.f306588i;
            long j17 = fVar.f306584e;
            fVar.m123179xfb82e301();
            java.util.Map e17 = fVar.g().e();
            java.util.TreeMap treeMap = new java.util.TreeMap();
            if (e17 != null) {
                treeMap.putAll(e17);
            }
            treeMap.put("GSN", java.lang.String.valueOf(i17));
            treeMap.put("LSN", java.lang.String.valueOf(i18));
            treeMap.put("SDKTimestamp", java.lang.String.valueOf(j17));
            java.util.Iterator<cz5.a> it = this.f70357x7adc7765.iterator();
            if (it.hasNext()) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                throw null;
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
