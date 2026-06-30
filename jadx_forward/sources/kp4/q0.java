package kp4;

/* loaded from: classes5.dex */
public final class q0 implements kp4.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 f392667a;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9) {
        this.f392667a = c18813xaf14a0f9;
    }

    public void a(bg0.y item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onItemSelected: " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18813xaf14a0f9 c18813xaf14a0f9 = this.f392667a;
        c18813xaf14a0f9.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "reset: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f fVar = c18813xaf14a0f9.f257584f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x42192224 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224) fVar;
        c16540x42192224.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SegmentClip.RecyclerThumbBarView", "reset: ");
        rm5.k kVar = c16540x42192224.f230458x;
        if (kVar != null) {
            kVar.mo122875x5cd39ffa();
        }
        c16540x42192224.f230458x = null;
        c16540x42192224.B.f230621e = null;
        c18813xaf14a0f9.f257585g = item;
        fVar.mo66926xcb54795(item.f101404g);
        double d17 = item.f101403f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224 c16540x421922242 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16540x42192224) fVar;
        java.lang.String path = item.f101399b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        c16540x421922242.mediaItemStartTimeMsPositionMap.put(path, java.lang.Double.valueOf(d17));
        fVar.mo66925xfdfce516(item.f101400c / 1000.0d);
        fVar.mo66929x50321ffc(item.f101401d);
        c16540x421922242.b(path);
        fVar.mo66927x5dd7c812(new kp4.o0(c18813xaf14a0f9));
    }
}
