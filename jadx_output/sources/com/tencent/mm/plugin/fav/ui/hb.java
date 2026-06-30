package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public class hb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f101145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f101146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f101149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101150i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavoriteIndexUI f101152n;

    public hb(com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI, double d17, double d18, int i17, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.util.ArrayList arrayList) {
        this.f101152n = favoriteIndexUI;
        this.f101145d = d17;
        this.f101146e = d18;
        this.f101147f = i17;
        this.f101148g = str;
        this.f101149h = charSequence;
        this.f101150i = str2;
        this.f101151m = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.pp0 pp0Var;
        com.tencent.mm.plugin.fav.ui.FavoriteIndexUI favoriteIndexUI = this.f101152n;
        favoriteIndexUI.f100267e = true;
        r45.pp0 pp0Var2 = new r45.pp0();
        pp0Var2.t(this.f101148g);
        pp0Var2.u(this.f101145d);
        pp0Var2.w(this.f101146e);
        pp0Var2.E(this.f101147f);
        pp0Var2.C(this.f101150i);
        o72.r2 r2Var = new o72.r2();
        r2Var.field_type = 6;
        r2Var.field_sourceType = 6;
        r2Var.field_favProto.j(pp0Var2);
        java.lang.CharSequence charSequence = this.f101149h;
        if (charSequence != null && !com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString())) {
            r45.bq0 bq0Var = r2Var.field_favProto;
            bq0Var.f370970o = charSequence.toString();
            bq0Var.f370971p = true;
            r45.bq0 bq0Var2 = r2Var.field_favProto;
            bq0Var2.f370976u = java.lang.System.currentTimeMillis();
            bq0Var2.f370977v = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10873, 6);
        }
        com.tencent.mm.plugin.fav.ui.d4.f(r2Var);
        java.util.ArrayList<java.lang.String> arrayList = this.f101151m;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (java.lang.String str : arrayList) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    java.util.Iterator it = r2Var.field_tagProto.f385096e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (str.equals((java.lang.String) it.next())) {
                                break;
                            }
                        } else {
                            r2Var.field_tagProto.f385096e.add(str);
                            break;
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.fav.ui.a0.a(r2Var);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10648, 3, 0);
        long j17 = r2Var.field_localId;
        o72.x1.f343518d = j17;
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(j17);
        if (F == null || (pp0Var = F.field_favProto.f370966h) == null) {
            return;
        }
        o72.x1.N0(j17, F, pp0Var, "", "", new java.util.ArrayList(), favoriteIndexUI.getContext(), true, true);
    }
}
