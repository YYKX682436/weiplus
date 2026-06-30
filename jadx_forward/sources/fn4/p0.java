package fn4;

/* loaded from: classes15.dex */
public class p0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.r0 f346129d;

    public p0(fn4.r0 r0Var, fn4.l0 l0Var) {
        this.f346129d = r0Var;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        fn4.r0 r0Var = this.f346129d;
        if (r0Var.f346135c.containsKey(str)) {
            r45.yn6 yn6Var = (r45.yn6) r0Var.f346135c.get(str);
            long j17 = hVar.f69548xe026fea1;
            yn6Var.f472777e = j17;
            yn6Var.f472778f = r0Var.a(j17, (int) hVar.f69523x17c343e7);
            yn6Var.f472779g = (int) hVar.f69523x17c343e7;
            r0Var.f346135c.put(str, yn6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryPreloadMgr", "VideoPreloadCallback onFinish %s %d %s", str, java.lang.Long.valueOf(yn6Var.f472778f), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i0(yn6Var.f472777e, 100.0d));
        }
    }
}
