package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 f296516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f296517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f296518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f296519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f296520h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var, boolean z17, long j17, long j18, long j19) {
        super(0);
        this.f296516d = m0Var;
        this.f296517e = z17;
        this.f296518f = j17;
        this.f296519g = j18;
        this.f296520h = j19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = this.f296516d;
        sb6.append(m0Var.f296525a);
        sb6.append(". preferredTileSize. ");
        sb6.append(this.f296517e ? "changed" : "keep");
        sb6.append(". ");
        sb6.append(zq5.h.f(this.f296518f));
        sb6.append(" -> ");
        sb6.append(zq5.h.f(this.f296519g));
        sb6.append(", containerSize=");
        sb6.append(zq5.h.f(this.f296520h));
        sb6.append(". '");
        sb6.append(com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0.a(m0Var));
        sb6.append('\'');
        return sb6.toString();
    }
}
