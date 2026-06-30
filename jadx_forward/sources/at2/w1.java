package at2;

/* loaded from: classes3.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.y1 f95305d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(at2.y1 y1Var) {
        super(1);
        this.f95305d = y1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dt2.v vVar = (dt2.v) obj;
        if (vVar != null) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f409306d;
            java.lang.String jSONObject = ml2.z0.b(ml2.z0.f409863a, null, 1, null).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_point_click", jSONObject);
            at2.y1 y1Var = this.f95305d;
            android.view.View m58811xd2e47b8b = y1Var.f95314q.m58811xd2e47b8b();
            dt2.h hVar = m58811xd2e47b8b instanceof dt2.h ? (dt2.h) m58811xd2e47b8b : null;
            if (hVar != null) {
                hVar.m126202x143580d2(vVar.f324738b);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1617xc84c47e7.p1621xd1075a44.C14938xc9a3f782 c14938xc9a3f782 = y1Var.f95314q;
            c14938xc9a3f782.getClass();
            gk2.e eVar = ws2.k1.f530599r.a().f530604c;
            boolean z17 = eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).N1;
            db5.d5 d5Var = c14938xc9a3f782.f206462q;
            if (d5Var != null && !z17) {
                android.view.View contentView = d5Var.getContentView();
                if (contentView != null) {
                    contentView.measure(0, 0);
                }
                android.graphics.drawable.Drawable drawable = vVar.f324739c;
                float intrinsicWidth = drawable.getBounds().left + (drawable.getIntrinsicWidth() / 2.0f);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14938xc9a3f782.f206462q);
                int measuredWidth = (int) (intrinsicWidth - (r6.getContentView().getMeasuredWidth() / 2));
                int height = c14938xc9a3f782.getHeight();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14938xc9a3f782.f206462q);
                int i17 = (int) (-(height + r2.getContentView().getMeasuredHeight() + c14938xc9a3f782.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7)));
                db5.d5 d5Var2 = c14938xc9a3f782.f206462q;
                if (d5Var2 != null) {
                    d5Var2.showAsDropDown(c14938xc9a3f782, measuredWidth, i17);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
