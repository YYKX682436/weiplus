package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 f230619d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4) {
        this.f230619d = c16538x58704dc4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4 c16538x58704dc4 = this.f230619d;
        try {
            c16538x58704dc4.f230414p.m66939x853690dc(-1.0f);
            c16538x58704dc4.f230413o = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z(c16538x58704dc4, null);
            int i17 = 1000;
            int a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4.a(c16538x58704dc4, (c16538x58704dc4.f230416r.f152728h * 1000) + 1000);
            int max = java.lang.Math.max(c16538x58704dc4.f230416r.f152729i * 1000, 2500);
            if (max > 1000) {
                i17 = max;
            }
            int a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16538x58704dc4.a(c16538x58704dc4, i17);
            int width = (c16538x58704dc4.getWidth() - a17) / 2;
            c16538x58704dc4.f230415q = width;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16543xabefc23a c16543xabefc23a = c16538x58704dc4.f230414p;
            c16543xabefc23a.getClass();
            c16543xabefc23a.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i1(c16543xabefc23a, a17, width, a18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "RecyclerThumbSeekBar.run(212) width %d", java.lang.Integer.valueOf(c16538x58704dc4.getWidth()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z zVar = c16538x58704dc4.f230413o;
            int width2 = c16538x58704dc4.getWidth();
            int i18 = c16538x58704dc4.f230415q;
            zVar.f230646f = (width2 - i18) - a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.z zVar2 = c16538x58704dc4.f230413o;
            zVar2.f230645e = i18;
            c16538x58704dc4.f230412n.mo7960x6cab2c8d(zVar2);
            c16538x58704dc4.f230413o.mo1894x7e414b06();
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g gVar = c16538x58704dc4.f230410i;
            if (gVar != null) {
                gVar.a(false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RecyclerThumbSeekBar", e17, "RecyclerThumbSeekBar notifySuccess error : %s", e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g gVar2 = c16538x58704dc4.f230410i;
            if (gVar2 != null) {
                gVar2.a(true);
            }
        }
    }
}
