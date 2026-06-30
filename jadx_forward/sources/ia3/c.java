package ia3;

/* loaded from: classes15.dex */
public class c implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia3.d f371528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f371529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ia3.e f371530d;

    public c(ia3.e eVar, int i17, ia3.d dVar, boolean z17) {
        this.f371530d = eVar;
        this.f371527a = i17;
        this.f371528b = dVar;
        this.f371529c = z17;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        ia3.e eVar = this.f371530d;
        int i17 = eVar.f371551e;
        int i18 = this.f371527a;
        if (i18 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRes: stale callback (gen:%d != current:%d), ignore", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(eVar.f371551e));
            return;
        }
        ia3.d dVar = eVar.f371548b;
        ia3.d dVar2 = this.f371528b;
        if (dVar != dVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRes: session already removed, ignore callback");
            return;
        }
        if (strArr == null || strArr.length <= 0 || android.text.TextUtils.isEmpty(strArr[0])) {
            return;
        }
        eVar.f371550d = true;
        java.lang.String str = strArr[0];
        if ((str == null || !str.equals(dVar2.f371544n)) && !dVar2.f371545o) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onResult text:%s", str);
            dVar2.f371544n = str;
            dVar2.d(str, false);
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
        if (this.f371527a != this.f371530d.f371551e) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onKeywordRes: %d keywords", objArr);
    }

    @Override // z21.b
    public void c() {
        if (this.f371527a != this.f371530d.f371551e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecordStart");
        boolean z17 = this.f371529c;
        ia3.d dVar = this.f371528b;
        if (!z17) {
            long j17 = dVar.f371540j;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onStart callbackId:%d", java.lang.Long.valueOf(j17));
            if (j17 != 0) {
                dVar.a(j17, new org.json.JSONObject().toString(), true);
            }
        }
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechStart");
        long j18 = dVar.f371537g;
        if (j18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onSpeechStart callbackId:%d", java.lang.Long.valueOf(j18));
            dVar.a(j18, jSONObject.toString(), true);
        }
    }

    @Override // z21.b
    public void d(int i17) {
        ia3.e eVar = this.f371530d;
        if (this.f371527a != eVar.f371551e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecognizeFinish: stale callback, ignore");
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        ia3.d dVar = this.f371528b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecognizeFinish: %d, continuous: %b", valueOf, java.lang.Boolean.valueOf(dVar.f371542l));
        if (eVar.f371547a == null) {
            return;
        }
        if (eVar.f371550d) {
            eVar.f371550d = false;
            dVar.c();
        }
        if (!dVar.f371542l) {
            dVar.b();
            eVar.f371548b = null;
            return;
        }
        z21.e eVar2 = eVar.f371547a;
        if (eVar2 != null) {
            eVar2.mo48278xae7a2e7a(false);
            eVar.f371547a.mo48299x360802(false);
            eVar.f371547a = null;
        }
        eVar.f371549c.postDelayed(new ia3.b(this), 100L);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        if (this.f371527a != this.f371530d.f371551e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onError: stale callback, ignore");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVoiceHelper", "onError localCode:%d, errType:%d, errCode:%d, voiceid:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(j17));
        ia3.d dVar = this.f371528b;
        dVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppVoiceHelper", "onError localCode:%d, errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        long j18 = dVar.f371539i;
        if (j18 != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errCode", i17);
                jSONObject.put("errMsg", "Voice recognition error: " + i17);
            } catch (java.lang.Exception unused) {
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onError callbackId:%d, error:%s", java.lang.Long.valueOf(j18), jSONObject.toString());
            dVar.a(j18, jSONObject.toString(), true);
        }
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
        if (this.f371527a != this.f371530d.f371551e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onFullReplaceText: %s %b", str, java.lang.Boolean.valueOf(z17));
    }

    @Override // z21.b
    public void g() {
        if (this.f371527a != this.f371530d.f371551e) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppVoiceHelper", "onRecordFin");
    }
}
