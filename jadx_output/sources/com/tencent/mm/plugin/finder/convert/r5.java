package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class r5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.q6 f104443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f104444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.z0 f104445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104446g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.convert.q6 q6Var, com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView, so2.z0 z0Var, in5.s0 s0Var) {
        super(1);
        this.f104443d = q6Var;
        this.f104444e = finderCollapsibleTextView;
        this.f104445f = z0Var;
        this.f104446g = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yw2.a0 a0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.convert.q6 q6Var = this.f104443d;
        if (q6Var.f104342g && !booleanValue) {
            this.f104444e.setLimitLine(Integer.MAX_VALUE);
        }
        so2.z0 z0Var = this.f104445f;
        z0Var.F = booleanValue;
        boolean z17 = q6Var.f104342g;
        in5.s0 s0Var = this.f104446g;
        if (z17) {
            q6Var.v(s0Var, z0Var);
        }
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            com.tencent.mm.plugin.finder.feed.a7 a7Var = q6Var.f104340e;
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = z0Var.E;
            if (booleanValue) {
                yw2.a0 a0Var2 = a7Var.f106216o;
                android.widget.FrameLayout p17 = a0Var2 != null ? a0Var2.p() : null;
                if (p17 != null) {
                    p17.setVisibility(0);
                }
                ec2.d e27 = zy2.ra.e2(nyVar, 0, 1, null);
                if (e27 != null) {
                    e27.a(new ec2.a(13, finderItem.field_id, finderItem.getDupFlag()));
                }
            } else {
                yw2.a0 a0Var3 = a7Var.f106216o;
                android.widget.FrameLayout p18 = a0Var3 != null ? a0Var3.p() : null;
                if (p18 != null) {
                    p18.setVisibility(8);
                }
                ec2.d e28 = zy2.ra.e2(nyVar, 0, 1, null);
                if (e28 != null) {
                    e28.a(new ec2.a(5, finderItem.field_id, finderItem.getDupFlag()));
                }
                com.tencent.mm.plugin.finder.feed.a7 a7Var2 = a7Var instanceof com.tencent.mm.plugin.finder.feed.a7 ? a7Var : null;
                if (a7Var2 != null && (a0Var = a7Var2.f106216o) != null) {
                    a0Var.s().y(false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
