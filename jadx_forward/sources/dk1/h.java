package dk1;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f314682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.ref.WeakReference weakReference) {
        super(5);
        this.f314682d = weakReference;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = (com.p314xaae8f345.mm.p944x882e457a.o) obj4;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiWxaAppGetPrivacyUseRecord", "callback, errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str);
        java.lang.ref.WeakReference weakReference = this.f314682d;
        if (intValue == 0 && intValue2 == 0) {
            java.lang.Object obj6 = oVar != null ? oVar.f152244b.f152233a : null;
            r45.lc7 lc7Var = obj6 instanceof r45.lc7 ? (r45.lc7) obj6 : null;
            if (lc7Var == null) {
                p3325xe03a0797.p3326xc267989b.q qVar = (p3325xe03a0797.p3326xc267989b.q) weakReference.get();
                if (qVar != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Client Framework Error(resp is null)"))));
                }
            } else {
                p3325xe03a0797.p3326xc267989b.q qVar2 = (p3325xe03a0797.p3326xc267989b.q) weakReference.get();
                if (qVar2 != null) {
                    ((p3325xe03a0797.p3326xc267989b.r) qVar2).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(lc7Var));
                }
            }
        } else {
            p3325xe03a0797.p3326xc267989b.q qVar3 = (p3325xe03a0797.p3326xc267989b.q) weakReference.get();
            if (qVar3 != null) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                ((p3325xe03a0797.p3326xc267989b.r) qVar3).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.io.IOException("Server Framework Error(errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + str + ')'))));
            }
        }
        return 0;
    }
}
