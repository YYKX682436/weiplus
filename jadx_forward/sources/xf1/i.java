package xf1;

/* loaded from: classes7.dex */
public class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f535770d;

    /* renamed from: f, reason: collision with root package name */
    public volatile tf.w f535772f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f535771e = true;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f535773g = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f535770d = "MicroMsg.AppBrandRuntimeLiveVOIPStateManager";
        this.f535770d = "MicroMsg.AppBrandRuntimeLiveVOIPStateManager#" + hashCode() + "Runtime#" + c11510xdd90c2f2.hashCode();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1037xbf3330d1.h1
    public boolean a() {
        return (this.f535772f == null || this.f535773g.isEmpty()) ? false : true;
    }

    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, boolean z17) {
        boolean a17 = a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535770d, "enableMic, enable:%s, isVOIPing: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        if (a17) {
            boolean z18 = this.f535771e;
            this.f535771e = z17;
            if (z18 != z17) {
                c(c11510xdd90c2f2, 1);
            }
        }
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e c12295xd16fc59e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1128x6f7d720f.p1129x32b0ec.C12295xd16fc59e();
        c12295xd16fc59e.f165456g.f535755a = c11510xdd90c2f2.f156336n;
        xf1.a aVar = c12295xd16fc59e.f165456g;
        aVar.f535756b = 4;
        aVar.f535757c = i17;
        c12295xd16fc59e.e();
    }

    public boolean d(tf.w wVar, int i17) {
        boolean z17 = false;
        if (a() && i17 != 3) {
            if (wVar instanceof yf.i0) {
                if (this.f535772f == wVar) {
                    z17 = true;
                }
            } else if (wVar instanceof wf.b) {
                z17 = this.f535773g.contains(wVar);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f535770d, "shouldInterceptEnterBackground, result:%s, isVOIPing:%s, type:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a()), java.lang.Integer.valueOf(i17));
        return z17;
    }
}
