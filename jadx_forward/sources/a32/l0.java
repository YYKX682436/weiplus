package a32;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd f82561d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd) {
        super(2);
        this.f82561d = c13395xf82efecd;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        t85.d info = (t85.d) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd = this.f82561d;
        z22.f fVar = c13395xf82efecd.f180218y;
        int i17 = fVar.f551251e;
        if (i17 != intValue) {
            fVar.m8147xed6e4d18(i17);
            fVar.f551251e = intValue;
            fVar.m8147xed6e4d18(intValue);
        }
        yz5.l selectionCallback = c13395xf82efecd.getSelectionCallback();
        if (selectionCallback != null) {
            selectionCallback.mo146xb9724478(info);
        }
        c13395xf82efecd.B = info.f497989a.f464325d;
        return jz5.f0.f384359a;
    }
}
