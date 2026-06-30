package com.p314xaae8f345.p457x3304c6.p461x3a6d265;

/* loaded from: classes5.dex */
public class c extends com.p314xaae8f345.p457x3304c6.p461x3a6d265.AbstractC3986x27cfaaca {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p461x3a6d265.a f129461a;

    public c(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, com.p314xaae8f345.p457x3304c6.p461x3a6d265.a aVar, boolean z17) {
        super(c3985x6b47324b, z17);
        this.f129461a = aVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p461x3a6d265.AbstractC3986x27cfaaca
    /* renamed from: onInvoke */
    public void mo32483x48671b37(com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3985x6b47324b c3985x6b47324b, java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3987x9a935ffa.OnCancelWithInfoArg onCancelWithInfoArg = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3987x9a935ffa.OnCancelWithInfoArg) obj;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.a aVar = this.f129461a;
        if (aVar == null || onCancelWithInfoArg == null) {
            return;
        }
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3997xc4921114 taskInfo = onCancelWithInfoArg.f15809xe788c3d3;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C3988x30783b49 cancelInfo = onCancelWithInfoArg.f15808x708d3a48;
        zx0.f fVar = (zx0.f) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskInfo, "taskInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancelInfo, "cancelInfo");
        yx0.b8 b8Var = (yx0.b8) fVar.f558536a.get();
        if (b8Var == null) {
            return;
        }
        fVar.f558540e = p3325xe03a0797.p3326xc267989b.l.d(b8Var.L, null, null, new zx0.c(taskInfo, cancelInfo.f15812x9102695e, b8Var, null), 3, null);
    }
}
