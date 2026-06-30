package nu4;

/* loaded from: classes7.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final nu4.a0 f421773d = new nu4.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        mu4.n nVar = mu4.w.f412985y;
        ku4.i iVar = ku4.i.f394047a;
        jz5.g gVar = ku4.i.f394050d;
        boolean z17 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1;
        if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a17 = iVar.a("wx97b7aebac2183fd2", 2);
            if (a17 != null) {
                str = a17.f67183x55b471cc;
            }
            str = null;
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("wx97b7aebac2183fd2")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.n9 a18 = iVar.a("wx97b7aebac2183fd2", 0);
                if (a18 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo is null");
                } else if (com.p314xaae8f345.mm.vfs.w6.j(a18.f67183x55b471cc)) {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) ku4.i.f394049c).mo141623x754a37bb()).A("LastUseVersion_".concat("wx97b7aebac2183fd2"), a18.f67185x8987ca93);
                    iVar.b("wx97b7aebac2183fd2", a18.f67185x8987ca93);
                    str = a18.f67183x55b471cc;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebCanvasPackageDownManager", "geReleasePkgPath pkgInfo " + a18.f67183x55b471cc + " not exist");
                }
            }
            str = null;
        }
        return mu4.n.b(nVar, nVar.a("prefetcher.wspkg", z17, str, "wx97b7aebac2183fd2"), nu4.z.f421826d, null, false, 12, null);
    }
}
