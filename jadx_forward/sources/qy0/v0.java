package qy0;

/* loaded from: classes5.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f449186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f449187e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f449188f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(yz5.a aVar, boolean z17, ty0.b1 b1Var) {
        super(1);
        this.f449186d = aVar;
        this.f449187e = z17;
        this.f449188f = b1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 it = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f449186d.mo152xb9724478();
        boolean z17 = this.f449187e;
        ty0.b1 b1Var = this.f449188f;
        if (z17) {
            yz5.l lVar = b1Var.f504326c;
            java.lang.String music_id = ((r45.k96) it.f151471a).f460050d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(music_id, "music_id");
            lVar.mo146xb9724478(music_id);
        } else {
            yz5.l lVar2 = b1Var.f504335l;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(it);
            }
        }
        return jz5.f0.f384359a;
    }
}
