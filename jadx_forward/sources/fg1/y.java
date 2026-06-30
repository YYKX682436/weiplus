package fg1;

/* loaded from: classes7.dex */
public class y implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.z f343451d;

    public y(fg1.z zVar) {
        this.f343451d = zVar;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        bg.f fVar;
        fg1.z zVar = this.f343451d;
        if (str.equalsIgnoreCase(zVar.f343456d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandVideoCustomHandler", "onRunningStateChanged, state: " + bVar);
            if (bVar == u81.b.BACKGROUND) {
                bg.f fVar2 = zVar.f343454b;
                if (fVar2 != null) {
                    fVar2.getClass();
                    fVar2.Q(new bg.s(fVar2));
                    return;
                }
                return;
            }
            if (bVar != u81.b.FOREGROUND || (fVar = zVar.f343454b) == null) {
                return;
            }
            fVar.getClass();
            fVar.Q(new bg.r(fVar));
        }
    }
}
