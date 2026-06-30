package pn4;

/* loaded from: classes4.dex */
public final class h1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn4.k1 f438645d;

    public h1(pn4.k1 k1Var) {
        this.f438645d = k1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList;
        o01.a aVar = (o01.a) obj;
        q01.f fVar = aVar.f440817a;
        q01.f fVar2 = q01.f.f440809e;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (fVar == fVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEnd " + aVar.f440818b + ' ' + aVar.f440819c + ' ' + aVar.f440820d);
            r45.kp3 kp3Var = (r45.kp3) aVar.f440822f;
            pn4.k1 k1Var = this.f438645d;
            if (kp3Var == null || (linkedList = kp3Var.f460424e) == null) {
                f0Var = null;
            } else {
                if (!linkedList.isEmpty()) {
                    java.lang.String str = ((r45.dq6) linkedList.get(0)).f454202e;
                    if (!(str == null || str.length() == 0)) {
                        r45.dq6 dq6Var = (r45.dq6) linkedList.get(0);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess " + dq6Var.f454201d + ' ' + dq6Var.f454202e);
                        int i17 = dq6Var.f454201d;
                        java.lang.String TranslatedText = dq6Var.f454202e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(TranslatedText, "TranslatedText");
                        k1Var.getClass();
                        ((nn4.a) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(nn4.a.class)).O6(new nn4.b(i17, TranslatedText));
                        f0Var = f0Var2;
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Translate.TranslateInWritingHelper", "onTranslateEndSuccess msgList.isEmpty():" + linkedList.isEmpty() + ' ');
                ((nn4.a) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(nn4.a.class)).O6(new nn4.b(-1, ""));
                f0Var = f0Var2;
            }
            if (f0Var == null) {
                k1Var.getClass();
                ((nn4.a) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(nn4.a.class)).O6(new nn4.b(-1, ""));
            }
        }
        return f0Var2;
    }
}
