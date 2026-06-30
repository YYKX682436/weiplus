package b85;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.view.View view) {
        super(1);
        this.f18351d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it = (com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig) obj;
        kotlin.jvm.internal.o.g(it, "it");
        fo3.r a17 = b85.i.a(b85.i.f18352a, this.f18351d, it);
        return a17 == null ? java.lang.Boolean.FALSE : java.lang.Boolean.valueOf(fo3.p.f264924f.a(a17.f264944a));
    }
}
