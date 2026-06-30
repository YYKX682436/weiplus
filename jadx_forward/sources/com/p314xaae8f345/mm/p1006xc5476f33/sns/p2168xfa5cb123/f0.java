package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f246383d;

    public f0(java.util.ArrayList arrayList) {
        this.f246383d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportYuanBaoEvent$1");
        java.util.Iterator it = this.f246383d.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
            int mo63659xfb85f7b0 = abstractC15633xee433078.mo63659xfb85f7b0();
            java.lang.String o17 = mo63659xfb85f7b0 != 1 ? mo63659xfb85f7b0 != 6 ? "" : abstractC15633xee433078.o() : abstractC15633xee433078.f219963e;
            try {
                java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(o17, false);
                if (!android.text.TextUtils.isEmpty(i17)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                    p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
                    java.lang.String m7340x351be6 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3248x2de8f93);
                    java.lang.String m7340x351be62 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3252x58f9a604);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("yuanbao.tencent.com", m7340x351be6) && !android.text.TextUtils.isEmpty(m7340x351be62)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsPublishProcessReport", "path:%s model:%s", o17, m7340x351be62);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7340x351be62);
                        hashMap.put("yb_template_id", m7340x351be62);
                        java.lang.String wi6 = ((ee0.v4) ((fe0.o4) i95.n0.c(fe0.o4.class))).wi();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wi6, "checkSnsPostSessionId(...)");
                        hashMap.put("sns_publish_sessionid", wi6);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("yb_retouch_to_publisher", hashMap, 36244);
                    }
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsUploadElment", e17, "parse error", new java.lang.Object[0]);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$reportYuanBaoEvent$1");
    }
}
