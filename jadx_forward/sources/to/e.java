package to;

/* loaded from: classes13.dex */
public class e extends android.media.AudioTrack {
    public e(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i17, i18, i19, i27, i28, i29);
        int hashCode = hashCode();
        to.f.f502424a++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "mm audio track init [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502424a), java.lang.Integer.valueOf(to.f.f502425b));
        java.util.HashMap hashMap = to.f.f502426c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        hashMap.put(valueOf, com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true));
        to.f.a();
    }

    @Override // android.media.AudioTrack
    public void release() {
        super.release();
        int hashCode = hashCode();
        to.f.f502425b++;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMAudioManager", "mm audio track release [%d] mmInitCount[%d] mmReleaseCount[%d]", java.lang.Integer.valueOf(hashCode), java.lang.Integer.valueOf(to.f.f502424a), java.lang.Integer.valueOf(to.f.f502425b));
        to.f.f502426c.remove(java.lang.Integer.valueOf(hashCode));
    }
}
