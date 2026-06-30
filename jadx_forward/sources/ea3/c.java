package ea3;

/* loaded from: classes10.dex */
public class c implements ea3.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f332137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f332138b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ea3.n f332139c;

    public c(ea3.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078, int i17) {
        this.f332139c = nVar;
        this.f332137a = abstractC15633xee433078;
        this.f332138b = i17;
    }

    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "LivePhotoSelectCallback onClickChangeSelect:%b", java.lang.Boolean.valueOf(z17));
        ea3.n nVar = this.f332139c;
        java.util.ArrayList arrayList = nVar.f332163g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f332137a;
        boolean contains = arrayList.contains(abstractC15633xee433078);
        int i17 = this.f332138b;
        if (!contains) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "no select but live icon state changed! position:%d", java.lang.Integer.valueOf(i17));
            return;
        }
        int indexOf = nVar.f332163g.indexOf(abstractC15633xee433078);
        ea3.j jVar = nVar.f332164h;
        if (jVar != null) {
            ((ea3.p) jVar).m(nVar.B(), i17, indexOf, 0);
        }
    }
}
