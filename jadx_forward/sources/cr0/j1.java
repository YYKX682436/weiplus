package cr0;

/* loaded from: classes8.dex */
public final class j1 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.util.Iterator it = ((java.util.Map) ((jz5.l) obj).f384367e).values().iterator();
        long j17 = 0;
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) it.next()).f150223e;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j18);
        java.util.Iterator it6 = ((java.util.Map) ((jz5.l) obj2).f384367e).values().iterator();
        while (it6.hasNext()) {
            j17 += ((com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.C10871xcc6f010f) it6.next()).f150223e;
        }
        return mz5.a.b(valueOf, java.lang.Long.valueOf(j17));
    }
}
