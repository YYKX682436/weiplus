package ru1;

/* loaded from: classes13.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru1.e f481239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ru1.e eVar) {
        super(0);
        this.f481239d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ru1.e eVar = this.f481239d;
        tl.w wVar = eVar.f481244e;
        if (wVar != null) {
            wVar.l();
        }
        eVar.f481242c.quitSafely();
        com.p314xaae8f345.mm.vfs.y6 y6Var = eVar.f481243d;
        if (y6Var != null) {
            y6Var.close();
        }
        eVar.f481243d = null;
        return jz5.f0.f384359a;
    }
}
