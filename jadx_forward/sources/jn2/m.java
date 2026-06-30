package jn2;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382179e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.hy1 f382180f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(jn2.w wVar, r45.hy1 hy1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382179e = wVar;
        this.f382180f = hy1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn2.m(this.f382179e, this.f382180f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object p76;
        java.util.List list;
        java.util.List list2;
        jn2.c1 c1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382178d;
        kz5.p0 p0Var = kz5.p0.f395529d;
        r45.hy1 hy1Var = this.f382180f;
        boolean z17 = true;
        jn2.w wVar = this.f382179e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                sf2.x xVar = wVar.f382255f;
                java.lang.String real_key = hy1Var.f458087g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(real_key, "real_key");
                this.f382178d = 1;
                p76 = xVar.p7(real_key, null, this);
                if (p76 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                p76 = obj;
            }
            r45.ux1 ux1Var = (r45.ux1) p76;
            list = ux1Var != null ? ux1Var.f469246d : null;
            if (list == null) {
                list = p0Var;
            }
            list2 = ux1Var != null ? ux1Var.f469249g : null;
            if (list2 == null) {
                list2 = p0Var;
            }
            java.lang.String str = hy1Var.f458087g;
            if (str == null) {
                str = "";
            }
            wVar.D = str;
            wVar.B = ux1Var != null ? ux1Var.f469247e : null;
            wVar.C = ux1Var != null ? ux1Var.f469248f : 0;
            wVar.E.clear();
            c1Var = wVar.f382270x;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveAnchorSingSongAddPanelSearchWidget", "Search music failed: " + e17.getMessage());
            jn2.w.a(wVar, p0Var);
        }
        if (c1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchAdapter");
            throw null;
        }
        if (wVar.C == 0) {
            z17 = false;
        }
        c1Var.y(list, list2, z17, wVar.D);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = wVar.f382264r;
        if (c1163xf1deaba4 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$initAdapters$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$initAdapters$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
        }
        jn2.w.a(wVar, list);
        return jz5.f0.f384359a;
    }
}
