package zm5;

/* loaded from: classes3.dex */
public final class v implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f555808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zm5.f0 f555809b;

    public v(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, zm5.f0 f0Var) {
        this.f555808a = activityC0065xcd7aa112;
        this.f555809b = f0Var;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f555808a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f435481a.a(activity).a(zm5.l.class);
        lVar.f555773n = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = lVar.f555767e;
        if (c21520x5bb48e5e != null) {
            c21520x5bb48e5e.m79167xa8f8963d(true);
            c21520x5bb48e5e.m79174x52d6d40d(false);
        }
    }

    @Override // sy3.e
    public void c(long j17) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f555808a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f435481a.a(activity).a(zm5.l.class);
        lVar.f555773n = false;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = lVar.f555767e;
        if (c21520x5bb48e5e != null) {
            c21520x5bb48e5e.m79167xa8f8963d(false);
            c21520x5bb48e5e.m79174x52d6d40d(true);
        }
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        zm5.f0 f0Var = this.f555809b;
        f0Var.U6();
        f0Var.f555749r = zm5.x0.f555819d;
    }

    @Override // sy3.e
    /* renamed from: onError */
    public void mo71154xaf8aa769(int i17, int i18) {
        zm5.f0 f0Var = this.f555809b;
        f0Var.U6();
        f0Var.f555749r = zm5.x0.f555819d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f555808a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        zm5.l lVar = (zm5.l) pf5.z.f435481a.a(activity).a(zm5.l.class);
        lVar.f555773n = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e = lVar.f555767e;
        if (c21520x5bb48e5e != null) {
            c21520x5bb48e5e.m79167xa8f8963d(true);
            c21520x5bb48e5e.m79174x52d6d40d(false);
        }
    }
}
