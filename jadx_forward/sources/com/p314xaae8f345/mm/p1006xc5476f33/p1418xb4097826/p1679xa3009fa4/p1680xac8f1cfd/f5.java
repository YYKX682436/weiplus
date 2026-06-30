package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class f5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f215864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f215865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f215866f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f215867g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647, java.lang.String str, int i17, long j17) {
        super(0);
        this.f215864d = c15442xfd56d647;
        this.f215865e = str;
        this.f215866f = i17;
        this.f215867g = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bb2.w1 bulletManager;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f215864d;
        bb2.a1 a1Var = c15442xfd56d647.f215037q;
        if (a1Var != null && (bulletManager = a1Var.getBulletManager()) != null) {
            bb2.w1.k(bulletManager, this.f215865e, c15442xfd56d647.a7(), this.f215866f, 0L, this.f215867g, 0L, false, 104, null);
        }
        return jz5.f0.f384359a;
    }
}
