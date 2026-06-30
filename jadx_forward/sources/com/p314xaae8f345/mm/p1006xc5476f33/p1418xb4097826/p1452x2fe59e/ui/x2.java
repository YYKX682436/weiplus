package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f192249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13954x25503e9f f192250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13954x25503e9f activityC13954x25503e9f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f192250e = activityC13954x25503e9f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x2 x2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x2(this.f192250e, interfaceC29045xdcb5ca57);
        x2Var.f192249d = obj;
        return x2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x2 x2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.x2) mo148xaf65a0fc((jz5.l) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        jz5.l lVar = (jz5.l) this.f192249d;
        dv2.n nVar = (dv2.n) lVar.f384366d;
        dv2.i iVar = (dv2.i) lVar.f384367e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13954x25503e9f.f190778y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13954x25503e9f activityC13954x25503e9f = this.f192250e;
        activityC13954x25503e9f.getClass();
        java.lang.String str = nVar.f325437a ? null : iVar == dv2.i.f325398e ? nVar.f325439c : nVar.f325440d;
        if (str != null) {
            android.widget.TextView textView = activityC13954x25503e9f.f190783x;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subtitleTv");
                throw null;
            }
            textView.setText(str);
            android.widget.TextView textView2 = activityC13954x25503e9f.f190783x;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subtitleTv");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = activityC13954x25503e9f.f190783x;
            if (textView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("subtitleTv");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f384359a;
    }
}
