package xj1;

/* loaded from: classes7.dex */
public final class p implements vl5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12711x1197fa56 f536345a;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12711x1197fa56 c12711x1197fa56) {
        this.f536345a = c12711x1197fa56;
    }

    @Override // vl5.o
    public final void a(int i17, int i18) {
        xj1.x xVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1202x9835ae9e.C12711x1197fa56 c12711x1197fa56 = this.f536345a;
        xj1.x xVar2 = c12711x1197fa56.f171184i;
        if (xVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4) xVar2.getItem(i17);
            xVar2.remove(c11714x918fd2e4);
            if (c11714x918fd2e4 == null || (xVar = c12711x1197fa56.f171184i) == null) {
                return;
            }
            xVar.insert(c11714x918fd2e4, i18);
        }
    }
}
