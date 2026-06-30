package on2;

/* loaded from: classes3.dex */
public final class m2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f428503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(on2.z2 z2Var) {
        super(0);
        this.f428503d = z2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        on2.z2 z2Var = this.f428503d;
        java.util.LinkedList linkedList = z2Var.f428624i;
        if (linkedList != null) {
            linkedList.clear();
        }
        z2Var.f428624i = new java.util.LinkedList();
        return jz5.f0.f384359a;
    }
}
