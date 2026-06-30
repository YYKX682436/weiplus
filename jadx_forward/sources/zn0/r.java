package zn0;

/* loaded from: classes3.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f555914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555915h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle, zn0.s sVar) {
        super(0);
        this.f555911d = str;
        this.f555912e = i17;
        this.f555913f = str2;
        this.f555914g = bundle;
        this.f555915h = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleUpdatePublishMediaStreamResult, taskId: ");
        java.lang.String str = this.f555911d;
        sb6.append(str);
        sb6.append(", code: ");
        int i17 = this.f555912e;
        sb6.append(i17);
        sb6.append(", message: ");
        java.lang.String str2 = this.f555913f;
        sb6.append(str2);
        sb6.append(", extraInfo: ");
        android.os.Bundle bundle = this.f555914g;
        sb6.append(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f555915h;
        if (sVar.f555922g != zn0.k.f555894f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f555922g);
        } else {
            sVar.d();
            sVar.f555922g = zn0.k.f555892d;
            java.lang.String str3 = sVar.f555918c;
            if (str3 == null || str3.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is empty");
            } else {
                if (str == null || str.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "taskId is empty, publishMediaStreamTaskId: " + sVar.f555918c);
                } else if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(sVar.f555918c, str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "taskId not same, publishMediaStreamTaskId: " + sVar.f555918c);
                } else if (i17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Reset requestFailedCount");
                    sVar.f555923h = 0;
                    sVar.f555924i = 0;
                    zn0.s.a(sVar, false);
                } else {
                    int b17 = i17 == -7 ? zn0.s.b(sVar, bundle) : 0;
                    this.f555915h.g(zn0.j.f555889e, this.f555911d, this.f555912e, this.f555913f, b17);
                    if (i17 == -6 || i17 == -7) {
                        sVar.f555923h++;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "requestFailedCount: " + sVar.f555923h);
                        if (i17 == -6) {
                            sVar.j();
                        } else {
                            zn0.s.c(sVar, str, str2, b17, false);
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid code: " + i17);
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
