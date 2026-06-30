package qo1;

/* loaded from: classes5.dex */
public final /* synthetic */ class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public q0(java.lang.Object obj) {
        super(0, obj, qo1.v0.class, "buildRoamTaskInfo", "buildRoamTaskInfo()I", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        qo1.v0 v0Var = (qo1.v0) this.f72685xcfcbe9ef;
        int i18 = qo1.v0.f447088y;
        java.lang.Object obj = v0Var.f447025r;
        java.util.HashMap hashMap = obj instanceof java.util.HashMap ? (java.util.HashMap) obj : null;
        if (hashMap == null) {
            i17 = 256;
        } else {
            java.util.Collection values = hashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            long j17 = 0;
            while (it.hasNext()) {
                j17 += ((go1.a) it.next()).f355454d;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("buildRoamTaskInfo, sumSize = ");
            sb6.append(j17);
            sb6.append(", taskType = ");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0 o0Var = v0Var.f447009b;
            sb6.append(o0Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", sb6.toString());
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o oVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o();
            oVar.f297463e = o0Var == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP;
            oVar.f297464f = j17;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("modifyTimeOrderMode", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "modifyTimeOrder = " + z17);
            java.util.Set entrySet = hashMap.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.Set<java.util.Map.Entry> set = entrySet;
            if (!z17) {
                java.util.List U0 = kz5.n0.U0(entrySet);
                java.util.Collections.shuffle(U0);
                set = U0;
            }
            for (java.util.Map.Entry entry : set) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
                java.lang.String str = (java.lang.String) entry.getKey();
                go1.a aVar = (go1.a) entry.getValue();
                oo1.o oVar2 = oo1.o.f428684a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                long p17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) oo1.o.f428686c).mo141623x754a37bb()).p(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "recoverTime=" + p17 + ", convInfo=" + aVar);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s sVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s();
                sVar.f297507d = str;
                sVar.f297508e = aVar.f355452b;
                sVar.f297509f = aVar.f355453c;
                sVar.f297510g = aVar.f355454d;
                long j18 = aVar.f355455e;
                sVar.f297511h = j18 > 0;
                sVar.f297512i = j18;
                sVar.f297513m = p17;
                oVar.f297462d.add(sVar);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a;
            long j19 = v0Var.f447016i;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.h1 b17 = uVar.b(j19);
            if (b17 == null) {
                i17 = 257;
            } else {
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m0 f17 = b17.f(oVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupTask", "[+] New backup task, packageId = " + j19 + ", taskInfo = " + f17.f297435d);
                v0Var.f447025r = f17;
                v0Var.f447024q = new qo1.l0(v0Var);
                i17 = 0;
            }
        }
        return java.lang.Integer.valueOf(i17);
    }
}
