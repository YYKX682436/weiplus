package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class b implements com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o f234921b;

    public b(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar) {
        this.f234920a = i17;
        this.f234921b = oVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.d1
    /* renamed from: complete */
    public final void mo67612xdc453139(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.o oVar = this.f234921b;
        if (this.f234920a != oVar.f235093t) {
            return;
        }
        oVar.f235090q = i17;
        if (oVar.f235091r) {
            android.view.View view = oVar.f235083j;
            if (view != null) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.a(oVar));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
                throw null;
            }
        }
    }
}
