package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class ki implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.li f285872d;

    public ki(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.li liVar) {
        this.f285872d = liVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.li liVar = this.f285872d;
        if (i17 == 100 && intent != null) {
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = (com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3) intent.getParcelableExtra("key_biz_data");
            if (c11162xe78737a3 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = liVar.f286017f;
                java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
                c21908xb66fd105.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ni(c21908xb66fd105));
                o31.m.f424214a.b(liVar.f286015d, c11162xe78737a3, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ii(this));
                return;
            }
            return;
        }
        if (i17 != 101 || intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("key_need_update", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "back from SubscribeMsgManagerUI needUpdate: %b", java.lang.Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7 c11161xb2ee02d7 = (com.p314xaae8f345.mm.p965xc41bc71e.api.C11161xb2ee02d7) intent.getParcelableExtra("key_biz_data");
            e31.k a17 = e31.n.f328620a.a("name_biz");
            if (c11161xb2ee02d7 == null || a17 == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd1052 = liVar.f286017f;
            java.lang.String str2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
            c21908xb66fd1052.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ni(c21908xb66fd1052));
            e31.o oVar = new e31.o();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = liVar.f286015d;
            if (str3 == null) {
                str3 = "";
            }
            oVar.f328622a = str3;
            ((java.util.ArrayList) oVar.f328624c).addAll(c11161xb2ee02d7.f153365d);
            oVar.f328625d = c11161xb2ee02d7.f153366e;
            oVar.f328630i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ji(this);
            ((g31.l) a17).x(oVar);
        }
    }
}
