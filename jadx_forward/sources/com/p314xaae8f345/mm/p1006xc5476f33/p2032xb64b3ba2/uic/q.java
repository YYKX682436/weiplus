package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f239991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f239992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v f239993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f239994g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar, android.content.Intent intent) {
        super(0);
        this.f239991d = u3Var;
        this.f239992e = z17;
        this.f239993f = vVar;
        this.f239994g = intent;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f239991d.hide();
        boolean z17 = this.f239992e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.v vVar = this.f239993f;
        if (z17) {
            db5.t7.h(vVar.m158354x19263085(), vVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2p));
        } else {
            db5.t7.g(vVar.m158354x19263085(), vVar.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2o));
        }
        vVar.m158354x19263085().setResult(6, this.f239994g);
        vVar.m158354x19263085().finish();
        return jz5.f0.f384359a;
    }
}
