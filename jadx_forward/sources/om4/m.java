package om4;

@j95.b
/* loaded from: classes11.dex */
public class m extends i95.w implements pm4.r {

    /* renamed from: d, reason: collision with root package name */
    public om4.t f427960d;

    /* renamed from: e, reason: collision with root package name */
    public om4.p f427961e;

    public final om4.t Ai() {
        om4.t tVar = this.f427960d;
        if (tVar != null) {
            return tVar;
        }
        synchronized (this) {
            om4.t tVar2 = this.f427960d;
            if (tVar2 != null) {
                return tVar2;
            }
            om4.t tVar3 = new om4.t();
            this.f427960d = tVar3;
            return tVar3;
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        s75.d.b(new om4.l(this, null), "TopStory.InitTopStoryCacheFolderTask");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        om4.t tVar = this.f427960d;
        if (tVar != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = tVar.f427975a;
            n3Var.mo50302x6b17ad39(null);
            n3Var.mo50299x35224f();
            this.f427960d = null;
        }
        om4.p pVar = this.f427961e;
        if (pVar != null) {
            pVar.getClass();
            this.f427961e = null;
        }
        rm4.c cVar = rm4.c.f478974q;
        if (cVar != null) {
            if (cVar.f478979h != null) {
                gm0.j1.d().d(rm4.c.f478974q.f478979h);
                rm4.c.f478974q.f478979h = null;
            }
            if (rm4.c.f478974q.f478980i != null) {
                gm0.j1.d().d(rm4.c.f478974q.f478980i);
                rm4.c.f478974q.f478980i = null;
            }
            gm0.j1.d().q(2748, rm4.c.f478974q);
            rm4.c.f478974q = null;
        }
    }

    public om4.p wi() {
        om4.p pVar = this.f427961e;
        if (pVar == null) {
            synchronized (this) {
                pVar = this.f427961e;
                if (pVar == null) {
                    pVar = new om4.p();
                    this.f427961e = pVar;
                }
            }
        }
        return pVar;
    }
}
