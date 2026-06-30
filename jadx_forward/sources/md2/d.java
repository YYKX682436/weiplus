package md2;

/* loaded from: classes2.dex */
public final class d implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f407369a;

    public d(yz5.l lVar) {
        this.f407369a = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f407369a;
        if (i17 != -1) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
        if (byteArrayExtra == null) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
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
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new byte[0])));
        } else {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(h32Var != null ? h32Var.m75954xc3d85326() : null)));
        }
    }
}
