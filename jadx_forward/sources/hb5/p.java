package hb5;

/* loaded from: classes11.dex */
public class p implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f361781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 f361782e;

    public p(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4, com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f361782e = activityC21585x4f340ac4;
        this.f361781d = s6Var;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 < this.f361782e.f279449e.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizChatFavUI", "on header view long click, ignore");
            return true;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var = this.f361781d;
        com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21585x4f340ac4 activityC21585x4f340ac4 = this.f361782e;
        s6Var.b(view, i17, j17, activityC21585x4f340ac4, activityC21585x4f340ac4.f279451g);
        return true;
    }
}
