package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(in5.s0 s0Var) {
        super(0);
        this.f104447d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f104447d.f293121e;
        db5.t7.makeText(context, context.getString(com.tencent.mm.R.string.f9b), 0).show();
        return jz5.f0.f302826a;
    }
}
