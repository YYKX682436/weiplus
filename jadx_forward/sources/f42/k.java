package f42;

/* loaded from: classes13.dex */
public final class k implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373 c6158xab01373 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373();
        c6158xab01373.f136420g.f89480c = 1;
        c6158xab01373.e();
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr == null || objArr.length < 2) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373 c6158xab01373 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6158xab01373();
        java.lang.Object obj2 = objArr[0];
        android.telephony.PhoneStateListener phoneStateListener = obj2 instanceof android.telephony.PhoneStateListener ? (android.telephony.PhoneStateListener) obj2 : null;
        if (phoneStateListener == null) {
            phoneStateListener = null;
        }
        am.sy syVar = c6158xab01373.f136420g;
        syVar.f89478a = phoneStateListener;
        java.lang.Object obj3 = objArr[1];
        java.lang.Integer num = obj3 instanceof java.lang.Integer ? (java.lang.Integer) obj3 : null;
        syVar.f89479b = num != null ? num.intValue() : -1;
        syVar.f89480c = 0;
        c6158xab01373.e();
    }
}
