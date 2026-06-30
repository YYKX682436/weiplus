package l26;

/* loaded from: classes14.dex */
public final class e extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public int f396754f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l26.f f396755g;

    public e(l26.f fVar) {
        this.f396755g = fVar;
    }

    @Override // kz5.c
    public void b() {
        int i17;
        java.lang.Object[] objArr;
        do {
            i17 = this.f396754f + 1;
            this.f396754f = i17;
            objArr = this.f396755g.f396757d;
            if (i17 >= objArr.length) {
                break;
            }
        } while (objArr[i17] == null);
        if (i17 >= objArr.length) {
            this.f395495d = 2;
            return;
        }
        java.lang.Object obj = objArr[i17];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
        this.f395496e = obj;
        this.f395495d = 1;
    }
}
