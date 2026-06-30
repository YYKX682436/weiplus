package eg4;

/* loaded from: classes4.dex */
public class y1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rl5.r f334365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 f334366e;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98, rl5.r rVar) {
        this.f334366e = activityC18506xcc7cdd98;
        this.f334365d = rVar;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98 = this.f334366e;
        if (i17 < activityC18506xcc7cdd98.f253706d.getHeaderViewsCount()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FMessageConversationUI", "on header view long click, ignore");
            return true;
        }
        int headerViewsCount = i17 - activityC18506xcc7cdd98.f253706d.getHeaderViewsCount();
        rl5.r rVar = this.f334365d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd982 = this.f334366e;
        rVar.g(view, headerViewsCount, j17, activityC18506xcc7cdd982, activityC18506xcc7cdd982.f253714o, activityC18506xcc7cdd982.f253710h, activityC18506xcc7cdd982.f253711i);
        return true;
    }
}
