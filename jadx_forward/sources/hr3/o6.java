package hr3;

/* loaded from: classes4.dex */
public class o6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er3.e f365384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f365385e;

    public o6(hr3.t6 t6Var, er3.e eVar) {
        this.f365385e = t6Var;
        this.f365384d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f365384d);
        c01.d9.e().q(td1.t.f76810x366c91de, this.f365385e);
    }
}
