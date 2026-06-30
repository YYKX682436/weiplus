package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class vp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.xp f104805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(dm.pd pdVar, com.tencent.mm.plugin.finder.convert.xp xpVar) {
        super(1);
        this.f104804d = pdVar;
        this.f104805e = xpVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            int i17 = fVar.f70616b;
            cu2.a0 a0Var = cu2.b0.f222371a;
            dm.pd pdVar = this.f104804d;
            com.tencent.mm.plugin.finder.convert.xp xpVar = this.f104805e;
            if (i17 == -4043) {
                pdVar.field_extFlag |= 8;
                com.tencent.mars.xlog.Log.i(xpVar.f104968i, "requestFinderFollowVerify failed revoke, id:" + pdVar.field_id + ", modify extFlag:" + pdVar.field_extFlag + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f104967h.f103851a));
            } else if (i17 == -4042) {
                pdVar.field_followExpireTime = 0L;
                com.tencent.mars.xlog.Log.i(xpVar.f104968i, "requestFinderFollowVerify failed expire, id:" + pdVar.field_id + ", modify extFlag:" + pdVar.field_extFlag + ", updateDb ret:" + a0Var.l(pdVar, xpVar.f104967h.f103851a));
            }
            java.util.Vector vector = cu2.c0.f222378a;
            cu2.c0.f222378a.remove(java.lang.Long.valueOf(pdVar.field_id));
            com.tencent.mm.autogen.events.FinderMentionUpdateEvent finderMentionUpdateEvent = new com.tencent.mm.autogen.events.FinderMentionUpdateEvent();
            long j17 = pdVar.field_id;
            am.lc lcVar = finderMentionUpdateEvent.f54306g;
            lcVar.f7236a = j17;
            lcVar.f7239d = 0;
            finderMentionUpdateEvent.e();
        }
        return jz5.f0.f302826a;
    }
}
