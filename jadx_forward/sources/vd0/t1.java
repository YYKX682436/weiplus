package vd0;

/* loaded from: classes14.dex */
public final class t1 implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.g2 f517043a;

    public t1(wd0.g2 g2Var) {
        this.f517043a = g2Var;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.a result = (eu5.a) eVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[fingerprint login] requestAuthorizeAndSign onResult errCode: ");
        sb6.append(result.f557138a);
        sb6.append(", errMsg: ");
        sb6.append(result.f557139b);
        sb6.append(", resultInfo is : ");
        java.lang.Object obj = result.f338360c;
        sb6.append(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", sb6.toString());
        if (result.f557138a == 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[fingerprint login] requestAuthorizeAndSign onResult extData: ");
            zt5.s sVar = (zt5.s) obj;
            sb7.append(sVar.f557163k);
            sb7.append(", jsonValue: ");
            sb7.append(sVar.f557162j);
            sb7.append(", resultInfo is : ");
            sb7.append(sVar.f557154b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", sb7.toString());
        }
        wd0.m2 m2Var = new wd0.m2(0, null, null, 7, null);
        m2Var.f526285a = result.f557138a;
        java.lang.String errMsg = result.f557139b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(errMsg, "errMsg");
        m2Var.f526286b = errMsg;
        zt5.s sVar2 = (zt5.s) obj;
        if (sVar2 != null) {
            m2Var.f526287c = sVar2;
        }
        this.f517043a.a(m2Var);
    }
}
