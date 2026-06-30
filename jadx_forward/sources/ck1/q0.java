package ck1;

/* loaded from: classes4.dex */
public final class q0 extends p012xc85e97e9.p093xedfae76a.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 f123899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f123900c;

    public q0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d4, java.lang.String str) {
        this.f123899b = c12720x8e4fa2d4;
        this.f123900c = str;
    }

    @Override // p012xc85e97e9.p093xedfae76a.h1, p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ck1.s0.class, modelClass)) {
            return new ck1.s0(this.f123899b, this.f123900c, null);
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = super.a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "create(...)");
        return a17;
    }
}
