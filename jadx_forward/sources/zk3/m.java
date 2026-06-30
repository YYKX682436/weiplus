package zk3;

/* loaded from: classes8.dex */
public final class m extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    public final /* synthetic */ zk3.g0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zk3.g0 g0Var, in5.s sVar, java.util.ArrayList arrayList) {
        super(sVar, arrayList, true);
        this.I = g0Var;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B0 */
    public void mo8160xd8bfd53(in5.s0 holder) {
        android.view.View findViewById;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        this.I.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
        if (((o17 == null || (mo7946xf939df19 = o17.mo7946xf939df19()) == null) ? 0 : mo7946xf939df19.mo1894x7e414b06()) >= 2 && (findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hhd)) != null && findViewById.getLayoutParams().width != com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.K) {
            findViewById.getLayoutParams().height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.L;
            findViewById.getLayoutParams().width = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.K;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
            if (c22646x1e9ca55 != null) {
                c22646x1e9ca55.getLayoutParams().height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q;
            }
            findViewById.requestLayout();
        }
        holder.m8186xceeefb69();
    }
}
