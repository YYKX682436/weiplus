package cq4;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cq4.n f302999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cq4.n nVar) {
        super(1);
        this.f302999d = nVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        cq4.f fVar = this.f302999d.f303013g;
        if (fVar != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", intValue);
            ((bp4.q1) fVar).f104885a.w(ju3.c0.P1, bundle);
        }
        return jz5.f0.f384359a;
    }
}
