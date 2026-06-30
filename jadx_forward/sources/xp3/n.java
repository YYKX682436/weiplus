package xp3;

/* loaded from: classes5.dex */
public final class n extends android.content.BroadcastReceiver {
    public n(xp3.k kVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (!"ACTION_ELF_CHECK_RESPONSE".equals(intent.getAction())) {
            if ("com.tencent.mm.MMUIModeManager".equals(intent.getAction())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessElf", "restart mm for uimode change!");
                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new xp3.m(this, context), 500L);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a c16793x5e82fb2a = (com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a) intent.getParcelableExtra("MicroMsg.ElfCheckResponse");
        if (c16793x5e82fb2a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessElf", "[onReceive] response is null!");
            return;
        }
        if (!c16793x5e82fb2a.f234502e) {
            xp3.o.f537465d.mo50302x6b17ad39(null);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = xp3.o.f537465d;
        boolean z18 = c16793x5e82fb2a.f234502e;
        if (z18 && c16793x5e82fb2a.f234501d && c16793x5e82fb2a.f234504g) {
            n3Var.mo50297x7c4d7ca2(new xp3.e(c16793x5e82fb2a, context), c16793x5e82fb2a.f234508n);
            z17 = true;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ElfCheckResponse", "can't call process[%s]", c16793x5e82fb2a.f234506i);
            z17 = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessElf", "[onReceive] %s, isEnable:%s, CHECK_TIME:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Long.valueOf(xp3.o.f537463b));
    }
}
