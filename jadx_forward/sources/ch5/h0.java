package ch5;

/* loaded from: classes14.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        super(0);
        this.f123107d = c22421x5301a0d7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int c17;
        int i17 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.Z;
        android.content.Context mo7438x76847179 = this.f123107d.mo7438x76847179();
        if (mo7438x76847179 == null) {
            mo7438x76847179 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        if (com.p314xaae8f345.mm.ui.b4.c(mo7438x76847179)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7438x76847179);
            c17 = com.p314xaae8f345.mm.ui.cl.c(mo7438x76847179);
        } else {
            c17 = com.p314xaae8f345.mm.ui.bl.c(mo7438x76847179);
        }
        return java.lang.Float.valueOf(((int) ((r0.w0() - c17) * r0.S)) / r0.w0());
    }
}
