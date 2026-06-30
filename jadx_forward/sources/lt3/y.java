package lt3;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f402817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lt3.f0 f0Var) {
        super(1);
        this.f402817d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        ((java.lang.Number) obj).longValue();
        zv3.g gVar = this.f402817d.f402749e;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("frameRetriever");
            throw null;
        }
        zv3.d dVar = gVar.f557978a;
        zv3.a aVar = (!((dVar.f557971j.length() > 0) && com.p314xaae8f345.mm.vfs.w6.j(dVar.f557971j)) || (bitmap = gVar.f557985h) == null) ? null : new zv3.a(bitmap, 0L);
        if (aVar != null) {
            return aVar.f557960a;
        }
        return null;
    }
}
