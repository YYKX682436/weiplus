package rw2;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rw2.t f482156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rw2.t tVar) {
        super(0);
        this.f482156d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rw2.t tVar = this.f482156d;
        yz5.l lVar = tVar.f482163g;
        if (lVar != null) {
            android.view.Surface surface = tVar.f482164h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(surface);
            lVar.mo146xb9724478(surface);
        }
        return jz5.f0.f384359a;
    }
}
