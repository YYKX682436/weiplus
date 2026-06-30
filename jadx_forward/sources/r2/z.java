package r2;

/* loaded from: classes14.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.y1 f450298d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u1.y1 y1Var) {
        super(0);
        this.f450298d = y1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        java.lang.Object obj = this.f450298d.f505257a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        android.view.View m161324x7cca4367 = ((r2.h0) obj).m161324x7cca4367();
        if (m161324x7cca4367 != null) {
            m161324x7cca4367.saveHierarchyState(sparseArray);
        }
        return sparseArray;
    }
}
