package qb5;

/* loaded from: classes3.dex */
public class c implements com.p314xaae8f345.mm.p944x882e457a.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo.l f442862d;

    public c(qb5.g gVar, lo.l lVar) {
        this.f442862d = lVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.v0
    public void S(long j17, long j18, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        lo.l lVar;
        lo.l lVar2 = this.f442862d;
        if (lVar2 != null) {
            lVar2.a(j17, j18, m1Var);
        }
        if (j17 < j18 || (lVar = this.f442862d) == null) {
            return;
        }
        lVar.b(0, "");
    }
}
