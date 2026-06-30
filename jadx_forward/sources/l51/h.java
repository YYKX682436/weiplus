package l51;

/* loaded from: classes12.dex */
public class h implements com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06, l51.a {

    /* renamed from: c, reason: collision with root package name */
    public static int f398101c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f398102d = -1;

    /* renamed from: a, reason: collision with root package name */
    public final l51.d[] f398103a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f398104b;

    public h(l51.d[] dVarArr, java.lang.String str) {
        this.f398103a = dVarArr;
        this.f398104b = str;
        int length = dVarArr.length / 4;
        f398102d = length;
        if (length < 4) {
            f398102d = 4;
        }
    }

    public void a() {
        l51.d[] dVarArr = this.f398103a;
        for (int i17 = 0; i17 < dVarArr.length; i17++) {
            try {
                l51.d dVar = dVarArr[i17];
                if (dVar != null) {
                    try {
                        l51.b bVar = dVar.f398093b;
                        if (bVar != null) {
                            bVar.getClass();
                            dVarArr[i17].f398093b = null;
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e17);
                    }
                    try {
                        h51.h hVar = dVarArr[i17].f398094c;
                        if (hVar != null) {
                            hVar.close();
                            dVarArr[i17].f398094c = null;
                        }
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, remove byteArrayStream = " + e18);
                    }
                    dVarArr[i17].getClass();
                    dVarArr[i17] = null;
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, destory destory = " + e19);
                return;
            }
        }
        java.lang.Runtime.getRuntime().gc();
    }

    public void b(int i17, java.lang.String str) {
        l51.d[] dVarArr = this.f398103a;
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "clearData = " + i17);
        try {
            l51.d dVar = dVarArr[i17];
            if (dVar.f398093b != null) {
                dVar.f398093b = null;
            }
            dVar.getClass();
            dVarArr[i17] = null;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "Zip7DiffCallBack, clearData byteArrayStream = " + e17);
        }
        int i18 = f398101c + 1;
        f398101c = i18;
        int i19 = f398102d;
        if (i19 <= 0 || i18 % i19 != 0) {
            return;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "finishTask, finistask = " + f398101c + ", filePath = " + str + ", MAX_GC_TIME = " + f398102d);
        java.lang.Runtime.getRuntime().gc();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("Zip7MMMergeCallBack", "finishTask, finistask = " + f398101c + ", filePath = " + str + ", MAX_GC_TIME = " + f398102d);
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06
    /* renamed from: getItemInformation */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11051x42cfe9e9 mo47593x50f4d9e3(int i17, com.p314xaae8f345.mm.p930xc01b152a.p931x316220.C11088x34540a69 c11088x34540a69) {
        com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11051x42cfe9e9 m47763x43e76ae5 = c11088x34540a69.m47763x43e76ae5();
        l51.d[] dVarArr = this.f398103a;
        m47763x43e76ae5.mo47620xe134fd4d(java.lang.Long.valueOf(dVarArr[i17].f398095d.f360568e));
        ((com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11052x8e8b3109) m47763x43e76ae5).mo47612x63b2511c(dVarArr[i17].f398092a);
        return m47763x43e76ae5;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06
    /* renamed from: getStream */
    public com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11059x8bb0b4d mo47594x2fec7276(int i17) {
        h51.h hVar;
        h51.h hVar2;
        l51.d[] dVarArr = this.f398103a;
        h51.h hVar3 = null;
        try {
            hVar2 = new h51.h(new java.io.File(this.f398104b));
        } catch (java.lang.Exception unused) {
        }
        try {
            dVarArr[i17].f398094c = hVar2;
            hVar = hVar2;
        } catch (java.lang.Exception unused2) {
            hVar3 = hVar2;
            hVar = hVar3;
            l51.d dVar = dVarArr[i17];
            java.lang.String str = this.f398104b;
            h51.j jVar = dVar.f398095d;
            dVar.f398093b = new l51.b(str, (int) jVar.f360567d, (int) jVar.f360568e, hVar, this, i17);
            l51.d dVar2 = dVarArr[i17];
            l51.b bVar = dVar2.f398093b;
            bVar.f398086o = dVar2.f398092a;
            return bVar;
        }
        l51.d dVar3 = dVarArr[i17];
        java.lang.String str2 = this.f398104b;
        h51.j jVar2 = dVar3.f398095d;
        dVar3.f398093b = new l51.b(str2, (int) jVar2.f360567d, (int) jVar2.f360568e, hVar, this, i17);
        l51.d dVar22 = dVarArr[i17];
        l51.b bVar2 = dVar22.f398093b;
        bVar2.f398086o = dVar22.f398092a;
        return bVar2;
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
    /* renamed from: setCompleted */
    public void mo47631x8222809(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11044xb21bbf06
    /* renamed from: setOperationResult */
    public void mo47595xac740ba2(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p930xc01b152a.InterfaceC11057xfb2cd96
    /* renamed from: setTotal */
    public void mo47632x53c29c02(long j17) {
    }
}
