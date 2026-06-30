package qx5;

/* loaded from: classes13.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qx5.r f449041d;

    public p(qx5.r rVar) {
        this.f449041d = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        cy5.t tVar;
        qx5.r rVar = this.f449041d;
        if (rVar.f449043a || (tVar = rVar.f449048f.f306428c) == null) {
            return;
        }
        tVar.o(4, -1);
    }
}
