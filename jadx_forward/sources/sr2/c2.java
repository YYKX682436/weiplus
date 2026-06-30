package sr2;

/* loaded from: classes10.dex */
public final class c2 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f493062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f493063e;

    public c2(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, sr2.y2 y2Var) {
        this.f493062d = c22848x6ddd90cf;
        this.f493063e = y2Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostLocationUIC", "click item pos:" + (i17 - this.f493062d.a0()));
        so2.d2 d2Var = (so2.d2) holder.f374658i;
        if (d2Var != null) {
            sr2.y2 y2Var = this.f493063e;
            ya2.p1 p1Var = y2Var.f493333d;
            if (p1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            r45.c64 c64Var = d2Var.f491845d;
            java.lang.String str2 = c64Var.A;
            float f17 = (float) c64Var.f452861y;
            float f18 = (float) c64Var.f452862z;
            yv2.b bVar = (yv2.b) p1Var;
            android.content.Intent intent = bVar.f547737m;
            if (intent == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent.putExtra("saveLocation", true);
            android.content.Intent intent2 = bVar.f547737m;
            if (intent2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String str3 = c64Var.f452844e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            intent2.putExtra("get_poi_name", str3);
            android.content.Intent intent3 = bVar.f547737m;
            if (intent3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            if (str2 == null) {
                str2 = "";
            }
            intent3.putExtra("get_city", str2);
            android.content.Intent intent4 = bVar.f547737m;
            if (intent4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent4.putExtra("get_lat", f18);
            android.content.Intent intent5 = bVar.f547737m;
            if (intent5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            intent5.putExtra("get_lng", f17);
            android.content.Intent intent6 = bVar.f547737m;
            if (intent6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.util.LinkedList DescList = c64Var.f452849m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(DescList, "DescList");
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            int size = DescList.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.du5 du5Var = (r45.du5) DescList.get(i18);
                if (du5Var != null && (str = du5Var.f454289d) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
                    java.lang.String str4 = du5Var.f454289d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getString(...)");
                    java.lang.String lowerCase = str4.toLowerCase();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lowerCase, "null")) {
                        stringBuffer.append(du5Var.f454289d);
                        if (i18 < DescList.size() - 1) {
                            stringBuffer.append("·");
                        }
                    }
                }
            }
            intent6.putExtra("get_poi_address", stringBuffer.toString());
            android.content.Intent intent7 = bVar.f547737m;
            if (intent7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
                throw null;
            }
            java.lang.String str5 = c64Var.f452843d;
            intent7.putExtra("get_poi_classify_id", str5 != null ? str5 : "");
            ya2.p1 p1Var2 = y2Var.f493333d;
            if (p1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            ((yv2.b) p1Var2).d(false);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = y2Var.f493334e;
            if (c22849x81a93d25 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lbsRecyclerView");
                throw null;
            }
            c22849x81a93d25.setVisibility(8);
            ya2.p1 p1Var3 = y2Var.f493333d;
            if (p1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locationWidget");
                throw null;
            }
            r45.ze2 ze2Var = ((yv2.b) p1Var3).f547735h;
            if (ze2Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
                if (c19783xd9a946b7 != null) {
                    c19783xd9a946b7.m76398xb0107807(5);
                    c19783xd9a946b7.m76432x60a0b1d3(ze2Var);
                    c19783xd9a946b7.m76427xcc694b10(i17);
                }
            }
        }
    }
}
