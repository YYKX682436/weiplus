package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class bz extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.bz f106419d = new com.tencent.mm.plugin.finder.feed.bz();

    public bz() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.jx2 jx2Var = (r45.jx2) obj;
        return pm0.v.u(jx2Var.getLong(0)) + " type:" + jx2Var.getInteger(2) + ' ' + hc2.o0.m((com.tencent.mm.protocal.protobuf.FinderObject) jx2Var.getCustom(1));
    }
}
