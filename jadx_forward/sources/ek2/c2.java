package ek2;

/* loaded from: classes3.dex */
public final class c2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final ek2.x1 f334960u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f334961v;

    /* renamed from: w, reason: collision with root package name */
    public final org.json.JSONObject f334962w;

    /* renamed from: x, reason: collision with root package name */
    public final org.json.JSONObject f334963x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r45.kv0 kv0Var, java.lang.String str, java.lang.String str2, long j17, long j18, int i17, long j19, int i18, ek2.x1 x1Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(null, 1, null);
        long j27 = (i19 & 8) != 0 ? 0L : j17;
        long j28 = (i19 & 16) == 0 ? j18 : 0L;
        int i27 = (i19 & 128) != 0 ? 0 : i18;
        this.f334960u = x1Var;
        this.f334961v = "Finder.CgiFinderLivePrepare";
        r45.i01 i01Var = new r45.i01();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        this.f334962w = jSONObject;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        this.f334963x = jSONObject2;
        i01Var.set(1, kv0Var);
        i01Var.set(2, str);
        i01Var.set(3, str2);
        i01Var.set(4, java.lang.Long.valueOf(j27));
        i01Var.set(5, java.lang.Long.valueOf(j28));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sg2.a0 a0Var = sg2.a0.f489415a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(sg2.a0.f489417c);
        linkedList.addAll(arrayList);
        i01Var.set(7, linkedList);
        if (tq5.i.f502802a == 0) {
            tq5.i.f502802a = 2014500;
        }
        i01Var.set(8, java.lang.Long.valueOf(tq5.i.f502802a));
        i01Var.set(9, java.lang.Integer.valueOf(te2.sc.f499946b));
        i01Var.set(10, java.lang.Integer.valueOf(i27));
        jSONObject2.put("mic_live_id", j28);
        jSONObject2.put("mic_object_id", j27);
        jSONObject.put(dm.i4.f66875xa013b0d5, str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderLivePrepare", "CgiFinderLivePrepare finderUsername " + str + " micFinderUsername " + str2 + " micObjectId " + j27 + " micLiveId " + j28);
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = i01Var;
        r45.j01 j01Var = new r45.j01();
        j01Var.mo11485x1f73abb4(new r45.ie());
        r45.ie mo11484xe92ab0a8 = j01Var.mo11484xe92ab0a8();
        if (mo11484xe92ab0a8 != null) {
            mo11484xe92ab0a8.f458493e = new r45.du5();
        }
        lVar.f152198b = j01Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findercreateliveprepare";
        lVar.f152200d = 5874;
        p(lVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:348:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x08c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0819  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0312  */
    /* JADX WARN: Type inference failed for: r0v196 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    @Override // az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r25, int r26, java.lang.String r27, com.p314xaae8f345.mm.p2495xc50a8b8b.f r28, com.p314xaae8f345.mm.p944x882e457a.m1 r29) {
        /*
            Method dump skipped, instructions count: 2352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ek2.c2.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306536e;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        return this.f334963x;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f334962w;
    }
}
