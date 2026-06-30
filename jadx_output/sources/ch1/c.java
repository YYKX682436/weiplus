package ch1;

/* loaded from: classes7.dex */
public class c implements com.tencent.mm.plugin.appbrand.profile.a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f41277a = {1088};

    public void b(long j17, long j18, long j19) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(j17, j18, j19);
    }

    public void c(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(j17, j18, j19, z17);
        long[] jArr = this.f41277a;
        int length = jArr.length;
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            if (jArr[i17] == j17) {
                z18 = true;
                break;
            }
            i17++;
        }
        if (z18) {
            com.tencent.mm.plugin.appbrand.report.v0.j(null, 0, 0, j17, j18, j19);
        }
    }
}
