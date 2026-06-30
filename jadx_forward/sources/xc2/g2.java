package xc2;

/* loaded from: classes2.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f534675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f534677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(java.lang.String str, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534676e = str;
        this.f534677f = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc2.g2(this.f534676e, this.f534677f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.g2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f534675d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            il4.l lVar = il4.l.f373675a;
            this.f534675d = 1;
            c17 = lVar.c(this.f534676e, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        bw5.o50 o50Var = (bw5.o50) c17;
        android.app.Activity activity = (android.app.Activity) this.f534677f.get();
        boolean z17 = activity != null && activity.isFinishing();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            return f0Var;
        }
        pm0.v.X(xc2.f2.f534661d);
        if (o50Var != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            qk.f9.c(aj6, context, o50Var, bw5.ar0.TingScene_FinderChat, new il4.e(null, 0, 1613, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554427, null), null, 16, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.JumperUtils", "jumpToTingCategory getCategoryItem failed");
        }
        return f0Var;
    }
}
