package tg1;

/* loaded from: classes7.dex */
public final class m extends tg1.d {
    @Override // tg1.d
    public void c(java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, tg1.c cVar) {
        java.lang.String queryParameter = uri == null ? "" : uri.getQueryParameter("appid");
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i18 = 0;
                if (uri != null && uri.getBooleanQueryParameter("debug", false)) {
                    i18 = 1;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12630x22aa6575.T6(com.p314xaae8f345.mm.R.C30867xcad56011.f571811qi);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m(queryParameter, 2, i18 + 1);
                return;
            }
            if (ordinal == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12630x22aa6575.T6(com.p314xaae8f345.mm.R.C30867xcad56011.f571794py);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m("", 4, 2);
            } else if (ordinal != 3) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12630x22aa6575.T6(com.p314xaae8f345.mm.R.C30867xcad56011.f571649ld);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12630x22aa6575.T6(com.p314xaae8f345.mm.R.C30867xcad56011.f571793px);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.m("", 3, 2);
            }
        }
    }
}
