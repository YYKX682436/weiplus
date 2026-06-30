package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.emoji.ui.f6 f97987d = new com.tencent.mm.plugin.emoji.ui.f6();

    public f6() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        o12.u it = (o12.u) obj;
        kotlin.jvm.internal.o.g(it, "it");
        o12.w wVar = o12.w.f342193a;
        o12.y yVar = it.f342184b;
        if (kotlin.jvm.internal.o.b(yVar, wVar)) {
            return "1";
        }
        if (kotlin.jvm.internal.o.b(yVar, o12.v.f342192a)) {
            return "2";
        }
        if (kotlin.jvm.internal.o.b(yVar, o12.x.f342194a)) {
            return "3";
        }
        throw new jz5.j();
    }
}
