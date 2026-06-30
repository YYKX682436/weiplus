package v70;

/* loaded from: classes3.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f515154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v70.w f515155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.String str, long j17, v70.w wVar) {
        super(0);
        this.f515153d = str;
        this.f515154e = j17;
        this.f515155f = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17 = pt0.f0.f439742b1.k(this.f515153d, this.f515154e);
        if (k17 != null) {
            v70.w wVar = this.f515155f;
            wVar.getClass();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 S1 = m11.b1.Di().S1(k17);
            if (S1 != null) {
                tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
                bm5.f0 d17 = bm5.c0.f104083a.d(S1.l());
                java.lang.String str = S1.f404170e;
                if (str == null) {
                    str = "";
                }
                java.lang.String aj6 = ((k90.b) u0Var).aj(k17, d17, str, "", "");
                java.lang.String str2 = (r26.n0.N(aj6) ^ true) && com.p314xaae8f345.mm.vfs.w6.j(aj6) ? aj6 : null;
                if (str2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", "updateMsgImgHashInfoInner midPath is null or not exist ".concat(aj6));
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(str2)) {
                    com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                    com.p314xaae8f345.mm.vfs.r6 h07 = lp0.b.h0("MsgImg_PHash");
                    if (!h07.m()) {
                        h07.J();
                    }
                    java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(h07, k17.m124847x74d37ac6() + "_pHash_hevc").o();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                    if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                        com.p314xaae8f345.mm.vfs.w6.h(o17);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.MsgImgFeatureService", "updateMsgImgHashInfo hevc_ret:" + ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).aj(str2, o17, 1));
                    wVar.aj(aj6.hashCode(), o17);
                    com.p314xaae8f345.mm.vfs.w6.h(o17);
                } else {
                    wVar.aj(aj6.hashCode(), str2);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImgUpload.MsgImgFeatureService", "updateMsgImgHashInfoInner imgInfo is null. msgId: " + k17.m124847x74d37ac6() + ", talekr: " + k17.Q0());
            }
        }
        return jz5.f0.f384359a;
    }
}
