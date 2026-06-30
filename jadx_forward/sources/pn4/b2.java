package pn4;

/* loaded from: classes5.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.s1 f438584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(pn4.s1 s1Var) {
        super(1);
        this.f438584d = s1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        pn4.s1 s1Var = this.f438584d;
        if (fVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang response is null");
            ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z0) s1Var).a("");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang " + fVar.f152148a + ' ' + fVar.f152149b);
            if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                r45.nl6 nl6Var = (r45.nl6) fVar.f152151d;
                if (nl6Var == null || (str = nl6Var.m75945x2fec8307(2)) == null) {
                    str = "";
                }
                if (str.length() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang ".concat(str));
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z0) s1Var).a(str);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang summary_lang is empty");
                    ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z0) s1Var).a("");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TranslateVoice2TxtHelper", "startGetDefaultTransLang network error");
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z0) s1Var).a("");
            }
        }
        return jz5.f0.f384359a;
    }
}
