package bg2;

/* loaded from: classes2.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.z3 f20028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(bg2.z3 z3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20028e = z3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.d3(this.f20028e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object q17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.String userName;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.nw1 liveInfo;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        com.tencent.mm.protobuf.g byteString;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20027d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            bg2.z3 z3Var = this.f20028e;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z3Var.f417141d.f417148h;
            long j17 = 0;
            long id6 = (baseFinderFeed == null || (feedObject4 = baseFinderFeed.getFeedObject()) == null) ? 0L : feedObject4.getId();
            tc2.g gVar = z3Var.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
            if (baseFinderFeed2 != null && (feedObject2 = baseFinderFeed2.getFeedObject()) != null && (feedObject3 = feedObject2.getFeedObject()) != null && (liveInfo = feedObject3.getLiveInfo()) != null) {
                j17 = liveInfo.getLong(0);
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = gVar.f417148h;
            java.lang.String str = (baseFinderFeed3 == null || (feedObject = baseFinderFeed3.getFeedObject()) == null || (userName = feedObject.getUserName()) == null) ? "" : userName;
            this.f20027d = 1;
            ((b92.d1) zbVar).getClass();
            q17 = st2.g3.f412326a.q(id6, j17, 2, str, this);
            if (q17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            q17 = obj;
        }
        r45.nd2 nd2Var = (r45.nd2) q17;
        r45.cp1 cp1Var = new r45.cp1();
        byte[] g17 = (nd2Var == null || (byteString = nd2Var.getByteString(1)) == null) ? null : byteString.g();
        if (g17 != null) {
            try {
                cp1Var.parseFrom(g17);
                return cp1Var;
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
