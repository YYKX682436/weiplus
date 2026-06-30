package ld2;

/* loaded from: classes3.dex */
public final class d implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f399618a;

    public d(yz5.p pVar) {
        this.f399618a = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.p pVar = this.f399618a;
        if (i17 != -1) {
            pVar.mo149xb9724478(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43669x24a738, null);
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
        if (byteArrayExtra == null) {
            pVar.mo149xb9724478(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43669x24a738, null);
            return;
        }
        r45.h32 h32Var = new r45.h32();
        try {
            h32Var.mo11468x92b714fd(byteArrayExtra);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            h32Var = null;
        }
        java.lang.String m75945x2fec8307 = h32Var != null ? h32Var.m75945x2fec8307(4) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            pVar.mo149xb9724478(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43669x24a738, null);
        } else {
            pVar.mo149xb9724478(com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.EnumC24416x82f1a476.f43667x76f894fc, h32Var);
        }
    }
}
