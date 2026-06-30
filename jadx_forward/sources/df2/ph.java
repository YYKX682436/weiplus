package df2;

/* loaded from: classes3.dex */
public final class ph extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6() {
        java.lang.String str;
        java.lang.Object obj = this.f372632e;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        java.lang.Object context = view != null ? view.getContext() : null;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = hashCode();
            java.lang.String b76 = b7();
            r45.v74 v74Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410513g;
            if (v74Var == null || (str = v74Var.m75945x2fec8307(3)) == null) {
                str = "";
            }
            android.view.Window window = activity.getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            ((b92.d2) d8Var).wi(hashCode, b76, str, activity, window, ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        }
    }

    public final void a7() {
        java.lang.String str;
        zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
        int hashCode = hashCode();
        java.lang.String b76 = b7();
        r45.v74 v74Var = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410513g;
        if (v74Var == null || (str = v74Var.m75945x2fec8307(3)) == null) {
            str = "";
        }
        ((b92.d2) d8Var).Ai(hashCode, b76, str);
    }

    public final java.lang.String b7() {
        if2.z zVar = if2.z.f372686a;
        java.lang.Object obj = this.f372632e;
        int ordinal = zVar.c(obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null).ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "UnknownLive" : "Visitor" : "Secondary" : "Anchor";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        super.mo8998x9f682d55(pluginLayout);
        Z6();
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        a7();
    }

    @Override // if2.e
    /* renamed from: pause */
    public void mo124180x65825f6() {
        a7();
    }

    @Override // if2.e
    /* renamed from: resume */
    public void mo57157xc84dc82d() {
        Z6();
    }
}
