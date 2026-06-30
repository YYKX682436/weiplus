package q10;

/* loaded from: classes7.dex */
public final class j implements com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f441048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f441049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f441052e;

    public j(long j17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, java.lang.String str2, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f441048a = j17;
        this.f441049b = c0Var;
        this.f441050c = str;
        this.f441051d = str2;
        this.f441052e = qVar;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveChunkedData */
    public void mo37969x6a58464f(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ChunkedData chunkedData, long j17) {
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveHeader */
    public int mo37970x82943234(com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.ResponseHeader header, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile onCronetReceiveHeader: statusCode=" + i17 + ", protocol=" + str + ", elapsed=" + (java.lang.System.currentTimeMillis() - this.f441048a) + "ms");
        return 0;
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetReceiveUploadProgress */
    public void mo37971x77ce5bf5(long j17, long j18) {
        if (j18 > 0) {
            long j19 = (j17 * 100) / j18;
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onCronetTaskCompleted */
    public void mo37972x5b5f2d2a(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskResult cronetTaskResult, java.lang.String str2) {
        java.lang.String str3;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f441049b;
        if (c0Var.f391645d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MBProfileUtil", "uploadFile already callback");
            return;
        }
        c0Var.f391645d = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f441048a;
        java.lang.String str4 = this.f441051d;
        java.lang.String str5 = this.f441050c;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f441052e;
        if (cronetTaskResult == null) {
            q10.k.a(q10.k.f441053a, "Upload Error:\nFile: " + str5 + "\nURL: " + str4 + "\nError: Result is null\nElapsed Time: " + currentTimeMillis + "ms");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile failed: result is null");
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
            return;
        }
        if (cronetTaskResult.f18200x139cb015 != 0) {
            q10.k.a(q10.k.f441053a, "Upload Error:\nFile: " + str5 + "\nURL: " + str4 + "\nProtocol: " + str2 + "\nError Code: " + cronetTaskResult.f18200x139cb015 + "\nError Message: " + cronetTaskResult.f18201x5336c059 + "\nElapsed Time: " + currentTimeMillis + "ms");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("uploadFile failed: errorCode=");
            sb6.append(cronetTaskResult.f18200x139cb015);
            sb6.append(", errorMsg=");
            sb6.append(cronetTaskResult.f18201x5336c059);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", sb6.toString());
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
            return;
        }
        byte[] bArr = cronetTaskResult.f18198x2eefaa;
        if (bArr != null) {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(forName, "forName(...)");
            str3 = new java.lang.String(bArr, forName);
        } else {
            str3 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "uploadFile success: statusCode=" + cronetTaskResult.f18207xec0a8ff + ", response=" + str3 + ", elapsedTime=" + currentTimeMillis + "ms");
        try {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new org.json.JSONObject(str3).optString("jobUrl")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBProfileUtil", "uploadFile parse response failed: " + e17.getMessage());
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetTaskCallback
    /* renamed from: onDownloadProgressChanged */
    public void mo37973x617c4940(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.CronetDownloadProgress cronetDownloadProgress) {
    }
}
