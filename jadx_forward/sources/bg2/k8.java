package bg2;

/* loaded from: classes2.dex */
public final class k8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.l8 f101785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101787f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(bg2.l8 l8Var, android.content.Context context, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101785d = l8Var;
        this.f101786e = context;
        this.f101787f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.k8(this.f101785d, this.f101786e, this.f101787f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.k8 k8Var = (bg2.k8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        k8Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList m75941xfb821914;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.l8 l8Var = this.f101785d;
        bg2.a5 a5Var = (bg2.a5) l8Var.N6(bg2.a5.class);
        if (a5Var != null) {
            a5Var.d7();
        }
        if (l8Var.f101809g == null) {
            android.content.Context context = this.f101786e;
            dg2.m mVar = new dg2.m(context);
            l8Var.f101809g = mVar;
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.loe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            mVar.f313842d = string;
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lof);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            mVar.f313841c = string2;
            r45.vw0 vw0Var = l8Var.f101810h;
            java.util.LinkedList m75941xfb8219142 = vw0Var != null ? vw0Var.m75941xfb821914(2) : null;
            java.util.LinkedList linkedList = mVar.f313840b;
            linkedList.clear();
            if (m75941xfb8219142 != null) {
                linkedList.addAll(m75941xfb8219142);
            }
            mVar.f313844f = new bg2.h8(l8Var, this.f101787f, context);
            mVar.f313843e = new bg2.i8(l8Var);
            mVar.f313845g = bg2.j8.f101753d;
            mVar.c();
        } else {
            r45.vw0 vw0Var2 = l8Var.f101810h;
            if (vw0Var2 != null && (m75941xfb821914 = vw0Var2.m75941xfb821914(2)) != null) {
                dg2.m mVar2 = l8Var.f101809g;
                if (mVar2 != null) {
                    mVar2.b(m75941xfb821914);
                }
                dg2.m mVar3 = l8Var.f101809g;
                if (mVar3 != null) {
                    mVar3.c();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
