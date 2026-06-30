package e33;

/* loaded from: classes10.dex */
public class m2 implements y51.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 f328888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 f328889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e33.v2 f328890c;

    public m2(e33.v2 v2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830) {
        this.f328890c = v2Var;
        this.f328888a = c15632xfc4fd0d0;
        this.f328889b = c15628x6bc05830;
    }

    @Override // y51.d
    public void a(long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageAdapter", "onParseVideoError >> mediaId: %d, errCode: %d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
        this.f328888a.H = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830 = this.f328889b;
        if (c15628x6bc05830.f219944h == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", "changeStateInValid >> " + c15628x6bc05830.hashCode() + ", " + c15628x6bc05830.f219944h + ", " + c15628x6bc05830.f219945i);
        int i18 = c15628x6bc05830.f219945i;
        if (i18 == 1 || i18 == 2) {
            c15628x6bc05830.b(3);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a();
            am.zi ziVar = c5683x770cde8a.f136009g;
            ziVar.f90100b = false;
            ziVar.f90099a = c15628x6bc05830.f219944h;
            ziVar.f90101c = c15628x6bc05830.f219940d;
            c5683x770cde8a.e();
        }
    }

    @Override // y51.d
    public void b(long j17, aq.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageAdapter", "onParseVideoSuccess >> mediaId: %d", java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = this.f328888a;
        c15632xfc4fd0d0.C = u0Var.f94512e;
        c15632xfc4fd0d0.D = u0Var.f94511d;
        c15632xfc4fd0d0.F = u0Var.f94514g;
        c15632xfc4fd0d0.E = u0Var.f94510c;
        c15632xfc4fd0d0.G = 1;
        c15632xfc4fd0d0.B = u0Var.f94513f;
        j33.d0.k(c15632xfc4fd0d0.f219967i, c15632xfc4fd0d0.f219963e, this.f328890c.f329046x, false, 0, true, c15632xfc4fd0d0);
    }
}
