package k53;

/* loaded from: classes4.dex */
public class s implements java.lang.Runnable {
    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3) {
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = (java.util.HashSet) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.C15920x9de661ce.A;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoView", "delete temp cache ret:%b, cachePath:%s", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.vfs.w6.h(str)), str);
        }
        hashSet.clear();
    }
}
