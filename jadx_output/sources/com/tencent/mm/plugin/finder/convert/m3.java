package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f103971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.u4 f103972f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(in5.s0 s0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.convert.u4 u4Var) {
        super(1);
        this.f103970d = s0Var;
        this.f103971e = finderJumpInfo;
        this.f103972f = u4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.content.Context context = this.f103970d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        xc2.p0 p0Var = new xc2.p0(this.f103971e);
        p0Var.f453244f = this.f103972f.f104672g;
        xc2.y2.i(y2Var, context, p0Var, 0, this.f103970d, 4, null);
        return jz5.f0.f302826a;
    }
}
