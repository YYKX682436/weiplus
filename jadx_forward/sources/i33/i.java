package i33;

/* loaded from: classes10.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a f369732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15665xa8e4cac4 f369733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15665xa8e4cac4 c15665xa8e4cac4) {
        super(0);
        this.f369732d = c5683x770cde8a;
        this.f369733e = c15665xa8e4cac4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaId: ");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a = this.f369732d;
        sb6.append(c5683x770cde8a.f136009g.f90099a);
        sb6.append(" isUseLivePhoto:");
        am.zi ziVar = c5683x770cde8a.f136009g;
        sb6.append(ziVar.f90100b);
        sb6.append(" scene: ");
        sb6.append(ziVar.f90101c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEventUIC", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.uic.C15665xa8e4cac4 c15665xa8e4cac4 = this.f369733e;
        c15665xa8e4cac4.getClass();
        if (ziVar.f90101c == 1) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = c15665xa8e4cac4.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
            e33.b0 b0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) m158354x19263085).f220061m;
            if (b0Var != null) {
                java.util.ArrayList arrayList = b0Var.f328663f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
                java.util.Iterator it = arrayList.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) next;
                    if (abstractC15633xee433078.f219967i == ziVar.f90099a) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AlbumEventUIC", "notifyMediaDataChange find it " + abstractC15633xee433078.f219967i);
                        b0Var.m8147xed6e4d18(b0Var.z() + i17);
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = c15665xa8e4cac4.m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x192630852, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) m158354x192630852).R7();
                        break;
                    }
                    i17 = i18;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
