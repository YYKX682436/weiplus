package ln1;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f401276d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401277e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f401278f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f401279g;

    public d(ln1.g gVar, boolean z17, int i17, int i18, byte[] bArr) {
        this.f401276d = z17;
        this.f401277e = i17;
        this.f401278f = i18;
        this.f401279g = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        boolean z17 = this.f401276d;
        int i17 = this.f401277e;
        int i18 = this.f401278f;
        byte[] bArr = this.f401279g;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f491546g;
        sn1.i iVar = concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17)) ? (sn1.i) concurrentHashMap.remove(java.lang.Integer.valueOf(i17)) : null;
        if (z17) {
            if (bArr == null) {
                str = "null";
            } else {
                try {
                    str = new java.lang.String(bArr);
                } catch (java.lang.Exception unused) {
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupBaseScene", "callback error buf content : ".concat(str));
            sn1.i.f491547h.mo50293x3498a0(new sn1.b(z17, i18, bArr, i17));
            return;
        }
        sn1.i0 i0Var = sn1.i.f491551o;
        if (i0Var != null) {
            i0Var.c();
        }
        if (iVar != null) {
            try {
                if (bArr == null) {
                    throw new java.lang.Exception("buf is null");
                }
                iVar.N().mo11468x92b714fd(bArr);
                iVar.P(i17);
                return;
            } catch (java.lang.Exception e17) {
                iVar.J(3, -1, "buf to resq fail");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e17, "%s ", e17.toString());
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "notify scene null type:%d", java.lang.Integer.valueOf(i18));
        if (i18 != 16) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupBaseScene", "notify seq:%d, type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            sn1.i.f491547h.mo50293x3498a0(new sn1.b(z17, i18, bArr, i17));
            return;
        }
        synchronized (concurrentHashMap) {
            java.util.Iterator it = new java.util.HashSet(concurrentHashMap.keySet()).iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = sn1.i.f491546g;
                sn1.i iVar2 = (sn1.i) concurrentHashMap2.get(num);
                if (iVar2 != null) {
                    iVar2.mo808xfb85f7b0();
                }
                if (iVar2 != null && iVar2.mo808xfb85f7b0() == 15) {
                    int intValue = num.intValue();
                    if (concurrentHashMap2.containsKey(java.lang.Integer.valueOf(intValue))) {
                    }
                    try {
                        iVar2.N().mo11468x92b714fd(bArr);
                        iVar2.P(i17);
                    } catch (java.lang.Exception e18) {
                        iVar2.J(3, -1, "buf to tagResp fail");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BackupBaseScene", e18, "buf to tagResp error, type[%d], errMsg:%s ", java.lang.Integer.valueOf(iVar2.mo808xfb85f7b0()), e18.toString());
                    }
                }
            }
        }
    }
}
