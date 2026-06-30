package cb1;

/* loaded from: classes7.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f121772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f121773e;

    public f1(cb1.h1 h1Var, android.content.Context context, yz5.l lVar) {
        this.f121772d = context;
        this.f121773e = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f121772d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12664x47027a16.class);
        intent.putExtra("key_from_scene", 0);
        nf.g.a(context).j(intent, new cb1.e1(this));
    }
}
