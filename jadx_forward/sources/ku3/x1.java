package ku3;

/* loaded from: classes3.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.z1 f393987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bs0.f f393988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f393989f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(ku3.z1 z1Var, bs0.f fVar, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f393987d = z1Var;
        this.f393988e = fVar;
        this.f393989f = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ku3.x1(this.f393987d, this.f393988e, this.f393989f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ku3.x1 x1Var = (ku3.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        x1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ku3.z1 z1Var = this.f393987d;
        z1Var.c().setVisibility(0);
        zt3.a aVar2 = z1Var.f394027e;
        java.lang.Object obj2 = aVar2.f557110e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type android.view.View");
        android.view.View view = (android.view.View) obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (aVar2.O6(6) || aVar2.O6(5)) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) z1Var.f394029g).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            android.view.View view2 = (android.view.View) mo141623x754a37bb;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordFrameShaderPlugin$showFrameShader$1$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bs0.j jVar = aVar2.f557110e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(jVar, "null cannot be cast to non-null type com.tencent.mm.media.camera.view.ICameraAdvancedUsage");
            ((bs0.h) jVar).d();
        }
        bs0.j jVar2 = aVar2.f557110e;
        bs0.f fVar = this.f393988e;
        jVar2.mo9384xfd9785ff(fVar);
        java.lang.Object obj3 = aVar2.f557110e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type android.view.View");
        ((android.view.View) obj3).requestLayout();
        ku3.z1.a(z1Var, fVar, this.f393989f);
        return jz5.f0.f384359a;
    }
}
