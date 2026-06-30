package su0;

/* loaded from: classes5.dex */
public final class t implements com.p314xaae8f345.p457x3304c6.p482xca9708e2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f494229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f494230b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f494231c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f494232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f494233e;

    public t(yz5.l lVar, su0.a0 a0Var, java.lang.String str, long j17, float f17) {
        this.f494229a = lVar;
        this.f494230b = a0Var;
        this.f494231c = str;
        this.f494232d = j17;
        this.f494233e = f17;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p482xca9708e2.b
    public void a(com.p314xaae8f345.p457x3304c6.p482xca9708e2.C4194x93c4c6d6 c4194x93c4c6d6, com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        java.lang.Object m143895xf1229813;
        yz5.l lVar = this.f494229a;
        if (c4093x6b88526b != null || c4194x93c4c6d6 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: message ");
            sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSubtitleTaskExecutor", sb6.toString());
            lVar.mo146xb9724478(null);
            return;
        }
        boolean z17 = c4194x93c4c6d6.f130073b;
        su0.a0 a0Var = this.f494230b;
        if (!z17) {
            java.lang.String str = this.f494231c;
            long j17 = this.f494232d;
            float f17 = this.f494233e;
            java.nio.ByteBuffer byteBuffer = c4194x93c4c6d6.f130075d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteBuffer, "getContextBuff(...)");
            a0Var.f494158d.postDelayed(new su0.x(a0Var, str, j17, f17, byteBuffer, this.f494229a), c4194x93c4c6d6.f130074c);
            return;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("queryAsyncSpeechRequest onComplete: responseInfo timeOffsetMs ");
        long j18 = this.f494232d;
        sb7.append(j18);
        sb7.append(" speed ");
        float f18 = this.f494233e;
        sb7.append(f18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VideoSubtitleTaskExecutor", sb7.toString());
        a0Var.getClass();
        x36.o oVar = x36.o.f533228g;
        java.nio.ByteBuffer byteBuffer2 = c4194x93c4c6d6.f130072a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteBuffer2, "getData(...)");
        byte[] bArr = new byte[byteBuffer2.remaining()];
        byteBuffer2.get(bArr);
        x36.o oVar2 = new x36.o(bArr);
        java.nio.charset.Charset charset = r26.c.f450398a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(charset, "charset");
        java.lang.String str2 = new java.lang.String(oVar2.f533232f, charset);
        if (str2.length() == 0) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException("data.isEmpty() ")));
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                if (jSONObject.optInt("ret", -1) != 0) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException(" ret != 0 ")));
                } else {
                    org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55720x1b30a884);
                    if (optJSONObject == null) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException(" res == null ")));
                    } else {
                        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("sentences");
                        if (optJSONArray == null) {
                            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.IllegalStateException(" sentences == null ")));
                        } else {
                            r45.ne4 ne4Var = new r45.ne4();
                            java.util.LinkedList linkedList = ne4Var.f462844e;
                            jz5.g gVar = ru0.m.f481222a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            c75.c.d(optJSONArray, new ru0.l(j18, f18, arrayList));
                            linkedList.addAll(arrayList);
                            ne4Var.f462843d = optJSONObject.optLong("voice_len_ms", 0L);
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(ne4Var);
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(e17));
            }
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("VideoSubtitleTaskExecutor", "onComplete: " + m143898xd4a2fc34.getMessage(), m143898xd4a2fc34);
            lVar.mo146xb9724478(null);
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813)) {
            lVar.mo146xb9724478((r45.ne4) m143895xf1229813);
        }
    }
}
