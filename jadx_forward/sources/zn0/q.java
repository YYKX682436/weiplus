package zn0;

/* loaded from: classes3.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f555907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555909g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f555910h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, int i17, java.lang.String str2, zn0.s sVar, android.os.Bundle bundle) {
        super(0);
        this.f555906d = str;
        this.f555907e = i17;
        this.f555908f = str2;
        this.f555909g = sVar;
        this.f555910h = bundle;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleStopPublishMediaStreamResult, taskId: ");
        sb6.append(this.f555906d);
        sb6.append(", code: ");
        int i17 = this.f555907e;
        sb6.append(i17);
        sb6.append(", message: ");
        sb6.append(this.f555908f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", sb6.toString());
        zn0.s sVar = this.f555909g;
        if (sVar.f555922g != zn0.k.f555895g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f555922g);
        } else {
            sVar.d();
            sVar.f555922g = zn0.k.f555892d;
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Clear lastPublishMediaStreamTaskId: " + sVar.f555919d);
                sVar.f555919d = null;
            } else {
                this.f555909g.g(zn0.j.f555890f, this.f555906d, this.f555907e, this.f555908f, i17 == -7 ? zn0.s.b(sVar, this.f555910h) : 0);
            }
            sVar.h();
        }
        return jz5.f0.f384359a;
    }
}
