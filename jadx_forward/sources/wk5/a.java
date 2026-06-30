package wk5;

/* loaded from: classes4.dex */
public final class a extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f528516d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f528516d = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f528516d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifyFirstOnResumeUIC", "first onResume() called send broadcast");
            m158354x19263085().sendBroadcast(new android.content.Intent("com.tencent.mm.Intent.ACTION_ACT_ON_RESUME"));
        }
        this.f528516d = false;
    }
}
