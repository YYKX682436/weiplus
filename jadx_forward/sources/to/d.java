package to;

/* loaded from: classes13.dex */
public class d extends android.media.AudioRecord {
    public d(int i17, int i18, int i19, int i27, int i28) {
        super(i17, i18, i19, i27, i28);
        int hashCode = hashCode();
        to.f.f502427d++;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMAudioManager", "mm audio record init [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502427d), java.lang.Integer.valueOf(to.f.f502428e));
        java.util.HashMap hashMap = to.f.f502429f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put(valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        to.f.a();
    }

    @Override // android.media.AudioRecord
    public void release() {
        super.release();
        int hashCode = hashCode();
        java.util.HashMap hashMap = to.f.f502429f;
        if (hashMap.containsKey(java.lang.Integer.valueOf(hashCode))) {
            to.f.f502428e++;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MMAudioManager", "mm audio record release [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502427d), java.lang.Integer.valueOf(to.f.f502428e));
            hashMap.remove(java.lang.Integer.valueOf(hashCode));
        }
    }
}
