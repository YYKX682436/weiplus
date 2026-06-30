package bm2;

/* loaded from: classes.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(java.lang.String str) {
        super(1);
        this.f22349d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.h32 it = (r45.h32) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.getString(4), this.f22349d));
    }
}
