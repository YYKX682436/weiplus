package ha3;

/* loaded from: classes15.dex */
public final class b implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.g f361331d;

    public b(ha3.g gVar) {
        this.f361331d = gVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        this.f361331d.f361394l = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        ha3.g gVar = this.f361331d;
        gVar.f361394l = eventSink;
        java.util.HashMap hashMap = gVar.f361383a;
        if (hashMap != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap);
            gVar.b(hashMap);
        }
        java.util.HashMap hashMap2 = gVar.f361384b;
        if (hashMap2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap2);
            java.lang.Object obj2 = hashMap2.get(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.util.HashMap hashMap3 = gVar.f361384b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap3);
            java.lang.Object obj3 = hashMap3.get(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb);
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.String valueOf = java.lang.String.valueOf(intValue);
            java.util.HashMap hashMap4 = gVar.f361384b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hashMap4);
            gVar.a(valueOf, str, hashMap4);
        }
    }
}
