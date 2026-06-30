package md3;

/* loaded from: classes.dex */
public final class b implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.c f407387a;

    public b(md3.c cVar) {
        this.f407387a = cVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        md3.c cVar = this.f407387a;
        if (i17 == -2) {
            cVar.s().mo146xb9724478(cVar.h(3, "added"));
            return;
        }
        if (i17 == 0) {
            cVar.s().mo146xb9724478(cVar.i(lc3.x.f399468b));
        } else if (i17 != 1) {
            cVar.s().mo146xb9724478(cVar.h(2, "fail"));
        } else {
            cVar.s().mo146xb9724478(cVar.k());
        }
    }
}
