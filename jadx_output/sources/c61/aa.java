package c61;

/* loaded from: classes.dex */
public final class aa extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f38882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f38882d = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f38882d.f310112d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterAccountPlugin", "Canceled because of " + ((java.lang.Throwable) obj));
        return jz5.f0.f302826a;
    }
}
