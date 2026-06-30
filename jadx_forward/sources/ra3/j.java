package ra3;

/* loaded from: classes5.dex */
public class j implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f475052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e[] f475053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f475054f;

    public j(boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.e[] eVarArr, long j17) {
        this.f475052d = zArr;
        this.f475053e = eVarArr;
        this.f475054f = j17;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f475052d[0]) {
            this.f475053e[0] = null;
            ra3.m.f475055a.remove(java.lang.Long.valueOf(this.f475054f));
        }
    }
}
