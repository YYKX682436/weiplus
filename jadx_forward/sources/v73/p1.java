package v73;

/* loaded from: classes9.dex */
public class p1 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f515258a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f515259b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f515260c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f515261d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f515262e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f515263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 f515264g;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247, v73.l1 l1Var) {
        this.f515264g = activityC16106x38110247;
    }

    public final void a(android.view.View view, r45.av3 av3Var) {
        this.f515258a = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f566813h55);
        this.f515259b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h57);
        this.f515260c = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566814h56);
        this.f515263f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f566812h54);
        this.f515258a.setImageResource(u73.h.c(av3Var.f451808h));
        boolean z17 = av3Var.f451807g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247 = this.f515264g;
        if (z17) {
            this.f515258a.m82040x7541828(activityC16106x38110247.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        } else {
            this.f515258a.m82040x7541828(activityC16106x38110247.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
        }
        this.f515259b.setText(av3Var.f451804d);
        this.f515260c.setText(av3Var.f451805e);
        if (!av3Var.f451807g) {
            view.setOnClickListener(new v73.o1(this, av3Var));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "disable this card");
        view.setEnabled(false);
        this.f515263f.setVisibility(8);
        this.f515259b.setTextColor(activityC16106x38110247.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        this.f515260c.setTextColor(activityC16106x38110247.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
    }
}
