package s65;

/* loaded from: classes11.dex */
public class a0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s65.g0 f484964a;

    public a0(s65.g0 g0Var) {
        this.f484964a = g0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (1 == message.what) {
            s65.g0 g0Var = this.f484964a;
            if (g0Var.f484996n) {
                return;
            }
            com.p314xaae8f345.mm.vfs.w6.h(g0Var.d());
            int i17 = message.arg1;
            if (i17 == 0) {
                g0Var.f484991i.d(200, 0, (r45.js5) message.obj);
            } else if (i17 == 3) {
                g0Var.f484991i.d(3, -1, (r45.js5) message.obj);
            } else if (i17 == 4) {
                g0Var.f484991i.d(4, -1, (r45.js5) message.obj);
            }
        }
    }
}
