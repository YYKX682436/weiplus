package j11;

/* loaded from: classes11.dex */
public class k implements o65.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j11.h f378662b;

    public k(j11.h hVar, java.lang.String str) {
        this.f378662b = hVar;
        this.f378661a = str;
    }

    @Override // o65.c, o65.b
    /* renamed from: b */
    public void a(int i17, int i18, java.lang.String str, o65.c cVar) {
        j11.h hVar = this.f378662b;
        hVar.f378645a = false;
        java.lang.String str2 = this.f378661a;
        if (i17 == 0 && i18 == 0) {
            if (!((java.util.ArrayList) hVar.f378648d).isEmpty() && hVar.f378652h.e()) {
                hVar.f378652h.c(500L, 500L);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ActionCallbackFunc", "getChatRoomInfoDetail onResult %s %s", java.lang.Boolean.valueOf(j11.q.Ai().m0(str2)), str2);
            hVar.l(str2, true);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActionCallbackFunc", "tryStartNetscene onSceneEnd openRoom errType:" + i17 + " errCode:" + i18 + " will retry");
        hVar.f378652h.c(com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        hVar.l(str2, false);
    }
}
