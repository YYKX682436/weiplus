package hz3;

/* loaded from: classes12.dex */
public final class k implements hz3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f367871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f367872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f367873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f367874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f367875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f367876f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ry3.p f367877g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hz3.s f367878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hz3.s f367879i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hz3.z f367880j;

    public k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, java.util.ArrayList arrayList, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, long j17, ry3.p pVar, hz3.s sVar, hz3.s sVar2, hz3.z zVar) {
        this.f367871a = h0Var;
        this.f367872b = h0Var2;
        this.f367873c = arrayList;
        this.f367874d = c0Var;
        this.f367875e = c0Var2;
        this.f367876f = j17;
        this.f367877g = pVar;
        this.f367878h = sVar;
        this.f367879i = sVar2;
        this.f367880j = zVar;
    }

    @Override // hz3.r
    public void a(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        hz3.z zVar = this.f367880j;
        if (zVar != null) {
            ((ku5.t0) ku5.t0.f394148d).B(new iz3.a(((iz3.d) zVar).f377602a, mediaId));
        }
    }

    @Override // hz3.r
    public void b(hz3.t checkImageResult) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkImageResult, "checkImageResult");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCDNImageInfoList-chat checkImageStatus result errType: ");
        sb6.append(checkImageResult.f367896c);
        sb6.append(", errCode: ");
        sb6.append(checkImageResult.f367897d);
        sb6.append(", reUploadInfo: ");
        r45.si siVar = checkImageResult.f367895b;
        if (siVar != null) {
            str = java.lang.String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", java.util.Arrays.copyOf(new java.lang.Object[]{siVar.f467279g, java.lang.Integer.valueOf(siVar.f467277e), java.lang.Integer.valueOf(siVar.f467278f), java.lang.Integer.valueOf(siVar.f467276d), java.lang.Integer.valueOf(siVar.f467281i)}, 5));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanChatImageStrategy", sb6.toString());
        int i17 = checkImageResult.f367896c;
        hz3.z zVar = this.f367880j;
        if (i17 != 0 || checkImageResult.f367897d != 0) {
            if (zVar != null) {
                ((iz3.d) zVar).a(i17, checkImageResult.f367897d, checkImageResult.f367898e);
                return;
            }
            return;
        }
        r45.si siVar2 = checkImageResult.f367895b;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f367871a;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f367872b;
        java.util.ArrayList arrayList = this.f367873c;
        if (siVar2 != null) {
            r45.si siVar3 = (r45.si) h0Var.f391656d;
            if (siVar3 != null) {
                siVar3.f467281i = 2;
            }
            r45.si siVar4 = (r45.si) h0Var2.f391656d;
            if (siVar4 != null) {
                siVar4.f467281i = 2;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(siVar2);
            arrayList.add(siVar2);
            z17 = true;
        } else {
            r45.si siVar5 = (r45.si) h0Var.f391656d;
            if (siVar5 != null) {
                siVar5.f467281i = 1;
            }
            r45.si siVar6 = (r45.si) h0Var2.f391656d;
            if (siVar6 != null) {
                siVar6.f467281i = 1;
            }
            z17 = false;
        }
        boolean z18 = this.f367874d.f391645d;
        ry3.p pVar = this.f367877g;
        if (z18) {
            r45.si siVar7 = (r45.si) h0Var2.f391656d;
            if (siVar7 != null) {
                arrayList.add(siVar7);
            }
            r45.si siVar8 = (r45.si) h0Var.f391656d;
            if (siVar8 != null) {
                siVar8.f467277e = 0;
                siVar8.f467278f = 0;
                arrayList.add(siVar8);
            }
        } else if (!this.f367875e.f391645d || z18) {
            r45.si siVar9 = (r45.si) h0Var2.f391656d;
            if (siVar9 != null) {
                arrayList.add(siVar9);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat hasHd but hd not exist");
            hz3.s sVar = new hz3.s(this.f367876f, 1);
            hz3.m.a(sVar, pVar.f483062c, pVar.f483063d, 1);
            r45.si a17 = sVar.a();
            a17.f467276d = 1;
            arrayList.add(a17);
            r45.si siVar10 = (r45.si) h0Var2.f391656d;
            if (siVar10 != null) {
                arrayList.add(siVar10);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat checkImageStatus result reUpload: %s, list size: %s, request.pHash: %s, needPHash: %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(arrayList.size()), pVar.f483070k, java.lang.Boolean.valueOf(pVar.f483071l));
        if (pVar.f483070k == null && pVar.f483071l) {
            hz3.s sVar2 = this.f367878h;
            if (com.p314xaae8f345.mm.vfs.w6.j(sVar2.f367888b)) {
                str2 = sVar2.f367888b;
            } else {
                hz3.s sVar3 = this.f367879i;
                str2 = com.p314xaae8f345.mm.vfs.w6.j(sVar3.f367888b) ? sVar3.f367888b : "";
            }
            if (str2.length() > 0) {
                pVar.f483070k = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o1.f240505a.a(str2);
            }
        }
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }
}
