package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class p8 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.f1 f104244a;

    public p8(so2.f1 f1Var) {
        this.f104244a = f1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.Integer num;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        bu2.j jVar = bu2.j.f24534a;
        so2.f1 f1Var = this.f104244a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = jVar.h(f1Var.getItemId());
        if (h17 == null || (feedObject = h17.getFeedObject()) == null) {
            num = null;
        } else {
            nv2.h1 h1Var = nv2.n1.f340550g;
            num = java.lang.Integer.valueOf(nv2.n1.f340551h.l(feedObject));
        }
        jz5.l[] lVarArr = new jz5.l[3];
        lVarArr[0] = new jz5.l("like_cnt", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
        lVarArr[1] = new jz5.l("thx_to_uin", f1Var.f410336d.getString(5));
        lVarArr[2] = new jz5.l("feed_id", f1Var.f410337e);
        return kz5.c1.k(lVarArr);
    }
}
