package hw2;

/* loaded from: classes5.dex */
public final class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.b0 f367113d;

    public x(hw2.b0 b0Var) {
        this.f367113d = b0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        ju3.d0.k(this.f367113d.f367037e, ju3.c0.f383430q, null, 2, null);
    }
}
