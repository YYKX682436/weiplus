package ye5;

/* loaded from: classes9.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 f542820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006) {
        super(0);
        this.f542820d = c22100x47612006;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.e1 fromNewsJumpInfo;
        int i17 = 0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = this.f542820d;
        boolean z17 = (c22100x47612006 == null || c22100x47612006.fromNewsJumpInfo == null) ? false : true;
        if (c22100x47612006 != null && (fromNewsJumpInfo = c22100x47612006.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f286317a;
        }
        return new jz5.l(java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17));
    }
}
