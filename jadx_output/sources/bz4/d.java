package bz4;

/* loaded from: classes7.dex */
public class d implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f36812a;

    public d(bz4.e eVar, long j17) {
        this.f36812a = j17;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        java.lang.String str;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) it.next();
            if (ballInfo.f93046d == 3 && ballInfo.G.getInt("eventType") == 1 && (str = ballInfo.f93049g) != null) {
                if (str.startsWith("" + this.f36812a)) {
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(ballInfo);
                    return;
                }
            }
        }
    }
}
