package ch2;

/* loaded from: classes.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f41414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(boolean z17) {
        super(0);
        this.f41414d = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f41414d) {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "加入辅唱", 0).show();
        } else {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "退出辅唱", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
