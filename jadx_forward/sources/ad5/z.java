package ad5;

/* loaded from: classes5.dex */
public final class z implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84863e;

    public z(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f84862d = c0Var;
        this.f84863e = h0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f84862d.f391645d = true;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f84863e;
        yz5.a aVar = (yz5.a) h0Var.f391656d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        h0Var.f391656d = null;
    }
}
