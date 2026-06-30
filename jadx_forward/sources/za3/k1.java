package za3;

/* loaded from: classes14.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f f552505d;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f runnableC16292x2e41dc6f) {
        this.f552505d = runnableC16292x2e41dc6f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.RunnableC16292x2e41dc6f runnableC16292x2e41dc6f = this.f552505d;
        runnableC16292x2e41dc6f.f226207e = true;
        runnableC16292x2e41dc6f.f226206d = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = runnableC16292x2e41dc6f.f226213n;
        if (n3Var != null) {
            n3Var.mo50283x2f1920ea().f538836b.g();
            runnableC16292x2e41dc6f.f226213n = null;
        }
    }
}
