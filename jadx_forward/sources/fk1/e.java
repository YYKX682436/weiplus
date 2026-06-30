package fk1;

/* loaded from: classes8.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 f344803d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6) {
        this.f344803d = activityC12732x6baffca6;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1210xc8466c51.ActivityC12732x6baffca6 activityC12732x6baffca6 = this.f344803d;
        java.util.ArrayList arrayList = activityC12732x6baffca6.f171718h;
        if (arrayList == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareOptionsInParam");
            throw null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null && num.intValue() == 0) {
                java.lang.String r17 = i65.a.r(activityC12732x6baffca6.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.a1y);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
                java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{activityC12732x6baffca6.f171716f.f404837b}, 1));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
                g4Var.f(0, format);
            }
            if (num != null && num.intValue() == 1) {
                g4Var.f(1, i65.a.r(activityC12732x6baffca6.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.a1x));
            }
            if (num != null && num.intValue() == 2) {
                g4Var.f(2, i65.a.r(activityC12732x6baffca6.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.a2x));
            }
        }
    }
}
