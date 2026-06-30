package st2;

/* loaded from: classes3.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493757e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.k0 f493758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(st2.h1 h1Var, cm2.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493757e = h1Var;
        this.f493758f = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.b0(this.f493757e, this.f493758f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        st2.h1 h1Var;
        java.lang.String str;
        java.lang.Class cls;
        cm2.k0 k0Var;
        java.lang.Object g17;
        r45.ie ieVar;
        r45.du5 du5Var;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493756d;
        cm2.k0 k0Var2 = this.f493758f;
        st2.h1 h1Var2 = this.f493757e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.content.Context context = h1Var2.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r4Var.h3(context, true);
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context2 = h1Var2.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            gk2.e eVar = h1Var2.f493868f;
            boolean w17 = h1Var2.w();
            boolean z17 = ((mm2.f6) h1Var2.f493868f.a(mm2.f6.class)).f410566g;
            long m75942xfb822ef2 = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            long j17 = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410516m;
            java.lang.String str3 = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410517n;
            java.lang.String str4 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).f410385o;
            byte[] bArr = ((mm2.e1) h1Var2.f493868f.a(mm2.e1.class)).f410518o;
            java.lang.String str5 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).P3;
            java.lang.String str6 = k0Var2.f124895x;
            java.lang.String str7 = ((mm2.c1) h1Var2.f493868f.a(mm2.c1.class)).f410377m5;
            this.f493756d = 1;
            h1Var = h1Var2;
            str = "getContext(...)";
            cls = mm2.f6.class;
            k0Var = k0Var2;
            g17 = q4Var.g((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2, eVar, w17, z17, m75942xfb822ef2, j17, str3, str4, bArr, str5, str6, 3, str7, (r37 & 8192) != 0 ? java.lang.Boolean.TRUE : null, this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g17 = obj;
            h1Var = h1Var2;
            str = "getContext(...)";
            cls = mm2.f6.class;
            k0Var = k0Var2;
        }
        jz5.l lVar = (jz5.l) g17;
        zl2.r4 r4Var2 = zl2.r4.f555483a;
        st2.h1 h1Var3 = h1Var;
        android.content.Context context3 = h1Var3.f493866d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, str);
        r4Var2.h3(context3, false);
        if (((java.lang.Boolean) lVar.f384366d).booleanValue()) {
            mm2.f6 f6Var = (mm2.f6) h1Var3.f493868f.a(cls);
            java.lang.String m75945x2fec8307 = k0Var.f124893v.m75945x2fec8307(20);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            f6Var.U = m75945x2fec8307;
            h1Var3.d(java.lang.Boolean.FALSE);
        } else {
            r45.dv1 dv1Var = (r45.dv1) lVar.f384367e;
            if (dv1Var != null && (ieVar = (r45.ie) dv1Var.m75936x14adae67(0)) != null && (du5Var = ieVar.f458493e) != null && (str2 = du5Var.f454289d) != null) {
                db5.t7.g(h1Var3.f493866d.getContext(), str2);
            }
            h1Var3.G();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveShoppingListPlugin", "get shop shelf failed on gotouse");
        }
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.Fj((ml2.r0) c17, ml2.f4.D, this.f493758f, "0", null, 8, null);
        return jz5.f0.f384359a;
    }
}
