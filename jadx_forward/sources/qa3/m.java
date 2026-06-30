package qa3;

/* loaded from: classes15.dex */
public final class m implements com.p314xaae8f345.p3132xf2511bc7.a {
    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void a(java.lang.String str, int i17, byte[] bArr, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "recv from " + str + '(' + i17 + "), isText:" + z17);
        if (z17) {
            if (bArr == null) {
                return;
            }
            qa3.o.a(qa3.o.f442584a, bArr);
        }
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void b(java.lang.String str, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "onHandShake, " + str + '(' + i17 + ')');
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void c(java.lang.String str, int i17, boolean z17, java.lang.String[] strArr, java.lang.String[] strArr2, int i18, java.lang.String str2, java.lang.String[] strArr3, java.lang.String[] strArr4) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "onOpen, " + str + '(' + i17 + "), isSuc:" + z17 + ", code:" + i18 + ", msg:" + str2);
        if (!z17 || str == null) {
            return;
        }
        qa3.o oVar = qa3.o.f442584a;
        qa3.o.f442585b = new jz5.l(str, java.lang.Integer.valueOf(i17));
        qa3.o.b(qa3.o.f442584a);
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    public void d(java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "socket close, " + str + '(' + i17 + ')');
        jz5.l lVar = qa3.o.f442585b;
        if (lVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
            if (((java.lang.Number) lVar.f384367e).intValue() == i17) {
                qa3.o.f442585b = null;
            }
        }
    }

    @Override // com.p314xaae8f345.p3132xf2511bc7.a
    /* renamed from: doCertificateVerify */
    public int mo108928x2f1063a5(java.lang.String str, byte[][] bArr) {
        return 0;
    }
}
