package e04;

/* loaded from: classes9.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 f327610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.p f327611e;

    public r0(e04.p pVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853) {
        this.f327611e = pVar;
        this.f327610d = c5834xa4df3853;
    }

    @Override // java.lang.Runnable
    public void run() {
        e04.p pVar = this.f327611e;
        if (pVar.f327592w != null) {
            am.co coVar = this.f327610d.f136142h;
            if (coVar == null || coVar.f87900a != 1) {
                pVar.t(false, null);
            }
        }
    }
}
