package xp3;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {
    public l(xp3.k kVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessElf", "send check broadcast!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16792xd1660a86 c16792xd1660a86 = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16792xd1660a86();
        c16792xd1660a86.f234500d = xp3.o.f537463b;
        android.content.Intent intent = new android.content.Intent("ACTION_ELF_CHECK");
        intent.putExtra("MicroMsg.ElfCheckRequest", c16792xd1660a86);
        intent.setPackage(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(intent);
        xp3.o.f537465d.mo50297x7c4d7ca2(this, xp3.o.f537463b);
    }
}
