package f31;

/* loaded from: classes9.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o31.d f340799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o31.b f340800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o31.e f340801c;

    public a(o31.d dVar, o31.b bVar, o31.e eVar) {
        this.f340799a = dVar;
        this.f340800b = bVar;
        this.f340801c = eVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        f31.b bVar = f31.b.f340802a;
        java.lang.Object obj = oVar.f152244b.f152233a;
        if ((obj == null || ((obj instanceof r45.ny3) && ((r45.ny3) obj).mo11484xe92ab0a8() == null)) ? false : true) {
            try {
                ((o31.c) this.f340799a).f424201c.mo11468x92b714fd(oVar.f152244b.f152233a.mo14344x5f01b1f6());
            } catch (b36.g e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + ((o31.c) this.f340799a).f424203e + ", e=" + e17);
                o31.b bVar2 = this.f340800b;
                if (bVar2 != null) {
                    ((f31.f) bVar2).b(i17, i18, str, this.f340801c);
                    return;
                }
                return;
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCompatNetworkDispatcher", "parseFrom mmrr uri=" + ((o31.c) this.f340799a).f424203e + ", e=" + e18);
                o31.b bVar3 = this.f340800b;
                if (bVar3 != null) {
                    ((f31.f) bVar3).b(5, i18, str, this.f340801c);
                    return;
                }
                return;
            }
        }
        o31.b bVar4 = this.f340800b;
        if (bVar4 != null) {
            ((f31.f) bVar4).b(i17, i18, str, this.f340801c);
        }
        java.util.WeakHashMap weakHashMap = f31.b.f340803b;
        o31.e eVar = this.f340801c;
        synchronized (weakHashMap) {
            weakHashMap.remove(eVar);
        }
    }
}
