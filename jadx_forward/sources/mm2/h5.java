package mm2;

/* loaded from: classes3.dex */
public final class h5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f410644f;

    /* renamed from: g, reason: collision with root package name */
    public mm2.i7 f410645g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f410644f = "LiveProductRecordSlice";
    }

    public final void N6(mm2.i7 i7Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f410644f, "set recodingProduct: " + this.f410645g);
        this.f410645g = i7Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        N6(null);
        super.mo528x82b764cd();
    }
}
