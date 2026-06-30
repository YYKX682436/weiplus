package ns4;

/* loaded from: classes2.dex */
public final class y1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f421215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421216e;

    public y1(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de) {
        this.f421215d = linkedList;
        this.f421216e = activityC19067xb53aa1de;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f421215d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int m75939xb282bd08 = ((r45.y94) obj).m75939xb282bd08(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421216e;
            java.lang.String string = m75939xb282bd08 == 1 ? activityC19067xb53aa1de.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpn) : activityC19067xb53aa1de.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19067xb53aa1de.mo55332x76847179();
            java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(r3.m75942xfb822ef2(2) / 100.0d)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            g4Var.o(i17, string, mo55332x76847179.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lpm, format));
            i17 = i18;
        }
    }
}
