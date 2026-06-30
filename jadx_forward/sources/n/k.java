package n;

/* loaded from: classes15.dex */
public class k extends n3.d2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f414947a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f414948b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n.l f414949c;

    public k(n.l lVar) {
        this.f414949c = lVar;
    }

    @Override // n3.c2
    public void b(android.view.View view) {
        int i17 = this.f414948b + 1;
        this.f414948b = i17;
        n.l lVar = this.f414949c;
        if (i17 == lVar.f414950a.size()) {
            n3.c2 c2Var = lVar.f414953d;
            if (c2Var != null) {
                c2Var.b(null);
            }
            this.f414948b = 0;
            this.f414947a = false;
            lVar.f414954e = false;
        }
    }

    @Override // n3.d2, n3.c2
    public void c(android.view.View view) {
        if (this.f414947a) {
            return;
        }
        this.f414947a = true;
        n3.c2 c2Var = this.f414949c.f414953d;
        if (c2Var != null) {
            c2Var.c(null);
        }
    }
}
