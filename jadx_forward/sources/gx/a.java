package gx;

/* loaded from: classes7.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f357700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx.b f357701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, gx.b bVar) {
        super(3);
        this.f357700d = str;
        this.f357701e = bVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf result = (com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiBrandGetFrameSetPosition", "MBJsApiBrandGetFrameSetPosition " + this.f357700d + ' ' + intValue + ' ' + result);
        gx.b bVar = this.f357701e;
        if (intValue != 0) {
            bVar.s().mo146xb9724478(bVar.h(intValue, str));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("isRecCard", java.lang.Boolean.valueOf(result.mo45420x1d519880()));
            hashMap.put("position", java.lang.Integer.valueOf(result.mo45422xb588631e()));
            hashMap.put("subPosition", java.lang.Integer.valueOf(result.mo45423x2ff2f6ea()));
            bVar.s().mo146xb9724478(bVar.l(hashMap));
        }
        return jz5.f0.f384359a;
    }
}
