package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yi implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f105021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f105022b;

    public yi(com.tencent.mm.plugin.finder.convert.oj ojVar, so2.n1 n1Var) {
        this.f105021a = ojVar;
        this.f105022b = n1Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.protocal.protobuf.FinderContact contact;
        java.lang.String username;
        java.lang.String sessionBuffer;
        cw2.da daVar = this.f105021a.C;
        java.lang.String str2 = null;
        java.lang.Object tag = daVar != null ? daVar.getTag() : null;
        com.tencent.mm.plugin.finder.convert.gi giVar = tag instanceof com.tencent.mm.plugin.finder.convert.gi ? (com.tencent.mm.plugin.finder.convert.gi) tag : null;
        so2.n1 n1Var = this.f105022b;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = n1Var.f410491e;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        if (finderObject != null && (sessionBuffer = finderObject.getSessionBuffer()) != null) {
            str2 = sessionBuffer;
        } else if (giVar != null && (baseFinderFeed = giVar.f103489b) != null) {
            str2 = baseFinderFeed.g0();
        }
        lVarArr[1] = new jz5.l("session_buffer", str2);
        java.lang.String str3 = n1Var.f410492f;
        java.lang.String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        lVarArr[2] = new jz5.l("author_finder_username", str3);
        if (finderObject != null && (contact = finderObject.getContact()) != null && (username = contact.getUsername()) != null) {
            str4 = username;
        }
        lVarArr[3] = new jz5.l("card_finder_username", str4);
        lVarArr[4] = new jz5.l("card_index", java.lang.Integer.valueOf(giVar != null ? giVar.f103490c : 0));
        return kz5.c1.k(lVarArr);
    }
}
