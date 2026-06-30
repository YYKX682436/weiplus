package ei4;

/* loaded from: classes8.dex */
public final class k implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f334756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f334757e;

    public k(boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f334756d = z17;
        this.f334757e = adapterContextMenuInfo;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "longclick delete msg finish");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusConversationLongClickListener", "[CONTEXT_MENU_LONG_CLICK_DELETE] ret" + this.f334756d + " position=" + this.f334757e.position);
    }
}
