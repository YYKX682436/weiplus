package o72;

/* loaded from: classes12.dex */
public class g2 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.i2 f424874a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(o72.i2 i2Var, android.os.Looper looper) {
        super(looper);
        this.f424874a = i2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        o72.i2 i2Var = this.f424874a;
        java.util.Iterator it = i2Var.f424887b.iterator();
        while (it.hasNext()) {
            o72.h2 h2Var = (o72.h2) it.next();
            if (h2Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.e1) h2Var).a();
            }
        }
        i2Var.f424887b.clear();
    }
}
