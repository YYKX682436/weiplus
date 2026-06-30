package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class o extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1.w f92203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 f92205g;

    public o(u1.w wVar, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa8272988, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.C1059xa8272988 c1059xa82729882) {
        this.f92203e = wVar;
        this.f92204f = c1059xa8272988;
        this.f92205g = c1059xa82729882;
    }

    @Override // n3.c
    /* renamed from: onInitializeAccessibilityNodeInfo */
    public void mo7102x1bd2f9af(android.view.View host, o3.l info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.mo7102x1bd2f9af(host, info);
        y1.n d17 = y1.z.d(this.f92203e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        d17.c();
        int i17 = ((y1.q) ((y1.o) d17.f505188e)).f540319d;
        u1.w p17 = d17.f505187d.f505087h.p();
        while (true) {
            if (p17 == null) {
                p17 = null;
                break;
            } else {
                if (java.lang.Boolean.valueOf(y1.z.d(p17) != null).booleanValue()) {
                    break;
                } else {
                    p17 = p17.p();
                }
            }
        }
        y1.n d18 = p17 != null ? y1.z.d(p17) : null;
        y1.y yVar = d18 != null ? new y1.y(d18, false) : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        int i18 = this.f92204f.getSemanticsOwner().a().f540333f;
        int i19 = yVar.f540333f;
        if (i19 == i18) {
            i19 = -1;
        }
        info.f424176b = i19;
        info.f424175a.setParent(this.f92205g, i19);
    }
}
