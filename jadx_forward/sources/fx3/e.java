package fx3;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fx3.f f348668d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fx3.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348668d = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fx3.e(this.f348668d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fx3.e eVar = (fx3.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        eVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.LinkedList linkedList = ((zc0.h) ((xs.i1) i95.n0.c(xs.i1.class))).f552921m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
        int i17 = 0;
        for (java.lang.Object obj2 : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            jz5.l lVar = (jz5.l) obj2;
            java.lang.String format = new java.text.SimpleDateFormat("dd HH:mm:ss.SSS").format(lVar.f384366d);
            arrayList.add(new fx3.h(java.lang.String.valueOf(i17), i17, "[" + lVar.f384366d + '-' + format + "]\n" + ((java.lang.String) lVar.f384367e)));
            i17 = i18;
        }
        j75.f Q6 = this.f348668d.Q6();
        if (Q6 != null) {
            Q6.B3(new fx3.g(arrayList));
        }
        return jz5.f0.f384359a;
    }
}
