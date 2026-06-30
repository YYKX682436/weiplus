package hz3;

/* loaded from: classes12.dex */
public final class y implements hz3.a0 {
    @Override // hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        r45.jj4 jj4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        byte[] byteArray = request.f483075p.getByteArray("key_sns_media_data");
        if (byteArray != null) {
            jj4Var = new r45.jj4();
            try {
                jj4Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception unused) {
            }
        } else {
            jj4Var = null;
        }
        if (jj4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns parse mediaObj failed");
            if (zVar != null) {
                ((iz3.d) zVar).a(3, 999, "media object parse failed");
                return;
            }
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jj4Var != null) {
            r45.si siVar = new r45.si();
            siVar.f467281i = 1;
            siVar.f467276d = 4;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj4Var);
            siVar.f467282m = jj4Var.f459391g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(jj4Var);
            siVar.f467283n = jj4Var.G;
            siVar.f467284o = jj4Var.H;
            siVar.f467285p = pm0.v.Z(jj4Var.I);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns url: %s", siVar.f467282m);
            arrayList.add(siVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanSnsImageCDNStrategy", "getCDNImageInfoList-sns request.pHash: %s, needPHash: %s", request.f483070k, java.lang.Boolean.valueOf(request.f483071l));
        if (request.f483070k == null && request.f483071l && com.p314xaae8f345.mm.vfs.w6.j(request.f483064e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o1 o1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.o1.f240505a;
            java.lang.String imagePath = request.f483064e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
            request.f483070k = o1Var.a(imagePath);
        }
        if (zVar != null) {
            ((iz3.d) zVar).b(arrayList);
        }
    }

    @Override // hz3.a0
    /* renamed from: name */
    public java.lang.String mo134285x337a8b() {
        return "MicroMsg.AiScanSnsImageCDNStrategy";
    }
}
