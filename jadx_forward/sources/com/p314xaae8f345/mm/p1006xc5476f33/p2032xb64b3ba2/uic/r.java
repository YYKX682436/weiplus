package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f239999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v f240000e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f240001f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar, android.content.Intent intent) {
        super(0);
        this.f239999d = z17;
        this.f240000e = vVar;
        this.f240001f = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f239999d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar = this.f240000e;
        if (z17) {
            db5.t7.h(vVar.m158354x19263085(), vVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2p));
        } else {
            db5.t7.g(vVar.m158354x19263085(), vVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2o));
        }
        vVar.m158354x19263085().setResult(6, this.f240001f);
        vVar.m158354x19263085().finish();
        return jz5.f0.f384359a;
    }
}
