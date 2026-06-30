package rt1;

/* loaded from: classes7.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f480956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480957f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.app.Activity activity, rt1.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480956e = activity;
        this.f480957f = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rt1.i1(this.f480956e, this.f480957f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f480955d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.app.Activity activity = this.f480956e;
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13028x321e1ca7.class);
            this.f480955d = 1;
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
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.app.Instrumentation.ActivityResult activityResult = (android.app.Instrumentation.ActivityResult) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityResult, "<this>");
        int resultCode = activityResult.getResultCode();
        android.content.Intent resultData = activityResult.getResultData();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CarLicensePlateListViewPresenter", "startEditUIForCreate, get code:" + resultCode + ", data:" + resultData);
        java.lang.String stringExtra = (-1 != resultCode || resultData == null) ? null : resultData.getStringExtra("RESULT_KEY_SUBMITTED_PLATE_TEXT");
        if (stringExtra != null && stringExtra.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            rt1.h1 h1Var = new rt1.h1(this.f480957f, stringExtra);
            this.f480955d = 2;
            if (st1.g.d(h1Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
