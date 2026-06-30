package sp2;

/* loaded from: classes2.dex */
public final class u3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f492767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f492768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f492769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, sp2.x3 x3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492767e = arrayList;
        this.f492768f = arrayList2;
        this.f492769g = x3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.u3(this.f492767e, this.f492768f, this.f492769g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.u3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492766d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList = this.f492767e;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = this.f492768f;
                if (arrayList2.size() > 0) {
                    this.f492766d = 1;
                    if (sp2.x3.P6(this.f492769g, arrayList2, arrayList, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
