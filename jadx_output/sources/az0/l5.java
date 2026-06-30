package az0;

/* loaded from: classes10.dex */
public final class l5 implements com.tencent.maas.instamovie.MJTextResolver {

    /* renamed from: a, reason: collision with root package name */
    public static final az0.l5 f15663a = new az0.l5();

    @Override // com.tencent.maas.instamovie.MJTextResolver
    public final java.lang.String resolve(java.lang.String str) {
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        if (hashCode != -265713450) {
            if (hashCode == 780988929 && str.equals("deviceName")) {
                return "";
            }
            return null;
        }
        if (!str.equals(dm.i4.COL_USERNAME)) {
            return null;
        }
        zy2.dc hj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).hj(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj());
        if (hj6 != null) {
            return ((ya2.b2) hj6).z0();
        }
        return null;
    }
}
