package com.tencent.mm.plugin.finder.highlight;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.highlight.u f111463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f111464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f111465f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.plugin.finder.highlight.u uVar, in5.s0 s0Var, xc2.p0 p0Var) {
        super(0);
        this.f111463d = uVar;
        this.f111464e = s0Var;
        this.f111465f = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g necessary_params_bytes;
        com.tencent.mm.protobuf.g necessary_params_bytes2;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        com.tencent.mm.plugin.finder.highlight.u uVar = this.f111463d;
        in5.s0 s0Var = this.f111464e;
        uVar.f111468d = s0Var;
        if (s0Var != null && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k)) != null) {
            com.tencent.mm.plugin.finder.highlight.s sVar = new com.tencent.mm.plugin.finder.highlight.s(uVar);
            uVar.f111472h = sVar;
            finderVideoLayout.t(sVar);
        }
        com.tencent.mm.plugin.finder.highlight.t tVar = new com.tencent.mm.plugin.finder.highlight.t(uVar);
        com.tencent.mm.plugin.finder.highlight.p pVar = uVar.f111470f;
        pVar.f111455b = tVar;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveHighlightDrawerUIC", "add highlight progress listener to drawer");
        xc2.p0 p0Var = this.f111465f;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info = p0Var.f453234a.getNative_info();
        if (native_info != null && native_info.getNative_type() == 56) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = p0Var.f453234a;
            com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo.getNative_info();
            if (((native_info2 == null || (necessary_params_bytes2 = native_info2.getNecessary_params_bytes()) == null) ? 0 : necessary_params_bytes2.f192156a.length) > 0) {
                r45.hb1 hb1Var = new r45.hb1();
                com.tencent.mm.protocal.protobuf.NativeInfo native_info3 = finderJumpInfo.getNative_info();
                byte[] g17 = (native_info3 == null || (necessary_params_bytes = native_info3.getNecessary_params_bytes()) == null) ? null : necessary_params_bytes.g();
                if (g17 != null) {
                    try {
                        hb1Var.parseFrom(g17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                }
                pVar.getClass();
                java.util.LinkedList<r45.gb1> list = hb1Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getInfo_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                for (r45.gb1 gb1Var : list) {
                    kotlin.jvm.internal.o.d(gb1Var);
                    arrayList.add(new com.tencent.mm.plugin.finder.highlight.d(gb1Var));
                }
                java.util.ArrayList arrayList2 = pVar.f111456c;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = pVar.f111458e;
                if (wxRecyclerAdapter == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                wxRecyclerAdapter.notifyDataSetChanged();
                com.tencent.mm.plugin.finder.highlight.FinderLiveHighlightDrawer finderLiveHighlightDrawer = uVar.f111469e;
                if (finderLiveHighlightDrawer != null) {
                    if (s0Var != null) {
                        s0Var.getAdapterPosition();
                    }
                    finderLiveHighlightDrawer.r(true, true, 0);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
