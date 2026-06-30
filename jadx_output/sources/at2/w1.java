package at2;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.y1 f13772d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(at2.y1 y1Var) {
        super(1);
        this.f13772d = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dt2.v vVar = (dt2.v) obj;
        if (vVar != null) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject = ml2.z0.b(ml2.z0.f328330a, null, 1, null).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_point_click", jSONObject);
            at2.y1 y1Var = this.f13772d;
            android.view.View fragmentView = y1Var.f13781q.getFragmentView();
            dt2.h hVar = fragmentView instanceof dt2.h ? (dt2.h) fragmentView : null;
            if (hVar != null) {
                hVar.setFragment(vVar.f243205b);
            }
            com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar = y1Var.f13781q;
            finderLiveReplaySeekbar.getClass();
            gk2.e eVar = ws2.k1.f449066r.a().f449071c;
            boolean z17 = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).N1;
            db5.d5 d5Var = finderLiveReplaySeekbar.f124929q;
            if (d5Var != null && !z17) {
                android.view.View contentView = d5Var.getContentView();
                if (contentView != null) {
                    contentView.measure(0, 0);
                }
                android.graphics.drawable.Drawable drawable = vVar.f243206c;
                float intrinsicWidth = drawable.getBounds().left + (drawable.getIntrinsicWidth() / 2.0f);
                kotlin.jvm.internal.o.d(finderLiveReplaySeekbar.f124929q);
                int measuredWidth = (int) (intrinsicWidth - (r6.getContentView().getMeasuredWidth() / 2));
                int height = finderLiveReplaySeekbar.getHeight();
                kotlin.jvm.internal.o.d(finderLiveReplaySeekbar.f124929q);
                int i17 = (int) (-(height + r2.getContentView().getMeasuredHeight() + finderLiveReplaySeekbar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479714d7)));
                db5.d5 d5Var2 = finderLiveReplaySeekbar.f124929q;
                if (d5Var2 != null) {
                    d5Var2.showAsDropDown(finderLiveReplaySeekbar, measuredWidth, i17);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
