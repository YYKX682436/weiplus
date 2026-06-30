package z85;

/* loaded from: classes4.dex */
public class r extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f552351e = {l75.n0.m145250x3fdc6f77(z85.q.f552350p, "EmotionDesignerInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f552352d;

    public r(l75.k0 k0Var) {
        super(k0Var, z85.q.f552350p, "EmotionDesignerInfo", null);
        this.f552352d = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        if (r0 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0051, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.ee3 y0(java.lang.String r13) {
        /*
            r12 = this;
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r13)
            java.lang.String r1 = "MicroMsg.emoji.EmotionDesignerInfo"
            r2 = 0
            if (r0 == 0) goto Lf
            java.lang.String r13 = "getDesignerSimpleInfoResponseByID failed. Designer ID is null."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r13)
            return r2
        Lf:
            java.lang.String r0 = "content"
            java.lang.String[] r5 = new java.lang.String[]{r0}
            java.lang.String r6 = "designerIDAndType=? "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            r13 = 0
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r7 = new java.lang.String[]{r0}
            l75.k0 r3 = r12.f552352d     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            java.lang.String r4 = "EmotionDesignerInfo"
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 2
            android.database.Cursor r0 = r3.D(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            if (r0 == 0) goto L4f
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            if (r3 == 0) goto L4f
            r45.ee3 r3 = new r45.ee3     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            byte[] r4 = r0.getBlob(r13)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r3.mo11468x92b714fd(r4)     // Catch: java.lang.Exception -> L4d java.lang.Throwable -> L6b
            r2 = r3
            goto L4f
        L4d:
            r3 = move-exception
            goto L59
        L4f:
            if (r0 == 0) goto L6a
        L51:
            r0.close()
            goto L6a
        L55:
            r13 = move-exception
            goto L6d
        L57:
            r3 = move-exception
            r0 = r2
        L59:
            java.lang.String r4 = "exception:%s"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L6b
            java.lang.String r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r3)     // Catch: java.lang.Throwable -> L6b
            r5[r13] = r3     // Catch: java.lang.Throwable -> L6b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r4, r5)     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L6a
            goto L51
        L6a:
            return r2
        L6b:
            r13 = move-exception
            r2 = r0
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z85.r.y0(java.lang.String):r45.ee3");
    }

    public void z0(java.lang.String str, r45.ee3 ee3Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || ee3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID or response is null.");
            return;
        }
        try {
            z85.q qVar = new z85.q();
            qVar.f69297x137f2586 = str + 0;
            qVar.f69296xad49e234 = ee3Var.mo14344x5f01b1f6();
            android.content.ContentValues mo9763xeb27878e = qVar.mo9763xeb27878e();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append(0);
            if (this.f552352d.m("EmotionDesignerInfo", "designerIDAndType", mo9763xeb27878e) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID success. designerID:%s", str);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID failed. designerID:%s", str);
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmotionDesignerInfo", "saveDesignerSimpleInfoResponseByID exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
