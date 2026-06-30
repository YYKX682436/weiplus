package v12;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f514037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v12.i f514038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, v12.i iVar) {
        super(1);
        this.f514037d = i17;
        this.f514038e = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.FrameLayout holder = (android.widget.FrameLayout) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("view holder ready: for scene count ");
        int i17 = this.f514037d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSnsTimeline", sb6.toString());
        v12.i iVar = this.f514038e;
        if (i17 == iVar.f514045i) {
            iVar.f514044h = holder;
            iVar.wi();
        }
        return jz5.f0.f384359a;
    }
}
