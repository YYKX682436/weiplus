package androidx.work;

/* loaded from: classes12.dex */
public final class OverwritingInputMerger extends a5.q {
    @Override // a5.q
    public a5.m a(java.util.List list) {
        a5.l lVar = new a5.l();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(java.util.Collections.unmodifiableMap(((a5.m) it.next()).f1411a));
        }
        lVar.c(hashMap);
        return lVar.a();
    }
}
