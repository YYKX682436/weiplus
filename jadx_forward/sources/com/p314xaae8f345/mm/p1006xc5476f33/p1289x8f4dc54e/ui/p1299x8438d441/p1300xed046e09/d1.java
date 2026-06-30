package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09;

/* loaded from: classes7.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f175743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.util.List list, int i17) {
        super(2);
        this.f175742d = list;
        this.f175743e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0 result = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.y0) obj;
        r45.cf response = (r45.cf) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        boolean z17 = result.f176011a;
        boolean z18 = true;
        java.util.List list = this.f175742d;
        boolean z19 = result.f176014d;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("response.AppMsgContextList size:");
            java.util.LinkedList<r45.i9> linkedList = response.f453048d;
            sb6.append(linkedList != null ? java.lang.Integer.valueOf(linkedList.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", sb6.toString());
            ax4.c cVar = new ax4.c();
            cVar.f96651d = result.f176012b;
            cVar.f96648a = list.size();
            if (linkedList != null) {
                for (r45.i9 i9Var : linkedList) {
                    if ((i9Var == null || (str = i9Var.f458355d) == null || hy4.i.p(str) != z18) ? false : z18) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i9Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("appMsgContext url:");
                        sb7.append(i9Var.f458355d);
                        sb7.append(" content:");
                        java.lang.String str2 = i9Var.f458356e;
                        sb7.append(str2 != null ? str2.length() : 0);
                        sb7.append(" clientCacheTime:");
                        sb7.append(i9Var.f458357f);
                        sb7.append(" forceUrl:");
                        sb7.append(i9Var.f458358g);
                        sb7.append(" lastModifyTime:");
                        sb7.append(i9Var.f458359h);
                        sb7.append(" noNeedUpdate:");
                        sb7.append(i9Var.f458360i);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", sb7.toString());
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.v0 v0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i;
                        java.lang.String Url = i9Var.f458355d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
                        v0Var.c(Url, i9Var);
                        lr1.c0 c0Var = lr1.c0.f402176a;
                        java.lang.String Url2 = i9Var.f458355d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url2, "Url");
                        if (c0Var.c(Url2)) {
                            java.lang.String Url3 = i9Var.f458355d;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url3, "Url");
                            int i17 = i9Var.f458362n;
                            int i18 = i9Var.f458363o;
                            int i19 = i9Var.f458364p;
                            java.lang.String str3 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + '/';
                            java.lang.String str4 = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + '/';
                            try {
                                byte[] bytes = jz5.u.a(i17).getBytes(r26.c.f450398a);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                                java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 2);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
                                str4 = hy4.i.b(hy4.i.b(hy4.i.b(str3, "__biz", encodeToString), "mid", jz5.u.a(i18)), "idx", java.lang.String.valueOf(i19));
                            } catch (java.lang.Exception unused) {
                            }
                            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.s(Url3, str4);
                        }
                        if (!z19) {
                            if (i9Var.f458360i) {
                                cVar.f96650c++;
                                ax4.a.a(31);
                            } else {
                                cVar.f96649b++;
                                ax4.a.a(32);
                            }
                            cVar.f96653f += i9Var.mo75928xcd1e8d8();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", "terry trace: preloaded " + i9Var.f458355d);
                        int i27 = i9Var.f458366r;
                        java.util.LinkedList linkedList2 = i9Var.f458369u;
                        int i28 = this.f175743e;
                        if (i27 == 8) {
                            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).z(i28, !(linkedList2 == null || linkedList2.isEmpty()) ? 10 : 11, 0, 0);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.c2.f175736a.c(linkedList2, i28);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreloadLogic", "batchSyncAppMsgContext no Url response");
                    }
                    z18 = true;
                }
            }
            cVar.a();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadLogic", "terry trace: preloaded fail");
        }
        if (!z19) {
            ax4.a.a(23);
            ax4.a.b(908, 26, list.size(), true);
            ax4.a.a(result.f176011a ? 24 : 25);
        }
        return jz5.f0.f384359a;
    }
}
