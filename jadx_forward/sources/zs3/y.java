package zs3;

/* loaded from: classes9.dex */
public class y extends dm.s9 implements zs3.s {
    public static final l75.e0 W = dm.s9.m125493x3593deb(zs3.y.class);

    /* renamed from: equals */
    public boolean m179402xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof zs3.y) && this.f68323x88be67a1 == ((zs3.y) obj).f68323x88be67a1;
    }

    @Override // dm.s9, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return W;
    }

    @Override // zs3.s
    /* renamed from: getKey */
    public int mo179386xb5884f29() {
        return this.f68323x88be67a1;
    }

    /* renamed from: toString */
    public java.lang.String m179403x9616526c() {
        return "localid[" + this.f68323x88be67a1 + "]\nrecordId[" + this.f68327x4ad5cdd0 + "]\nmediaId[" + this.f68324xaca5bdda + "]\ndataId[" + this.f68319xf604e54a + "]\npath[" + this.f68326x2260084a + "]\ncdnurl[" + this.f68318xf47770e7 + "]\ncdnkey[" + this.f68317xf47749d7 + "]\ntype[" + this.f68334x2262335f + "]\nerrCode[" + this.f68320x1c571ead + "]\nfileType[" + this.f68321xf1ebe47b + "]\nisThumb[" + this.f68322xf00f0c87 + "]\nstatus[" + this.f68328x10a0fed7 + "]\ntotalLen[" + this.f68330xeb1a61d6 + "]\noffset[" + this.f68325x90a9378 + "]\ntoUser[" + this.f68329x1209e7cb + "]\n";
    }
}
