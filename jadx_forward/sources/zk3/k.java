package zk3;

/* loaded from: classes8.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555006a;

    public k(zk3.g0 g0Var) {
        this.f555006a = g0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void c(int i17, int i18) {
        zk3.g0 g0Var = this.f555006a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c22849x81a93d25 != null ? c22849x81a93d25.m7949x5701d990() : null;
        if (m7949x5701d990 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + m7949x5701d990);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = g0Var.f554987i;
            if (c22849x81a93d252 != null) {
                c22849x81a93d252.m7964x8d4ad49c(null);
            }
            android.os.Handler handler = g0Var.f554998w;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new zk3.i(g0Var, m7949x5701d990), m7949x5701d990.f93704f + 60);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        zk3.g0 g0Var = this.f555006a;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990 = c22849x81a93d25 != null ? c22849x81a93d25.m7949x5701d990() : null;
        if (m7949x5701d990 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "originItemAnimator=" + m7949x5701d990);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = g0Var.f554987i;
            if (c22849x81a93d252 != null) {
                c22849x81a93d252.m7964x8d4ad49c(null);
            }
            android.os.Handler handler = g0Var.f554998w;
            handler.removeCallbacksAndMessages(null);
            handler.postDelayed(new zk3.j(g0Var, m7949x5701d990), m7949x5701d990.f93704f + 60);
        }
        c(i17, i18);
    }
}
