package p012xc85e97e9.p125x37c711;

/* renamed from: androidx.work.OverwritingInputMerger */
/* loaded from: classes12.dex */
public final class C1261x510e511c extends a5.q {
    @Override // a5.q
    public a5.m a(java.util.List list) {
        a5.l lVar = new a5.l();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(java.util.Collections.unmodifiableMap(((a5.m) it.next()).f82944a));
        }
        lVar.c(hashMap);
        return lVar.a();
    }
}
