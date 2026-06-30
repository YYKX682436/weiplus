package f00;

/* loaded from: classes.dex */
public final class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f00.o f339850d;

    public l(f00.o oVar) {
        this.f339850d = oVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c c10750x9556b48c = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) obj;
        f00.o oVar = this.f339850d;
        android.view.View view = oVar.f339853a;
        if (view != null) {
            view.post(new f00.k(oVar, c10750x9556b48c));
        }
    }
}
