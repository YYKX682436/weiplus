package zo1;

/* loaded from: classes5.dex */
public final class o1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f556247e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        super(0);
        this.f556246d = activityC12868xd8a7d79e;
        this.f556247e = u3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e = this.f556246d;
        android.widget.Button button = activityC12868xd8a7d79e.f174355n;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("createBtn");
            throw null;
        }
        button.setEnabled(true);
        this.f556247e.dismiss();
        android.widget.Toast.makeText(activityC12868xd8a7d79e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.mxh, 1).show();
        return jz5.f0.f384359a;
    }
}
