package zo1;

/* loaded from: classes.dex */
public final class w3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f556347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556348e;

    public w3(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556347d = view;
        this.f556348e = activityC12872x8baa24f8;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.View maskView = this.f556347d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(maskView, "$maskView");
        sa5.d.d(maskView, 0, 0L, new zo1.v3(maskView), 3, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f556348e.f174383g;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f78534x98e18718);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortTypeIv");
            throw null;
        }
    }
}
