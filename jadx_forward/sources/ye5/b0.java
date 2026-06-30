package ye5;

/* loaded from: classes9.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f542774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 f542775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rd5.d f542776f;

    public b0(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, rd5.d dVar2) {
        this.f542774d = dVar;
        this.f542775e = a0Var;
        this.f542776f = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.e1 fromNewsJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        java.util.Iterator mo144672x467c086e = q26.y.d(view.getParent(), n3.w1.f415966d).mo144672x467c086e();
        while (true) {
            if (!mo144672x467c086e.hasNext()) {
                c22100x47612006 = 0;
                break;
            } else {
                c22100x47612006 = mo144672x467c086e.next();
                if (((android.view.ViewParent) c22100x47612006) instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x476120062 = c22100x47612006 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 ? c22100x47612006 : null;
        int i17 = 0;
        boolean z17 = (c22100x476120062 == null || c22100x476120062.fromNewsJumpInfo == null) ? false : true;
        if (c22100x476120062 != null && (fromNewsJumpInfo = c22100x476120062.getFromNewsJumpInfo()) != null) {
            i17 = fromNewsJumpInfo.f286317a;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5 m5Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.m5();
        m5Var.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f5(z17, i17));
        new ze5.u6(this.f542774d, this.f542775e, 4, this.f542776f.f475787d.f526833b, view, false, m5Var);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/foldItem/ChattingItemMediaGroupItem$Companion$mediaGroupItemConvert$viewModelInitializer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
