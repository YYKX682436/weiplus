package o25;

/* loaded from: classes8.dex */
public final class r {
    public r(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(21:137|138|139|(18:141|142|143|144|145|(12:147|148|149|150|151|152|153|154|(1:156)|157|158|159)|167|148|149|150|151|152|153|154|(0)|157|158|159)|171|143|144|145|(0)|167|148|149|150|151|152|153|154|(0)|157|158|159) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x066a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x066b, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.StartWebSearchService", r0, "extParams package failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0629, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x062a, code lost:
    
        r17 = r3;
        r25 = r11;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.StartWebSearchService", r0, "openSdkBypassInfo json parse failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x05ee, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebSearch.StartWebSearchService", r0, "bypassInfo json parse failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0047. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d0 A[Catch: JSONException -> 0x05ed, TRY_LEAVE, TryCatch #9 {JSONException -> 0x05ed, blocks: (B:145:0x05ca, B:147:0x05d0), top: B:144:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0655  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.r.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void b(java.lang.String businessType, java.lang.String str, java.lang.String str2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(businessType, "businessType");
        try {
            cl0.g gVar = new cl0.g(str2);
            long E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(gVar.mo15082x48bce8a4("canvasId"));
            java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("uxInfo");
            boolean z17 = gVar.optInt("videoMuted") == 0;
            java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("canvasDynamicInfo");
            boolean z18 = gVar.optInt("forbidBackToBizApp") == 1;
            boolean z19 = z17;
            long optLong = gVar.optLong("outPlaybackTimeMs");
            java.lang.String wi6 = ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).wi(E1, str, mo15082x48bce8a4);
            if (i17 == 1) {
                ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 23);
            } else {
                ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 3);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas, appid=" + str + ", bType=" + businessType + ", extInfo=" + str2);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15082x48bce8a4) && E1 != 0) {
                p94.v0 v0Var = new p94.v0();
                v0Var.f434450e = 29;
                v0Var.f434452g = mo15082x48bce8a42;
                v0Var.f434451f = wi6;
                v0Var.f434453h = z19;
                v0Var.f434456k = z18;
                v0Var.f434457l = optLong;
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).wi(null, E1, mo15082x48bce8a4, v0Var);
                if (i17 == 1) {
                    ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 24);
                } else {
                    ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas ex " + e17.getMessage());
        }
    }
}
