package x82;

/* loaded from: classes9.dex */
public class p implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f534056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534057b;

    public p(o72.r2 r2Var, android.content.Context context) {
        this.f534056a = r2Var;
        this.f534057b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_content", this.f534056a.f67640x5ab01132.f452507s);
        android.content.Context context = this.f534057b;
        j45.l.u(context, ".ui.transmit.RetransmitPreviewUI", intent, null);
        db5.f.j(context);
    }
}
