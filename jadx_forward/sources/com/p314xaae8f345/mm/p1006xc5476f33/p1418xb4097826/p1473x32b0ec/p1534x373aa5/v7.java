package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class v7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f198274d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f198275e;

    /* renamed from: f, reason: collision with root package name */
    public int f198276f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198277g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 f198278h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 c14337xdaa7e550, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f198277g = context;
        this.f198278h = c14337xdaa7e550;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v7(this.f198277g, this.f198278h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.eq1 eq1Var;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 c14337xdaa7e550;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f198276f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.n2 n2Var = (mm2.n2) dk2.ef.f314905a.i(mm2.n2.class);
            if (n2Var != null && (eq1Var = n2Var.f410812g) != null) {
                context = this.f198277g;
                dk2.q4 q4Var = dk2.q4.f315471a;
                this.f198274d = context;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550 c14337xdaa7e5502 = this.f198278h;
                this.f198275e = c14337xdaa7e5502;
                this.f198276f = 1;
                java.lang.Object k17 = q4Var.k(context, eq1Var, null, true, this);
                if (k17 == aVar) {
                    return aVar;
                }
                c14337xdaa7e550 = c14337xdaa7e5502;
                obj = k17;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c14337xdaa7e550 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14337xdaa7e550) this.f198275e;
        context = (android.content.Context) this.f198274d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (((java.lang.Boolean) ((jz5.l) obj).f384366d).booleanValue()) {
            android.view.View view = c14337xdaa7e550.f197590e;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("announcementContentContainer");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveNewFansClubAnnouncementView$initView$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            db5.t7.h(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573053dd5));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = c14337xdaa7e550.f197591f;
            if (viewOnClickListenerC22631x1cc07cc8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("showAnnouncementSwitch");
                throw null;
            }
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(true);
            db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573051dd3));
        }
        return jz5.f0.f384359a;
    }
}
