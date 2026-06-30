package ps3;

/* loaded from: classes11.dex */
public final class f implements ps3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ps3.m f439614a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f439615b;

    public f(ps3.m mVar, java.lang.String str, long j17) {
        this.f439614a = mVar;
        this.f439615b = j17;
    }

    @Override // ps3.d
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        ps3.m mVar = this.f439614a;
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (((int) n17.E2) > 0) {
                c01.e2.m0(n17);
            }
            ps3.m.b(mVar, str, 1);
            if (kz5.n0.O(mVar.f439637f, str)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(mVar.f439637f).remove(str);
            }
        } else if (z18) {
            if (str != null && !mVar.f439637f.contains(str)) {
                mVar.f439637f.add(str);
            }
            ps3.m.b(mVar, str, 2);
        }
        mVar.f439641m.mo50293x3498a0(new ps3.h(mVar, z17, z18, str2, str, this.f439615b));
    }
}
