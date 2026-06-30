package ch1;

/* loaded from: classes7.dex */
public class d implements com.tencent.mm.plugin.appbrand.profile.c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f41278a = {15496, 13536, 14992};

    public void b(int i17, java.lang.String str) {
        if (u46.a.a(f41278a, i17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(i17, str);
        } else {
            com.tencent.mm.plugin.appbrand.report.d.f87824a.b(i17, str);
        }
    }

    public void c(int i17, java.lang.Object... objArr) {
        if (u46.a.a(f41278a, i17)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(i17, objArr);
        } else {
            com.tencent.mm.plugin.appbrand.report.d.f87824a.b(i17, objArr);
        }
    }
}
