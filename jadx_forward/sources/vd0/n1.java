package vd0;

/* loaded from: classes11.dex */
public final class n1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 f517006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wd0.e2 f517007b;

    public n1(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 c10684xe921b56, wd0.e2 e2Var) {
        this.f517006a = c10684xe921b56;
        this.f517007b = e2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c result = (eu5.c) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] prepareAuthKey onResult errCode: ");
        sb6.append(result.f557138a);
        sb6.append(", errMsg: ");
        sb6.append(result.f557139b);
        sb6.append(", resultInfo is : ");
        java.lang.Object obj = result.f338360c;
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", sb6.toString());
        int i17 = result.f557138a;
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 c10684xe921b56 = this.f517006a;
        c10684xe921b56.f149343d = i17;
        if (i17 != 0) {
            c10684xe921b56.f149345f = "";
            c10684xe921b56.f149344e = "";
        } else {
            zt5.r rVar = (zt5.r) obj;
            java.lang.String str = rVar.f557150e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getRawJson(...)");
            c10684xe921b56.f149344e = str;
            java.lang.String str2 = rVar.f557152g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getSignature(...)");
            c10684xe921b56.f149345f = str2;
        }
        vd0.o1 o1Var = (vd0.o1) this.f517007b;
        o1Var.getClass();
        ((p3325xe03a0797.p3326xc267989b.r) o1Var.f517012a).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c10684xe921b56));
    }
}
