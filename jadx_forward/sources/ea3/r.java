package ea3;

/* loaded from: classes10.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.p f332206d;

    public r(ea3.p pVar) {
        this.f332206d = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onAlbumChanged");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ea3.p pVar = this.f332206d;
        java.util.Iterator it = pVar.G.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next();
            java.lang.String e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.e(c15630x7d8d0183.f219953i, false);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator it6 = it;
            java.lang.String str4 = c15630x7d8d0183.f219951g;
            java.lang.String str5 = c15630x7d8d0183.f219948d;
            if (str4 != null) {
                str5 = str5 + "|" + c15630x7d8d0183.f219951g;
            }
            hashMap.put(dm.i4.f66865x76d1ec5a, android.util.Base64.encodeToString(str5.getBytes(), 0));
            hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c15630x7d8d0183.f219949e);
            if (e17 != null) {
                str3 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(e17).f264269e;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "thumbPath is null");
                str3 = "";
            }
            hashMap.put(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9, str3);
            hashMap.put("photoCount", java.lang.Integer.valueOf(c15630x7d8d0183.f219950f));
            arrayList.add(hashMap);
            it = it6;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.lang.String e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.e(pVar.E.f219953i, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = pVar.E;
        if (c15630x7d8d01832.f219951g != null) {
            str = pVar.E.f219948d + "|" + pVar.E.f219951g;
        } else {
            str = c15630x7d8d01832.f219948d;
        }
        hashMap2.put(dm.i4.f66865x76d1ec5a, android.util.Base64.encodeToString(str.getBytes(), 0));
        hashMap2.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, pVar.E.f219949e);
        if (e18 != null) {
            str2 = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(e18).f264269e;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LiteAppAlbumViewImpl", "thumbPath is null");
            str2 = "";
        }
        hashMap2.put(com.p314xaae8f345.tav.p2947x2eaf9f.C25657xb56a6b4f.f47247x9eebe4b9, str2);
        hashMap2.put("photoCount", java.lang.Integer.valueOf(pVar.E.f219950f));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("albums", arrayList);
        hashMap3.put("currentalbum", hashMap2);
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new ea3.q(this, hashMap3));
    }
}
