package yw1;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f548131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.h f548132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f548133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yw1.c f548134g;

    public a(yw1.c cVar, java.lang.String str, dn.h hVar, int i17) {
        this.f548134g = cVar;
        this.f548131d = str;
        this.f548132e = hVar;
        this.f548133f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        yw1.c cVar = this.f548134g;
        java.util.HashMap hashMap = (java.util.HashMap) cVar.f548136d;
        java.lang.String str = this.f548131d;
        yw1.b bVar = (yw1.b) hashMap.get(str);
        if (bVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.QrRewardCdnDownloadHelper", "no callback");
            return;
        }
        dn.h hVar = this.f548132e;
        if (hVar != null) {
            int i17 = hVar.f69553xb5f54fe9;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.p) bVar;
            int i18 = this.f548133f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QrRewardMainUI", "callback ret: %s, %s, %s", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
            if (i18 == 0 && i17 == 0) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.p1334xc84f4f2f.ui.o(pVar));
            }
            ((java.util.HashMap) cVar.f548136d).remove(str);
            if (hVar.f69553xb5f54fe9 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 8L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(724L, 9L, 1L, false);
            }
        }
    }
}
