package cd0;

/* loaded from: classes.dex */
public final class u implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f40593d;

    public u(yb5.d dVar) {
        this.f40593d = dVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 menu) {
        kotlin.jvm.internal.o.g(menu, "menu");
        yb5.d dVar = this.f40593d;
        menu.d(1, i65.a.d(dVar.g(), com.tencent.mm.R.color.f478532ac), i65.a.r(dVar.g(), com.tencent.mm.R.string.nhd));
        menu.d(2, i65.a.d(dVar.g(), com.tencent.mm.R.color.f478532ac), i65.a.r(dVar.g(), com.tencent.mm.R.string.nha));
    }
}
