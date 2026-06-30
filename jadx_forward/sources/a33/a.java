package a33;

/* loaded from: classes10.dex */
public final class a implements t23.k1 {

    /* renamed from: d, reason: collision with root package name */
    public long f82585d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public yz5.p f82586e;

    @Override // t23.k1
    public void F6(java.util.LinkedList albumItems) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(albumItems, "albumItems");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f82585d;
        java.lang.String str = a33.c.f82593e;
        java.util.Iterator it = albumItems.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next()).f219950f;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(str, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) kz5.n0.Z(albumItems);
        c15630x7d8d0183.f219953i = c15630x7d8d01832 != null ? c15630x7d8d01832.f219953i : null;
        albumItems.add(0, c15630x7d8d0183);
        yz5.p pVar = this.f82586e;
        if (pVar != null) {
            pVar.mo149xb9724478(albumItems, java.lang.Long.valueOf(currentTimeMillis));
        }
    }
}
