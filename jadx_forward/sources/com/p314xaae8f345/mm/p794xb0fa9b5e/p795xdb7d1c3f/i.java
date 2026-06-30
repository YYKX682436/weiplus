package com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f;

/* loaded from: classes7.dex */
public class i implements com.p314xaae8f345.mm.p794xb0fa9b5e.r, ok0.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p794xb0fa9b5e.r f149885d;

    /* renamed from: e, reason: collision with root package name */
    public final ok0.a f149886e;

    public i(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f149885d = rVar;
        if (rVar instanceof ok0.a) {
            this.f149886e = (ok0.a) rVar;
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f149885d;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.C10747xff81be48(null, obj));
        }
    }

    @Override // ok0.a
    public void b(ok0.b bVar) {
        ok0.a aVar = this.f149886e;
        if (aVar == null) {
            return;
        }
        aVar.b(bVar);
    }
}
