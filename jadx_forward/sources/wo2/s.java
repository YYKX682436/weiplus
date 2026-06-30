package wo2;

/* loaded from: classes2.dex */
public final class s implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529657d;

    public s(wo2.m0 m0Var) {
        this.f529657d = m0Var;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof wo2.q) {
            wo2.q qVar = (wo2.q) obj;
            android.widget.TextView textView = qVar.f529650c;
            if (textView != null) {
                android.view.View view = qVar.f529648a.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
            qVar.a(false);
            if (qVar.f529649b == 1003) {
                this.f529657d.Q6();
            }
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        java.lang.Object obj = t17.f425311a;
        if (obj instanceof wo2.q) {
            wo2.q qVar = (wo2.q) obj;
            android.widget.TextView textView = qVar.f529650c;
            if (textView != null) {
                android.view.View view = qVar.f529648a.f425316f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            }
            qVar.a(true);
            wo2.m0 m0Var = this.f529657d;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351 c14496x6858d351 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class);
            int i17 = qVar.f529649b;
            c14496x6858d351.R6(i17);
            if (i17 != 1006) {
                switch (i17) {
                    case 1001:
                        wo2.m0.P6(m0Var, 1);
                        return;
                    case 1002:
                        break;
                    case 1003:
                        wo2.m0.P6(m0Var, 3);
                        m0Var.Q6();
                        return;
                    default:
                        return;
                }
            }
            wo2.m0.P6(m0Var, 2);
        }
    }
}
