package bk4;

/* loaded from: classes8.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent f21479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent) {
        super(0);
        this.f21479d = localCheckResUpdateCacheFileEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = lp0.b.e() + "textstatus/icon";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        com.tencent.mm.vfs.w6.f(str);
        bk4.y yVar = bk4.y.f21618a;
        java.lang.String filePath = this.f21479d.f54480g.f6473c;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        yVar.c0(filePath);
        return jz5.f0.f302826a;
    }
}
