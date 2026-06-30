package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class h6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.l6 f294513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f294514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.m6 f294515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.p314xaae8f345.mm.vfs.l6 l6Var, int i17, com.p314xaae8f345.mm.vfs.m6 m6Var) {
        super(1);
        this.f294513d = l6Var;
        this.f294514e = i17;
        this.f294515f = m6Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.vfs.x1 fe6 = (com.p314xaae8f345.mm.vfs.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fe6, "fe");
        return java.lang.Boolean.valueOf(this.f294513d.c(this.f294514e, this.f294515f.f294608b, fe6));
    }
}
