package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n3 f285919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f285921f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.n3 n3Var, yb5.d dVar, rd5.d dVar2) {
        super(1);
        this.f285919d = n3Var;
        this.f285920e = dVar;
        this.f285921f = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e3 holder = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.e3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (te5.f.f500167a.a()) {
            holder.f39493x8ad70635.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
            holder.f39493x8ad70635.setForeground(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562704me));
            holder.f39493x8ad70635.setPadding(0, 0, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 5), 0);
        }
        holder.f39493x8ad70635.setOnClickListener(this.f285919d.w(this.f285920e));
        holder.f39493x8ad70635.setOnLongClickListener(this.f285919d.u(this.f285920e));
        android.view.View view = holder.f39493x8ad70635;
        sb5.z zVar = (sb5.z) this.f285920e.f542241c.a(sb5.z.class);
        view.setOnTouchListener(zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null);
        holder.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(this.f285921f, this.f285920e.D(), holder, null));
        return jz5.f0.f384359a;
    }
}
