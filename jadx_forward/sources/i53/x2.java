package i53;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.d3 f370317d;

    public x2(i53.d3 d3Var) {
        this.f370317d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.d3 d3Var = this.f370317d;
        if (d3Var.f370089j) {
            return;
        }
        int i17 = d3Var.f370087h + 1;
        d3Var.f370087h = i17;
        if (i17 <= i53.d3.f370079p) {
            ((java.util.HashSet) d3Var.f370084e).clear();
            d3Var.f370084e.addAll(d3Var.f370086g);
            ((java.util.HashSet) d3Var.f370086g).clear();
            d3Var.e();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "retry count bigger than 5");
        java.util.HashSet hashSet = (java.util.HashSet) d3Var.f370086g;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            i53.w wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
            wi6.getClass();
            java.lang.String format = java.lang.String.format("update %s set %s=%d where %s=\"%s\"", "GameHaowanMedia", "uploadState", 1, dm.i4.f66867x2a5c95c7, str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateUploadSuccess, sql: " + format);
            wi6.m145253xb158737d("GameHaowanMedia", format);
        }
        hashSet.clear();
        i53.c3 c3Var = d3Var.f370083d;
        if (c3Var != null) {
            ((i53.y) c3Var).a(false);
        }
    }
}
