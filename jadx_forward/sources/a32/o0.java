package a32;

/* loaded from: classes10.dex */
public final class o0 implements u22.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd f82567a;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd) {
        this.f82567a = c13395xf82efecd;
    }

    @Override // u22.c
    public void a(int i17, int i18) {
        this.f82567a.f180218y.m8151xc67946d3(i17, i18);
    }

    @Override // u22.c
    public void b(java.util.List lensList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lensList, "lensList");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd = this.f82567a;
        z22.f fVar = c13395xf82efecd.f180218y;
        fVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MoreStickerAdapter", "update: " + lensList.size());
        java.util.ArrayList arrayList = fVar.f551250d;
        arrayList.clear();
        arrayList.addAll(lensList);
        if (c13395xf82efecd.C) {
            c13395xf82efecd.f180216w.postDelayed(new a32.n0(c13395xf82efecd), 300L);
            c13395xf82efecd.C = false;
        }
    }

    @Override // u22.c
    public void c(int i17, int i18) {
        this.f82567a.f180218y.m8153xd399a4d9(i17, i18);
    }

    @Override // u22.c
    public void d(int i17, int i18) {
        this.f82567a.f180218y.m8154xdb81fc7f(i17, i18);
    }

    @Override // u22.c
    /* renamed from: onMove */
    public void mo484xc39cb650(int i17, int i18) {
        this.f82567a.f180218y.m8150x87567217(i17, i18);
    }
}
