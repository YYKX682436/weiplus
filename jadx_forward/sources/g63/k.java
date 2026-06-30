package g63;

/* loaded from: classes8.dex */
public final class k implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f350666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f350667e;

    public k(boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f350666d = z17;
        this.f350667e = adapterContextMenuInfo;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameLife.ConversationOnLongClickListener", "longclick delete msg finish [CONTEXT_MENU_LONG_CLICK_DELETE] ret=" + this.f350666d + " position=" + this.f350667e.position);
    }
}
