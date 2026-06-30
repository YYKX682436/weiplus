package qp1;

/* loaded from: classes10.dex */
public class z implements i4.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pv.i0 f447291a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f447292b;

    public z(pv.i0 i0Var, int i17) {
        this.f447291a = i0Var;
        this.f447292b = i17;
    }

    @Override // i4.h
    public void a(i4.j jVar) {
        int i17 = this.f447292b;
        pv.i0 i0Var = this.f447291a;
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated fail");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w0) i0Var).a(i17);
            return;
        }
        i4.i iVar = jVar.f369892d;
        if (iVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w0) i0Var).a(iVar.f369882d);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, palette generated but swatch is null");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w0) i0Var).a(i17);
        }
    }
}
