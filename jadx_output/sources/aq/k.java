package aq;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aq.n f12890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(aq.n nVar, boolean z17) {
        super(0);
        this.f12890d = nVar;
        this.f12891e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        aq.n nVar = this.f12890d;
        int i17 = nVar.f12908c + 1;
        nVar.f12908c = i17;
        boolean z17 = this.f12891e;
        if (i17 == 2 || !z17) {
            int i18 = nVar.f12909d + 2;
            nVar.f12909d = i18;
            nVar.f12908c = 0;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new aq.j(nVar, i18, !z17, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
