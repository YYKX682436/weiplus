package i32;

/* loaded from: classes13.dex */
public class m extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i32.s f369659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i32.s sVar, android.os.Looper looper) {
        super(looper);
        this.f369659a = sVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "handleMessage msg.what = %d", java.lang.Integer.valueOf(message.what));
        int i17 = message.what;
        i32.s sVar = this.f369659a;
        if (i17 == 0) {
            long longValue = ((java.lang.Long) message.obj).longValue();
            i32.q qVar = (i32.q) sVar.f369673d.get(java.lang.Long.valueOf(longValue));
            if (qVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId(%d), or response has been send", java.lang.Long.valueOf(longValue));
                return;
            }
            iz5.a.d(null, qVar.f369668a);
            qVar.f369668a.e(-1, "", null);
            iz5.a.d(null, qVar.f369668a);
            u32.h1.c().b(new w32.h(qVar.f369668a));
            sVar.f369673d.remove(java.lang.Long.valueOf(longValue));
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "unknown message type = %d", java.lang.Integer.valueOf(i17));
                    return;
                }
                i32.o oVar = (i32.o) message.obj;
                i32.q qVar2 = (i32.q) sVar.f369673d.get(java.lang.Long.valueOf(oVar.f369664a));
                if (qVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", java.lang.Long.valueOf(oVar.f369664a));
                    return;
                }
                qVar2.f369668a.e(0, "", oVar.f369665b);
                iz5.a.d(null, qVar2.f369668a);
                u32.h1.c().b(new w32.h(qVar2.f369668a));
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = sVar.f369674e;
                iz5.a.d(null, qVar2.f369669b);
                n3Var.mo50300x3fa464aa(qVar2.f369669b);
                sVar.f369673d.remove(java.lang.Long.valueOf(oVar.f369664a));
                return;
            }
            i32.n nVar = (i32.n) message.obj;
            if (nVar.f369661b == 0 && nVar.f369660a == 0) {
                return;
            }
            com.p314xaae8f345.mm.p944x882e457a.o oVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p2) nVar.f369663d).f180575d;
            iz5.a.d(null, oVar2);
            long j17 = ((r45.az5) oVar2.f152243a.f152217a).f451913e.f466757d;
            i32.q qVar3 = (i32.q) sVar.f369673d.get(java.lang.Long.valueOf(j17));
            if (qVar3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Cannot find SendDataToManufacturerCmdContext in the map by SessionId = %d", java.lang.Long.valueOf(j17));
                return;
            }
            iz5.a.d(null, qVar3.f369668a);
            qVar3.f369668a.e(nVar.f369660a == -417 ? -5 : -1, nVar.f369662c, null);
            iz5.a.d(null, qVar3.f369668a);
            u32.h1.c().b(new w32.h(qVar3.f369668a));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = sVar.f369674e;
            iz5.a.d(null, qVar3.f369669b);
            n3Var2.mo50300x3fa464aa(qVar3.f369669b);
            sVar.f369673d.remove(java.lang.Long.valueOf(j17));
            return;
        }
        i32.g gVar = (i32.g) message.obj;
        if (!u32.h1.a().g(gVar.f369652a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "This device send other cmd before do auth, device id = %d", java.lang.Long.valueOf(gVar.f369652a));
            gVar.e(-2, "", new byte[0]);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        int i18 = message.arg1;
        if (-5 == i18 || -3 == i18 || -4 == i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "Error Code = %d, reply errorcode to device and close channel", java.lang.Integer.valueOf(i18));
            gVar.e(-1, "", new byte[0]);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        v32.b b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ui().b1(gVar.f369652a + "");
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
            return;
        }
        if (java.lang.System.currentTimeMillis() / 1000 < b17.f318636v) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "device has been blocked");
            gVar.e(-5, "Device Is Block", null);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        if (i32.r.f369670b == null) {
            i32.r.f369670b = new i32.r();
        }
        i32.r rVar = i32.r.f369670b;
        if (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 == rVar.f369671a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMSendDataToManufacturerLogic", "Sequence Data-overrun!!!");
            rVar.f369671a = 0L;
        }
        long j18 = rVar.f369671a + 1;
        rVar.f369671a = j18;
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("exdevice_pref", 0);
        if (sharedPreferences != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.Util", "save locall seq id : %d", java.lang.Long.valueOf(j18));
            sharedPreferences.edit().putLong("local_message_seq", j18).commit();
        }
        o32.k kVar = (o32.k) gVar.f369656e;
        if (kVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataToManufacturerSvr Request parse failed!!!, Tell device before stop this task");
            gVar.e(-4, "Decode failed", null);
            u32.h1.c().b(new w32.h(gVar));
            return;
        }
        java.lang.Integer num = (java.lang.Integer) sVar.f369675f.get(b17.f66606x5fdff396);
        if (num == null) {
            num = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.MMSendDataToManufacturerLogic", "SendDataDirection = %s", num);
        int intValue = num.intValue();
        java.util.HashMap hashMap = sVar.f369673d;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var3 = sVar.f369674e;
        if (intValue == 0) {
            if (kVar.f424249f == 10001) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().p(b17.f66606x5fdff396, b17.f66602x6bae49ad, kVar.f424248e.g());
                return;
            }
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p2(gVar.f369652a, b17.f66607xe7b73b15, b17.f66606x5fdff396, j18, java.lang.System.currentTimeMillis(), kVar.f424248e.g(), kVar.f424249f));
            i32.p pVar = new i32.p(sVar, j18);
            n3Var3.mo50297x7c4d7ca2(pVar, 30000L);
            i32.q qVar4 = new i32.q(null);
            iz5.a.d(null, gVar);
            qVar4.f369668a = gVar;
            iz5.a.d(null, pVar);
            qVar4.f369669b = pVar;
            hashMap.put(java.lang.Long.valueOf(j18), qVar4);
            return;
        }
        if ((num.intValue() & 1) != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Di().p(b17.f66606x5fdff396, b17.f66602x6bae49ad, kVar.f424248e.g());
        }
        if ((num.intValue() & 2) != 0) {
            gm0.j1.n().f354821b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.p2(gVar.f369652a, b17.f66607xe7b73b15, b17.f66606x5fdff396, j18, java.lang.System.currentTimeMillis(), kVar.f424248e.g(), kVar.f424249f));
            i32.p pVar2 = new i32.p(sVar, j18);
            n3Var3.mo50297x7c4d7ca2(pVar2, 30000L);
            i32.q qVar5 = new i32.q(null);
            iz5.a.d(null, gVar);
            qVar5.f369668a = gVar;
            iz5.a.d(null, pVar2);
            qVar5.f369669b = pVar2;
            hashMap.put(java.lang.Long.valueOf(j18), qVar5);
        }
    }
}
