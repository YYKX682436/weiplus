package ts3;

/* loaded from: classes9.dex */
public class p implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f503227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 f503228b;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152, boolean z17) {
        this.f503228b = activityC16956x7944e152;
        this.f503227a = z17;
    }

    @Override // db5.n4
    public void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        g4Var.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.f503228b;
        if (20 == activityC16956x7944e152.f236593h) {
            if (this.f503227a) {
                g4Var.c(intValue, 0, 1, activityC16956x7944e152.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrg), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            }
            j45.l.g("favorite");
            g4Var.c(intValue, 1, 2, activityC16956x7944e152.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
            activityC16956x7944e152.f236598p = ((java.lang.Integer) view.getTag(com.p314xaae8f345.mm.R.id.ljk)).intValue();
        }
        g4Var.c(intValue, 2, 3, activityC16956x7944e152.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrf), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
    }
}
