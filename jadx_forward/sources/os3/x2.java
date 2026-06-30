package os3;

/* loaded from: classes8.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.z2 f429782e;

    public x2(os3.z2 z2Var, java.lang.String str) {
        this.f429782e = z2Var;
        this.f429781d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16939x74e056 activityC16939x74e056 = this.f429782e.f429796a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = activityC16939x74e056.f236442d;
        if (c22633x83752a59 == null || (str = this.f429781d) == null) {
            return;
        }
        java.lang.String str2 = activityC16939x74e056.f236443e;
        if (str2 == null) {
            c22633x83752a59.mo74798x6dfa45b0(str, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } else {
            c22633x83752a59.mo64581x9b341568(str2, str, "text/html", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6, null);
        }
    }
}
