package com.p314xaae8f345.mm.p2829xfa87f9de;

/* loaded from: classes13.dex */
public class m implements fp.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296384d;

    public m(java.lang.String str) {
        this.f296384d = str;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0053 -> B:25:0x006d). Please report as a decompilation issue!!! */
    @Override // fp.c
    /* renamed from: onChange */
    public void mo13848x3dcbea6f(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper onChange %d", java.lang.Integer.valueOf(i17));
        if (!com.p314xaae8f345.mm.p2829xfa87f9de.q.b(this.f296384d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, sCurrentParams invalid");
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6 = com.p314xaae8f345.mm.p2829xfa87f9de.q.f296401a.f296410h;
        if (interfaceC26164x73fc6bc6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper onChange, tpPlayer invalid");
            return;
        }
        try {
            if (i17 == -2 || i17 == -3 || i17 == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper focus loss, try pause");
                if (interfaceC26164x73fc6bc6.mo100916xb7d72d0e() == 5) {
                    interfaceC26164x73fc6bc6.mo100930x65825f6();
                }
            } else if (i17 != 1 && i17 != 2 && i17 != 3) {
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("XFilesAudioPlayerLogic", "audioFocusHelper focus gain");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("XFilesAudioPlayerLogic", "audioFocusHelper pause error: " + th6.getMessage());
            com.p314xaae8f345.mm.p2829xfa87f9de.q.d("audioFocusHelper pause error ", th6);
        }
    }
}
