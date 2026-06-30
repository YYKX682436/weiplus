package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.feature.finder.live.h4 f66750d = new com.tencent.mm.feature.finder.live.h4();

    public h4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gm0.j1.b().c();
        com.tencent.wcdb.core.Database database = (com.tencent.wcdb.core.Database) ((jz5.n) qo2.g.f365587a).getValue();
        kotlin.jvm.internal.o.f(database, "<get-db>(...)");
        return new qo2.e(database);
    }
}
