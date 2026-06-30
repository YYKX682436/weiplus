package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes10.dex */
public final class l8 implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f216561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216562e;

    public l8(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.lang.String str) {
        this.f216561d = c11286x34a5504;
        this.f216562e = str;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.util.Collection collection;
        if (i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
            java.util.List g17 = new r26.t(",").g(stringExtra, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.util.ArrayList<java.lang.String> P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1((java.lang.String[]) collection.toArray(new java.lang.String[0]));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P1);
            for (java.lang.String str : P1) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5529x3d70ea7 c5529x3d70ea7 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5529x3d70ea7();
                am.bd bdVar = c5529x3d70ea7.f135855g;
                bdVar.f87770a = this.f216561d;
                bdVar.f87771b = str;
                bdVar.f87772c = 4;
                bdVar.f87773d = this.f216562e;
                c5529x3d70ea7.e();
            }
        }
    }
}
