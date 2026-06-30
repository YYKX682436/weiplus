package l02;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f396334d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f396335e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396336f;

    public c(l02.k kVar, android.content.DialogInterface.OnClickListener onClickListener, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.String str) {
        this.f396334d = onClickListener;
        this.f396335e = c19762x487075a;
        this.f396336f = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f396334d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i17);
        }
        this.f396335e.f38859x6ac9171 = true;
        o02.a.b(15, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.t.f34133x366c91de, 1, 3, this.f396336f, "", "");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            return;
        }
        l02.b bVar = new l02.b(this);
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fax);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.S6(context, string, bVar, true, a17);
    }
}
