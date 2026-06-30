package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class pg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f108719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f108720e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f108721f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(com.tencent.mm.ui.MMActivity mMActivity, r45.m70 m70Var, r45.v71 v71Var) {
        super(0);
        this.f108719d = mMActivity;
        this.f108720e = m70Var;
        this.f108721f = v71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        androidx.appcompat.app.AppCompatActivity context = this.f108719d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.m70 m70Var = this.f108720e;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f108721f.getCustom(3);
        s40.w0.z5(w0Var, context, m70Var, null, finderContact != null ? finderContact.getUsername() : null, null, 20, null);
        return jz5.f0.f302826a;
    }
}
