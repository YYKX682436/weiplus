package cj5;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(cj5.l2 l2Var) {
        super(0);
        this.f42262d = l2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mars.xlog.Log.isDebug()) {
            cj5.l2 l2Var = this.f42262d;
            androidx.recyclerview.widget.f2 adapter = l2Var.Y6().k().getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(l2Var.f42189o);
            }
        }
        return jz5.f0.f302826a;
    }
}
