package es2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.g f337869d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(es2.g gVar) {
        super(0);
        this.f337869d = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        es2.g gVar = this.f337869d;
        vr2.e eVar = gVar.f337881i;
        if (eVar != null && (i17 = gVar.f337879g) == eVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FMTPScheduler", "onPreloadStart " + i17);
            java.util.Iterator it = eVar.b(eVar.a()).iterator();
            while (it.hasNext()) {
                cs2.j jVar = ((cs2.k) it.next()).f303609d;
                if (jVar != null) {
                    jVar.p0("FMTPScheduler.onPreloadStart." + eVar.a());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
