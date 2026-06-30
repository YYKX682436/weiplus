package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class rl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f201190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl f201191f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201190e = view;
        this.f201191f = slVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rl(this.f201190e, this.f201191f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.rl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f201189d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = this.f201191f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int[] iArr = new int[2];
            android.view.View view = this.f201190e;
            view.getLocationOnScreen(iArr);
            jz5.l a17 = slVar.a(view, iArr);
            try {
                slVar.showAtLocation(view, 0, ((java.lang.Number) a17.f384366d).intValue(), ((java.lang.Number) a17.f384367e).intValue());
                if (slVar.f201338i != null) {
                    slVar.setTouchInterceptor(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pl(slVar));
                }
                slVar.f201335f.mo152xb9724478();
                slVar.getContentView().setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ql(slVar));
                long j17 = slVar.f201332c;
                this.f201189d = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                    return aVar;
                }
            } catch (android.view.WindowManager.BadTokenException unused) {
                slVar.f201336g.mo152xb9724478();
                return f0Var;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        slVar.dismiss();
        slVar.f201334e.mo152xb9724478();
        return f0Var;
    }
}
