package y70;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y70.c f541201d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y70.c cVar) {
        super(1);
        this.f541201d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof y70.e)) {
            y70.e eVar = (y70.e) dVar;
            byte[] bArr = eVar.f541203c;
            m70.h hVar = eVar.f541204d;
            y70.c cVar = this.f541201d;
            android.graphics.Bitmap j17 = cVar.j(state, eVar.f541202b, bArr, hVar);
            if (j17 != null) {
                cVar.a(new m70.f(eVar.f541202b, j17));
            }
        }
        return jz5.f0.f384359a;
    }
}
