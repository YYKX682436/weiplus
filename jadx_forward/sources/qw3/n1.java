package qw3;

/* loaded from: classes9.dex */
public class n1 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 f448715d;

    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377) {
        this.f448715d = activityC17109x265f5377;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17109x265f5377 activityC17109x265f5377 = this.f448715d;
        activityC17109x265f5377.f238073f.b(view, i17, j17, activityC17109x265f5377, activityC17109x265f5377);
        return true;
    }
}
