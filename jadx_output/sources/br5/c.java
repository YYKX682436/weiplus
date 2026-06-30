package br5;

/* loaded from: classes11.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br5.e f23750d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(br5.e eVar) {
        super(1);
        this.f23750d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.zoomimage.subsampling.internal.m0 it = (com.tencent.mm.zoomimage.subsampling.internal.m0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        br5.e eVar = this.f23750d;
        ((kotlinx.coroutines.flow.h3) eVar.f23763l).k(java.lang.Boolean.valueOf(it.f215014w));
        ((kotlinx.coroutines.flow.h3) eVar.f23762k).k(it.f215013v);
        ((kotlinx.coroutines.flow.h3) eVar.f23768q).k(it.B);
        ((kotlinx.coroutines.flow.h3) eVar.f23759h).k(java.lang.Boolean.valueOf(it.f215010s));
        return jz5.f0.f302826a;
    }
}
