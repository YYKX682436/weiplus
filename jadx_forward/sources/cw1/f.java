package cw1;

/* loaded from: classes12.dex */
public final class f extends ot1.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f304458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int[] f304459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ot1.h f304460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.database.Cursor cursor, java.util.HashSet hashSet, int[] iArr, ot1.h hVar) {
        super(cursor);
        this.f304458e = hashSet;
        this.f304459f = iArr;
        this.f304460g = hVar;
    }

    @Override // ot1.g
    public java.lang.Object j(android.database.Cursor cursor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cursor, "cursor");
        ot1.h hVar = new ot1.h();
        hVar.mo9015xbf5d97fd(cursor);
        java.lang.String b17 = ot1.d.b(hVar.f68230xdec927b);
        hVar.f68230xdec927b = b17;
        if ((hVar.f68220x2918cf02 & 1) != 0) {
            this.f304458e.add(new jz5.l(b17, java.lang.Long.valueOf(hVar.f68223x297eb4f7)));
        }
        return ot1.h.w0(this.f304459f, hVar.f68224x169c833e) ? hVar : this.f304460g;
    }
}
