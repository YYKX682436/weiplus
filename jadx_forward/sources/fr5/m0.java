package fr5;

/* loaded from: classes15.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.h f347534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(fr5.h hVar) {
        super(1);
        this.f347534d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fr5.h hVar = this.f347534d;
        if (hVar.f347491i) {
            hVar.f347491i = false;
            hVar.f347483a.removeCallbacks(hVar.f347490h);
            hVar.f347489g.forceFinished(true);
            hVar.f347488f.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
