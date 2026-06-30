package bg4;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str = ((com.tencent.mm.autogen.events.VoiceReminderDeleteRecordMessageEvent) iEvent).f54938g.f7756a;
        if (str != null) {
            java.lang.String b17 = zf4.r.b(str, false);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                zf4.l.Bi().d(b17);
            }
            java.util.HashMap hashMap = (java.util.HashMap) zf4.l.Bi().f472650e;
            zf4.i iVar = (zf4.i) hashMap.get(str);
            if (iVar != null) {
                java.io.RandomAccessFile randomAccessFile = iVar.f472669a;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        iVar.f472669a = null;
                    } catch (java.io.IOException unused) {
                    }
                }
                hashMap.remove(str);
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (m17.a()) {
                m17.f213266a.d(m17.f213267b);
            }
        }
        return false;
    }
}
