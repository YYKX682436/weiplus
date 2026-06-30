package ru1;

/* loaded from: classes13.dex */
public final class a implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ru1.e f481236a;

    public a(ru1.e eVar) {
        this.f481236a = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastAudioEncoder", "onRecError state is in " + i17);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        if (bArr != null) {
            ru1.e eVar = this.f481236a;
            eVar.getClass();
            try {
                yz5.l lVar = eVar.f481240a;
                if (lVar != null) {
                    lVar.mo146xb9724478(bArr);
                }
                com.p314xaae8f345.mm.vfs.y6 y6Var = eVar.f481243d;
                if (y6Var != null) {
                    y6Var.write(bArr);
                }
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastAudioEncoder", "error write to local");
            }
        }
    }
}
