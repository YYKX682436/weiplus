package zn0;

/* loaded from: classes3.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555903f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555904g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f555905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, int i17, java.lang.String str2, zn0.s sVar, android.os.Bundle bundle) {
        super(0);
        this.f555901d = str;
        this.f555902e = i17;
        this.f555903f = str2;
        this.f555904g = sVar;
        this.f555905h = bundle;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStartPublishMediaStreamResult, taskId: ");
        java.lang.String str = this.f555901d;
        sb6.append(str);
        sb6.append(", code: ");
        int i17 = this.f555902e;
        sb6.append(i17);
        sb6.append(", message: ");
        java.lang.String str2 = this.f555903f;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f555904g;
        if (sVar.f555922g != zn0.k.f555893e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f555922g);
        } else {
            sVar.d();
            sVar.f555922g = zn0.k.f555892d;
            int b17 = i17 == -7 ? zn0.s.b(sVar, this.f555905h) : 0;
            int i18 = this.f555902e;
            if (i18 != 0) {
                this.f555904g.g(zn0.j.f555888d, this.f555901d, i18, this.f555903f, b17);
            }
            if (str == null || str.length() == 0) {
                java.lang.String str3 = sVar.f555918c;
                if (!(str3 == null || str3.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is not null: " + sVar.f555918c);
                    sVar.f555918c = null;
                }
                if (i17 == -6 || i17 == -7) {
                    sVar.f555923h++;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "taskId is empty, requestFailedCount: " + sVar.f555923h);
                    if (i17 == -6) {
                        sVar.i();
                    } else {
                        zn0.s.c(sVar, str, str2, b17, true);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid code: " + i17);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "update taskId, lastPublishMediaStreamTaskId: " + sVar.f555919d);
                sVar.f555923h = 0;
                sVar.f555919d = null;
                sVar.f555918c = str;
                zn0.s.a(sVar, i17 != 0);
            }
        }
        return jz5.f0.f384359a;
    }
}
