package u23;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f505573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u23.e f505574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f505575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u23.s f505576g;

    public d(u23.n nVar, u23.e eVar, long j17, u23.s sVar) {
        this.f505573d = nVar;
        this.f505574e = eVar;
        this.f505575f = j17;
        this.f505576g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.e eVar;
        java.lang.String a17;
        java.util.List list;
        boolean z17;
        java.util.LinkedList f17;
        u23.o oVar;
        u23.o oVar2;
        if (this.f505573d.f505634e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505574e.f505577a, "start: skip, controller[" + this.f505573d.hashCode() + "] isCancelled");
            return;
        }
        try {
            this.f505574e.e("【start】run start", this.f505575f);
            a17 = this.f505576g.f505639c.a();
            list = (java.util.List) ((java.util.HashMap) this.f505574e.f505581e).get(a17);
            z17 = true;
            if (list != null && this.f505573d.f505631b != null) {
                this.f505574e.e("【start】Post data with cache in ", this.f505575f);
                this.f505573d.b(list, true);
            }
            u23.n nVar = this.f505573d;
            if (nVar.f505631b != null && (oVar2 = nVar.f505631b) != null) {
                oVar2.c();
            }
            u23.e.b(this.f505574e, this.f505573d, this.f505576g);
            u23.e eVar2 = this.f505574e;
            eVar2.getClass();
            android.net.Uri uri = t23.o2.f496749e;
            f17 = t23.n2.f496742a.f();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar2.f505577a, "loadPrivateAlbumData: " + f17.size());
            this.f505574e.getClass();
        } catch (java.lang.Throwable th6) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f505574e.f505577a, th6, "start err!", new java.lang.Object[0]);
                this.f505573d.getClass();
                eVar = this.f505574e;
            } finally {
                this.f505573d.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505574e.f505577a, "【start】runnable end");
            }
        }
        if (this.f505573d.f505634e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505574e.f505577a, "【start】: skip post data");
            return;
        }
        if (list == null || this.f505573d.f505631b != null || this.f505573d.f505632c != null) {
            if (list == null) {
                u23.e eVar3 = this.f505574e;
                u23.s sVar = this.f505576g;
                java.util.List f18 = eVar3.f(sVar.f505637a, sVar.f505638b, kz5.n0.V0(f17), this.f505573d);
                if (this.f505573d.f505634e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505574e.f505577a, "【start】: skip notifyPostDataFinish data");
                    return;
                }
                this.f505574e.e("【start】Post new data in ", this.f505575f);
                ((java.util.HashMap) this.f505574e.f505581e).put(a17, f18);
                u23.n nVar2 = this.f505573d;
                if (this.f505574e.f505586j) {
                    z17 = false;
                }
                nVar2.b(f18, z17);
                u23.n nVar3 = this.f505573d;
                if (nVar3.f505631b != null && (oVar = nVar3.f505631b) != null) {
                    oVar.a();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f505574e.f505577a, "【start】No data changed");
            }
        }
        this.f505576g.f505637a.getClass();
        if (!this.f505574e.f505578b && !this.f505573d.f505634e) {
            u23.e eVar4 = this.f505574e;
            u23.n nVar4 = this.f505573d;
            u23.s sVar2 = this.f505576g;
            u23.e.a(eVar4, nVar4, sVar2.f505637a, sVar2.f505638b, this.f505575f);
        }
        this.f505573d.getClass();
        eVar = this.f505574e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f505577a, "【start】runnable end");
    }
}
