package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class i7 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f255508d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255509e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f255511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255512h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        super(3, interfaceC29045xdcb5ca57);
        this.f255511g = c22621x7603e017;
        this.f255512h = activityC18635xb8188ef9;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i7 i7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.i7((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj3, this.f255511g, this.f255512h);
        i7Var.f255509e = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj;
        i7Var.f255510f = obj2;
        return i7Var.mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f255508d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.k kVar = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) this.f255509e;
            android.text.Editable editable = (android.text.Editable) this.f255510f;
            android.content.Context context = this.f255511g.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            vj4.d dVar = (vj4.d) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(vj4.d.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l5 l5Var = this.f255512h.f255089x;
            java.lang.String wording = editable.toString();
            dVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.m2 m2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new vj4.c(dVar, wording, l5Var, null));
            this.f255508d = 1;
            if (kVar instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.k3) {
                throw ((p3325xe03a0797.p3326xc267989b.p3328x30012e.k3) kVar).f391844d;
            }
            java.lang.Object a17 = m2Var.a(kVar, this);
            if (a17 != aVar) {
                a17 = f0Var;
            }
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
