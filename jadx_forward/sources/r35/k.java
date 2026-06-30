package r35;

/* loaded from: classes11.dex */
public class k implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f450683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r35.o f450684b;

    public k(r35.o oVar, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f450684b = oVar;
        this.f450683a = z3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        r35.o oVar = this.f450684b;
        if (z17) {
            oVar.c(this.f450683a);
        } else {
            oVar.b(0);
        }
        oVar.f450758q.dismiss();
    }
}
