package vu0;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521592d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f521593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f521594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vu0.o0 f521595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.util.List list, vu0.o0 o0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521594f = list;
        this.f521595g = o0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        vu0.c0 c0Var = new vu0.c0(this.f521594f, this.f521595g, interfaceC29045xdcb5ca57);
        c0Var.f521593e = obj;
        return c0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vu0.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f521592d;
        vu0.o0 o0Var = this.f521595g;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f521593e;
            java.util.List list = this.f521594f;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new vu0.b0(o0Var, (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) it.next(), null), 3, null));
            }
            this.f521592d = 1;
            obj = p3325xe03a0797.p3326xc267989b.h.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Iterable iterable = (java.lang.Iterable) obj;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it6 = iterable.iterator();
            while (it6.hasNext()) {
                if (((yu0.d) it6.next()) != null) {
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSubtitleService", "automaticSubtitles: not any group");
            o0Var.f521663c.c(o0Var.f521665e.a());
        }
        return jz5.f0.f384359a;
    }
}
