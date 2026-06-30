package nc5;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f417766a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f417767b;

    /* renamed from: c, reason: collision with root package name */
    public nc5.r f417768c;

    public u(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 sugRv, android.content.Context activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sugRv, "sugRv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f417766a = sugRv;
        this.f417767b = activity;
        sugRv.N(new nc5.s(activity));
    }

    public final void a(yz5.l callback, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.ArrayList aj6 = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).aj();
        boolean isEmpty = aj6.isEmpty();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f417766a;
        if (isEmpty) {
            c1163xf1deaba4.setVisibility(8);
        } else {
            c1163xf1deaba4.setVisibility(0);
        }
        if (lVar != null) {
            lVar.mo146xb9724478(aj6);
        }
        this.f417768c = new nc5.r(aj6, new nc5.t(callback, aj6));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this.f417767b);
        c1162x665295de.Q(0);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.mo7960x6cab2c8d(this.f417768c);
    }
}
