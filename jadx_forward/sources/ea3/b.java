package ea3;

/* loaded from: classes10.dex */
public class b implements kn5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ea3.n f332135a;

    public b(ea3.n nVar) {
        this.f332135a = nVar;
    }

    @Override // kn5.a
    public void a(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "setSelected() called with: index = [" + i17 + "], selected = [" + z17 + "]");
        ea3.n nVar = this.f332135a;
        nVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z18 = nVar.z(i17);
        if (z18 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z18.f219963e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppAlbumAdapter", "[onClick] null == item!");
            nVar.m8147xed6e4d18(i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "click image path:" + z18.f219963e);
        if (nVar.f332163g.contains(z18) == z17) {
            return;
        }
        nVar.J(i17, z18, null);
    }

    @Override // kn5.a
    public boolean b(int i17) {
        return true;
    }

    @Override // kn5.a
    public boolean c(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppAlbumAdapter", "isSelected() called with: index = [" + i17 + "]");
        ea3.n nVar = this.f332135a;
        boolean contains = nVar.f332163g.contains(nVar.z(i17));
        nVar.getClass();
        return contains;
    }
}
