package s50;

/* loaded from: classes12.dex */
public final class d1 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s50.l1 f484576a;

    public d1(s50.l1 l1Var) {
        this.f484576a = l1Var;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.util.Arrays.toString(strArr), "toString(...)");
        java.util.Objects.toString(list);
        boolean z17 = true;
        if (strArr != null) {
            if (!(strArr.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            return;
        }
        java.lang.String str = strArr[0];
        s50.l1 l1Var = this.f484576a;
        if (str != null) {
            java.lang.ref.WeakReference weakReference = l1Var.f484614e;
            try {
                if (!l1Var.f484619m.equals(str)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    jSONObject2.put("status", "ondata");
                    jSONObject2.put("extinfo", jSONObject);
                    l1Var.bj(weakReference, jSONObject2);
                    l1Var.f484619m = str;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputData, error: " + e17);
            }
        }
        l1Var.f484622p.mo50303x856b99f0(101);
        l1Var.f484622p.mo50307xb9e94560(101, 3000L);
    }

    @Override // z21.b
    public void b(java.util.List list) {
        java.util.Objects.toString(list);
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onRecognizeFinish");
        s50.l1 l1Var = this.f484576a;
        java.lang.ref.WeakReference weakReference = l1Var.f484614e;
        l1Var.getClass();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("status", "onend");
            l1Var.bj(weakReference, jSONObject);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "notifyStreamVoiceInputEnd, error: " + e17);
        }
        l1Var.Bi();
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.VoiceSearchService", "onError, errType: " + i18 + ", errCode: " + i19 + ", localCode: " + i17 + ", voiceid: " + j17);
        s50.l1 l1Var = this.f484576a;
        l1Var.Zi(l1Var.f484614e, s50.w0.f484665h, "voice input errno: " + i18 + ", " + i19 + ", " + i17 + ", " + j17);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.VoiceSearchService", "onRecordFin");
    }
}
