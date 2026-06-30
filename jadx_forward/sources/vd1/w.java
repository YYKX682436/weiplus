package vd1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final vd1.v[] f517149a = {new vd1.v(vd1.l.f517126g, 3), new vd1.v(vd1.l.f517124e, 3), new vd1.v(vd1.l.f517125f, 1)};

    public java.util.List a(long j17) {
        long j18;
        vd1.v[] vVarArr;
        long j19;
        java.util.List list;
        long j27;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        vd1.v[] vVarArr2 = this.f517149a;
        int length = vVarArr2.length;
        long j28 = 0;
        int i17 = 0;
        long j29 = 0;
        while (i17 < length) {
            vd1.v vVar = vVarArr2[i17];
            synchronized (vVar.f517147c) {
                j18 = vVar.f517148d;
            }
            long j37 = j17 - j29;
            synchronized (vVar.f517147c) {
                if (vVar.f517147c.isEmpty()) {
                    list = kz5.p0.f395529d;
                    vVarArr = vVarArr2;
                    j19 = j28;
                } else {
                    if (j37 < j28) {
                        j37 = ((vd1.y) vVar.f517147c.peekFirst()).f517157c.length();
                    }
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    long j38 = j37;
                    while (!vVar.f517147c.isEmpty() && j38 > 0) {
                        java.lang.Object pollFirst = vVar.f517147c.pollFirst();
                        ((vd1.y) pollFirst).f517161g++;
                        j38 -= r5.f517157c.length();
                        linkedList2.addLast(pollFirst);
                        vVarArr2 = vVarArr2;
                    }
                    vVarArr = vVarArr2;
                    long j39 = vVar.f517148d - (j37 - j38);
                    vVar.f517148d = j39;
                    if (j39 < 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", '[' + vVar.f517145a.name() + "] poll(" + j37 + ") final bytesCount becomes minus");
                        j19 = 0;
                        vVar.f517148d = 0L;
                    } else {
                        j19 = 0;
                    }
                    list = linkedList2;
                }
            }
            linkedList.addAll(list);
            synchronized (vVar.f517147c) {
                j27 = vVar.f517148d;
            }
            j29 += j18 - j27;
            i17++;
            vVarArr2 = vVarArr;
            j28 = j19;
        }
        return linkedList;
    }

    public boolean b(vd1.y entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        for (vd1.v vVar : this.f517149a) {
            if (vVar.f517145a == entry.f517158d) {
                if (entry.f517161g <= vVar.f517146b) {
                    synchronized (vVar.f517147c) {
                        vVar.f517147c.addLast(entry);
                        vVar.f517148d += entry.f517157c.length();
                    }
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue.BufferQueue", "push reach TryCountLimit priority[" + vVar.f517145a.name() + "], entry[" + entry.f517160f + ", " + entry.f517155a + ", " + entry.f517156b + ']');
                return false;
            }
        }
        return false;
    }
}
