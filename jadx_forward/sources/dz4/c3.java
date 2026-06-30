package dz4;

/* loaded from: classes5.dex */
public final class c3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f326718d;

    public c3(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f326718d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f326718d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h0Var.f391656d = null;
    }
}
