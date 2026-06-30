package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* loaded from: classes5.dex */
public class e extends com.p314xaae8f345.p457x3304c6.p461x3a6d265.AbstractC3986x27cfaaca {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.a f129463a;

    public e(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.a aVar, boolean z17) {
        super(c3985x6b47324b, z17);
        this.f129463a = aVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.AbstractC3986x27cfaaca
    /* renamed from: onInvoke */
    public void mo32483x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3987x9a935ffa.OnSubmitArg onSubmitArg = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3987x9a935ffa.OnSubmitArg) obj;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.a aVar = this.f129463a;
        if (aVar == null || onSubmitArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3995xe72952b6 request = onSubmitArg.f15811x414ef28f;
        zx0.f fVar = (zx0.f) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        yx0.b8 b8Var = (yx0.b8) fVar.f558536a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f558538c = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new zx0.e(b8Var, request, fVar, null), 3, null);
    }
}
