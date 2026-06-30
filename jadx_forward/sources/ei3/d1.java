package ei3;

/* loaded from: classes10.dex */
public class d1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.e1 f334568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ei3.e1 e1Var, android.os.Looper looper) {
        super(looper);
        this.f334568a = e1Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        if (257 != i17) {
            if (258 == i17) {
                p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(message.obj);
                return;
            } else {
                if (259 == i17) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(message.obj);
                    return;
                }
                return;
            }
        }
        int i18 = 0;
        while (true) {
            ei3.e1 e1Var = this.f334568a;
            if (i18 >= e1Var.f334573b.size()) {
                return;
            }
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(((java.lang.ref.WeakReference) e1Var.f334573b.valueAt(i18)).get());
            i18++;
        }
    }
}
