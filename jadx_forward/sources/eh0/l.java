package eh0;

/* loaded from: classes5.dex */
public final class l implements e70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eh0.o f334423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh0.i f334424b;

    public l(eh0.o oVar, eh0.i iVar) {
        this.f334423a = oVar;
        this.f334424b = iVar;
    }

    @Override // e70.c0
    public void d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.a abortInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abortInfo, "abortInfo");
        eh0.o.wi(this.f334423a, this.f334424b, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateServerAbort);
    }

    @Override // e70.c0
    public void e(java.util.List data) {
        java.util.Iterator it;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        eh0.o oVar = this.f334423a;
        oVar.getClass();
        java.lang.String str5 = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24;
        eh0.i iVar = this.f334424b;
        java.lang.String str6 = iVar.f334415e;
        long j17 = iVar.f334411a;
        java.lang.String str7 = "MicroMsg.WeClawStream.Service";
        if ((str6 == null || str6.length() == 0) || j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", "handleStreamData: talker or msgSvrId is empty. talker:" + str6 + ", msgSvrId:" + j17);
            return;
        }
        java.lang.String a17 = eh0.q.a(str6, j17, iVar.f334413c);
        java.lang.String Ni = oVar.Ni(str6, j17);
        java.util.Iterator it6 = data.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) next).i());
                java.lang.String optString = jSONObject.optString("type");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, str5)) {
                    java.lang.String optString2 = jSONObject.optString(str5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                    if (optString2.length() > 0) {
                        iVar.f334418h.append(optString2);
                        if (iVar.f334419i) {
                            eh0.k.f334421a.d(str6, j17, iVar.a());
                            it = it6;
                            str2 = a17;
                            str3 = Ni;
                            str = str5;
                            str4 = str7;
                            try {
                                oVar.f334429e.c(str6, j17, iVar.f334412b, iVar.a());
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str4, str2 + "handleStreamData parse error: " + e.getMessage());
                                a17 = str2;
                                Ni = str3;
                                str7 = str4;
                                i17 = i18;
                                str5 = str;
                                it6 = it;
                            }
                        } else {
                            it = it6;
                            str = str5;
                            str2 = a17;
                            str3 = Ni;
                            str4 = str7;
                            oVar.Zi(iVar);
                            eh0.g.f334408a.c(str3, iVar);
                            oVar.f334429e.a(str6, j17, iVar.f334412b, optString2);
                        }
                    } else {
                        it = it6;
                        str = str5;
                        str2 = a17;
                        str3 = Ni;
                        str4 = str7;
                    }
                } else {
                    it = it6;
                    str = str5;
                    str2 = a17;
                    str3 = Ni;
                    str4 = str7;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str4, str2 + "handleStreamData: unknown type:" + optString);
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                it = it6;
                str = str5;
                str2 = a17;
                str3 = Ni;
                str4 = str7;
            }
            a17 = str2;
            Ni = str3;
            str7 = str4;
            i17 = i18;
            str5 = str;
            it6 = it;
        }
    }

    @Override // e70.c0
    public void g(com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        eh0.o.wi(this.f334423a, this.f334424b, error);
    }

    @Override // e70.c0
    public void h() {
        eh0.o oVar = this.f334423a;
        oVar.getClass();
        eh0.i iVar = this.f334424b;
        java.lang.String str = iVar.f334415e;
        boolean z17 = str == null || str.length() == 0;
        long j17 = iVar.f334411a;
        if (!z17 && j17 != 0) {
            java.lang.String Ni = oVar.Ni(str, j17);
            oVar.Zi(iVar);
            eh0.g.f334408a.b(Ni);
            oVar.Bi(iVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeClawStream.Service", "handleStreamEnd: talker or msgSvrId is empty. talker:" + str + ", msgSvrId:" + j17);
    }

    @Override // e70.c0
    /* renamed from: onTimeout */
    public void mo123670x1554e82() {
        eh0.o.wi(this.f334423a, this.f334424b, com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.x.kIlinkStreamStateError);
    }
}
