package sf4;

/* loaded from: classes4.dex */
public final class h2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f489022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 f489023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(sf4.j2 j2Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2) {
        super(0);
        this.f489022d = j2Var;
        this.f489023e = c5814x771f4db2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sf4.j2 j2Var = this.f489022d;
        if4.h hVar = j2Var.f489037f;
        int i17 = hVar != null ? hVar.f372788c : 0;
        r45.xe6 xe6Var = hVar != null ? hVar.f372791f : null;
        if (i17 > 0 && xe6Var != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2 = this.f489023e;
            java.lang.String str = c5814x771f4db2.f136121g.f88379c;
            ef4.k0 k0Var = ef4.k0.f333992a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, k0Var.a(i17, xe6Var.f471556f))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(c5814x771f4db2.f136121g.f88379c);
                sb6.append(" video source changed, filePath:");
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = j2Var.f489032a;
                sb6.append(c18499x2fc2446b != null ? c18499x2fc2446b.m71531x5000ed37() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
                j2Var.f(false, true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b2 = j2Var.f489032a;
                com.p314xaae8f345.mm.vfs.w6.h(c18499x2fc2446b2 != null ? c18499x2fc2446b2.m71531x5000ed37() : null);
                if4.h hVar2 = j2Var.f489037f;
                if (hVar2 != null) {
                    nf4.o b17 = k0Var.b(hVar2);
                    b17.f66549x799e9d9e = 0;
                    b17.f66552x78351860 = 0;
                    ef4.w.f334001t.k().D0(b17);
                }
                j2Var.e();
            }
        }
        return jz5.f0.f384359a;
    }
}
