package aw1;

/* loaded from: classes12.dex */
public final class y implements aw1.x, com.p314xaae8f345.mm.vfs.l6 {

    /* renamed from: a, reason: collision with root package name */
    public long f96234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw1.w f96235b;

    public y(aw1.w wVar) {
        this.f96235b = wVar;
    }

    @Override // aw1.x
    public void a(boolean z17) {
        aw1.w wVar = this.f96235b;
        if (wVar != null) {
            wVar.b(z17, this.f96234a, 0);
        }
    }

    @Override // aw1.x
    public void b(com.p314xaae8f345.mm.vfs.k6 entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        if ((entry.f294565a & 16384) == 0) {
            return;
        }
        com.p314xaae8f345.mm.vfs.x1 x1Var = entry.f294567c;
        x1Var.b(false);
        this.f96234a = this.f96234a + x1Var.f294767d + 1;
    }

    @Override // com.p314xaae8f345.mm.vfs.l6
    public boolean c(int i17, java.lang.String str, com.p314xaae8f345.mm.vfs.x1 entry) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entry, "entry");
        return (str == null && (i17 & 8192) == 0) || (i17 & 16384) != 0;
    }
}
