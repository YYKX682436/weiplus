package wp3;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f {

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f529922l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f529923m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f529924n;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar) {
        super(dVar);
        this.f529922l = dVar.b() + ".$hook";
        this.f529923m = dVar.b() + ".$ignore";
        this.f529924n = dVar.b() + ".$thread";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f
    public void a(java.util.Map map) {
        super.a(map);
        java.lang.String str = this.f529922l;
        java.lang.String str2 = (java.lang.String) map.get(str);
        if (android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PthreadHookConfigStg", "ERROR(PthreadHook): hook regex is blank");
            return;
        }
        java.lang.String str3 = this.f529923m;
        java.lang.String str4 = (java.lang.String) map.get(str3);
        java.lang.String str5 = this.f529924n;
        java.lang.String str6 = (java.lang.String) map.get(str5);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f234454a;
        o4Var.D(str, str2);
        o4Var.D(str3, str4);
        o4Var.D(str5, str6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.f
    public long c() {
        return -1L;
    }
}
