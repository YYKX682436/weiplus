package ml1;

/* loaded from: classes7.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml1.b f408722a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ml1.b bVar, android.os.Looper looper) {
        super(looper);
        this.f408722a = bVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (1000 == message.what) {
            java.lang.String str = (java.lang.String) message.obj;
            int i17 = message.arg1;
            if (this.f408722a.f408724b != null) {
                qc1.q qVar = (qc1.q) this.f408722a.f408724b;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q0 q0Var = qVar.f443020a;
                int i18 = q0Var.f173144p;
                if (q0Var.f173145q == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowKeyboard", "dispatchKBValue(%s), but get NULL inputWidget", qVar.f443021b);
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.n5 uVar = new qc1.u();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("value", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.d(str));
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, qVar.f443023d.F(i18));
                hashMap.put("cursor", java.lang.Integer.valueOf(i17));
                hashMap.put("inputId", java.lang.Integer.valueOf(i18));
                hashMap.put("keyCode", java.lang.Integer.valueOf(q0Var.f173145q.m53465xfe6f04ef()));
                uVar.t(hashMap);
                qVar.f443022c.i(uVar, null);
            }
        }
    }
}
