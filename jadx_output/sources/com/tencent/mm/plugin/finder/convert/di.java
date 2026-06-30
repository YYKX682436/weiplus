package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class di extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc2.a f103157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di(com.tencent.mm.plugin.finder.convert.oj ojVar, fc2.a aVar) {
        super(0);
        this.f103156d = ojVar;
        this.f103157e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.RecyclerView o17;
        fc2.t tVar = (fc2.t) this.f103157e;
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103156d;
        java.util.ArrayList t17 = ojVar.t();
        so2.j5 j5Var = t17 != null ? (so2.j5) kz5.n0.a0(t17, tVar.f260994m) : null;
        boolean z17 = false;
        if (j5Var != null && (j5Var instanceof so2.n1)) {
            r45.en2 place_holder_info = ((so2.n1) j5Var).getFeedObject().getFeedObject().getPlace_holder_info();
            if ((place_holder_info != null ? place_holder_info.getInteger(2) : 0) == 8) {
                z17 = true;
            }
        }
        if (z17) {
            in5.s0 s0Var = ojVar.f104192q;
            o17 = s0Var != null ? s0Var.o() : null;
            if (o17 != null) {
                o17.setDescendantFocusability(262144);
            }
        } else {
            in5.s0 s0Var2 = ojVar.f104192q;
            o17 = s0Var2 != null ? s0Var2.o() : null;
            if (o17 != null) {
                o17.setDescendantFocusability(131072);
            }
        }
        return jz5.f0.f302826a;
    }
}
