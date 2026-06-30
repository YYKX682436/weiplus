package c61;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f38953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(yz5.l lVar) {
        super(1);
        this.f38953d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String nickname = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            this.f38953d.invoke(nickname);
        }
        return jz5.f0.f302826a;
    }
}
