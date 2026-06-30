package fq0;

/* loaded from: classes7.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fq0.x f347000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(fq0.x xVar) {
        super(0);
        this.f347000d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qq0.u uVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclFrameSet.SCL", "CoverLogic, removeCoverFromScl");
        fq0.x xVar = this.f347000d;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = xVar.f347021l;
        if (c10867x3e50a04d != null && (uVar = c10867x3e50a04d.f150218r) != null) {
            uVar.f447453i = true;
            uVar.f447449e.postDelayed(new qq0.r(uVar), 600L);
        }
        hq0.e0 e0Var = xVar.f347012c;
        if (e0Var != null) {
            java.lang.String frameSetId = xVar.f347011b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
            hq0.f fVar = e0Var.f364521i.f364535q;
            if (fVar != null) {
                dq0.a0 a0Var = (dq0.a0) fVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclBizFlutterPluginBase.SCL.MBFlutter", "removeCover, frameSetId: ".concat(frameSetId));
                com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.g0 j17 = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.h0.j();
                j17.f149499d |= 1;
                j17.f149500e = frameSetId;
                j17.m20881x7bb163d5();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                j17.f149499d |= 2;
                j17.f149501f = currentTimeMillis;
                j17.m20881x7bb163d5();
                dq0.x xVar2 = new dq0.x(a0Var, j17.mo20556x59bc66e().mo20648x5f01b1f6());
                fq0.x Ai = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(frameSetId);
                if (Ai != null && Ai.f347022m) {
                    xVar2.run();
                } else {
                    java.util.HashMap hashMap = a0Var.f323827m;
                    java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(frameSetId);
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                    }
                    linkedList.add(xVar2);
                    hashMap.put(frameSetId, linkedList);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
