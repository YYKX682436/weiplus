package e75;

/* loaded from: classes12.dex */
public final class f implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 f331508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e75.g f331510f;

    public f(com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1, java.util.List list, e75.g gVar) {
        this.f331508d = c20988xba34acb1;
        this.f331509e = list;
        this.f331510f = gVar;
    }

    @Override // wu5.f
    public boolean a() {
        return false;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f331510f.mo42857x23aed0ac();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1 = this.f331508d;
        if (c20988xba34acb1.b()) {
            java.util.Iterator it = this.f331509e.iterator();
            while (it.hasNext()) {
                c20988xba34acb1.f273939e.mo2231x7bb163d5(it.next());
            }
        }
    }
}
