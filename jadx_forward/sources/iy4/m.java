package iy4;

/* loaded from: classes11.dex */
public final class m implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iy4.p f377508d;

    public m(iy4.p pVar) {
        this.f377508d = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != 101) {
            return;
        }
        iy4.k kVar = iy4.k.f377505d;
        iy4.p pVar = this.f377508d;
        if (intent != null) {
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            if (i18 == -1 && bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("go_next", "");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "continue_login")) {
                    pVar.f377517g = false;
                    com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23703x4c6877f0 c23703x4c6877f0 = pVar.f377514d;
                    if (c23703x4c6877f0 != null) {
                        c23703x4c6877f0.m87834x7bf45089(iy4.l.f377507d);
                    }
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, "cancel_login")) {
                    pVar.f377517g = false;
                    com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23703x4c6877f0 c23703x4c6877f02 = pVar.f377514d;
                    if (c23703x4c6877f02 != null) {
                        c23703x4c6877f02.m87833xa144cd0f(kVar);
                    }
                }
            }
        }
        if (pVar.f377517g) {
            pVar.f377517g = false;
            com.p314xaae8f345.p2845xc516c4b6.p2853x44f11a34.C23703x4c6877f0 c23703x4c6877f03 = pVar.f377514d;
            if (c23703x4c6877f03 != null) {
                c23703x4c6877f03.m87833xa144cd0f(kVar);
            }
        }
    }
}
