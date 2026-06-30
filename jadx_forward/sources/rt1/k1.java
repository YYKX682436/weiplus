package rt1;

/* loaded from: classes7.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f480974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(android.app.Activity activity, java.lang.String str, rt1.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480974e = activity;
        this.f480975f = str;
        this.f480976g = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rt1.k1(this.f480974e, this.f480975f, this.f480976g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.k1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f480973d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        java.lang.String str = this.f480975f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity activity = this.f480974e;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7.class);
            intent.putExtra("INTENT_KEY_DEFAULT_PLATE_TEXT", str);
            this.f480973d = 1;
            obj = st1.g.c(activity, intent, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.app.Instrumentation.ActivityResult activityResult = (android.app.Instrumentation.ActivityResult) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityResult, "<this>");
        int resultCode = activityResult.getResultCode();
        android.content.Intent resultData = activityResult.getResultData();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForUpdate(plateNo:" + str + "), get code:" + resultCode + ", data:" + resultData);
        rt1.p1 p1Var = this.f480976g;
        if (-2 == resultCode) {
            p1Var.e();
            return f0Var;
        }
        java.lang.String stringExtra = (-1 != resultCode || resultData == null) ? null : resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (!z17 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, str)) {
            rt1.j1 j1Var = new rt1.j1(p1Var, str, stringExtra);
            this.f480973d = 2;
            if (st1.g.d(j1Var, this) == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
