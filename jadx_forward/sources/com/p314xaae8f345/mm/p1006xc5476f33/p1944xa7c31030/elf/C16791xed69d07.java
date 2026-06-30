package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf;

/* renamed from: com.tencent.mm.plugin.performance.elf.ElfCallUpReceiver */
/* loaded from: classes.dex */
public class C16791xed69d07 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static int f234499a = -1;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ElfCallUpReceiver", "[onReceive] call up! ");
        if (getClass().getName().equals(intent.getAction())) {
            f234499a = intent.getIntExtra("processId", 0);
        }
    }
}
