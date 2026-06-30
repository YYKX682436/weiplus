package bg2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.x0 f20320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f20321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bg2.x0 x0Var, dk2.zf zfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20320e = x0Var;
        this.f20321f = zfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bg2.n0(this.f20320e, this.f20321f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.n0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        android.content.Context context;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        byte[] bArr;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f20319d;
        bg2.x0 x0Var = this.f20320e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.sp2 sp2Var = new r45.sp2();
            sp2Var.set(1, db2.t4.f228171a.a(6888));
            uc2.f fVar = (uc2.f) x0Var.O6(uc2.f.class);
            sp2Var.set(2, (fVar == null || (bArr = ((bg2.d2) fVar).f20026y) == null) ? null : new com.tencent.mm.protobuf.g(bArr, 0, bArr.length));
            tc2.g gVar = x0Var.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (finderObject = feedObject.getFinderObject()) != null) {
                sp2Var.set(5, java.lang.Long.valueOf(finderObject.getId()));
                sp2Var.set(6, finderObject.getObjectNonceId());
                r45.nw1 liveInfo = finderObject.getLiveInfo();
                sp2Var.set(4, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
            }
            sp2Var.set(7, 2);
            in5.s0 s0Var = gVar.f417149i;
            if (s0Var == null || (context = s0Var.f293121e) == null || (str = xy2.c.e(context)) == null) {
                str = "";
            }
            sp2Var.set(8, str);
            sp2Var.set(3, ke2.q0.f306981w.a(this.f20321f));
            com.tencent.mm.modelbase.i d17 = sp2Var.d();
            this.f20319d = 1;
            obj = rm0.h.b(d17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        if (fVar2.b()) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.daj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            db5.t7.f(com.tencent.mm.sdk.platformtools.x2.f193071a, string, bg2.m0.f20295a);
        }
        com.tencent.mars.xlog.Log.i(x0Var.f20613e, "[complainDanmaku] errCode:" + fVar2.f70616b + ", errType:" + fVar2.f70615a);
        return jz5.f0.f302826a;
    }
}
