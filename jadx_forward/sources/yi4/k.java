package yi4;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi4.l f544150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f544151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yi4.l lVar, yz5.l lVar2) {
        super(2);
        this.f544150d = lVar;
        this.f544151e = lVar2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        this.f544150d.getClass();
        yz5.l lVar = this.f544151e;
        byte[] bArr = null;
        if (intValue != -1 || intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", "handleResult: cancelled, resultCode=" + intValue);
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        } else {
            java.lang.String stringExtra = intent.getStringExtra("get_poi_name");
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("get_city");
            java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
            float floatExtra = intent.getFloatExtra("get_lat", -1000.0f);
            float floatExtra2 = intent.getFloatExtra("get_lng", -1000.0f);
            java.lang.String stringExtra3 = intent.getStringExtra("get_poi_classify_id");
            java.lang.String str3 = stringExtra3 != null ? stringExtra3 : "";
            if (str.length() == 0) {
                if (str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", "handleResult: no poi selected, reset location");
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
                }
            }
            r45.c64 c64Var = new r45.c64();
            c64Var.f452843d = str3;
            c64Var.f452844e = str;
            c64Var.A = str2;
            c64Var.f452862z = (floatExtra > (-1000.0f) ? 1 : (floatExtra == (-1000.0f) ? 0 : -1)) == 0 ? 0.0d : floatExtra;
            c64Var.f452861y = floatExtra2 == -1000.0f ? 0.0d : floatExtra2;
            try {
                bArr = c64Var.mo14344x5f01b1f6();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusPublishPoiApiImpl", "handleResult: serialize LbsLife failed, err=" + th6.getMessage());
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleResult: poi=");
            sb6.append(str);
            sb6.append(", city=");
            sb6.append(str2);
            sb6.append(", lat=");
            sb6.append(floatExtra);
            sb6.append(", lng=");
            sb6.append(floatExtra2);
            sb6.append(", bytes=");
            sb6.append(bArr != null ? bArr.length : -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", sb6.toString());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bArr)));
        }
        return jz5.f0.f384359a;
    }
}
