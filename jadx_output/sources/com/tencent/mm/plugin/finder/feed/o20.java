package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class o20 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.o20 f108617d = new com.tencent.mm.plugin.finder.feed.o20();

    public o20() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject2;
        r45.dm2 object_extend;
        r45.vx0 vx0Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject3;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject4;
        r45.dm2 object_extend2;
        r45.vx0 vx0Var2;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.Integer num = null;
        sb6.append((baseFinderFeed == null || (feedObject3 = baseFinderFeed.getFeedObject()) == null || (feedObject4 = feedObject3.getFeedObject()) == null || (object_extend2 = feedObject4.getObject_extend()) == null || (vx0Var2 = (r45.vx0) object_extend2.getCustom(0)) == null) ? null : vx0Var2.getString(1));
        sb6.append('#');
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (feedObject2 = feedObject.getFeedObject()) != null && (object_extend = feedObject2.getObject_extend()) != null && (vx0Var = (r45.vx0) object_extend.getCustom(0)) != null) {
            num = java.lang.Integer.valueOf(vx0Var.getInteger(6));
        }
        sb6.append(num);
        return sb6.toString();
    }
}
