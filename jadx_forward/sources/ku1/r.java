package ku1;

/* loaded from: classes15.dex */
public class r extends ku1.i {
    @Override // ku1.i
    public ku1.l0 g() {
        return new ku1.g(this, this.f393626b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        if (r12 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00fb, code lost:
    
        if (r15 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fd, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "get code is failure! db is  empty! doNetSceneGetDynamicQrcode! cardId= %s", r4.g());
        r2.g(r4, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        r0 = xt1.t0.aj().D0(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0117, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0123, code lost:
    
        if (xt1.t0.aj().y0(r7, r0.f68372xacb60e68) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
    
        r2.d(r7, r0.f68372xacb60e68, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012a, code lost:
    
        r2.f530845f = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "update current code showing! newQrCodeData cardId= %s,codeId=%s，refreshReason=%d", r7, r15.f68372xacb60e68, java.lang.Integer.valueOf(r19.f402870d));
        r1 = r4.g();
        r0 = r15.f68371x225a5212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        if (r0.length() > 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016d, code lost:
    
        r0 = lu1.s.b("CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + gm0.j1.b().h() + "_" + r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017a, code lost:
    
        r1 = xt1.t0.Zi().y0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0182, code lost:
    
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0196, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData is need insert show timestamp! code signTimestamp!");
        r1 = r1.f68242xdde7b67f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x019d, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a6, code lost:
    
        r11 = java.lang.System.currentTimeMillis() / 1000;
        r9 = new java.lang.StringBuilder();
        r13 = new java.lang.StringBuilder();
        r9.append(r0);
        r9.append("&");
        r9.append(r11);
        r9.append("&");
        r9.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c9, code lost:
    
        r1 = lu1.s.a(r9.toString(), r1);
        r13.append(r0);
        r13.append("&");
        r13.append(r11);
        r13.append("&");
        r13.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e7, code lost:
    
        r13 = r13.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ed, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01f8, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01fa, code lost:
    
        r2.j(1, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01ff, code lost:
    
        r15.f68373x10a0fed7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0212, code lost:
    
        if (xt1.t0.aj().mo9952xce0038c9(r15, "card_id", "code_id") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0214, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  failure! card_id = %s, code_id = %s ,status = %d", r15.f68370x95970a65, r15.f68372xacb60e68, java.lang.Integer.valueOf(r15.f68373x10a0fed7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x023d, code lost:
    
        r1 = xt1.t0.Ni();
        r2 = r4.g();
        r1.getClass();
        r2 = xt1.t0.Zi().y0(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0250, code lost:
    
        if (r2 == null) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0252, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRequestCodeTimer failure! CardQrCodeConfi is null!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0276, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0259, code lost:
    
        r6 = r2.f68241x9c21bcc8 * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "startRefreshCodeTimer refreshTime: " + r6);
        r1.f530846g.c(r6, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0229, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardQrCodeDataInfoStorage", "update qrCodeData  success! card_id = %s, code_id = %s ,status = %d", r15.f68370x95970a65, r15.f68372xacb60e68, java.lang.Integer.valueOf(r15.f68373x10a0fed7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e2, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardDymanicQrcodeOfflineHelper", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ec, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01ef, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "getCodeData only decrypt qrcode!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0173, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CardDymanicQrcodeOfflineHelper", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    @Override // ku1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String h(lu1.e r19) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku1.r.h(lu1.e):java.lang.String");
    }

    @Override // ku1.i
    public ku1.l0 i() {
        return new ku1.b0(this, this.f393626b);
    }

    @Override // ku1.i
    public ku1.l0 j() {
        return new ku1.v(this, this.f393626b);
    }

    @Override // ku1.i
    public boolean k(tt1.j jVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        tt1.j jVar2 = this.f393628d;
        if (jVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain mCardInfo is null！");
            return true;
        }
        if (jVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain false  newCardInfo null！");
            return false;
        }
        if (jVar2.i0().E != jVar.i0().E) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain is_commom_card is different！");
            return true;
        }
        r45.w50 w50Var = this.f393628d.i0().D;
        r45.w50 w50Var2 = jVar.i0().D;
        if ((w50Var == null && w50Var2 != null) || (w50Var != null && w50Var2 == null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field is different！");
            return true;
        }
        if (w50Var != null && w50Var2 != null && (str5 = w50Var.f470411d) != null && (str6 = w50Var2.f470411d) != null && str5.equals(str6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain unavailable_qrcode_field title is different！");
            return true;
        }
        r45.w50 w50Var3 = this.f393628d.s0().Z;
        r45.w50 w50Var4 = jVar.s0().Z;
        if ((w50Var3 == null && w50Var4 != null) || (w50Var3 != null && w50Var4 == null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field  is diffrent！");
            return true;
        }
        if (w50Var3 != null && w50Var4 != null && (str3 = w50Var3.f470411d) != null && (str4 = w50Var4.f470411d) != null && !str3.equals(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field title is diffrent！");
            return true;
        }
        if (w50Var3 == null || w50Var4 == null || (str = w50Var3.f470413f) == null || (str2 = w50Var4.f470413f) == null || str.equals(str2)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarDynamicCodeView", "isNeedUpdateViewAgain pay_and_qrcode_field aux_title  is diffrent！");
        return true;
    }
}
