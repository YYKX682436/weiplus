package vi1;

/* loaded from: classes7.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519015i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f519016m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, vi1.b1 b1Var) {
        super(1);
        this.f519010d = str;
        this.f519011e = str2;
        this.f519012f = str3;
        this.f519013g = str4;
        this.f519014h = str5;
        this.f519015i = str6;
        this.f519016m = b1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.zs6 zs6Var = (r45.zs6) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateUserPhone success:");
        sb6.append(zs6Var != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneNumberAddLogic", sb6.toString());
        if (zs6Var != null) {
            vi1.o0 o0Var = vi1.o0.f518949a;
            java.lang.String str = this.f519010d;
            java.lang.String showMobile = this.f519011e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(showMobile, "$showMobile");
            java.lang.String encryptedData = this.f519012f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encryptedData, "$encryptedData");
            java.lang.String iv6 = this.f519013g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iv6, "$iv");
            o0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str, showMobile, encryptedData, iv6, this.f519014h, false, false, false, true, this.f519015i, 224, null));
            this.f519016m.f518808c.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
