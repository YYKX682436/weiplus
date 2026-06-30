package k53;

/* loaded from: classes8.dex */
public class i implements i53.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385897a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3) {
        this.f385897a = activityC15919x390706d3;
    }

    @Override // i53.q
    public void a(java.util.LinkedList linkedList, boolean z17) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList) ? 0 : linkedList.size());
        objArr[1] = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoPreviewUI", "data size:%d, hasNext:%b", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3 = this.f385897a;
        if (activityC15919x390706d3.isFinishing() || activityC15919x390706d3.isDestroyed()) {
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            k53.c0 c0Var = activityC15919x390706d3.f221649f;
            c0Var.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
                c0Var.f385879d.addAll(linkedList);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new k53.t(c0Var), 1000L);
            }
        }
        activityC15919x390706d3.f221660t = z17;
    }
}
