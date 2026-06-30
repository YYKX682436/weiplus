package br5;

/* loaded from: classes11.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br5.e f23751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(br5.e eVar) {
        super(1);
        this.f23751d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.zoomimage.subsampling.internal.m0 it = (com.tencent.mm.zoomimage.subsampling.internal.m0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        br5.e eVar = this.f23751d;
        ((kotlinx.coroutines.flow.h3) eVar.f23765n).k(it.f215016y);
        ((kotlinx.coroutines.flow.h3) eVar.f23764m).k(it.f215015x);
        ((kotlinx.coroutines.flow.h3) eVar.f23766o).k(java.lang.Integer.valueOf(it.f215017z));
        ((kotlinx.coroutines.flow.h3) eVar.f23767p).k(it.A);
        return jz5.f0.f302826a;
    }
}
