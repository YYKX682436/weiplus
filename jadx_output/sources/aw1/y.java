package aw1;

/* loaded from: classes12.dex */
public final class y implements aw1.x, com.tencent.mm.vfs.l6 {

    /* renamed from: a, reason: collision with root package name */
    public long f14701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw1.w f14702b;

    public y(aw1.w wVar) {
        this.f14702b = wVar;
    }

    @Override // aw1.x
    public void a(boolean z17) {
        aw1.w wVar = this.f14702b;
        if (wVar != null) {
            wVar.b(z17, this.f14701a, 0);
        }
    }

    @Override // aw1.x
    public void b(com.tencent.mm.vfs.k6 entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        if ((entry.f213032a & 16384) == 0) {
            return;
        }
        com.tencent.mm.vfs.x1 x1Var = entry.f213034c;
        x1Var.b(false);
        this.f14701a = this.f14701a + x1Var.f213234d + 1;
    }

    @Override // com.tencent.mm.vfs.l6
    public boolean c(int i17, java.lang.String str, com.tencent.mm.vfs.x1 entry) {
        kotlin.jvm.internal.o.g(entry, "entry");
        return (str == null && (i17 & 8192) == 0) || (i17 & 16384) != 0;
    }
}
