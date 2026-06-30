package s65;

/* loaded from: classes11.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 f485040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f485041e;

    public q0(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f485040d = c20973x553f78a9;
        this.f485041e = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnCancelListener onCancelListener;
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).f(99);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 49L, 1L, true);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9.e(2);
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.C20973x553f78a9 c20973x553f78a9 = this.f485040d;
        c20973x553f78a9.d();
        if (c20973x553f78a9.f273859g || (onCancelListener = this.f485041e) == null) {
            return;
        }
        onCancelListener.onCancel(dialogInterface);
    }
}
