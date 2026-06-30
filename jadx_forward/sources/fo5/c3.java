package fo5;

/* loaded from: classes10.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er4.r f346499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(java.lang.String str, er4.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346498d = str;
        this.f346499e = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.c3(this.f346498d, this.f346499e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.c3 c3Var = (fo5.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        vx3.i iVar;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fo5.a aVar2 = fo5.f3.f346519c;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            er4.r rVar = this.f346499e;
            if (rVar != null && (str = this.f346498d) != null) {
                java.lang.ref.WeakReference weakReference = r0Var.f346627m;
                fo5.y yVar = new fo5.y(rVar);
                gp5.e eVar = r0Var.f346622h;
                eVar.getClass();
                rq4.q.f480613n = true;
                if (!(str.length() == 0) && (iVar = (vx3.i) mx3.f0.f414084d.mo3195x754a37bb()) != null) {
                    android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
                    if (activityC0065xcd7aa112 != null) {
                        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
                        eVar.f355999g = cy3.q.b(activityC0065xcd7aa112, mo273xed6858b4, "", iVar, 1L, 9, 0, "", false, false, new gp5.c(iVar, yVar, activityC0065xcd7aa112, str, eVar), null, 2112, null);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
