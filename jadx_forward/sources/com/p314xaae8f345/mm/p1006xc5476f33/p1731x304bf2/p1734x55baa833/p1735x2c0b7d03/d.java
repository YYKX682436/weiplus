package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03;

/* loaded from: classes15.dex */
public class d implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a f220281d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a) {
        this.f220281d = c15840x9669df9a;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a.b(this.f220281d, iVar, false);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d;
        java.lang.String str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatRoom.ChatChannelPage", "select tab:%d", java.lang.Integer.valueOf(iVar.f425315e));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a c15840x9669df9a = this.f220281d;
        c21470xb673f8d = c15840x9669df9a.f36920x1c18ee31;
        c21470xb673f8d.m80844x940d026a(iVar.f425315e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15840x9669df9a.b(c15840x9669df9a, iVar, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db c15839xf36ce1db = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1735x2c0b7d03.C15839xf36ce1db) c15840x9669df9a.f220264m.mo7764xfb80e389(iVar.f425315e);
        if (c15840x9669df9a.f220265n != null && c15839xf36ce1db != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = c15839xf36ce1db.f220244g;
            if (c15716x8f4414e3.f36473xbda00cb5) {
                str = c15716x8f4414e3.f36469x39ecb9c0;
            } else {
                if (c15716x8f4414e3.f36470x8cea31d7 == 0) {
                    str = "";
                } else {
                    str = "# " + c15839xf36ce1db.f220244g.f36472x337a8b;
                }
            }
            c15840x9669df9a.f220265n.a(!c15839xf36ce1db.f220244g.f36473xbda00cb5, str);
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e32 = c15839xf36ce1db.f220244g;
            c15840x9669df9a.f220265n.b(!(c15716x8f4414e32.f36470x8cea31d7 == 0), c15716x8f4414e32, false);
        }
        c15840x9669df9a.f220266o = c15839xf36ce1db.f220244g.f36470x8cea31d7;
        if (!c15840x9669df9a.f220267p) {
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a.o(iVar.f425311a instanceof java.lang.Integer ? ((java.lang.Integer) r0).intValue() : 1, 2L, c15840x9669df9a.f220260f, c15840x9669df9a.f220259e, c15840x9669df9a.f220266o);
        }
        c15840x9669df9a.f220267p = false;
    }
}
