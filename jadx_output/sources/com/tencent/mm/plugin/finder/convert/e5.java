package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class e5 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f103226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f103227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f103228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f103230h;

    public e5(boolean z17, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.convert.q6 q6Var, in5.s0 s0Var, so2.z0 z0Var) {
        this.f103226d = z17;
        this.f103227e = finderJumpInfo;
        this.f103228f = q6Var;
        this.f103229g = s0Var;
        this.f103230h = z0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        r45.wh2 req = (r45.wh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FeedCommentHeaderConvert", "feedId:" + pm0.v.u(req.getLong(0)) + ", scene:" + req.getInteger(1) + ", optype:" + req.getInteger(2));
        if (ret.getInteger(1) == 0) {
            int i17 = !this.f103226d ? 1 : 0;
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f103227e;
            if (finderJumpInfo == null || (native_info = finderJumpInfo.getNative_info()) == null || (str = native_info.getNecessary_params()) == null) {
                str = "";
            }
            com.tencent.mars.xlog.Log.i("FinderExt", "[updateOpParams] hideFlag:" + i17 + ", necessaryParams:" + str);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONObject.put("hide_flag", i17);
                com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo != null ? finderJumpInfo.getNative_info() : null;
                if (native_info2 != null) {
                    native_info2.setNecessary_params(jSONObject.toString());
                }
            } catch (org.json.JSONException unused) {
            }
            this.f103228f.x(this.f103229g, this.f103230h.E, true);
        }
    }
}
