package e04;

/* loaded from: classes15.dex */
public class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r f327400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e04.f f327401e;

    public b(e04.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar) {
        this.f327401e = fVar;
        this.f327400d = rVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar = this.f327400d;
        if (rVar != null) {
            rVar.a(null);
        }
        rz3.e eVar = this.f327401e.f327442s;
        if (eVar != null) {
            eVar.a(1, null);
        }
    }
}
