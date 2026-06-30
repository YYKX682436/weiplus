package com.tencent.mm.ipcinvoker.extension;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.ipcinvoker.r, ok0.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ipcinvoker.r f68352d;

    /* renamed from: e, reason: collision with root package name */
    public final ok0.a f68353e;

    public i(com.tencent.mm.ipcinvoker.r rVar) {
        this.f68352d = rVar;
        if (rVar instanceof ok0.a) {
            this.f68353e = (ok0.a) rVar;
        }
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.r rVar = this.f68352d;
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.extension.XIPCInvoker$WrapperParcelable(null, obj));
        }
    }

    @Override // ok0.a
    public void b(ok0.b bVar) {
        ok0.a aVar = this.f68353e;
        if (aVar == null) {
            return;
        }
        aVar.b(bVar);
    }
}
