package w10;

/* loaded from: classes9.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w10.d f523496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pq.a f523497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(w10.d dVar, pq.a aVar) {
        super(3);
        this.f523496d = dVar;
        this.f523497e = aVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        android.content.Intent intent = (android.content.Intent) obj3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.MBApp", "start result, reqCode:" + intValue + ", resultCode:" + intValue2);
        if (intValue == this.f523496d.f523498c && intValue2 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("resultData") : null;
            bw5.i8 i8Var = new bw5.i8();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (stringExtra == null) {
                stringExtra = "";
            }
            i8Var.f110027f = stringExtra;
            i8Var.f110029h[3] = true;
            yz5.p pVar = this.f523497e.f439086c;
            if (pVar != null) {
                pVar.mo149xb9724478(bw5.j8.EcsOpenEventType_changeSkuFlutterWebPageExit, i8Var);
            }
        }
        return jz5.f0.f384359a;
    }
}
