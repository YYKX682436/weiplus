package z71;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public long f552066d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f552067e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3 f552068f = null;

    public static z71.m wi() {
        return (z71.m) i95.n0.c(z71.m.class);
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        c81.b wi6 = c81.b.wi();
        wi6.m134976x2690a4ac();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = wi6.f121189d.a();
        java.lang.String string = a17 != null ? a17.getString("last_gps_info", "") : "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            this.f552068f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3();
        } else {
            this.f552068f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6295xdee69c3(string);
        }
    }
}
